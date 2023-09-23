package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new HashSet<>();
        for (String day: days) {
            if(timetable.containsKey(day)){
                set.addAll(timetable.get(day));
            }
        }
        return set;
    }



}
