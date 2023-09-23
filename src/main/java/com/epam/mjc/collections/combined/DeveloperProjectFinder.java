package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {


        Comparator<String> comparator = (o1, o2) -> {
            if(o1.length()==o2.length()){
                return o1.compareTo(o2)*-1;
            }
            else {
                if(o1.length()>o2.length()) return -1;
                else return 1;
            }
        };


        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> str: projects.entrySet()) {
            if(str.getValue().contains(developer)){
                list.add(str.getKey());
            }
            list.sort(comparator);
        }
        System.out.println(Arrays.toString(list.toArray()));
        return list;
    }
}
