package com.liamtseva.simplebank;

import com.liamtseva.simplebank.entity.Account;
import com.liamtseva.simplebank.entity.Person;
import com.liamtseva.simplebank.entity.Product;

public class GeneratorInform {
  public static Product[] products = new Product[10];
  private static Account[] accounts = new Account[2];
  private static Card[] cards = new Card[2];
  private static Person[] persons = new Person[2];

  public GeneratorInform() {
  }

  public static void main(String[] args) {
    initializePerson();
    initializeProducts();
  }
  public static Person[] initializePerson(){
    initializeAccount();
    persons[0] = new Person("Лямцева Олександра", "sashka", "1234", accounts[0]);
    persons[1] = new Person("Мельник Дарина", "dasha12", "1111", accounts[1]);
    return persons;
  }
  public static Account[] initializeAccount(){
    initializeCard();
    accounts[0] = new Account(1, 1000.0, "USD", cards[0]);
    accounts[1] = new Account(2, 1500.0, "EUR", cards[1]);
    return accounts;
  }
  public static Card[] initializeCard(){
    cards[0] = new Card(123456789, 1111);
    cards[1] = new Card(987654321, 9999);
    return cards;
  }
  public static Product[] initializeProducts() {
    products[0] = new Product(1, "Комп'ютер", "Крутий комп'ютер", 1000);
    products[1] = new Product(2, "Ручка", "Кулькова ручка з синім чорнилом", 1.5);
    products[2] = new Product(3, "Ноутбук", "Формат А5, 80 сторінок, лініювання", 3);
    products[3] = new Product(4, "Маркер", "Жовтий, з відхиленою підставкою", 1);
    products[4] = new Product(5, "Набір олівців", "Набір з 12 олівців, різні кольори", 2.5);
    products[5] = new Product(6, "Гумка", "Біла гумка, без латексу", 0.75);
    products[6] = new Product(7, "Книга", "Книга художньої літератури", 15.99);
    products[7] = new Product(8, "Стілець", "Дерев'яний стілець", 45.99);
    products[8] = new Product(9, "Стіл", "Кавовий стіл", 99.99);
    products[9] = new Product(10, "Навушники", "Бездротові навушники", 149.99);
    return products;
  }
}