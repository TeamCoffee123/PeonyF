package com.company;

public class TreeHeavenDisaster4 {
   /*
    아이템 획득시 발생
    온도가 높거나 낮을때 온도를 조절하여 아이템 확률을 2배 증가해준다.
     */
    String itemName = "온화한 날씨 마법 주문서";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int dropRate=2; //드랍율 증가

    public void PrintSymptom()
    {
        System.out.println("온도를 조절하여 아이템 드랍율을 2배 올리시겠습니까?");
        //나중에 스레드 사용 예정
    }
}
