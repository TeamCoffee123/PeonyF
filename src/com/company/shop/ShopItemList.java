package com.company.shop;

import java.util.Arrays;
import java.util.List;

public enum ShopItemList {
    EARTH(4, Arrays.asList("비옥땅 영양제","가뭄 방지 주문서","잡초 증식 방지 아이템","토지안 벌레 제거 아이템")),
    WATER(4,Arrays.asList("물 세균 번식 치료제","물 양 자동 조절 기계","홍수 방지벽 설치","물 오염 치료제")),
    WIND(7,Arrays.asList("아이템 유실 방지 주문서","바람을 강하게 불게 하는 주문서","멈춰라 태풍 주문서","바람 조절 주문서")),
    FIRE(10,Arrays.asList("나무 자외선 차단제","온도 상승 마법약","온도 하강 마법약","온화한 날씨 마법 주문서"));

    private int price;
    private List<String> itemList;

    ShopItemList(int price,List<String> itemList){
        this.price=price;
        this.itemList=itemList;
    }
}
