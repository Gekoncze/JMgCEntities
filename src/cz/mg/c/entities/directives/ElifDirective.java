package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.collections.list.List;
import cz.mg.token.Token;
import cz.mg.token.tokens.WordToken;

public @Entity class ElifDirective extends Directive {
    public static final String KEYWORD = "elif";

    private List<Token> expression;

    public ElifDirective() {
    }

    public ElifDirective(WordToken keyword, List<Token> expression) {
        super(keyword);
        this.expression = expression;
    }

    @Required @Shared
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
    }
}