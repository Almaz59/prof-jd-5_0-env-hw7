package ru.stepik;

import ru.stepik.service.ServiceImpl;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Привет", "Планета, ", "Привет", "Россия, ", "Привет", "Москва, ", "Привет", "Привет"));
        Map<Integer, String> words1 = new HashMap<>(Map.of(1, "Привет, ", 2, "Планета, ", 3, "Привет, ",
                4, "Россия, ", 5, "Привет, ", 6, "Москва, ", 7, "Москва, ", 8, "Россия, "));
        // Задание 1
        service.findOddNumbers(nums);
        // Задание 2
        service.findEvenNumbers(nums);
        // Задание 3
        service.findUniqueWords(words);
        // Задание 4
        service.findCountOfDuplicatesWords(words1);
    }
}