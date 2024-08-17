package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;

public @Entity interface CWrapperType extends CType {
    @Required @Shared
    CType getType();
    void setType(CType type);
}
