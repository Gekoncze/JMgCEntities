package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.tokenizer.entities.Token;

public @Entity class CVariable implements CMainEntity {
    private CType type;
    private String name;
    private List<Token> expression;

    public CVariable() {
    }

    public CVariable(CType type, @Optional String name, @Optional List<Token> expression) {
        this.type = type;
        this.name = name;
        this.expression = expression;
    }

    @Required @Shared
    public CType getType() {
        return type;
    }

    public void setType(CType type) {
        this.type = type;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(@Optional String name) {
        this.name = name;
    }

    @Optional @Shared
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
    }
}
