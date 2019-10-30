package com.company.region;

import com.company.monster.Monster;

import java.util.Collections;
import java.util.List;

public class Region {
    private int maximumLevelOfMonster;
    private int accessLevel;
    private List<Monster> monsterList;

    public Region(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    protected void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public Monster makeMonster() {
        Collections.shuffle(monsterList);
        return monsterList.get(0);
    }
}
