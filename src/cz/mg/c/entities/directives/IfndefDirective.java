package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.token.Token;
import cz.mg.token.tokens.WordToken;

public @Entity class IfndefDirective extends Directive {
    public static final String KEYWORD = "ifndef";

    private Token name;

    public IfndefDirective() {
    }

    public IfndefDirective(WordToken keyword, Token name) {
        super(keyword);
        this.name = name;
    }

    @Required @Shared
    public Token getName() {
        return name;
    }

    public void setName(Token name) {
        this.name = name;
    }
}