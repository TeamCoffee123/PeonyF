package com.company.treedisaster;

public class MiddleWindControl extends TreeDisaster{
    /*
    아이템 획득시 발생
    바람이 강하거나 약할때 바람을 조절하여 아이템 확률을 2배 증가해준다.
     */

    public  MiddleWindControl()
    {
        super("바람 조절 주문서",1,0,0,0,0,0,2);

    }

    public String printSymptom()
    {
        String treeSymptom = "바람을 조절하여 아이템 드랍율을 2배 올리시겠습니까? ";
        return treeSymptom;
    }

}
