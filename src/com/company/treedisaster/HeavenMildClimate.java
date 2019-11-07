package com.company.treedisaster;

public class HeavenMildClimate extends TreeDisaster {
   /*
    아이템 획득시 발생
    온도가 높거나 낮을때 온도를 조절하여 아이템 확률을 2배 증가해준다.
     */

    public HeavenMildClimate() {
        super("온화한 날씨 마법 주문서", 1, 0, 0, 0, 0, 0, 2.0);
    }

    public String printSymptom() {
        return "온도를 조절하여 아이템 드랍율을 2배 올리시겠습니까?";
    }

}
