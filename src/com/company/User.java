package com.company;

import javafx.util.Pair;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class User {
    /*
    각 마을 선택및 스킬 부여, hp 표현, 인벤토리 상태 print
     */
    private int userHp;
    private int userLevel;
    private Job job;

    public User() {
    }

    public void setUserHp(int userHp) {

        this.userHp = userHp;
    }

    public void setUserLevel(int userLevel) {

        this.userLevel = userLevel;
    }

    public void setJob(Job job) {

        this.job = job;
    }

    public int getUserLevel() {

        return userLevel;
    }

    public int getUserHp() {
        return userHp;
    }

    public Job getJob() {

        return job;
    }

    private ConcurrentMap<String, Integer> inventory = new ConcurrentHashMap<>();

    public void setInventory(ConcurrentMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public ConcurrentMap<Integer, Pair<String, Integer>> getSkills() {
        return job.getUserSkills();
    }

}
