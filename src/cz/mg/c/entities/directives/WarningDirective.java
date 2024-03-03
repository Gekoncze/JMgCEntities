package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Value;
import cz.mg.tokenizer.entities.tokens.WordToken;

public @Entity class WarningDirective extends Directive {
    public static final String KEYWORD = "warning";

    private String message;

    public WarningDirective() {
    }

    public WarningDirective(WordToken keyword) {
        super(keyword);
    }

    @Optional @Value
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
