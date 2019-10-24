package com.company;

public class TreeSpiritDisaster3 {
     /*
      홍수가 발생시 방어를 해주는 아이템 입니다.
     */


    String itemName = "홍수 방지벽 설치";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int waterAmount=10; //줄어드는 수분도 표시

    public void PrintSymptom()
    {
        System.out.println("홍수가 발생하여 나무에 물이 들어오고 있습니다. ");
        //나중에 스레드 사용 예정
    }
}
