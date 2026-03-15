package com.narxoz.rpg.decorator;

public class PoisonCoatingDecorator extends ActionDecorator {

    public PoisonCoatingDecorator(AttackAction action) {
        super(action);
    }

    @Override
    public int execute() {
        return super.execute() + 7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Poison Coating";
    }
}