package com.liamtseva.simplebank;

public class Card {
  private int cardNumber;
  private int cardPIN;
  public Card(int cardNumber, int cardPIN) {
    this.cardNumber = cardNumber;
    this.cardPIN = cardPIN;
  }
  public Card(){

  }
  public void printCardInfo() {
    System.out.println("Номер карти: " + cardNumber);
  }
  public int getCardNumber(){ return cardNumber;}
  public int getCardPIN(){ return cardPIN;}
}
