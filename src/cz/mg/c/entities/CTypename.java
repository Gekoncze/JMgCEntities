package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Value;

public @Entity class CTypename implements CEntity, CNamed {
    private String name;

    public CTypename() {
    }

    public CTypename(String name) {
        this.name = name;
    }

    @Override
    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
