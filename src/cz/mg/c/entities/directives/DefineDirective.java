package cz.mg.c.entities.directives;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.c.entities.macro.Macro;
import cz.mg.token.tokens.WordToken;

public @Entity class DefineDirective extends Directive {
    public static final String KEYWORD = "define";

    private Macro macro;

    public DefineDirective() {
    }

    public DefineDirective(WordToken keyword, Macro macro) {
        super(keyword);
        this.macro = macro;
    }

    @Required @Shared
    public Macro getMacro() {
        return macro;
    }

    public void setMacro(Macro macro) {
        this.macro = macro;
    }
}