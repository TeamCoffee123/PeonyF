package com.company.treedisaster;

public class HeavenTempRise extends TreeDisaster {
    /*
    온도가 높을때
     */

    public HeavenTempRise() {
        super("온도 상승 마법약", 1, 0, 0, 0, 0, 3, 0);

    }

    public String printSymptom() {
        return "온도가 낮아 나무 내부의 온도가 떨어지고 있습니다.";
    }


}
