package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterFloe extends Monster {
    public SpiritMonsterFloe()
    {
        super("플로우",8);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",10);
        skills.put("",12);
        skills.put("",14);
        skills.put("눈보라",16);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 8 : 플로우] 아뭄이 어디갔지? 아니 여기 살아있는 정령이 아직 있잖아? 내가 없애주지";
        return super.toString();
    }
}
