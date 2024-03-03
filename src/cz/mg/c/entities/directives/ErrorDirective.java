package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Value;
import cz.mg.tokenizer.entities.tokens.WordToken;

public @Entity class ErrorDirective extends Directive {
    public static final String KEYWORD = "error";

    private String message;

    public ErrorDirective() {
    }

    public ErrorDirective(WordToken keyword) {
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
