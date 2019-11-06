package com.company.treedisaster;

public class SpiritRemoveWorms extends TreeDisaster {
    /*
    토양내 벌레 증식
     */

    public SpiritRemoveWorms() {
        super("토지안 벌레 제거 아이템", 1, 0, 0, 4, 0, 0, 0);
    }

    public String printSymptom() {
        return "토지안에 해충이 생겨서 나무를 병들게 하고 있습니다.";
    }
}
