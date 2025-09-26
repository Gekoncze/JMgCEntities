package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Common;

public @Entity interface CWrapperType extends CType {
    @Required @Common
    CType getType();
    void setType(CType type);
}
