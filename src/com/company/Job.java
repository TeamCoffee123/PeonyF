package com.company;

import com.company.userskills.*;

import java.util.concurrent.ConcurrentMap;

public class Job {
    private UserSkills userSkills;

    public Job(ElementType elementType) {
        switch (elementType) {
            case WATER:
                userSkills = new UserWaterSpirit();
                break;
            case EARTH:
                userSkills = new UserEarthSpirit();
                break;
            case WIND:
                userSkills = new UserWindSpirit();
                break;
            case FIRE:
                userSkills = new UserFireSpirit();
                break;
        }
    }

    public ConcurrentMap<String, Integer> getUserSkills() {
        return userSkills.getUserSkills();
    }
}
