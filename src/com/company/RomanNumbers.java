package com.company;

import java.util.HashMap;
import java.util.Map;
//класс для работы с римскими цифрами
public class RomanNumbers {
    //метод преобразования арабских чисел в римские
    public String intToRoman(int num) {
        String[] hundreds = //массив сотней
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = //массив десяток
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = //массив единиц
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return  hundreds [num / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }
    //метод преобразования римских чисел в арабские
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);


        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
