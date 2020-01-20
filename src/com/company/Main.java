package com.company;
// 3 Создать класс Main c методом main.
//В методе main создать экземпляр класса Library.
//Запустить программу, проверить порядок вывода сообщений.
//4 Написать метод, который находит первую пустую ячейку массива с фильмами и
//возвращает индекс, если массив полностью заполнен возвращает -1.
//4.1 В методе main реализовать проверку на наличие пустой ячейки и добавить в нее новый
//фильм, если пустой ячейки уже нет – вывести сообщение: «Вы достигли лимита».
//4.2 Запустить, проверить результат выполнения программы
//4.3 Повторить шаги 4.1 - 4.2, пока не будет достигнут лимит.
//5 Написать JavaDoc для классов и методов

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









