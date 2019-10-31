package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterApollon extends Monster {
    public HeavenMonsterApollon()
    {
        super("아폴론",24); //궁술의 신
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("빛의 정령 소환",26);
        skills.put(" ",28);
        skills.put(" ",30);
        skills.put(" ",32);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str =" ";
        return super.toString();
    }
}
