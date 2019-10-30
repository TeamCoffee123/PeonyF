package com.company.treedisaster;

public class SpiritPreventEarthquake extends TreeDisaster{
    /*
    가뭄 발생
     */

    public SpiritPreventEarthquake()
    {
        super("가뭄 방지 주문서",1,0,0,10,0,0,0);

    }

    public String printSymptom()
    {
        String treeSymptom = "지진이 발생하여 땅 곳곳에서 균열이 생겼습니다.";
        return treeSymptom;
    }


}
