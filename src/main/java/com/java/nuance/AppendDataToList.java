package com.java.nuance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendDataToList {

    private List<Integer> orginalList;

    public AppendDataToList(List<Integer> orginalList) {
        this.orginalList = orginalList;
    }

    public void appendGivenListToTheBegining(List<Integer> list) {
        orginalList.addAll(0, list);

    }

    public List<Integer> getListData() {
        return orginalList;
    }

    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(40, 50, 60, 70));


        AppendDataToList appendDataToList = new AppendDataToList(dataList);

        List<Integer> newList = Arrays.asList(10, 20, 30);
        appendDataToList.appendGivenListToTheBegining(newList);

        appendDataToList.getListData().forEach(System.out::println);
    }
}
