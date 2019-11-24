grammar ASMgrammar;

program : instruction+ EOF;

instruction
    :
    (
    'mov' expression','register//musi dostać wyrażenie potem przecinek i rejestr
    |   'push' expression//musi dostać wyrażenie lub rejestr
    |   'int 0x80'//musi dostaeć tylko ciąg 0x80
    |   'xor' expression','register//musi dostać wyrażenie lub rejestr potem przeciek leci do rejestru
    ) NEWLINE
    ;

register
    :
    '%eax'
    |'%ebx'
    |'%ecx'
    |'%edx'
    ;

expression  :   term ((PLUS|MINUS) term)*;
term        :   factor ((MUL|DIV) factor)*;
factor      :   number | '('expression')' | register;
number      :   MINUS? DIGIT+;
DIGIT       :   [0-9];

PLUS                :   '+';
MINUS               :   '-';
MUL                 :   '*';
DIV                 :   '/';
WHITESPACE          : (' ' | '\t') -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;
ANY : . ;