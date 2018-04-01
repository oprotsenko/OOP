package com.oprotsen.JavaOOP.courseProject;

import java.util.ArrayList;
import java.util.List;

public class Money {
    private Card card;
    private Cash cash;
    private final List<Card> cards = new ArrayList();

    public Money(Card card, Cash cash) {
        this.card = card;
        this.cash = cash;
    }

    public void addCard(){
        cards.add(card);
    }

    public Card getCard() {
        return card;
    }

    public Cash getCash() {
        return cash;
    }

    public long getMoney() {
        long cardsMoney = 0;
        for (Card elem: cards){
            cardsMoney += elem.getMoney();
        }
        return cardsMoney + cash.getMoney();
    }

//    public void setCard(Card card) {
//        this.card = card;
//    }
//
//    public void setCash(Cash cash) {
//        this.cash = cash;
//    }

    @Override
    public String toString() {
        return "Money{" +
                ", card=" + card +
                ", cash=" + cash +
                '}';
    }
}
