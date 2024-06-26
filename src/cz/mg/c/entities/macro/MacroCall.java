package cz.mg.c.entities.macro;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Link;
import cz.mg.annotations.storage.Part;
import cz.mg.collections.list.List;
import cz.mg.token.Token;
import cz.mg.token.tokens.WordToken;

public @Entity class MacroCall {
    private Macro macro;
    private WordToken token;
    private List<List<Token>> arguments;

    public MacroCall() {
    }

    public MacroCall(Macro macro, WordToken token, List<List<Token>> arguments) {
        this.macro = macro;
        this.token = token;
        this.arguments = arguments;
    }

    @Required @Link
    public Macro getMacro() {
        return macro;
    }

    public void setMacro(Macro macro) {
        this.macro = macro;
    }

    @Required @Part
    public WordToken getToken() {
        return token;
    }

    public void setToken(WordToken token) {
        this.token = token;
    }

    @Optional @Part
    public List<List<Token>> getArguments() {
        return arguments;
    }

    public void setArguments(List<List<Token>> arguments) {
        this.arguments = arguments;
    }
}