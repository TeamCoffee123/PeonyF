package com.company.treedisaster;

public class SpiritPreventWeed extends TreeDisaster {
    /*
    잡초 증식
     */

    public SpiritPreventWeed() {
        super("잡초 증식 방지 아이템", 1, 0, 0, 6, 0, 0, 0);

    }

    public String printSymptom() {

        return "나무주변에 잡초가 증식하여 땅의 비옥도가 떨어지고 있습니다.";
    }
}
