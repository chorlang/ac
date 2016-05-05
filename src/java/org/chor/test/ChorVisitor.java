package org.chor.test;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.chor.parser.ChorBaseVisitor;
import org.chor.parser.ChorParser;

final class ChorVisitor extends ChorBaseVisitor< Void > {

	private final static ChorVisitor v = new ChorVisitor();
	private ChorVisitor(){}
	public static ChorVisitor getVisitor(){ return v; }

	@Override
	public Void visitProg( ChorParser.ProgContext n ) {
		System.out.println( this.toString() + " | Visting program: " + n.getText() );
		v.visitChildren( n );
		return null;
	}

	public Void visitExpr( ChorParser.ExprContext n ){
		System.out.println( this.toString() + " | Visiting expression " + n.getText() );
		v.visitChildren( n );
		return null;
	}

	@Override
	public Void visitTerminal( TerminalNode node ) {
		System.out.println( this.toString() + " | Visiting terminal " + node.getText() );
		return null;
	}
}
