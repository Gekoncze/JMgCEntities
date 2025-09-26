package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;

public @Entity class CStruct extends CTypename {
    private List<CVariable> variables;

    public CStruct() {
    }

    public CStruct(String name, List<CVariable> variables) {
        super(name);
        this.variables = variables;
    }

    @Optional @Parts
    public List<CVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<CVariable> variables) {
        this.variables = variables;
    }
}
