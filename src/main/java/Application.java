import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();
        //menu.mainMenu();


        // Player's info
            long playerCoins = 0;


        // Preparation for the start of a level
            // Create our playing deck
            Deck playingDeck = new Deck();
            playingDeck.createFullDeck();
            playingDeck.shuffle();
            //Create a deck for the player
            Deck playerDeck = new Deck();
            //Create a deck for each shelf
            int numberOfShelfs = 2; // it can be a diferent value
            ArrayList<Deck> shelfsDeck = new ArrayList<>();
            for(int i=0; i<numberOfShelfs; i++) shelfsDeck.add(new Deck());
    }
}
