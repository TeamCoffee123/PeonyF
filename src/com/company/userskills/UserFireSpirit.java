package com.company.userskills;

import com.company.User;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserFireSpirit extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();

    public UserFireSpirit(String job, int uerLevel) {
        super("fire", 0);
        userSkills.put("파이어 볼",2);
        userSkills.put("파이어 애로우",4);
        userSkills.put("파이어 회오리",6);
        userSkills.put("파이어 스피릿",8); //화염 방사기
        setUserSkills(userSkills);
    }


}
