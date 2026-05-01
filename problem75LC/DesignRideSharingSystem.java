package problem75LC;

import java.util.LinkedList;
import java.util.Queue;

public class DesignRideSharingSystem {
    Queue<Integer> riders;
    Queue<Integer> drivers;
    

    public DesignRideSharingSystem() {
        riders = new LinkedList<>();
        drivers = new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        riders.offer(riderId);
    }
    
    public void addDriver(int driverId) {
        drivers.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(drivers.isEmpty() || riders.isEmpty()) return new int[] {-1, -1};
        return new int[] {drivers.poll(), riders.poll()};
    }
    
    public void cancelRider(int riderId) {
        riders.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
