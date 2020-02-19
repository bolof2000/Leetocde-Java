package com.company;

import java.util.HashSet;
import java.util.Stack;

public class solutions {

    public static boolean containsDuplicate(int[] nums){

        HashSet<Integer> hash = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            else{
                hash.add(nums[i]);
            }
        }
        //System.out.println(hash);
        return false;
    }
    public static int[] twoSum(int[]nums1,int target){
        int[] result = new int[2];
        int left=0;
        int right =nums1.length-1;
        while(left <right){
            if(nums1[left]+nums1[right]==target){

                result[0] = left;
                result[1] = right;
                left++;
                right--;
            }
            else if(nums1[left]+nums1[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }


    public static boolean ispalindrome(int x){

        if(x==0){
            return true;
        }
        if(x<0||x%10==0){
            return false;
        }
        return false;
    }
    //revisit solution


    public static boolean backspaceCompare(String s,String t){

        int len_s = s.length();
        int len_t = t.length();
        Stack<Character> ch = new Stack<>();
        Stack<Character> ch_t1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character s_ch = s.charAt(i);

            if(s_ch== '#'){
                ch.pop();
            }
            else{
                ch.push(s_ch);
            }
        }
        for(int i=0;i<t.length();i++){

            Character s_ch = t.charAt(i);

            if(s_ch== '#'){
                ch_t1.pop();
            }
            else{
                ch_t1.push(s_ch);
            }
        }
        String str1 = ch.toString();
        String str2 = ch_t1.toString();
        return str1.equals(str2);
    }

    public static String reverseString(String s){
        StringBuffer rev = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            rev.append(ch);
        }

        return rev.toString();
    }

    public static boolean isPalindrone(String s){
        int right = s.length();
        int left =0;
        while(right < left){
            if(s.charAt(left)==s.charAt(right)){
                return true;
            }
            right--;
            left++;
        }
        return false;
    }

    public static int[] sortedSquares(int[] nums){

        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){

        }


        return result;


    }
}
