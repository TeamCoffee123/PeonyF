package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterHades extends Monster {
    public HeavenMonsterHades()
    {
        super("하데스",29);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("어둠의 정령 소환",31);
        skills.put(" ",33);
        skills.put(" ",35);
        skills.put(" ",37);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str = " ";
        return super.toString();
    }
}
