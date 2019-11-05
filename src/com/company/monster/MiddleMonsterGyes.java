package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterGyes extends Monster {
    public MiddleMonsterGyes()
    {
        super("기에스",20);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",22);
        skills.put(" ",24);
        skills.put(" ",26);
        skills.put(" ",28);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="";
        return super.toString();
    }
}
