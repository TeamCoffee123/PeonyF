package com.company;

public class TreeSpiritDisaster7 {
    /*
    잡초 증식
     */

    String itemName = "잡초 증식 방지 아이템";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int earthAmount=6; //줄어드는 비옥도 표시

    public void PrintSymptom()
    {
        System.out.println("나무주변에 잡초가 증식하여 땅의 비옥도가 떨어지고 있습니다.");
        //나중에 스레드 사용 예정
    }
}
