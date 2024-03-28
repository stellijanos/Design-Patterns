package org.design_patterns.behavioral.state;

public class BreakState extends State {

    public BreakState(Game game) {
        super(game);
        System.out.println("--Game in break state.--");
    }

    @Override
    public void onWelcomeScreen() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Currently on break state");

    }

    @Override
    public void onEndGame() {
        game.changeState(new EndGameState(game));
    }
}
