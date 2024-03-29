package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Shared;
import cz.mg.collections.list.List;

public @Entity class CType implements CEntity {
    private CTypename typename;
    private CTypeModifiers modifiers;
    private List<CPointer> pointers = new List<>();
    private List<CArray> arrays = new List<>();

    public CType() {
    }

    public CType(
        CTypename typename,
        CTypeModifiers modifiers,
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
    public CTypeModifiers getModifiers() {
        return modifiers;
    }

    public void setModifiers(CTypeModifiers modifiers) {
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
