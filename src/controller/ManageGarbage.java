package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.GarbageTruck;

public class ManageGarbage {
    Scanner sc = new Scanner(System.in);
    GarbageTruck xeRac = new GarbageTruck();
    ArrayList<Integer> garList = new ArrayList<>();
    public void run() {
        System.out.println("Enter the amount of garbage at each station in order by quantity (kg) (Please stop input = enter -1): ");

        int newElement;
        while(true) {
            newElement = sc.nextInt();
            if (newElement!=-1) garList.add(newElement);
            else break;
            
         }
        System.out.printf("The total cost is %.0f VND\n", xeRac.findCost(garList));
    }

}

