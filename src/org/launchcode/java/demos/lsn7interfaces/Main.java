package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static <allergens> void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //Comparator comparator = new FlavorComparator();
        //Comparator comparator2 = new ConeComparator();

        flavors.sort(new FlavorComparator());
        for(Flavor f : flavors) {
            System.out.println(f);
        }
       cones.sort(new ConeComparator());
        for(Cone c : cones) {
            System.out.println(c);
        }


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
