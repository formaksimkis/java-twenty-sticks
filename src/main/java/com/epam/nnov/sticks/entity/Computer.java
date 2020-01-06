package com.epam.nnov.sticks.entity;

public class Computer extends AbstractPlayer{
    public Computer() {
        this.setName("Computer");
        this.setNumberOfSticksForMove(0);
    }

    @Override
    public int makeMove(int numberOfAllSticks) {
        switch (numberOfAllSticks % 4) {
            case 0:
                this.setNumberOfSticksForMove(3);
                return this.getNumberOfSticksForMove();
            case 3:
                this.setNumberOfSticksForMove(2);
                return this.getNumberOfSticksForMove();
            case 2:
                this.setNumberOfSticksForMove(1);
                return this.getNumberOfSticksForMove();
            default:
                this.setNumberOfSticksForMove(0);
                return this.getNumberOfSticksForMove();
        }
    }
}
