package cz.mg.c.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;
import cz.mg.c.entities.CEntity;
import cz.mg.c.entities.CModifier;
import cz.mg.collections.set.Set;

public @Entity interface CType extends CEntity {
    @Required @Value
    Set<CModifier> getModifiers();
    void setModifiers(Set<CModifier> modifiers);
}
