package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) throws EnterException {
        System.out.println("Добро пожаловать в Калькулятор. Введите выражение в одну строку. Можно вводить целые числа от 1 до 10 или римские цифры от I до X Например, 1 + 5 или I + V");
        ReadingClass arr = new ReadingClass();
        String[] arrString = arr.readNextString();
        if (arrString.length < 3)
        {
            try {
                throw new EnterException("Не верно введено выражение, необходимо отделить пробелами.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            String one = arrString[0],two = arrString[2];
            int num1=0, num2=0;
            String operation = arrString[1];


        RomanNumbers roman = new RomanNumbers();


        if(List.of("1","2","3","4","5","6","7","8","9","10").contains(one) || List.of("1","2","3","4","5","6","7","8","9","10").contains(two)) {
            num1 = Integer.parseInt(one);
            num2 = Integer.parseInt(two);
            switch (operation){
                case "+" : System.out.println(num1+num2);
                    break;
                case "-" : System.out.println(num1-num2);
                    break;
                case "*" : System.out.println(num1*num2);
                    break;
                case "/" : System.out.println(num1/num2);
                    break;
                default: break;
            }
        }
        else if (List.of("I","II","III","IV","V","VI","VII","VIII","IX","X").contains(one) || List.of("I","II","III","IV","V","VI","VII","VIII","IX","X").contains(two))
        {
            num1 = roman.romanToInt(one);
            num2 = roman.romanToInt(two);
            switch (operation){
                case "+" : System.out.println(roman.intToRoman(num1+num2));
                    break;
                case "-" : System.out.println(roman.intToRoman(num1-num2));
                    break;
                case "*" : System.out.println(roman.intToRoman(num1*num2));
                    break;
                case "/" : System.out.println(roman.intToRoman(num1/num2));
                    break;
                default: break;
            }
        }
        else System.out.println("You entered not Integer or Roman numbers");


    }
}