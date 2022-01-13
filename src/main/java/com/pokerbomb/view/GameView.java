package com.pokerbomb.view;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.model.game.powerup.PowerUp;
import com.pokerbomb.view.game.powerup.DynamitePowerUpView;
import com.pokerbomb.view.game.powerup.FrozenPowerUpView;
import com.pokerbomb.view.game.powerup.JunglePowerUpView;
import com.pokerbomb.view.game.powerup.PowerUpView;

import java.io.IOException;

public class GameView extends View<Game>{

    FactoryView factory;
    BorderView borderView;


    public GameView(Game model, FactoryView factoryView) {
        super(model);
        this.factory = factoryView;
        initScreen();
    }

    private void drawShelves() {
        factory.genShelfView(model.getShelves().get(0), graphics).draw(5,13);
        factory.genShelfView(model.getShelves().get(1), graphics).draw(5,21);
        factory.genShelfView(model.getShelves().get(2), graphics).draw(5,39);
    }

    public void drawSelectedBorder() {
        Game.Cell selected = model.getSelected();
        int COL_BEGIN_SELECTED = this.getSize().getColumns() / 2 - 8;
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        borderView.draw(COL_BEGIN_SELECTED, getStringLine(model.getPosElem(selected)) - 1);
    }

    private void drawCards()  {
        TextColor textColor = graphics.getBackgroundColor();
        try {
            factory.genDeckView(model.getGivenDeck(), graphics).draw(6, 14);
        } catch (IOException e) {
            e.printStackTrace();
        }
        graphics.setBackgroundColor(textColor);
    }


    public void drawQuests() {
        //draw the level quests
    }

    public void drawPoints() {
        //draw current points
    }

    private void drawPowerUps() {
        int col = 10;
        int row = 50;
        for(PowerUp i: model.getPowerUps()){
            try {
                factory.genPowerUpView(i, graphics).draw(col, row);
            } catch (IOException e) {
                e.printStackTrace();
            }
            col += 20;
        }
    }

    

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        graphics.setBackgroundColor(TextColor.Factory.fromString("#010326"));
        graphics.fillRectangle(new TerminalPosition(col, row), getSize(), ' ');


        //draws all the shelves visible on the screen
        drawShelves();

        //drawDecks();



        //draw cards on the screen
        drawCards();


        //drawSelectedBorder();   draw selected card border


        drawPowerUps();
        refresh();
    }
}