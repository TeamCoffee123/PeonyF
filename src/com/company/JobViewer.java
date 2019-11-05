package com.company;

public class JobViewer {

    public JobViewer() {
    }


    public void showMenu() {
        System.out.println("원하는 마을을 선택하세요");
        System.out.println("1. 불의 마을");
        System.out.println("2. 물의 마을");
        System.out.println("3. 바람의 마을");
        System.out.println("4. 땅의 마을");
        System.out.println("선택 >>>>>> ");
    }

    public void initializeJob(User user, ElementType elementType) {
        final Job job = new Job(elementType);
        user.setJob(job);
    }
}
