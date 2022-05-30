package com.devexpress.reto.utils;

public class Transformations {

    public static String replaceValue(String value, String oldcharacter, String newcharacter) {
        return value.replace(oldcharacter, newcharacter);
    }

    public static String splitGetValue(String value, String character, int index) {
        return value.split(character)[index];
    }

    public static Integer stringToInteger(String value) {
        return Integer.parseInt(value);
    }
}
