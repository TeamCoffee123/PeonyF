package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SpiritMonsterNaga extends Monster {
    public SpiritMonsterNaga() {
        super("나가",1);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put("몸 조르기",2);
        skills.put("꼬리 치기",4);
        skills.put("독침 쏘기",6);
        skills.put("삼키기",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="[레벨 1 : 나가] 낄낄낄 너따위가 날 상대하겠다고? 쉭쉭 어디한번 싸워볼까?";
        //return str;
        return super.toString();
    }
}
