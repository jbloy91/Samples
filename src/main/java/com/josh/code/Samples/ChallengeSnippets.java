package com.josh.code.Samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ChallengeSnippets {


    class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }

    public static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }



    public ListNode findMiddleNode(ListNode head) {
        if(null == head) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(null!= head && null!=head.next && null!= (fast.next).next){
            slow = slow.next;
            fast = (fast.next).next;
        }


        int evalCoin = Integer.getInteger("");

        int[] coins = {1,3,5};
        return slow;

    }

    public static boolean areAllCharactersUnique(String str){
        if(null == str) return true;

       boolean[] strings = new boolean[255];


        for(int i = 0 ; i < str.length(); i++ ){
            int pos = str.charAt(i);

            if(strings[pos]){
                return false;
            }

            strings[pos] = true;

        }

        return true;

    }

    public static boolean altAreCharactersUnique(String str){
        if(null == str) return true;

        HashSet<Character> demStrings = new HashSet<Character>();

        for(int i = 0 ; i < str.length(); i++ ){
            if(!demStrings.add(str.charAt(i))){
                return false;
            }
        }
        return true;
    }





    }


