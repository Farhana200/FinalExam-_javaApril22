package finalExamExercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
//		Practical 1: Generate 500 random numbers and print the nth smallest 
//		number in a programming language of your choice. 
	//   (Ask user for the Nth smallest number)
	    //int answer = rn.nextInt(max - min + 1)+min;
			Scanner ui = new Scanner(System.in);
			Random rn = new Random();
	        int[] num = new int[500];  
	        for(int i=1; i<=100; i++) {
	        num[i] = (rn.nextInt(1000 - 1 + 1)+1);
	        System.out.print(num[i] + ",");
	        }
	        System.out.println();
			Arrays.sort(num);
			 for(int i=1; i<=100; i++) {
			 num[i] = (rn.nextInt(1000 - 1 + 1)+1);
			 System.out.print(num[i]+",");
			}
			 System.out.println();
		    int nthnumber = ui.nextInt();
			System.out.println("please give a number");
			System.out.println("the nthNumber is " + num[nthnumber] );
			
			}

	}





