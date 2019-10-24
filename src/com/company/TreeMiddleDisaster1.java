package com.company;

public class TreeMiddleDisaster1 {
    /*
    아이템 획득시 발생
    바람정령의 장난으로 아이템 유실
     */

    String itemName = "아이템 유실 방지 주문서";
    int amount; //수량 확인
    int choice; //사용여부 확인
    //double dropRate =0.8; //아이템획득율 감소

    public void PrintSymptom()
    {
        System.out.println("바람정령의 장난으로 아이템 유실이 발생하고 있습니다.");
        //나중에 스레드 사용 예정
    }
}
