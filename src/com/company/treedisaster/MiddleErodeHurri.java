package com.company.treedisaster;

public class MiddleErodeHurri extends TreeDisaster {
    /*
    강한 바람으로 태풍 발생
     */

    public MiddleErodeHurri() {
        super("멈춰라 태풍 주문서", 1, 0, 0, 0, -10, 0, 0);

    }

    public String printSymptom() {
        return "태풍이 발생하여 나무가 흔들리고 있습니다. ";
    }
}
