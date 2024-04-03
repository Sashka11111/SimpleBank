package com.liamtseva.simplebank.entity;

import com.liamtseva.simplebank.Card;
import java.util.ArrayList;
import java.util.List;
public class Account {
  private int accountId;
  private double balance;
  private String currency;
  public List<Transaction> transactionHistory;
  private Card associatedCards;

  public Account(int accountId, double balance, String currency, Card associatedCards) {
    this.accountId = accountId;
    this.balance = balance;
    this.currency = currency;
    this.associatedCards = associatedCards;
    this.transactionHistory = new ArrayList<>();
  }
  public Account(){

  }
  public void withdraw(double amount, int enteredPIN, int cardPIN) {
    if (enteredPIN == cardPIN) {
      if (amount > 0 && balance >= amount) {
        balance -= amount;
        System.out.println("Знято: " + amount + " " + currency);
        transactionHistory.add(new Transaction("Знято", amount));
      } else {
        System.out.println("Недійсна сума зняття або недостатньо коштів.");
      }
    } else {
      System.out.println("Неправильний PIN-код. Не вдалося зняти кошти.");
    }
  }
  public void deposit(double amount, int enteredPIN, int cardPIN) {
    if (enteredPIN == cardPIN) {
      if (amount > 0) {
        balance += amount;
        System.out.println("Депозит: " + amount + " " + currency);
        transactionHistory.add(new Transaction("Депозит", amount));
      } else {
        System.out.println("Недійсна сума депозиту.");
      }
    } else {
      System.out.println("Неправильний PIN-код. Помилка депозиту.");

    }
  }
  public Card addCard(Card card){
    this.associatedCards = card;
    return card;
  }

  public Card getAssociatedCards() {
    return associatedCards;
  }

  public List<Transaction> getTransactionHistory(){ return transactionHistory;}
  public int getAccountId(){
    return accountId;
  }
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCurrency(){
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "Account{" +
        "accountId=" + accountId +
        ", balance=" + balance +
        ", currency='" + currency + '\'' +
        ", transactionHistory=" + transactionHistory +
        ", associatedCards=" + associatedCards +
        '}'  + "\n";
  }
}
