package com.singingbush.plugins.diet.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.singingbush.plugins.diet.psi.DietTokenType.*;

/**
 * @author Samael Bate (singingbush)
 * This file is auto generated by Gradle at build time from the DietLexer.flex file,
 * which itself was initially generated from the BNF file that was put together using
 * the grammar provided here: http://vibed.org/templates/diet#grammar
 */
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

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "indent"            { return INDENT; }
  "empty"             { return EMPTY; }
  "html_attr_list"    { return HTML_ATTR_LIST; }
  "text"              { return TEXT; }

}

[^] { return BAD_CHARACTER; }

