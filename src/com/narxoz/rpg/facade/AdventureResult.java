package com.narxoz.rpg.facade;

public class AdventureResult {

    private boolean success;

    public AdventureResult(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}