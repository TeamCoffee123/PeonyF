package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterAkan extends Monster {
    public SpiritMonsterAkan()
    {
        super("아칸",6);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("",8);
        skills.put("",10);
        skills.put("",12);
        skills.put("",14);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 6 : 아칸] 모든 마을을 얼음의 마을로 바꾸겠어! 얼음의 정령들! 어서 다 얼려버리자고!";
        return super.toString();
    }
}
