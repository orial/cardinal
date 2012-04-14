
package parser;

import java_cup.runtime.*;
import java.io.IOException;

import parser.sym;
import static parser.sym.*;

%%

%class LekserLex

%unicode
%line
%column
%public
%cup

%init{
	// TODO: code that goes to constructor
%init}

%{
   private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}

LineTerminator 	= \r|\n|\r\n
WhiteSpace     	= {LineTerminator} | [ \t\f]
digit			= [0-9]
integer			= {digit}+
float			= {pointfloat} | {exponentfloat}
pointfloat      = {intpart}? {fraction} | {intpart} "."
exponentfloat   = ( {intpart} | {pointfloat} ) {exponent}
intpart 		= {integer}
fraction 		= "." {integer}
exponent 		= ( "e" | "E" ) [ "+" | "-" ] {integer}
letter 			= {lowercase} | {uppercase}
lowercase 		= [a-z]
uppercase 		= [A-Z]
identifier 		= ({letter}|"_") ({letter} | {digit} | "_")*

%%

"print"				{return symbol(sym.PRINT);}
"+"					{return symbol(sym.PLUS);}
"-"					{return symbol(sym.MINUS);}
"**"				{return symbol(sym.POW);}
"*"					{return symbol(sym.MULT);}
"/"					{return symbol(sym.DIV);}
"%"					{return symbol(sym.MOD);}
"("					{return symbol(sym.LEFTPARENTHESE);}
")"					{return symbol(sym.RIGHTPARENTHESE);}
"input"				{return symbol(sym.INPUT);}
","					{return symbol(sym.COMMA);}
"not"				{return symbol(sym.NOT);}
"<"					{return symbol(sym.LESS);}
">"					{return symbol(sym.GREATER);}
"=="				{return symbol(sym.EQUAL);}
">="				{return symbol(sym.GREATEROREQUAL);}
"<="				{return symbol(sym.LESSOREQUAL);}
"!="				{return symbol(sym.NOTEQUAL);}
"or"				{return symbol(sym.OR);}
"and"				{return symbol(sym.AND);}
"True"				{return symbol(sym.TRUE);}
"False"				{return symbol(sym.FALSE);}
"if"				{return symbol(sym.IF);}
"else"				{return symbol(sym.ELSE);}
":"					{return symbol(sym.COLON);}

{float}				{return symbol(sym.FLOAT, new Float(yytext()));}
{integer}			{return symbol(sym.INTEGER, new Integer(yytext()));}
{identifier}		{return symbol(sym.IDENTIFIER, new String(yytext()));}

{LineTerminator}	{return symbol(sym.NEWLINE);}
{WhiteSpace}   		{ /* Ignore whitespace. */ }
.           		{System.out.println("Illegal char, '" + yytext() + "' line: " + yyline + ", column: " + yychar);}
