package com.company;

//Описать поля: Массив из фильмов, название библиотеки.
//Добавить блок инициализации в котором создается массив (с размером 5) для поля
//списка фильмов.
//2.1 Поле экземпляра класса «имя» пометить модификатором final.
//2.2 Заполнить первые 2 элемента массива прямо в блоке инициализации. Создать 2 своих
//любимых фильма, и добавить в массив.
//2.3 Вывести сообщения на экран: “Добавлены любимые фильмы”
//2.4 Добавить конструктор для класса Library, который принимает и инициализирует имя
//библиотеки. Вывести сообщение на экран: «Библиотека “название”, успешно создана.»
//2.5 Создать геттеры для полей имя и список фильмов.

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