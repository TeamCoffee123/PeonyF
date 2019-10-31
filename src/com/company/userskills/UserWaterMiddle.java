package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWaterMiddle extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();
    public UserWaterMiddle(String job, int uerLevel) {
        super("water", 60);

        userSkills.put("워터 스매시",12);
        userSkills.put("워터 캐논",14); //물대포
        userSkills.put("토네이도",16);
        userSkills.put("워터 스피릿",18); //물의 정령으로 못움직이게 함
        setUserSkills(userSkills);
    }
}
