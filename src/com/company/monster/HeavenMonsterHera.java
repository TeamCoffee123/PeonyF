package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterHera extends Monster {
    public HeavenMonsterHera()
    {
        super("헤라",26);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",28);
        skills.put(" ",30);
        skills.put(" ",32);
        skills.put(" ",34);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
