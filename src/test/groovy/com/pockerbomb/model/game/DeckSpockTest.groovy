package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class DeckSpockTest extends Specification{
    def 'CreateFullDeck'() {
        given:
        Deck deck = new Deck()

        when:
            deck.createFullDeck()
            ArrayList<NormalCard> cards = deck.getDeck()

        then:
            cards.size()==52
    }

    def 'Shuffle'() {
        given:
            Deck deck = Mock(Deck)
            deck.createFullDeck()

        when:
            deck.shuffle()

        then:
            1 * deck.shuffle()
    }

    def 'AddCard'() {
        given:
            Deck deck = new Deck()
            NormalCard card = new NormalCard(Suit.HEART, Rank.SEVEN)

        when:
            deck.addCard(card)

        then:
            deck.getCard(0)==card
    }

    def 'RemoveCard'() {
        given:
            Deck deck = new Deck()
            NormalCard card = Mock(NormalCard)
            deck.addCard(card)

        when:
            deck.removeCard(0)

        then:
            deck.getDeck().size()==0
    }

    def 'DrawCard'() {
        given:
            Deck deck = new Deck()
            NormalCard card = new NormalCard(Suit.HEART, Rank.ACE)
            deck.addCard(card)

        when:
            NormalCard drawn = deck.pop(deck)

        then:
            drawn == card
    }

    def 'DrawCard 2'() {
        given:
        Deck deck = new Deck()
        NormalCard card = new NormalCard(Suit.HEART, Rank.ACE)
            deck.addCard(card)
            card = new NormalCard(Suit.DIAMOND, Rank.JACK)
            deck.addCard(card)

        when:
            NormalCard drawn = deck.pop(deck, 1)

        then:
            drawn == card
    }

    def 'ToString' () {
        given:
            Deck deck = new Deck()
            NormalCard card = new NormalCard(Suit.DIAMOND, Rank.TWO)
            deck.addCard(card)

        expect:
            deck.toString()== '\nDIAMOND-TWO'

    }

}
