package com.company;

public enum ElementType {
    FIRE(1),
    WATER(2),
    WIND(3),
    EARTH(4);

    ElementType(int num) {
        this.num = num;
    }

    private final int num;

    public static ElementType findByNum(int num) {
        for (ElementType type : ElementType.values()) {
            if (type.num == num) {
                return type;
            }
        }
        return FIRE;
    }
}


