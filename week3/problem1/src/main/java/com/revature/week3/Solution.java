package com.revature.week3;

import java.util.*;

public class Solution {
    public boolean isAnagram(String s1, String s2) {
        
        
        
        if(s1.length() != s2.length()){
            return false;
        }
        int index[] = new int[256];//amount of characters

        for(int i = 0; i<s1.length(); i++){
            index[s1.charAt(i)]++;
            index[s2.charAt(i)]--;
        }
        for (int i = 0; i< 256; i++){
            if(index[i] != 0){
                return false;
            }
        }
        return true;
    //throw new RuntimeException("Todo! Needs implementation...");
    }
}


