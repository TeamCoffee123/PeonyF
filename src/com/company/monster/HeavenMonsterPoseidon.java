package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterPoseidon extends Monster {
    public HeavenMonsterPoseidon()
    {
        super("포세이돈",22);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",24);
        skills.put(" ",26);
        skills.put(" ",28);
        skills.put(" ",30);
        setSkills(skills);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
