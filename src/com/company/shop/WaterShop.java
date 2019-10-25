package com.company.shop;

import com.company.ItemList;

import java.util.HashMap;

public class WaterShop  {
    void sellWaterItem() {

        HashMap<Integer, ItemList> waterItemList = new HashMap<Integer, ItemList>();   //변수 여기서는 대문자를 써도 될까?

        //HashMap에 데이터 입력
        waterItemList.put(1,new ItemList("물 세균 번식 치료제",4)); //물 세균 번식 치료제 : 물 세균 번식이벤트 발생시 방어
        waterItemList.put(2,new ItemList("물 양 자동 조절 기계",4)); //물 양 자동 조절 기계 : 물 양이 늘거나 줄경우 자동 조절해주는 기계
        waterItemList.put(3,new ItemList("홍수 방지벽 설치",4)); //홍수 방지벽 설치 : 홍수 발생 이벤트 발생시 방어
        waterItemList.put(4,new ItemList("물 오염 치료제",4)); //물 오염 치료제: 정령의 장난으로 물이 오염될 경우 치료하는 치료제

        //HashMap 데이터 정보 출력
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println(waterItemList.get(1));
        System.out.println("설명: 이 아이템은 물에 세균이 번식시 치료하는 아이템 입니다. ");
        System.out.println(waterItemList.get(2));
        System.out.println("설명: 이 아이템은 물양이 많거나 적지 않도록 자동 조절해주는 아이템 입니다.");
        System.out.println(waterItemList.get(3));
        System.out.println("설명: 이 아이템은 홍수가 발생시 방어를 해주는 아이템 입니다.");
        System.out.println(waterItemList.get(4));
        System.out.println("설명: 이 아이템은 다른 정령들의 장난으로 물이 오염되었을 때 오염된 물을 정화 해주는 아이템 입니다.");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");



    }
}
