package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.collections.list.List;
import cz.mg.token.Token;
import cz.mg.token.tokens.WordToken;

public @Entity class IfDirective extends Directive {
    public static final String KEYWORD = "if";

    private List<Token> expression;

    public IfDirective() {
    }

    public IfDirective(WordToken keyword, List<Token> expression) {
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