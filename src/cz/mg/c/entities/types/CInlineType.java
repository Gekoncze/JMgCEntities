package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CModifier;
import cz.mg.c.entities.CTypename;
import cz.mg.collections.set.Set;

public @Entity class CInlineType implements CType {
    private CTypename typename;
    private Set<CModifier> modifiers = new Set<>();

    public CInlineType() {
    }

    public CInlineType(CTypename typename, Set<CModifier> modifiers) {
        this.typename = typename;
        this.modifiers = modifiers;
    }

    @Required @Part
    public CTypename getTypename() {
        return typename;
    }

    public void setTypename(CTypename typename) {
        this.typename = typename;
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
