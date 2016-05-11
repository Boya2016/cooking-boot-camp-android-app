package model;

import java.util.Comparator;


public class UserComparator implements Comparator<User>{
    @Override
    /**
     * This method overrides the original and sort the array.
     */
    public int compare(User a, User b) {
        if (a.getDistance() < b.getDistance()) return -1;
        else if (a.getDistance() > b.getDistance()) return 1;
        else return 0;
    }
}
