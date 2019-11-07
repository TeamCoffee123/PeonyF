package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MiddleMonsterHyperion extends Monster {
    public MiddleMonsterHyperion()
    {
        super("히페리온",11); //태양의 신(티탄)
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",13);
        skills.put("",15);
        skills.put("",17);
        skills.put("파이어 브레스",19);
        setSkills(skills);
    }

    @Override
    public String scriptMonster() {
        String script=" ";
        return super.scriptMonster();
    }
}
