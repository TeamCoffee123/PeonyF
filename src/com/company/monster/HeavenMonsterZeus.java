package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HeavenMonsterZeus extends Monster {
    public HeavenMonsterZeus()
    {
        super("제우스",30);
        final ConcurrentMap<String, Integer> skills = new ConcurrentHashMap<>();
        skills.put("전기 정령 소환",32);
        skills.put("전기 볼 소환",34);
        skills.put(" ",36);
        skills.put(" ",38);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str=" ";
        return super.toString();
    }
}
