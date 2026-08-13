%{
#include <stdio.h>
#include <stdlib.h>

void yyerror(const char *s);
int yylex(void);
%}

/* Tokens from Lex */
%token NOUN VERB CONJ

%%

sentence:
      simple_sentence      { printf("Valid Simple Sentence\n"); }
    | compound_sentence    { printf("Valid Compound Sentence\n"); }
    ;

simple_sentence:
      NOUN VERB NOUN
    ;

compound_sentence:
      simple_sentence CONJ simple_sentence
    ;

%%

void yyerror(const char *s)
{
    printf("Invalid Sentence\n");
}

int main()
{
    printf("Enter a sentence:\n");
    yyparse();
    return 0;
}