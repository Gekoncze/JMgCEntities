package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CModifier;
import cz.mg.collections.list.List;

public @Entity class CNameType implements CType {
    private String name;
    private List<CModifier> modifiers = new List<>();

    public CNameType() {
    }

    @Required @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Value
    public List<CModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<CModifier> modifiers) {
        this.modifiers = modifiers;
    }
}
