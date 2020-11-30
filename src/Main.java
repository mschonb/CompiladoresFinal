import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.sql.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    static PrintWriter out;
    static String connectionUrl =
            "jdbc:sqlserver://simonmetta.database.windows.net:1433;"
                    + "database=COMPILADORES;"
                    + "user=simonmetta@simonmetta;"
                    + "password=mettasimon#1;"
                    + "encrypt=true;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";
    static ResultSet resultSet = null;

    public static void main(String[] args) {
        try {
            out = new PrintWriter((args.length == 0) ? "salida.txt" : args[0]);
            CharStream input = CharStreams.fromStream(System.in);
            //CharStream input = CharStreams.fromString("{a = 0\ni = 0\n while(i < 10) {a = a+i\n i = i + 1} print(a)}");
            testLexer lexer = new testLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            testParser parser = new testParser(tokens);
            ParseTree tree = parser.expr();
            out.close();
            ParseTreeWalker walker = new ParseTreeWalker();
            MiListener listener = new MiListener();
            System.out.println("Query " );
            //out.write(String.valueOf(tree));
            walker.walk(listener, tree);
            out.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        out.close();

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            //String selectSql = "select movie.id, movie.title, movie.release, genre.genre, director.name from movie inner join genre on movie.genreid = genre.id inner join director on movie.directorid = director.id";
            //System.out.println(selectSql);
            resultSet = statement.executeQuery(MiListener.queryFinal);
            ResultSetMetaData rsmd;
            rsmd = resultSet.getMetaData();

            // Print results from select statement
            while (resultSet.next()) {
                for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.printf("%40s",resultSet.getString(i));
                }
                System.out.println();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
