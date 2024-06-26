package cz.mg.c.entities.macro;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.token.Token;
import cz.mg.collections.list.List;
import cz.mg.token.tokens.WordToken;

public @Entity class Macro {
    private WordToken name;
    private List<Token> parameters;
    private List<Token> tokens = new List<>();

    public Macro() {
    }

    public Macro(WordToken name, List<Token> parameters, List<Token> tokens) {
        this.name = name;
        this.parameters = parameters;
        this.tokens = tokens;
    }

    @Required @Part
    public Token getName() {
        return name;
    }

    public void setName(WordToken name) {
        this.name = name;
    }

    @Optional @Part
    public List<Token> getParameters() {
        return parameters;
    }

    public void setParameters(List<Token> parameters) {
        this.parameters = parameters;
    }

    @Required @Part
    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}