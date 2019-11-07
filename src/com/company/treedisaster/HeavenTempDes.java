package com.company.treedisaster;

public class HeavenTempDes extends TreeDisaster {
    /*
     온도가 낮을때
     */

    public HeavenTempDes() {
        super("온도 하강 마법약", 1, 0, 0, 0, 0, -3, 0);

    }

    public String printSymptom() {
        return "온도가 높아 나무 내부의 온도가 높아지고 있습니다.";
    }


}
