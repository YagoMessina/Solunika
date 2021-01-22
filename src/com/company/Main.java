package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final int MENOR = 0;
    private static final int MEDIO = 1;
    private static final int MAYOR = 2;

    public static void main(String[] args) {
	    threeNumbers(10, 40, -20);
        System.out.println("----------");
        printIfCapicua("2345", "edfrhs", "3457", "20102");
    }

    public static void threeNumbers(int n1, int n2, int n3){
        List<Integer> list = new ArrayList();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        Collections.sort(list);

        System.out.println("Menor: " + list.get(MENOR));
        System.out.println("Medio: " + list.get(MEDIO));
        System.out.println("Mayor: " + list.get(MAYOR));
    }

    public static void printIfCapicua(String p1, String p2, String p3, String p4){
        List<Integer> list = createNumberList(p1,p2,p3,p4);
        Collections.sort(list);

        for(Integer n : list){
            System.out.print(n + " ");
            if(isCapicua(Integer.toString(n))){
                System.out.print("es Capicua");
            }
            System.out.println();
        }
    }

    public static List<Integer> createNumberList(String... p){
        List<Integer> list = new ArrayList<>();
        for(String n : p){
            try{
                list.add(Integer.parseInt(n));
            }catch (Exception ignored){}
        }
        return list;
    }

    public static boolean isCapicua(String s){
        int begin = 0;
        int end = s.length()-1;
        while (begin < end){
            if(s.charAt(begin) != s.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}
