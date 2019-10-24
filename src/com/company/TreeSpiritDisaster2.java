package com.company;

public class TreeSpiritDisaster2 {
    /*
     물양 조절실패로 아이템 획득율 0.5% 하락
     */


    String itemName = "물 양 자동 조절 기계";
    int amount; //수량 확인
    int choice; //사용여부 확인
    double dropRate =0.5; //아이템획득율 감소

    public void PrintSymptom()
    {
        System.out.println("물양이 조절이 되지 않아 아이템 획득율이 하락됩니다.");
        //나중에 스레드 사용 예정
    }



}
