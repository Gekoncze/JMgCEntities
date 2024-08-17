package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class CArrayType implements CType {
    private CType type;
    private List<Token> expression = new List<>();

    public CArrayType() {
    }

    public CArrayType(CType type, List<Token> expression) {
        this.type = type;
        this.expression = expression;
    }

    @Required @Shared
    public CType getType() {
        return type;
    }

    public void setType(CType type) {
        this.type = type;
    }

    @Required @Shared
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
    }
}