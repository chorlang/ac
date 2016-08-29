grammar Chor;
import CommonLexerRules;

// typing
globalTypeDeclaration   : Identifier COLON globalType;

globalType              : globalInteraction DOT globalCommunication
                            | globalInteraction DOT LBRACE globalCommunication ( COMMA globalCommunication )* RBRACE
                            | Identifier // for recursive types
                        ;

globalInteraction       : operation LPAREN dataType RPAREN;

globalCommunication     : role LEFTARROW role;

dataType                : 'string' | 'int' | 'long' | 'bool';

// deployment

// procedures

// choreographies


// common terms

operation                 : Identifier;

role                      : Identifier;

// common terminals

LEFTARROW                 : '->';
