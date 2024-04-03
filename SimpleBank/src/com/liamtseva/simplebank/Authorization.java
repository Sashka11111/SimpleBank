package com.liamtseva.simplebank;

import com.liamtseva.simplebank.entity.Person;
import java.util.Scanner;

public class Authorization {

  public static void authorization() {

    Scanner scanner = new Scanner(System.in);
    Person[] persons = GeneratorInform.initializePerson();

        System.out.println("Введіть логін");
        String username = scanner.nextLine();
        System.out.println("Введіть пароль");
        String password = scanner.nextLine();

    System.out.println("Ви ввели логін: " + username + " і пароль: " + password);


    for (Person person : persons) {
      if (person.getUsername().equals(username) && person.getPassword().equals(password)) {
        Menu.currentPerson = person;
        break;
      }
    }

    if (Menu.currentPerson != null) {
      System.out.println("Знайдений користувач: " + Menu.currentPerson.getName());
    } else {
      System.out.println("Користувача не знайдено.");
    }
  }
}
