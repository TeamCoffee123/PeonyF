package com.company;



import java.util.*;

public class EarthShop {
    int price;
    User user = new User();


    public void sellEarthItem() {
        HashMap<String, Integer> earthItemList = new HashMap<String, Integer>(); //돌의마을 상점 아이템 리스트 및 가격 출력
        earthItemList.put("비옥땅 영양제",4); //비옥땅 영양제 : 땅을 비옥하게 하는 아이템 , 아이템 드랍율 2배 증가
        earthItemList.put("지진 방지 주문서",4); //지진 방지 주문서 : 지진 발생 이벤트 발생 시 방어
        earthItemList.put("잡초 증식 방지 아이템",4); //잡초 증식 방지 아이템 : 잡초가 증식시 방지 아이템
        earthItemList.put("토지안 벌레 제거 아이템",4); //토지안 벌레 제거 아이템: 토지안에 벌레가 생겼을때 제거 아이템

        //아이템 리스트 설명
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("[가격: 정령의 돌 4개] 비옥땅 영양제: 땅을 비옥하게 하여 아이템 드랍율을 2배  증가시켜주는 아이템 입니다. ");
        System.out.println("[가격: 정령의 돌 4개] 지진 방지 주문서: 지진이 발생시 방어를 해주는 아이템 입니다. ");
        System.out.println("[가격: 정령의 돌 4개] 잡초 증식 방지 아이템: 잡초가 많이 자랐을때 증식을 방지하는데 도움을 주는 아이템 입니다.");
        System.out.println("[가격: 정령의 돌 4개] 토지안 벌레 제거 아이템: 토지안에 벌레가 생겼을 경우, 벌레를 제거해주는 아이템 입니다. ");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");

         Set<Map.Entry<String, Integer>> entries = earthItemList.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }








    }
}
