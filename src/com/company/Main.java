package com.company;

import java.util.Scanner;
// задание 9
         public class Main {
            public static void main(String args[]) {
                int num;
                System.out.println("Введите число: ");
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                if ( num % 2 == 0 )
                    System.out.println("Число четное");
                else
                    System.out.println("Число нечетное");
            }
        }
        // задание10
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int n;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        {if (n == 1) {
            System.out.println("понедельник");}
        } if (n == 2) {
            System.out.println("вторник");
        } else if (n == 3) {
            System.out.println("среда");
        }else if (n == 4) {
            System.out.println("четверг");
        }else if (n == 5) {
            System.out.println("пятница");
        }else if (n == 6){
            System.out.println("суббота");
        }else if (n == 7) {
            System.out.println("воскресенье");
        }else {
            System.out.println("такого дня недели не существует");
        }
    }
}
