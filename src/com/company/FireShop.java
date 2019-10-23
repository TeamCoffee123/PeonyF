package com.company;

import java.util.HashMap;

public class FireShop  {
    void sellFireItem() {

        //HashMap 생성
        HashMap<Integer, ItemList> fireItemList = new HashMap<Integer, ItemList>();   //변수 여기서는 대문자를 써도 될까?

        //HashMap에 데이터 입력
        fireItemList.put(1, new ItemList("나무 자외선 차단제", 10)); //니무 자외선 차단제 : 자외선 이벤트 발생시 방어
        fireItemList.put(2, new ItemList("온도 상승 마법약", 10)); //온도 상승 마법약 : 날씨가 너무 더울 경우 내려줌
        fireItemList.put(3, new ItemList("온도 하강 마법약", 10)); //온도 하강 마법약 : 날씨가 너무 추울 경우 올려줌
        fireItemList.put(4, new ItemList("온화한 날씨 마법 주문서", 10)); //온화한 날씨 마법 주문서: 아이템 드랍율을 2배

        //HashMap 데이터 정보 출력
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println(fireItemList.get(1));
        System.out.println("설명: 이 아이템은 천상계 나무가 자외선에 의해 약해졌을때 발라주면 좋은 아이템 입니다.");
        System.out.println(fireItemList.get(2));
        System.out.println("설명: 이 아이템은 천상계 나무 주변의 온도가 높을 경우, 사용시 정령나무에게 적정 온도로 변경시켜주는 아이템 입니다.");
        System.out.println(fireItemList.get(3));
        System.out.println("설명: 이 아이템은 천상계 나무 주변의 온도가 높을 경우, 사용시 정령나무에게 적정 온도로 변경시켜주는 아이템 입니다.");
        System.out.println(fireItemList.get(4));
        System.out.println("설명: 이 아이템은 천상계 나무 주변의 온도가 낮을 경우, 사용시 정령나무에게 적정 온도로 변경시켜줘 아이템 드랍율을 2배 증가시킵니다.");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");





    }

}
