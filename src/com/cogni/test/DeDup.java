package com.cogni.test;

import java.util.*;

public class DeDup {
    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

    public Object[] noDupes(){
        Set<Integer> noDupSet = new HashSet<>();
        Arrays.stream(randomIntegers).forEach(ele -> noDupSet.add(ele));
        return noDupSet.toArray();
    }

    public Object[] noDupesRetainOrder() {
        Set<Integer> noDupColl = new LinkedHashSet<Integer>();
        Arrays.stream(randomIntegers).forEach(ele -> noDupColl.add(ele));
        return noDupColl.toArray();
    }

    public Object[] noDupesWithSorting() {
        Set<Integer> noDupSortedSet = new TreeSet<>();
        Arrays.stream(randomIntegers).forEach(ele -> noDupSortedSet.add(ele));
        return noDupSortedSet.toArray();
    }

    public static void main(String[] args) {
        DeDup deDup = new DeDup();
        System.out.println("Basic logic to remove dupes");
        Object[] noDupes=deDup.noDupes();
        Arrays.stream(noDupes).forEach(e->System.out.println(e));
        System.out.println("To retain order - used LinkedHashSet");
        Object[] noDupesRetainOrder=deDup.noDupesRetainOrder();
        Arrays.stream(noDupesRetainOrder).forEach(e->System.out.println(e));
        System.out.println("Sorted order - TreeSet");
        Object[] noDupesWithSorting=deDup.noDupesWithSorting();
        Arrays.stream(noDupesWithSorting).forEach(e->System.out.println(e));
    }
}