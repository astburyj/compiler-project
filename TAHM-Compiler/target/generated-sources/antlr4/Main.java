import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

	public static void main(String[] args) throws IOException {
		
		TAHMLexer lexer = new TAHMLexer(new ANTLRFileStream("sample.tahm"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TAHMParser parser = new TAHMParser(tokens);
		ParseTree tree = parser.program();              // String representation of tree starting from root node
		
		// Interpreter
		TAHMInterpreter interpreter = new TAHMInterpreter();
		interpreter.visit(tree);
		
		// Java Compiler
		//PL0JavaCompiler javaCompiler = new PL0JavaCompiler();
		//javaCompiler.visit(tree);
	}
	
}
