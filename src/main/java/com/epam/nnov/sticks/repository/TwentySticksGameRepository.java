package com.epam.nnov.sticks.repository;

public interface TwentySticksGameRepository {

    void saveCountOfAllSticks(int sticksForMove);

    void saveCurrentPlayer(String player);

    String getNextPlayer();

    String getCurrentPlayer();

    int getCountOfAllSticks();

}
