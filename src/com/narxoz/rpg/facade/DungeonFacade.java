package com.narxoz.rpg.facade;

public class DungeonFacade {

    private PreparationService preparation = new PreparationService();
    private BattleService battle = new BattleService();
    private RewardService reward = new RewardService();

    public AdventureResult runDungeon() {

        System.out.println("=== Dungeon Run ===");

        preparation.prepareHero();
        battle.startBattle();
        reward.giveReward();

        return new AdventureResult(true);
    }
}