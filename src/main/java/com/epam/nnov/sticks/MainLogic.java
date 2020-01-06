package com.epam.nnov.sticks;

import com.epam.nnov.sticks.entity.Computer;
import com.epam.nnov.sticks.entity.Player;
import com.epam.nnov.sticks.repository.SimpleTwentySticksGameRepository;
import com.epam.nnov.sticks.service.PrinterGameMsg;

import java.util.Scanner;

public class MainLogic {

    private Computer computer;
    private Player player;
    private SimpleTwentySticksGameRepository stickRepository;
    private PrinterGameMsg printerMsgGame;
    private int playerEnterCountOfSticks;

    public MainLogic() {
        computer = new Computer();
        player = new Player();
        stickRepository = new SimpleTwentySticksGameRepository();
        printerMsgGame = new PrinterGameMsg();
    }

    private int inputCorrectCountOfSticks() {
        int number = -1;
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            number = sc.nextInt();
            while (number < 1 || number > 3) {
                this.printerMsgGame.printEnterCountOfSticksIsOutOfRange();
                number = this.inputCorrectCountOfSticks();
            }
        } else {
            this.printerMsgGame.printEnterCountOfSticksIsNAN();
            number = this.inputCorrectCountOfSticks();
        }
        return number;
    }

    public static void main(String[] args) {
        MainLogic game = new MainLogic();
        game.printerMsgGame.printWelcomeGame();

        while (game.stickRepository.getCountOfAllSticks() > 1) {
            game.printerMsgGame.printCurrentCountOfSticks(game.stickRepository);
            game.printerMsgGame.printWhoMakeNextMove(game.stickRepository);

            if (game.stickRepository.getNextPlayer().equals("Computer")) {
                game.computer.makeMove(game.stickRepository.getCountOfAllSticks());
                game.stickRepository.saveCountOfAllSticks(game.computer.getNumberOfSticksForMove());
                game.stickRepository.saveCurrentPlayer(game.computer.getName());
                game.printerMsgGame.printCountOfTakenSticksByComputer(game.computer);
            } else {
                game.printerMsgGame.printPlayerMakesMove();
                game.playerEnterCountOfSticks = game.inputCorrectCountOfSticks();
                game.player.setNumberOfSticksForMove(game.playerEnterCountOfSticks);
                game.player.makeMove(game.stickRepository.getCountOfAllSticks());
                game.stickRepository.saveCurrentPlayer(game.player.getName());
                game.stickRepository.saveCountOfAllSticks(game.player.getNumberOfSticksForMove());
            }
        }

        if (game.stickRepository.getCountOfAllSticks() <= 1) {
            game.printerMsgGame.printEndOfGame(game.stickRepository);
        }
    }
}