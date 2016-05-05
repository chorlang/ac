package org.chor.test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.chor.parser.ChorLexer;
import org.chor.parser.ChorParser;

final public class TestParser {

	public static void main( String[] args ){
		String prog = "5+3;";
		ChorLexer lexer = new ChorLexer( new ANTLRInputStream( prog ) );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ChorParser parser = new ChorParser( tokens );
		ParseTree t = parser.prog();
		ChorVisitor.getVisitor().visit( t );
	}

}