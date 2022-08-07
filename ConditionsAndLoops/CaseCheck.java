package ConditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("uppercase");
        }
    }
}
