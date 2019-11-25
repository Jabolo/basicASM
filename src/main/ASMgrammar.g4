grammar ASMgrammar;

//program : instruction+ EOF;

instruction
    :
    (
    'mov' expression','REGISTER//musi dostać wyrażenie potem przecinek i rejestr
    |   'push' expression//musi dostać wyrażenie lub rejestr
    |   'int 0x80'//musi dostaeć tylko ciąg 0x80
    |   'xor' expression','REGISTER//musi dostać (wyrażenie lub rejestr) i rejestr
    ) NEWLINE
    ;


expression  :   expression ((PLUS|MINUS) term) | term;
term        :   term ((MUL|DIV) factor) | factor;
factor      :   NUMBER | '('expression')' | REGISTER;
NUMBER     :   MINUS? [0-9]+;

REGISTER
    :
    '%eax'
    |'%ebx'
    |'%ecx'
    |'%edx'
    ;

PLUS                :   '+';
MINUS               :   '-';
MUL                 :   '*';
DIV                 :   '/';
WHITESPACE          : (' ' | '\t') -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;
ANY : . ;