package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CModifier;
import cz.mg.collections.set.Set;

public @Entity class CNamedType implements CType {
    private String name;
    private Set<CModifier> modifiers = new Set<>();

    public CNamedType() {
    }

    public CNamedType(String name, Set<CModifier> modifiers) {
        this.name = name;
        this.modifiers = modifiers;
    }

    @Required @Part
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Value
    public Set<CModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(Set<CModifier> modifiers) {
        this.modifiers = modifiers;
    }
}
