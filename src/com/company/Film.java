package com.company;

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
