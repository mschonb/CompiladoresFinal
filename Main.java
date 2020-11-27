import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.PrintWriter;


public class Main {
    static PrintWriter out;
    public static void main(String[] args) {
        try {
            out = new PrintWriter((args.length==0)?"salida.txt" : args[0]);
            CharStream input = CharStreams.fromStream(System.in);
            //CharStream input = CharStreams.fromString("{a = 0\ni = 0\n while(i < 10) {a = a+i\n i = i + 1} print(a)}");
            GraphqlLexer lexer = new GraphqlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GraphqlParser parser = new GraphqlParser(tokens);
            ParseTree tree = parser.program();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MiListener list = new MiListener();
//            Node n = eval.visit(tree);
//            n.gen();
            out.close();
        }
        catch(Exception e) {
            System.out.println("Error " + e ); }
        out.close();

    }

}
