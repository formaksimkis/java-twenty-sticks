package com.epam.nnov.sticks.service;

import com.epam.nnov.sticks.entity.Computer;
import com.epam.nnov.sticks.repository.SimpleTwentySticksGameRepository;

public class PrinterGameMsg {

    private final String paramIsNullMsg = "Param is null";

    public PrinterGameMsg() {
    }

    public void printWelcomeGame() {
        String welcomeGameMsg = "Let's play the twenty sticks game!";
        System.out.println(welcomeGameMsg);
    }

    public void printWhoMakeNextMove(SimpleTwentySticksGameRepository repositoryGame) {
        try {
            String whoMakeNextMoveMsg = "Next move makes ";
            System.out.println(whoMakeNextMoveMsg + repositoryGame.getNextPlayer());
        } catch (NullPointerException e) {
            System.out.println(paramIsNullMsg);
        }
    }

    public void printCountOfTakenSticksByComputer(Computer computer) {
        try {
            String countOfTakenSticksByComputerMsg = "Count of taken sticks by Computer is: ";
            System.out.println(countOfTakenSticksByComputerMsg + computer.getNumberOfSticksForMove());
        } catch (NullPointerException e) {
            System.out.println(paramIsNullMsg);
        }
    }

    public void printPlayerMakesMove() {
        String playerMakesMoveMsg = "Enter count of sticks: ";
        System.out.println(playerMakesMoveMsg);
    }

    public void printEnterCountOfSticksIsNAN() {
        String countOfSticksIsNANMsg = "Not a number. Please try again: ";
        System.out.println(countOfSticksIsNANMsg);
    }

    public void printEnterCountOfSticksIsOutOfRange() {
        String countOfSticksIsOutOfRange = "Count of sticks is out of range. Please try again: ";
        System.out.println(countOfSticksIsOutOfRange);
    }

    public void printCurrentCountOfSticks(SimpleTwentySticksGameRepository repositoryGame) {
        try {
            String currentCountOfSticksMsg = "Current count of sticks on the table is: ";
            System.out.println(currentCountOfSticksMsg + repositoryGame.getCountOfAllSticks());
        } catch (NullPointerException e) {
            System.out.println(paramIsNullMsg);
        }
    }

    public void printEndOfGame(SimpleTwentySticksGameRepository repositoryGame) {
        try {
            String endGameMsg = "Your stick is last. Winner is: ";
            System.out.println(endGameMsg + repositoryGame.getCurrentPlayer());
        } catch (NullPointerException e) {
            System.out.println(paramIsNullMsg);
        }
    }
}
