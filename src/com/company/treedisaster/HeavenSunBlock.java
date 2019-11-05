package com.company.treedisaster;

public class HeavenSunBlock extends TreeDisaster {
    /*
    높은 고도의 위치로 인해 자외선 상승
    태양온도로 구분하지말고 자외선 발생여부를 boolean으로 할지 고민중
     */

    public  HeavenSunBlock()
    {
        super("나무 자외선 차단제",1,0,0,0,0,-6,0);

    }

    public String printSymptom()
    {
        String treeSymptom = "자외선이 너무 강하여 나무가 시들어 가고 있습니다.";
        return treeSymptom;
    }


}
