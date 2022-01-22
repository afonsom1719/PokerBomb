package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class Level13SpockTest extends Specification {
    def 'Level 13 com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card2 = new NormalCard(Suit.CLUB, Rank.TEN)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hands.add(hand1)

        Card card3 = new NormalCard(Suit.HEART, Rank.THREE)
        Card card4 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        Card card6 = new NormalCard(Suit.HEART, Rank.FIVE)
        Hand hand2 = new Hand()
        hand2.addCard(card3)
        hand2.addCard(card4)
        hand2.addCard(card5)
        hand2.addCard(card6)
        hands.add(hand2)

        Card card7 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card8 = new NormalCard(Suit.HEART, Rank.FOUR)
        Hand hand3 = new Hand()
        hand3.addCard(card7)
        hand3.addCard(card8)
        hands.add(hand3)

        Card card9 = new NormalCard(Suit.DIAMOND, Rank.EIGHT)
        Card card10 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        Card card11 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card card12 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card13 = new NormalCard(Suit.SPADE, Rank.NINE)
        Hand hand4 = new Hand()
        hand4.addCard(card9)
        hand4.addCard(card10)
        hand4.addCard(card11)
        hand4.addCard(card12)
        hand4.addCard(card13)
        hands.add(hand4)

        Card card14 = new NormalCard(Suit.HEART, Rank.KING)
        Card card15 = new NormalCard(Suit.CLUB, Rank.KING)
        Hand hand5 = new Hand()
        hand5.addCard(card14)
        hand5.addCard(card15)
        hands.add(hand5)

        Card card16 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        Card card17 = new NormalCard(Suit.CLUB, Rank.JACK)
        Card card18 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Card card19 = new NormalCard(Suit.CLUB, Rank.ACE)
        Hand hand6 = new Hand()
        hand6.addCard(card16)
        hand6.addCard(card17)
        hand6.addCard(card18)
        hand6.addCard(card19)
        hands.add(hand6)

        Card card20 = new NormalCard(Suit.HEART, Rank.SEVEN)
        Card card21 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        Hand hand7 = new Hand()
        hand7.addCard(card20)
        hand7.addCard(card21)
        hands.add(hand7)

        Card card22 = new NormalCard(Suit.SPADE, Rank.TWO)
        Card card23 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card24 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Card card25 = new NormalCard(Suit.CLUB, Rank.FIVE)
        Card card26 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Hand hand8 = new Hand()
        hand8.addCard(card22)
        hand8.addCard(card23)
        hand8.addCard(card24)
        hand8.addCard(card25)
        hand8.addCard(card26)
        hands.add(hand8)

        Card card27 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card28 = new NormalCard(Suit.SPADE, Rank.TEN)
        Hand hand9 = new Hand()
        hand9.addCard(card27)
        hand9.addCard(card28)
        hands.add(hand9)

        Card card29 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card30 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Card card31 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Card card32 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Card card33 = new NormalCard(Suit.SPADE, Rank.KING)
        Hand hand10 = new Hand()
        hand10.addCard(card29)
        hand10.addCard(card30)
        hand10.addCard(card31)
        hand10.addCard(card32)
        hand10.addCard(card33)
        hands.add(hand10)

        Card card34 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        Card card35 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card36 = new NormalCard(Suit.CLUB, Rank.TWO)
        Card card37 = new NormalCard(Suit.HEART, Rank.ACE)
        Card card38 = new NormalCard(Suit.SPADE, Rank.ACE)
        Hand hand11 = new Hand()
        hand11.addCard(card34)
        hand11.addCard(card35)
        hand11.addCard(card36)
        hand11.addCard(card37)
        hand11.addCard(card38)
        hands.add(hand11)

        Card card39 = new NormalCard(Suit.HEART, Rank.SIX)
        Card card40 = new NormalCard(Suit.SPADE, Rank.SIX)
        Hand hand12 = new Hand()
        hand12.addCard(card39)
        hand12.addCard(card40)
        hands.add(hand12)

        Card card41 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        Card card42 = new NormalCard(Suit.CLUB, Rank.SEVEN)
        Card card43 = new NormalCard(Suit.HEART, Rank.NINE)
        Card card44 = new NormalCard(Suit.CLUB, Rank.NINE)
        Hand hand13 = new Hand()
        hand13.addCard(card41)
        hand13.addCard(card42)
        hand13.addCard(card43)
        hand13.addCard(card44)
        hands.add(hand13)

        Card card45 = new NormalCard(Suit.HEART, Rank.FIVE)
        Card card46 = new NormalCard(Suit.CLUB, Rank.FIVE)
        Card card47 = new NormalCard(Suit.SPADE, Rank.TEN)
        Card card48 = new NormalCard(Suit.CLUB, Rank.TEN)
        Hand hand14 = new Hand()
        hand14.addCard(card45)
        hand14.addCard(card46)
        hand14.addCard(card47)
        hand14.addCard(card48)
        hands.add(hand14)

        Card card49 = new NormalCard(Suit.HEART, Rank.JACK)
        Card card50 = new NormalCard(Suit.SPADE, Rank.JACK)
        Hand hand15 = new Hand()
        hand15.addCard(card49)
        hand15.addCard(card50)
        hands.add(hand15)

        Card card51 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card52 = new NormalCard(Suit.HEART, Rank.TEN)
        Hand hand16 = new Hand()
        hand16.addCard(card51)
        hand16.addCard(card52)
        hands.add(hand16)

        Card card53 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Card card54 = new NormalCard(Suit.HEART, Rank.KING)
        Hand hand17 = new Hand()
        hand17.addCard(card53)
        hand17.addCard(card54)
        hands.add(hand17)

        Card card55 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        Card card56 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        Hand hand18 = new Hand()
        hand18.addCard(card55)
        hand18.addCard(card56)
        hands.add(hand18)

        Card card57 = new NormalCard(Suit.SPADE, Rank.TWO)
        Card card58 = new NormalCard(Suit.CLUB, Rank.THREE)
        Card card59 = new NormalCard(Suit.SPADE, Rank.FOUR)
        Card card60 = new NormalCard(Suit.SPADE, Rank.FIVE)
        Card card61 = new NormalCard(Suit.CLUB, Rank.SIX)
        Hand hand19 = new Hand()
        hand19.addCard(card57)
        hand19.addCard(card58)
        hand19.addCard(card59)
        hand19.addCard(card60)
        hand19.addCard(card61)
        hands.add(hand19)

        Card card62 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card63 = new NormalCard(Suit.HEART, Rank.THREE)
        Hand hand20 = new Hand()
        hand20.addCard(card62)
        hand20.addCard(card63)
        hands.add(hand20)

        Card card64 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card65 = new NormalCard(Suit.CLUB, Rank.TWO)
        Card card66 = new NormalCard(Suit.SPADE, Rank.KING)
        Card card67 = new NormalCard(Suit.CLUB, Rank.KING)
        Hand hand21 = new Hand()
        hand21.addCard(card64)
        hand21.addCard(card65)
        hand21.addCard(card66)
        hand21.addCard(card67)
        hands.add(hand21)

        Card card68 = new NormalCard(Suit.SPADE, Rank.ACE)
        Card card69 = new NormalCard(Suit.CLUB, Rank.ACE)
        Hand hand22 = new Hand()
        hand22.addCard(card68)
        hand22.addCard(card69)
        hands.add(hand22)

        Card card70 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card71 = new NormalCard(Suit.SPADE, Rank.NINE)
        Hand hand23 = new Hand()
        hand23.addCard(card70)
        hand23.addCard(card71)
        hands.add(hand23)

        Card card72 = new NormalCard(Suit.HEART, Rank.FOUR)
        Card card73 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Hand hand24 = new Hand()
        hand24.addCard(card72)
        hand24.addCard(card73)
        hands.add(hand24)

        Card card74 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Card card75 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Card card76 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Hand hand25 = new Hand()
        hand25.addCard(card74)
        hand25.addCard(card75)
        hand25.addCard(card76)
        hands.add(hand25)

        SeeingDoubleGoal goal1 = new SeeingDoubleGoal(Type.PAIR, 3)
        TheDoubleDoubleGoal goal2 = new TheDoubleDoubleGoal(Type.TWO_PAIRS, 2)
        ThreesCompanyGoal goal3 = new ThreesCompanyGoal(Type.THREE_OF_A_KIND, 1)

        when:
        for (Hand hand : hands) {
            goal1.increment(hand)
            goal2.increment(hand)
            goal3.increment(hand)
        }

        then:
        goal1.isAchieved() && goal2.isAchieved() && goal3.isAchieved()
    }
}
