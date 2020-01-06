package com.epam.nnov.sticks.entity;

public class Player extends AbstractPlayer{

    public Player() {
        this.setName("Player");
        this.setNumberOfSticksForMove(0);
    }

    @Override
    public int makeMove(int numberOfAllSticks) {
        return this.getNumberOfSticksForMove();
    }
}
