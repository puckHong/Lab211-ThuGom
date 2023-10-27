package model;

import java.util.ArrayList;

public class GarbageTruck {

    private int maxCapacity = 10000; // in kg
    private int loadTime = 8; // in minutes
    private int dumpTime = 30; // in minutes
    private int costPerHour = 120000; // in VND
    private int dumpCost = 57000; // in VND tính giá thành vứt rác
    int index = 0;
    int countTruck = 0;
    double time = 0;

    // methods to calculate cost...
    
    public double findCost (ArrayList<Integer> garbageList) {
        double money = 0;
        while (index < garbageList.size()) {
        collectGarbage(garbageList); 
        time = time + dumpTime;
        }
        money = (double) time/60*costPerHour+dumpCost*countTruck;
        return money;
    }
    
    public void collectGarbage (ArrayList<Integer> garbageList) {
        long sum = 0;
        
        while (sum+garbageList.get(index)<=maxCapacity) {
            sum = sum + garbageList.get(index);
            time = time + loadTime;
            index++;
            if (index == garbageList.size()) break;
        }
         countTruck++;
}
}
