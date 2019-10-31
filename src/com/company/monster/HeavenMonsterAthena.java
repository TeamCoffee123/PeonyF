package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterAthena extends Monster {
    public HeavenMonsterAthena()
    {
        super("아테나",27);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" 다툼의 정령 소환",29);
        skills.put(" ",31);
        skills.put(" ",33);
        skills.put(" ",35);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str= " ";
        return super.toString();
    }
}
