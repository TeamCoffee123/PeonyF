package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterDionysos extends Monster {
    public HeavenMonsterDionysos()
    {
        super("디오니소스", 25);
        final ConcurrentMap<String, Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",27);
        skills.put(" ",29);
        skills.put(" ",31);
        skills.put(" ",33);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str= " ";
        return super.toString();
    }
}
