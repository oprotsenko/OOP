package com.oprotsen.JavaOOP.familyBudget;

import java.util.List;

public class Money {
    private Cash cash;
    private List<Card> cards;

    public Money(Cash cash, List<Card> cards) {
        this.cash = cash;
        this.cards = cards;
    }

    private void addCard(Card card) {
        cards.add(card);
    }

    public Cash getCash() {
        return cash;
    }

    public Card getCard() {
        for (Card elem : cards)
            return elem;
        return null;
    }

    public long getMoney() {
        long cardMoney = 0;
        for (Card elem: cards) {
            cardMoney += elem.getMoney();
        }
        return cardMoney + cash.getMoney();
    }
}
