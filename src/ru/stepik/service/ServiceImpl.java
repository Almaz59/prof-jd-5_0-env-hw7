package ru.stepik.service;

import java.util.*;

public class ServiceImpl implements Service {

    @Override
    public void findOddNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void findEvenNumbers(List<Integer> nums) {
        List<Integer> nums1 = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 == 0) {
                System.out.print(nums1.get(i) + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void findUniqueWords(List<String> words) {
        List<String> words1 = new ArrayList<>(new HashSet<>(words));
        for (int i = 0; i < words1.size(); i++) {
            System.out.print(words1.get(i));
        }
        System.out.println();
    }


    @Override
    public void findCountOfDuplicatesWords(Map<Integer, String> words) {
        ArrayList<String> values = new ArrayList<>(words.values());
        Collections.sort(values);
        int count = 1;
        for (int i = 0; i < values.size() - 1; i++) {
            if (values.get(i).equals(values.get(i + 1))) {
                count++;
            }
        }
        System.out.print(count);
    }
}


