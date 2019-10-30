package com.company.monster;

import java.util.concurrent.ConcurrentMap;

public class Monster {
    private final String monsterName;
    private final int monsterLevel;
    private int monsterHp;
    private ConcurrentMap<String, Integer> skills;

    public Monster(
            String monsterName,
            int monsterLevel
    ) {
        this.monsterName = monsterName;
        this.monsterLevel = monsterLevel;
        monsterHp = monsterLevel * 50;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getMonsterLevel() {
        return monsterLevel;
    }

    public int getMonsterHp() {
        return monsterHp;
    }

    public int attacked(int damage) {
        monsterHp = -damage;
        return monsterHp;
    }

    public ConcurrentMap<String, Integer> getSkills() {
        return skills;
    }

    protected void setSkills(ConcurrentMap<String, Integer> skills) {
        this.skills = skills;
    }
}
