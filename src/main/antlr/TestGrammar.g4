grammar TestGrammar;
r   : 'Hello' ID;
ID  : [A-Za-z]+ ;
WS  : [ \t\r\n]+ -> skip ;