import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.*

object TestKotlin {
  @Throws( Exception::class )
  @JvmStatic fun main( args: Array<String> ) {
    println( "THIS IS KOTLIN!!!!" )

    // create a CharStream that reads from standard input
    val src = "Hello Kotlin"
    val input = ANTLRInputStream( src ) // create a lexer that feeds off of input CharStream
    val lexer = TestGrammarLexer( input ) // create a buffer of tokens pulled from the lexer
    val tokens = CommonTokenStream( lexer ) // create a parser that feeds off the tokens buffer
    val parser = TestGrammarParser( tokens )
    val tree = parser.r() // begin parsing at init rule
    println( tree.toStringTree( parser ) ) // print LISP-style tree
  }
}