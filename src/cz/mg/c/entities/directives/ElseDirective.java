package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.WordToken;

public @Entity class ElseDirective extends Directive {
    public static final String KEYWORD = "else";

    public ElseDirective() {
    }

    public ElseDirective(WordToken keyword) {
        super(keyword);
    }
}