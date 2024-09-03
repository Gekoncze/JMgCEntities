package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CModifier;
import cz.mg.collections.set.Set;

public @Entity class CPointerType implements CWrapperType {
    private CType type;
    private Set<CModifier> modifiers = new Set<>();

    public CPointerType() {
    }

    public CPointerType(CType type, Set<CModifier> modifiers) {
        this.type = type;
        this.modifiers = modifiers;
    }

    public CPointerType(CType type, CModifier... modifiers) {
        this.type = type;
        this.modifiers = new Set<>(modifiers);
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

    @Override
    @Required @Value
    public Set<CModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(Set<CModifier> modifiers) {
        this.modifiers = modifiers;
    }
}
