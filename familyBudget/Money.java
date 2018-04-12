package com.oprotsen.JavaOOP.familyBudget;

import java.util.Iterator;
import java.util.List;

public class Money implements Iterable<Card>{
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

    public Card getCard(CardType type) {
        for (Card elem : cards) {
            if (elem.getCardType().equals(type))
            return elem;
        }
        return null;
    }

    public long getCardsMoney() {
        long cardsMoney = 0;
        for (Card elem : cards)
            cardsMoney += elem.getMoney();
        return cardsMoney;
    }

    public long getMoney() {
        long cardMoney = 0;
        for (Card elem: cards) {
            cardMoney += elem.getMoney();
        }
        return cardMoney + cash.getMoney();
    }

    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }
    @Override
    public String toString() {
        return "Money{" +
                "cash=" + cash +
                ", cards=" + cards +
                "";
    }
}
