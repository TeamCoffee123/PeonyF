package com.company.treedisaster;

public class TreeSpiritDisaster4 {
    /*
       다른 정령들의 장난으로 물이 오염되었을 때 오염된 물을 정화 해주는 아이템 입니다.
     */


    String itemName = "물 오염 치료제";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int waterAmount=6; //줄어드는 수분도 표시

    public void PrintSymptom()
    {
        System.out.println("다른 정령들의 장난으로 물이 오염되었습니다. ");
        //나중에 스레드 사용 예정
    }
}
