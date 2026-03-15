package com.narxoz.rpg.decorator;

public class FireRuneDecorator extends ActionDecorator {

    public FireRuneDecorator(AttackAction action) {
        super(action);
    }

    @Override
    public int execute() {
        return super.execute() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Fire Rune";
    }
}