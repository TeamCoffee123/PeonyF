package com.company.treedisaster;

public class MiddleStrongWind extends TreeDisaster{
    /*
    나무에 해충이 생김
     */

    public  MiddleStrongWind()
    {
        super("바람을 강하게 불게 하는 주문서",1,0,0,0,6,0,0);

    }

    public String printSymptom()
    {
        String treeSymptom = "바람이 약하게 불어 나무에 해충이 붙어있습니다.";
        return treeSymptom;
    }


}
