package cz.mg.c.entities;

import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;

public class CTypeModifiers {
    private boolean constant;
    private boolean isStatic;

    @Required @Value
    public boolean isConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    @Required @Value
    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }
}
