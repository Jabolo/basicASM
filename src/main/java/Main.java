import antlr.ASMgrammarLexer;
import antlr.ASMgrammarParser;
import antlr.ASMmyListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        CharStream input = new ANTLRInputStream("mov -5, %edx\n");
        ASMgrammarLexer asmGrammarLexer = new ASMgrammarLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(asmGrammarLexer);
        ASMgrammarParser asmGrammarParser = new ASMgrammarParser(commonTokenStream);

        ParseTree tree = asmGrammarParser.program();
        ASMmyListener listener = new ASMmyListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

    }
}
