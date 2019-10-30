package com.company.treedisaster;

public class MiddleWindMissingItem extends TreeDisaster{
    /*
    아이템 획득시 발생
    바람정령의 장난으로 아이템 유실
     */

    public  MiddleWindMissingItem()
    {
        super("아이템 유실 방지 주문서",1,0,0,0,0,0,0.8);

    }

    public String printSymptom()
    {
        String treeSymptom = "바람정령의 장난으로 아이템 유실이 발생하고 있습니다.";
        return treeSymptom;
    }


}
