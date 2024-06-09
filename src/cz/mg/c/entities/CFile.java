package cz.mg.c.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;

import java.nio.file.Path;

public @Entity class CFile {
    private Path path;
    private List<CEntity> entities = new List<>();

    public CFile() {
    }

    public CFile(Path path, List<CEntity> entities) {
        this.path = path;
        this.entities = entities;
    }

    @Required @Value
    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    @Required @Part
    public List<CEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<CEntity> entities) {
        this.entities = entities;
    }
}
