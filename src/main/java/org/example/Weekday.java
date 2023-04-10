package org.example;

public enum Weekday {

    SUNDAY ("Сегодня воскресенье"),
    MONDAY ("Сегодня понедельник"),
    TUESDAY ("Сегодня вторник"),
    WEDNESDAY ("Сегодня среда"),
    THURSDAY ("Сегодня четверг"),
    FRIDAY ("Сегодня пятница"),
    SATURDAY ("Сегодня суббота");

    private String message;
    Weekday(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
