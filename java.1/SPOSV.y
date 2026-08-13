%{
#include<stdio.h>
%}

%token BUILTIN ID OPEN_SQ CLOSE_SQ EQ NEW SC COMMA DIGIT

%%

Start : BUILTIN varlist SC        { printf("Valid Declaration\n"); }
      | BUILTIN ID OPEN_SQ CLOSE_SQ ID EQ NEW BUILTIN OPEN_SQ DIGIT CLOSE_SQ SC
        { printf("Valid Declaration\n"); }
      ;

varlist : varlist COMMA ID
        | ID
        ;

%%

int main() {
    printf("Enter declaration:\n");
    yyparse();
    return 0;
}

int yyerror(char *s) {
    printf("Invalid Declaration\n");
    return 0;
}