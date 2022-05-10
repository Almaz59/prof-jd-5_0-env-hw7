package ru.stepik;

import java.util.List;

public class Data {
    List<Integer> nums;

    public Data(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

}
