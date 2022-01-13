package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class TheHouseIsFullGoal extends Goal implements GoalIncrement{
    public TheHouseIsFullGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "THE HOUSE IS FULL!";
        this.description = String.format("Collect %s \"full houses\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (Hand.isFullHouse(hand.getCards())) {
            currentQuantity++;
        }
        checkAchieved();
    }
}