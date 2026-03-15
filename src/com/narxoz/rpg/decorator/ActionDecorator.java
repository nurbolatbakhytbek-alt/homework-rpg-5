package com.narxoz.rpg.decorator;

public abstract class ActionDecorator implements AttackAction {

    protected AttackAction action;

    public ActionDecorator(AttackAction action) {
        this.action = action;
    }

    @Override
    public int execute() {
        return action.execute();
    }

    @Override
    public String getDescription() {
        return action.getDescription();
    }
}