import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.PrintWriter;

public class Main {
    static PrintWriter out;
    public static void main(String[] args) {
        try {
            out = new PrintWriter((args.length==0)?"salida.txt" : args[0]);
            CharStream input = CharStreams.fromStream(System.in);
            //CharStream input = CharStreams.fromString("{a = 0\ni = 0\n while(i < 10) {a = a+i\n i = i + 1} print(a)}");
            testLexer lexer = new testLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            testParser parser = new testParser(tokens);
            ParseTree tree = parser.expr();
            System.out.println();
            out.close();

            ParseTreeWalker walker = new ParseTreeWalker();
            MiListener listener = new MiListener();
            walker.walk(listener, tree);
        }
        catch(Exception e) {
            System.out.println("Error " + e ); }
            out.close();
    }

}
