package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Shared;

public @Entity interface CMainEntity extends CEntity {
    @Optional @Shared
    String getName();
}
