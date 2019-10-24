package com.company;

public class TreeSpiritDisaster2 {
    /*
     물양이 많거나 적지 않도록 자동 조절해주는 아이템 입니다.
     */


    String itemName = "물 양 자동 조절 기계";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int waterAmount=2; //줄어드는 수분도 표시

    public void PrintSymptom()
    {
        System.out.println("물양이 조절이 되지 않아 나무에 물이 흘러넘치고 있습니다.");
        //나중에 스레드 사용 예정
    }



}
