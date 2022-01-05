package com.pockerbomb

import spock.lang.Specification

class FrozenCardSpockTest extends Specification{
    FrozenCard frozenCard;
    def setup(){
        frozenCard = new FrozenCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.FrozenCard removeLayers'() {
        when:
            frozenCard.removeSpecialAttribute(1)

        then:
            frozenCard.getSpecialAttribute()==1
    }

    def 'com.pockerbomb.FrozenCard removeLayers 2'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            frozenCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.FrozenCard constructor'() {
        when:
            int numberOfLayers = frozenCard.getSpecialAttribute()

        then:
            numberOfLayers==2
    }

    def 'com.pockerbomb.FrozenCard isActive'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            !frozenCard.isActive()

    }

    def 'com.pockerbomb.FrozenCard PlayWithCombo'() {
        expect:
            !frozenCard.PlayWithCombo(1);
    }

    def 'com.pockerbomb.FrozenCard PlayWithoutCombo'() {
        expect:
            !frozenCard.PlayWithoutCombo();
    }
}
