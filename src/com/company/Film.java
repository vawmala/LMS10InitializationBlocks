package com.company;

// 1.1 Создать класс Film. Описать поля: Название, продолжительность, жанр. Создать
//конструктор с параметрами, геттеры и сеттеры.
//1.2 Добавить константные поля жанров, например: комедия, фантастика, ужасы.
//Примечание, для создания экземпляра класса Film, пользоваться этими константами.
//1.3 Добавить блок инициализации в котором вывести на экран сообщение: «Создается
//новый Фильм».
//В конструкторе добавить вывод на экран сообщение: «Фильм “название”, успешно
//создана.»

/**
 Класс для создания фильма
  */

public class Film {
    private String title;
    private int duration;
    private String genre;

    public static final String GENRE_COMEDY = "Comedy";
    public static final String GENRE_FANTASY = "Fantasy";
    public static final String GENRE_HORROR = "Horror";

    static {
        System.out.println("Создание нового фильма");
    }

    public Film(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + this.title + " успешно создан.");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
