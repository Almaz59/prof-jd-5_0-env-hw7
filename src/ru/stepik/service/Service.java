package ru.stepik.service;

import ru.stepik.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Service {

    void findOddNumbers(List<Integer> nums1);

    void findEvenNumbers(List<Integer> nums);

    void findUniqueWords(List<String> words);

    void findCountOfDuplicatesWords(Map<Integer, String> words);
}
