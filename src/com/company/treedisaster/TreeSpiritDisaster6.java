package com.company.treedisaster;

public class TreeSpiritDisaster6 {
    /*
    지진 발생
     */

    String itemName = "지진 방지 주문서";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int earthAmount=10; //줄어드는 비옥도 표시

    public void PrintSymptom()
    {
        System.out.println("지진이 발생하여 땅 곳곳에서 균열이 생겼습니다.");
        //나중에 스레드 사용 예정
    }
}
