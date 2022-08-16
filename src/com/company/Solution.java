package com.company;

public class Solution {
    public boolean isValid(String s){

        for(int i = 0; i < s.length(); i++){
            if (s.equals(i)){
                return true;
            }
            return false;
        }
        return false;
    }
}
