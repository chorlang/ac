grammar Chor;
import CommonLexerRules;

// typing
GlobalTypeDeclaration   : Identifier COLON GlobalType;

GlobalType              : GlobalInteraction DOT GlobalCommunication;

GlobalInteraction       : operation LPAREN DataType RPAREN;

GlobalCommunication     : role LEFTARROW role;

DataType                : 'string' | 'int' | 'long' | 'bool';

// deployment

// procedures

// choreographies


// common terms

operation                 : Identifier;

role                      : Identifier;

// common terminals

LEFTARROW                 : '->';
