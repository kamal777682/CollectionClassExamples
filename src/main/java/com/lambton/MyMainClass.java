package com.lambton;

import java.util.*;

public class MyMainClass {
    public static void main(String[] args)
    {
        ArrayList<String>countryList = new ArrayList<>();
        countryList.add("Canada");
        countryList.add("India");
        countryList.add("Thailand");

        System.out.println(countryList.get(0));

        for(String name : countryList)
        {
            System.out.println(name);
        }

        for( int i=0 ; i<countryList.size();i++)
        {
            System.out.println(countryList.get(i));
        }

        //List c = new ArrayList<String>();

        HashSet<String>c = new HashSet<>();

        c.add("A");
        c.add("bca");
        c.add("abc");
        c.add("C");


        for(String s:c)
        {
            System.out.println(s);
        }

        c.remove("C");
        for(String s:c)
        {
            System.out.println(s);
        }

        HashMap<String,String>hashMap = new HashMap<>();
        hashMap.put("IND","India");
        hashMap.put("NEP","Nepal");
        hashMap.put("PAK","");

        for(Map.Entry<String,String > entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey()+ "_" + "_"+ entry.getValue());

        }
        HashMap<String,ArrayList<String>> countryStatesList = new HashMap<>();

    }
}
