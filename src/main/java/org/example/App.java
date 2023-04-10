package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Введите день недели на английском: ");
        Scanner scanner = new Scanner (System.in);
        String day = scanner.nextLine();
        try {
            Weekday today = Weekday.valueOf(day.toUpperCase());
            System.out.println(today.getMessage());
        } catch (Exception e) {
            System.out.println("Неверный день недели");
        }
     }
}
