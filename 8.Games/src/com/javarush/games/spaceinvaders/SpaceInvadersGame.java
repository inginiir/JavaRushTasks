package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;
import com.javarush.games.spaceinvaders.gameobjects.Star;

import java.util.ArrayList;
import java.util.List;

public class SpaceInvadersGame extends Game {

    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    private List<Star> stars;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void drawField() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.AQUAMARINE, "");
            }
        }
        for (Star star: stars) {
            star.draw(this);
        }
    }

    private void createGame() {
        createStars();
        drawScene();
    }

    private void drawScene() {
        drawField();
    }

    private void createStars() {
        stars = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            stars.add(new Star(Math.random()*64, Math.random()*64));
        }
    }
}
