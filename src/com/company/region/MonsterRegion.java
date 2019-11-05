package com.company.region;

import com.company.monster.Monster;

import java.util.Collections;
import java.util.List;

public class MonsterRegion {
    private int maximumLevelOfMonster;
    private int accessLevel;
    private List<Monster> monsterList;

    public MonsterRegion(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public Monster makeMonster() {
        Collections.shuffle(monsterList);
        return monsterList.get(0);
    }

}
