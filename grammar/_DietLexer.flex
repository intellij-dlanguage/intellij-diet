package com.singingbush.plugins.diet.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.singingbush.plugins.diet.psi.DietTypes.*;

%%

%{
  public _DietLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _DietLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

DOCTYPE=doctype\ (html|xml|transitional|strict|frameset|[1.1]|basic|mobile|plist)
COMMENT="//"[^\n\r]*
INDENT=^[ \t\n\x0B\f\r]+
FILTER=(:(css|javascript|markdown|htmlescape))
DQ_STRING=(\"[^\"]*\")
SQ_STRING=('[^']*')
DIGIT=[0-9]

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "\\R"              { return EOL; }
  "\\s+"             { return WHITE_SPACE; }
  "="                { return EQ; }
  "-"                { return HYPHEN; }
  "^$"               { return EMPTY; }

  {DOCTYPE}          { return DOCTYPE; }
  {COMMENT}          { return COMMENT; }
  {INDENT}           { return INDENT; }
  {FILTER}           { return FILTER; }
  {DQ_STRING}        { return DQ_STRING; }
  {SQ_STRING}        { return SQ_STRING; }
  {DIGIT}            { return DIGIT; }

}

[^] { return BAD_CHARACTER; }
