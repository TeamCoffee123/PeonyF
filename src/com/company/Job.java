package com.company;

import com.company.userskills.*;
import javafx.util.Pair;

import java.util.concurrent.ConcurrentMap;

public class Job {
    private UserSkills userSkills;

    public Job(ElementType elementType){
        switch (elementType){
            case WATER:
                userSkills = new UserWaterSpirit();
                break;
            case WIND:
                userSkills = new UserWindSpirit();
                break;
            case FIRE:
                userSkills = new UserFireSpirit();
                break;
            case EARTH:
                userSkills = new UserEarthSpirit();
                break;
        }
    }

    public ConcurrentMap<Integer, Pair<String, Integer>> getUserSkills()
    {
        return userSkills.getUserSkills();
    }
}
