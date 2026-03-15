package com.narxoz.rpg.decorator;

public class CriticalFocusDecorator extends ActionDecorator {

    public CriticalFocusDecorator(AttackAction action) {
        super(action);
    }

    @Override
    public int execute() {
        return super.execute() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Critical Focus";
    }
}