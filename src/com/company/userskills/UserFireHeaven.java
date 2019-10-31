package com.company.userskills;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserFireHeaven extends UserSkills {
    final ConcurrentMap userSkills = new ConcurrentHashMap<>();
    public UserFireHeaven(String job, int uerLevel) {
        super("fire", 90);
        userSkills.put("파이어 볼",22);
        userSkills.put("파이어 애로우",24);
        userSkills.put("파이어 회오리",26);
        userSkills.put("파이어 스피릿",28); //화염 방사기
        setUserSkills(userSkills);
    }
}
