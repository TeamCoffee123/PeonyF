package com.company.shop;

import com.company.ItemList;

import java.util.HashMap;

public class WindShop {
    HashMap<Integer, ItemList> windItemList = new HashMap<Integer, ItemList>();

    public void sellWindItem() {
        windItemList.put(1, new ItemList("아이템 유실 방지 주문서", 7)); //아이템 유실 방지 주문서 : 바람이 강하게 불때 아이템이 날라가는것을 방어해 줍니다.
        windItemList.put(2, new ItemList("바람을 강하게 불게 하는 주문서", 7)); //바람을 강하게 불게 하는 주문서 : 나무에 해충이 붙었을 경우 이 주문서를 사용해 해충을 날려버릴 수 있습니다.
        windItemList.put(3, new ItemList("멈춰라 태풍 주문서", 7)); //멈춰라 태풍 주문서 : 태풍이 발생시 피해가 없도록 방어해주는 주문서
        windItemList.put(4, new ItemList("바람 조절 주문서", 7)); //람 조절 주문서: 바람이 강하거나 약할때 바람을 조절하여 아이템 확률을 증가해준다.

    }

    public void scriptWindItem() {
        System.out.println("구매하고 싶은 아이템을 선택해 주세요.");
       //for(ShopItemList shopitemlist : ShopItemList.valueOf(Earth))
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println(windItemList.get(1));
        System.out.println("설명: 이 아이템은바람이 강하게 불때 아이템이 날라가는것을 방어해주는 아이템 입니다. ");
        System.out.println(windItemList.get(2));
        System.out.println("설명: 이 아이템은 나무에 해충이 붙었을 경우 이 주문서를 사용해 해충을 날릴 수 있습니다.");
        System.out.println(windItemList.get(3));
        System.out.println("설명: 이 아이템은 태풍이 발생시 피해가 없도록 방어해주는 주문서 입니다.");
        System.out.println(windItemList.get(4));
        System.out.println("설명: 이 아이템은 바람이 강하거나 약할때 바람을 조절하여 아이템 드랍율을 2배 증가해주는 아이템 입니다.");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");

    }
}
