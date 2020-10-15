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
            TACLexer lexer = new TACLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TACParser parser = new TACParser(tokens);
            ParseTree tree = parser.program();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            // MiVisitador eval = new MiVisitador();
            // Node n = eval.visit(tree);
            // n.gen();
            out.close();

            ParseTreeWalker walker = new ParseTreeWalker();
            MiListener listener = new MiListener();
            walker.walk(listener, tree);
            // {int x; char y; {bool y; x; y;} x;y; }
        }
        catch(Exception e) {
            System.out.println("Error " + e ); }
            out.close();
    }

}
