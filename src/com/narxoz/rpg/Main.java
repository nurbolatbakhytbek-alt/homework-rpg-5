package com.narxoz.rpg;

import com.narxoz.rpg.decorator.*;
import com.narxoz.rpg.facade.*;

public class Main {

    public static void main(String[] args) {

        AttackAction attack = new BasicAttack();

        attack = new FireRuneDecorator(attack);
        attack = new PoisonCoatingDecorator(attack);
        attack = new CriticalFocusDecorator(attack);

        System.out.println("Attack: " + attack.getDescription());
        System.out.println("Damage: " + attack.execute());

        DungeonFacade dungeon = new DungeonFacade();
        AdventureResult result = dungeon.runDungeon();

        System.out.println("Dungeon success: " + result.isSuccess());
    }
}