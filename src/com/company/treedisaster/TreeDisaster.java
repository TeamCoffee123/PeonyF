package com.company.treedisaster;

public class TreeDisaster {
    private final String itemName;
    private int amountItem;
    private final int usedItem;
    private final int waterAmount;
    private final int earthAmount;
    private final int windAmount;
    private final int fireAmount;
    private final double dropRate;

    public TreeDisaster(String itemName, int usedItem, int amountItem, int waterAmount, int earthAmount, int windAmount, int fireAmount, double dropRate) {

        this.itemName = itemName;
        this.waterAmount = waterAmount;
        this.earthAmount = earthAmount;
        this.windAmount = windAmount;
        this.fireAmount = fireAmount;
        this.dropRate = dropRate;
        this.usedItem = usedItem;
        this.amountItem = amountItem;
    }

    public String getItemName() {
        return itemName;
    }

    public int getUsedItem() {

        return usedItem;
    }

    public int getAmountItem() {

        return amountItem;
    }

    public int getWaterAmount() {

        return waterAmount;
    }

    public int getEarthAmount() {

        return earthAmount;
    }

    public int getFireAmount() {

        return fireAmount;
    }

    public int getWindAmount() {
        return windAmount;
    }

    public double getDropRate() {
        return dropRate;
    }

    public String printSymptom() {

        return "나무 상태 출력";
    }
}
