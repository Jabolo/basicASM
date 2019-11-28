package ASMinterpreter;

import antlr.ASMgrammarLexer;
import antlr.ASMgrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) {

        ASMInstructionInterpreter ASMInstructionInterpreter = new ASMInstructionInterpreter();
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String instruction = null;
        while (true){
            try {
                instruction = reader.readLine();
                if(instruction == null) return;
                if(instruction.equals(""))continue;
                else instruction += '\n';
            }
            catch (Exception ex){
            }
            try {
                CharStream charStream = fromString(instruction);
                ErrorsListenerSingleton errorsListenerSingleton = new ErrorsListenerSingleton();

                ASMgrammarLexer asmGrammarLexer = new ASMgrammarLexer(charStream);
                asmGrammarLexer.removeErrorListeners();
                asmGrammarLexer.addErrorListener(errorsListenerSingleton);

                CommonTokenStream commonTokenStream = new CommonTokenStream(asmGrammarLexer);

                ASMgrammarParser asmGrammarParser = new ASMgrammarParser(commonTokenStream);
                asmGrammarParser.removeErrorListeners();
                asmGrammarParser.addErrorListener(errorsListenerSingleton);
                ParseTree tree = asmGrammarParser.instruction();

                ASMInstructionInterpreter.startInterpretingInstruction(tree);
            }catch (Exception ex){
                System.out.println("Error");
            }
        }


    }
}
