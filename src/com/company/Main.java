package com.company;

import java.util.Arrays;
/**
Класс точка входа в программу. Создание новой библиотеки с фильмами
 */
public class Main {

    public static void main(String[] args) {

        Library library = new Library("Movie Library");
        int numberCell = 0;
        do {
            numberCell = library.searchEmptyCell(library);
            if (numberCell != -1) {
                library.films[numberCell] = new Film("New Film", 100, "New genre");
            } else {
                System.out.println("Вы достигли лимита");
            }
        } while (numberCell != -1);

        System.out.println(Arrays.toString(library.films));
    }


}









