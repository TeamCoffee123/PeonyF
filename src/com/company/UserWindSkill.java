package com.company;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWindSkill extends User{
    public UserWindSkill()
    {
        final ConcurrentMap<String,Integer> userSkills = new ConcurrentHashMap<>();
        userSkills.put("윈드 애로우",2);
        userSkills.put("메가 윈드 애로우",4);
        userSkills.put("윈드 스톰",6);
        userSkills.put("윈드 스피릿",8); //윈드 회오리
        setUserSkills(userSkills);
    }
}
