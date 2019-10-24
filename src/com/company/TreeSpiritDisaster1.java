package com.company;

import java.util.Scanner;

public class TreeSpiritDisaster1 {
    /*
     물 세균 번식
     */


    String itemName = "물 세균 번식 치료제";
    int amount; //수량 확인
    int choice; //사용여부 확인
    int waterAmount=4; //줄어드는 수분도 표시

    Inventory inven = new Inventory();
    TreeStatus status = new TreeStatus();
    Scanner sc = new Scanner(System.in);


    public void PrintSymptom()
    {
        System.out.println("물을 주려고 보니 물에 세균이 번식하여 나무의 수분도가 떨어지고 있습니다.");
        //나중에 스레드 사용 예정
    }



    /*
    현재 인벤토리 검사가 되지않고 바로 inventory에 없다고 출력됨.
    Inventory 클래스에 put하여 진행하였지만, 불가능하여 어떻게 이어야할지 고민중입니다.
    (저번에 생성자 이슈와 비슷한것 같은데 고치는 방법을 모르겠습니다.)
     */

    public void SpiritDisaster1InventoryCheck()
    {
        if(inven.inventory.containsKey(itemName)) // Hashmap 인벤토리에서 key값인 "물 세균 번식 치료제"가 있는 경우
        {
            amount = inven.inventory.get(itemName);
            System.out.println(itemName + "가 " + amount+"개 있습니다. 사용하시겠습니까?");
            System.out.println("1. 예    2. 아니요");
            choice  = sc.nextInt();
            if(choice==1)
            {
                //inven.inventory.merge("물 세균 번식 치료제",-1,Integer::sum); //사용시 -1
                System.out.println( itemName+"을 1개 사용하였습니다. 남은 갯수:"+inven.inventory.merge("물 세균 번식 치료제",-1,Integer::sum));
                SpiritDisaster1Yes();
            }
            else if(choice==2)
            {
                System.out.println( itemName+"을 사용하지 않겠습니다.");
                SpiritDisaster1No();
            }
            else
            {
                System.out.println("잘못 입력하셨습니다.");
            }

        } else {
            System.out.println(itemName+"이 없어서 사용하실 수 없습니다.");
            SpiritDisaster1No();

        }
    }//SpiritDisaster1InventoryCheck 끝


    public void SpiritDisaster1Yes()
    {
        System.out.println("물 세균 번식 치료제를 사용하여 세균을 박멸하였습니다.");
    }

    public int SpiritDisaster1No()
    {
        status.treeWater -= waterAmount;
        System.out.println("물에 세균이 번식하여 수분도가 10% 줄어들었습니다.");
        status.TreeStatusPrint();
        /*
        줄어든 수치가 정상적으로 출력되나, main클래스에서 status.TreeStatusPrint() 시 줄어든 수치가 반영되지 않습니다.
        (생성자가 다르기때문에..)
         */
        return  status.treeWater;
    }

}
