package com.revature.week3;

import java.util.*;

public class Solution {
    public int validWordsCount(String sentence) {
        //throw new RuntimeException("Todo! Needs implementation...");
       int valid = 0;
       //valid words
       //hypens
       int hyphen = 0;
       int wordCount = 0;
       char[] array = sentence.toCharArray();
       //loop for seeing every letter
       for(int i = 0; i< array.length; i++){
        //temp
        char temp = array[i];
        if(temp==' '){
            valid++;
        }
        //return back to 0s
        hyphen = 0;
        wordCount = 0;
        i = next(array, i);
        continue;
       }

       if(Character.isDigit(temp)||hypen >= 2 || wordCount == 0||i - 1 >= 0 && (array[index - 1] < 'a' || array[index - 1] > 'z') || i + 1 < array.length && (array[i + 1] < 'a' || array[i + 1] > 'z')|| index + 1 < arr.length && (array[i + 1] < 'a' || array[i + 1] > 'z')||
       i + 1 < array.length && array[i + 1] != ' ' ){
      //go ahead and reset the values instead of continueing with the word
        hypen = 0;
        wordCount = 0;
        i = next(array, i);
        continue;
       }


    }
    private static int next(char[] array, int index){
        //there is a space before each word

        for(int i = index; i<array.length && array[i] != ' '; i++){
            index = i;
        }
        return i;
    }

}
