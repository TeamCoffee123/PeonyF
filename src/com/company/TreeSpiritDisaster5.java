package com.company;

public class TreeSpiritDisaster5 {
    /*
    비옥땅 영양제-> 아이템 드랍율을 2배  증가
     */

    String itemName = "비옥땅 영양제";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int dropRate=2; //드랍율 증가

    public void PrintSymptom()
    {
        System.out.println("나무의 땅 비옥도를 높여 아이템 드랍율을 2배 올리시겠습니까?");
        //나중에 스레드 사용 예정
    }

}
