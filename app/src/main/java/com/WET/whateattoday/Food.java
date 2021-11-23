package com.WET.whateattoday;

public class Food {

    public Food(String name, int category1, int category2, int howManyPeople, int howManyHungry, int image) {
        this.name = name;
        this.category[category1] = true;
        this.category[category2] = true;
        this.howManyPeople = howManyPeople;
        this.howManyHungry = howManyHungry;
        this.image = image;
    }

//    음식 이름
    String name;

//    음식 카테고리
//    0 = 밥
//    1 = 면
//    2 = 떡,빵
//    3 = 요리
//    4 = 한식
//    5 = 일식
//    6 = 중식
//    7 = 양식
//    8 = 간식
//    9 = 카페음료
//    10 = 분식
//    11 = 자투리
    boolean[] category = new boolean[12];

//    몇명이 먹는지
    int howManyPeople;

//    허기진 정도
    int howManyHungry;

//    이미지
    int image;

}
