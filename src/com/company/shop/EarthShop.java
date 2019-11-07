package com.company.shop;

import com.company.ItemList;

import java.util.*;

public class EarthShop {

    HashMap<Integer, ItemList> earthItemList = new HashMap<Integer, ItemList>();

    public void sellEarthItem() {
        earthItemList.put(1, new ItemList("비옥땅 영양제", 4)); //비옥땅 영양제 : 땅을 비옥하게 하는 아이템 , 아이템 드랍율 2배 증가
        earthItemList.put(2, new ItemList("가뭄 방지 주문서", 4)); //가뭄 방지 주문서 : 가뭄 발생 이벤트 발생 시 방어
        earthItemList.put(3, new ItemList("잡초 증식 방지 아이템", 4)); //잡초 증식 방지 아이템 : 잡초가 증식시 방지 아이템
        earthItemList.put(4, new ItemList("토지안 벌레 제거 아이템", 4)); //토지안 벌레 제거 아이템: 토지안에 벌레가 생겼을때 제거 아이템
    }

    public void scriptEarthItem() {
        System.out.println("―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println(earthItemList.get(1));
        System.out.println("설명: 이 아이템은 땅을 비옥하게 하여 아이템 드랍율을 2배  증가시켜주는 아이템 입니다.");
        System.out.println(earthItemList.get(2));
        System.out.println("설명: 이 아이템은 가뭄이 발생시 방어를 해주는 아이템 입니다.");
        System.out.println(earthItemList.get(3));
        System.out.println("설명: 이 아이템은 잡초가 많이 자랐을때 증식을 방지하는데 도움을 주는 아이템 입니다.");
        System.out.println(earthItemList.get(4));
        System.out.println("설명: 이 아이템은 토지안에 벌레가 생겼을 경우, 벌레를 제거해주는 아이템 입니다.");
        System.out.println("―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
    }
}
