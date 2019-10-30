package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterAres extends Monster {
    public HeavenMonsterAres()
    {
        super("아레스", 28);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",30);
        skills.put(" ",32);
        skills.put(" ",34);
        skills.put(" ",36);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str= " ";
        return super.toString();
    }
}
