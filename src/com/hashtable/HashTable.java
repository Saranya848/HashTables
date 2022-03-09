package com.hashtable;
import java.util.*;
public class HashTable {
    public static void main(String[] args) {

        String s = "to be or not to be";
        String a[] = s.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);
    }
}
