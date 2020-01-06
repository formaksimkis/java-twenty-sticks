package com.epam.nnov.sticks.repository;

public class SimpleTwentySticksGameRepository implements TwentySticksGameRepository{

    private int countOfAllSticks;
    private String player;

    public SimpleTwentySticksGameRepository() {
        player = "Player";
        countOfAllSticks = 20;
    }

    @Override
    public void saveCountOfAllSticks(int sticksForMove) {
        countOfAllSticks = countOfAllSticks - sticksForMove;
    }

    @Override
    public String getNextPlayer() {
        return player.equals("Player") ? "Computer" : "Player";
    }

    @Override
    public String getCurrentPlayer() {
        return player;
    }

    @Override
    public int getCountOfAllSticks() {
        return countOfAllSticks;
    }

    @Override
    public void saveCurrentPlayer(String player) {
        this.player = player;
    }
}
