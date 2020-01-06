package com.epam.nnov.sticks.entity;

public abstract class AbstractPlayer {

    private String name;
    private int numberOfSticksForMove;

    public AbstractPlayer() {
        this.name = "";
        this.numberOfSticksForMove = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }

    }

    public int getNumberOfSticksForMove() {
        return numberOfSticksForMove;
    }

    public void setNumberOfSticksForMove(int numberOfSticksForMove) {
        this.numberOfSticksForMove = numberOfSticksForMove;
    }

    public int makeMove (int numberOfAllSticks) {
        return this.numberOfSticksForMove;
    }

}
