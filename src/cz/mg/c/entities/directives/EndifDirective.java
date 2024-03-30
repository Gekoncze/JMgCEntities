package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.WordToken;

public @Entity class EndifDirective extends Directive {
    public static final String KEYWORD = "endif";

    public EndifDirective() {
    }

    public EndifDirective(WordToken keyword) {
        super(keyword);
    }
}