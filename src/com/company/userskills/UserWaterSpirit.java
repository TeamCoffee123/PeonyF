package com.company.userskills;

import com.company.User;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserWaterSpirit extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();
    public UserWaterSpirit(String job, int uerLevel) {
        super("water", 0);

        userSkills.put("워터 스매시",2);
        userSkills.put("워터 캐논",4); //물대포
        userSkills.put("토네이도",6);
        userSkills.put("워터 스피릿",8); //물의 정령으로 못움직이게 함
        setUserSkills(userSkills);
    }


}
