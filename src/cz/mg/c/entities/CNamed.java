package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Value;

public @Entity interface CNamed {
    @Optional @Value
    String getName();
}
