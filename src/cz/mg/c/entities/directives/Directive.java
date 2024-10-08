package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.c.entities.CEntity;
import cz.mg.token.tokens.WordToken;

public abstract @Entity class Directive implements CEntity {
    private WordToken keyword;

    public Directive() {
    }

    public Directive(WordToken keyword) {
        this.keyword = keyword;
    }

    @Required @Shared
    public WordToken getKeyword() {
        return keyword;
    }

    public void setKeyword(WordToken keyword) {
        this.keyword = keyword;
    }
}