package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CModifier;
import cz.mg.collections.list.List;

public @Entity class CPointerType implements CWrapperType {
    private CType type;
    private List<CModifier> modifiers = new List<>();

    public CPointerType() {
    }

    public CPointerType(CType type, List<CModifier> modifiers) {
        this.type = type;
        this.modifiers = modifiers;
    }

    public CPointerType(CType type, CModifier... modifiers) {
        this.type = type;
        this.modifiers = new List<>(modifiers);
    }

    @Override
    @Required @Shared
    public CType getType() {
        return type;
    }

    @Override
    public void setType(CType type) {
        this.type = type;
    }

    @Required @Value
    public List<CModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<CModifier> modifiers) {
        this.modifiers = modifiers;
    }
}
