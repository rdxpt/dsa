/**
 * D es ig nA uc ti on Sy st em
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
package problem75LC;

import java.util.Map;
import java.util.TreeSet;
import java.util.HashMap;

public class DesignAuctionSystem{

    private static class Bid implements Comparable<Bid>{
        int userId;
        int amount;

        public Bid(int userId, int amount){
            this.userId = userId;
            this.amount = amount;
        }
        @Override
        public int compareTo(Bid other){
            if(this.amount != other.amount){
                return Integer.compare(other.amount, this.amount);
            }
            return Integer.compare(other.userId, this.userId);
        }
    }

    private Map<Integer, TreeSet<Bid>> itemBids;
    private Map<Integer, Map<Integer, Integer>> userBids;

    public DesignAuctionSystem() {
        itemBids = new HashMap<>();
        userBids = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        itemBids.putIfAbsent(itemId, new TreeSet<>());
        userBids.putIfAbsent(itemId, new HashMap<>());

        if(userBids.get(itemId).containsKey(userId)){
            int oldAmount = userBids.get(itemId).get(userId);
            itemBids.get(itemId).remove(new Bid(userId, oldAmount));
        }

        userBids.get(itemId).put(userId, bidAmount);
        itemBids.get(itemId).add(new Bid(userId, bidAmount));
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
        addBid(userId, itemId, newAmount);
    }
    
    public void removeBid(int userId, int itemId) {
        if(!userBids.containsKey(itemId) || !userBids.get(itemId).containsKey(userId)) return;
        int amount = userBids.get(itemId).get(userId);
        userBids.get(itemId).remove(userId);
        itemBids.get(itemId).remove(new Bid(userId, amount));
    }
    
    public int getHighestBidder(int itemId) {
        if(!itemBids.containsKey(itemId) || itemBids.get(itemId).isEmpty()){
            return -1;
        }

        return itemBids.get(itemId).first().userId;
    }
}

class AuctionSystem {
    // Using simple hashmap we hit TLE issue.
    Map<Integer, Map<Integer, Integer>> map;

    public AuctionSystem() {
        this.map = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        map.computeIfAbsent(itemId, k -> new HashMap<>());
        map.get(itemId).put(userId, bidAmount);
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
        map.get(itemId).put(userId, newAmount);
    }
    
    public void removeBid(int userId, int itemId) {
        map.get(itemId).remove(userId);
    }
    
    public int getHighestBidder(int itemId) {
        if(!map.containsKey(itemId) || map.get(itemId).isEmpty()) return -1;

        int highestUser = -1;
        int highestAmt = -1;

        for(Map.Entry<Integer, Integer> entry : map.get(itemId).entrySet()){
            int user = entry.getKey();
            int amt = entry.getValue();

            if(amt > highestAmt){
                highestAmt = amt;
                highestUser = user;
            } else if (amt == highestAmt){
                if(user > highestUser) highestUser = user;
            }
        }

        return highestUser;
    }
}


/**
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */
