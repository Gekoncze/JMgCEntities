package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CModifier;
import cz.mg.c.entities.CTypename;
import cz.mg.collections.list.List;

public @Entity class CInlineType implements CType {
    private CTypename typename;
    private List<CModifier> modifiers = new List<>();

    public CInlineType() {
    }

    public CInlineType(CTypename typename, List<CModifier> modifiers) {
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

    @Required @Value
    public List<CModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<CModifier> modifiers) {
        this.modifiers = modifiers;
    }
}
