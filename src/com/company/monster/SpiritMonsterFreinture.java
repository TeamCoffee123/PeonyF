package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterFreinture extends Monster {
    public SpiritMonsterFreinture()
    {
        super("프린셔",10);
        final ConcurrentMap<String ,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",12);
        skills.put("",14);
        skills.put("아이스 드랍",16);
        skills.put("강한 눈보라",18);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 10 : 프린셔] 내가 바로 얼음의 왕 프린셔, 네가 감히 나와 싸우려고 하다니 겁도 없구나";
        return super.toString();
    }
}
