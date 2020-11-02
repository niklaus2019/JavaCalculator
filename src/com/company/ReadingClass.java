package com.company;
import java.util.Scanner;
//класс для считывания выражения
public class ReadingClass {
    //метод, который возвращает массив строк
    public String [] readNextString() {

            Scanner expression = new Scanner(System.in); //создание обЪекта класса Scanner для ввода с клавиатуры
            String string = expression.nextLine(); //переменная, которая хранит одну строку, которую введет пользователь с клавиатуры
            String[] arrString = string.split(" ");//массив строк, разделенных пробелом
            return arrString;
        }
}
