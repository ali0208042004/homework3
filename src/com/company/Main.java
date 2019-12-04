package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         String[] names = new String[4];
        System.out.println(names[0]);
        names [0] = "Ali ";
        names [1] = "Munara ";
        names [2] = "Nurlan ";
        int name = 0;
        switch (name){
            case 0:
                System.out.println(names[0] + "Доброе утро");
            case 1:
                System.out.println(names[1] + "Доброго дня");
            case 2:
                System.out.println(names[2] + "Доброго вечера");
        }
    }
}
