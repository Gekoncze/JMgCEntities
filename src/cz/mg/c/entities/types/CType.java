package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Shared;
import cz.mg.c.entities.*;
import cz.mg.collections.list.List;
import cz.mg.collections.set.Set;

public @Entity class CType implements CEntity {
    private CTypename typename;
    private Set<CModifier> modifiers = new Set<>();
    private List<CPointer> pointers = new List<>();
    private List<CArray> arrays = new List<>();

    public CType() {
    }

    public CType(
        CTypename typename,
        Set<CModifier> modifiers,
        List<CPointer> pointers,
        List<CArray> arrays
    ) {
        this.typename = typename;
        this.modifiers = modifiers;
        this.pointers = pointers;
        this.arrays = arrays;
    }

    @Required @Shared
    public CTypename getTypename() {
        return typename;
    }

    public void setTypename(CTypename typename) {
        this.typename = typename;
    }

    @Required @Part
    public Set<CModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(Set<CModifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Required @Part
    public List<CPointer> getPointers() {
        return pointers;
    }

    public void setPointers(List<CPointer> pointers) {
        this.pointers = pointers;
    }

    @Required @Part
    public List<CArray> getArrays() {
        return arrays;
    }

    public void setArrays(List<CArray> arrays) {
        this.arrays = arrays;
    }
}
