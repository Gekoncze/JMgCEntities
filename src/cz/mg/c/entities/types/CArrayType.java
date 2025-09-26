package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Common;
import cz.mg.annotations.storage.Commons;
import cz.mg.annotations.storage.Values;
import cz.mg.c.entities.CModifier;
import cz.mg.collections.list.List;
import cz.mg.collections.set.Set;
import cz.mg.token.Token;

public @Entity class CArrayType implements CWrapperType {
    private CType type;
    private List<Token> expression = new List<>();
    private Set<CModifier> modifiers = new Set<>();

    public CArrayType() {
    }

    public CArrayType(CType type, List<Token> expression) {
        this.type = type;
        this.expression = expression;
    }

    @Override
    @Required @Common
    public CType getType() {
        return type;
    }

    @Override
    public void setType(CType type) {
        this.type = type;
    }

    @Required @Commons
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
    }

    @Override
    @Required @Values
    public Set<CModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(Set<CModifier> modifiers) {
        this.modifiers = modifiers;
    }
}