package com.company;

public class TreeStatus {
    int treeWater;
    int treeEarth;
    int treeWind; //중간계 갔을때 확인 가능
    int treeFire; //천상계 갔을때 확인 가능
    //int waterAmount;
    //int earthAmount;

    TreeHeight height = new TreeHeight();



    public void TreeStatusPrint() //나무 키, 수분, 비옥도 확인
    {
        System.out.println("나무의 키가 "+height.treeHeight+"cm 입니다.");
        System.out.println("나무의 수분이 "+treeWater+"% 입니다.");
        System.out.println("토양의 비옥한 정도가  "+treeEarth+"% 입니다.");
    }

}
