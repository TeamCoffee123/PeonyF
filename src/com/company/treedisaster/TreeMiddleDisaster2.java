package com.company.treedisaster;

public class TreeMiddleDisaster2 {
    /*
    나무에 해충이 생김
     */

    String itemName = "바람을 강하게 불게 하는 주문서";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int windAmount=6; //감소하는 공기의 양 표시

    public void PrintSymptom()
    {
        System.out.println("바람이 약하게 불어 나무에 해충이 붙어있습니다.");
        //나중에 스레드 사용 예정
    }
}
