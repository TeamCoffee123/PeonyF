package com.company;

public class TreeHeavenDisaster1 {
    /*
    높은 고도의 위치로 인해 자외선 상승
    태양온도로 구분하지말고 자외선 발생여부를 boolean으로 할지 고민중
     */
    String itemName = "나무 자외선 차단제";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int fireAmount=6; //적정 태양 온도 표시

    public void PrintSymptom()
    {
        System.out.println("자외선이 너무 강하여 나무가 시들어 가고 있습니다.");
        //나중에 스레드 사용 예정
    }
}
