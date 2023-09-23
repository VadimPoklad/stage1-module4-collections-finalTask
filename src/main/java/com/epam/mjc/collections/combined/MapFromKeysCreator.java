package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> hashMap = new HashMap<>();
        for (Map.Entry<String, Integer> str: sourceMap.entrySet()) {
            Set<String> set;
            if(hashMap.containsKey(str.getKey().length())){
                set = hashMap.get(str.getKey().length());
            }else {
                set = new HashSet<>();
            }
            set.add(str.getKey());
            hashMap.put(str.getKey().length(),set);

        }
        return hashMap;
    }
}
