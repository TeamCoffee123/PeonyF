package com.company;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWaterSkill extends User{
    public UserWaterSkill()
    {
        final ConcurrentMap<String, Integer> userSkills = new ConcurrentHashMap<>();
        userSkills.put("워터 스매시",2);
        userSkills.put("워터 캐논",4); //물대포
        userSkills.put("토네이도",6);
        userSkills.put("워터 스피릿",8); //물의 정령으로 못움직이게 함
        setUserSkills(userSkills);
    }
}
