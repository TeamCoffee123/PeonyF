package com.company;

import com.company.shop.EarthShop;
import com.company.shop.FireShop;
import com.company.shop.WaterShop;
import com.company.shop.WindShop;

import java.util.Scanner;

public class MarketViewer {
    int choice;
    Scanner sc = new Scanner(System.in);
    FireShop fireShop = new FireShop();
    WaterShop waterShop = new WaterShop();
    WindShop windShop = new WindShop();
    EarthShop earthShop = new EarthShop();



    public void In(){

        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("정령의 상점에 오신것을 환영합니다. 원하시는 상점으로 이동시켜 드리겠습니다.");
        System.out.println("1. 불의 상점: 불의 상인이 자외선 방어아이템을 포함한 온도 관련 아이템, 드랍율 증가 아이템을 판매하고 있습니다.");
        System.out.println("2. 물의 상점: 물의 상인이 물 세균 방어 아이템 및 물 조절 아이템 등 물과 관련된 아이템을 판매하고 있습니다.");
        System.out.println("3. 바람의 상점: 바람의 상인이 바람강약 조절 및 드랍율 증가 아이템을 판매하고 있습니다.");
        System.out.println("4. 돌의 상점: 돌의 상인이 땅을 비옥하게 하는 영양제를 포함한 땅과 관련된 아이템을 판매하고 있습니다.");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println();
        System.out.println("1.불의 상점  2.물의 상점 3.바람의 상점  4.돌의 상점  5.상점나가기");
        System.out.println("원하시는 지역을 선택해주세요 >>>>>>>\t");
        choice  = sc.nextInt();
        switch(choice)
        {
            //((Child) parent).childMethod()

            case 1 : fireShop.sellFireItem();
                break;
            case 2 : waterShop.sellWaterItem();
                break;
            case 3 : windShop.sellWindItem();
                break;
            case 4 : earthShop.sellEarthItem();
                break;
            case 5 :
                break;
        }
    }
}
