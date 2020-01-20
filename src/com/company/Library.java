package com.company;

/**
 Класс для создания библиотеки фильмов
 */
public class Library {

    private final String name;
    Film [] films;

    {
        films = new Film[5];
        films[0] = new Film("Matrix", 120, Film.GENRE_FANTASY);
        films[1] = new Film("Ace Ventura", 150, Film.GENRE_COMEDY);
        System.out.println("Добавлены любимые фильмы");
    }

    public Library(String name) {
        this.name = name;
        System.out.println("Библиотека " + name + " успешно cоздана");
    }

    public String getName() {
        return name;
    }

    public Film[] getFilms() {
        return films;
    }


    public int searchEmptyCell(Library library) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                return i;
            }
        }
        return -1;
    }
}