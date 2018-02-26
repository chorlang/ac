import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*;

public class Test {

  public static void main(String[] args) throws Exception {
    System.out.println( "THIS IS JAVA!!!" );
    
    // create a CharStream that reads from standard input
    String src = "Hello Java";
    ANTLRInputStream input = new ANTLRInputStream( src ); // create a lexer that feeds off of input CharStream
    TestGrammarLexer lexer = new TestGrammarLexer( input ); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream( lexer ); // create a parser that feeds off the tokens buffer
    TestGrammarParser parser = new TestGrammarParser( tokens );
    ParseTree tree = parser.r(); // begin parsing at init rule
    System.out.println( tree.toStringTree( parser ) ); // print LISP-style tree
  
  }

}