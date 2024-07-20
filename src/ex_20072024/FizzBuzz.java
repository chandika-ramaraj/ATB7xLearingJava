package ex_20072024;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1-100");
        byte num = sc.nextByte();
        if(num>=1 && num<=100){
            if (num%3==0 && num%5==0 ){
                System.out.println("FizzBuzz");
            } else if (num%5==0) {
                System.out.println("Buzz");
            }else if(num%3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println("Not Multiples of 3 and 5");
            }
        }
        else{
            System.out.println("Please enter number between 1-100");
        }
    }
        }


