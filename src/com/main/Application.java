package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number =Math.abs(input.nextInt());
        int basValue;
        int total=0;

       
        if(!(number==0)) {
        	while (number != 0) {
        		basValue = number % 10;
        		total +=basValue;
        		number /= 10;
        	}
        }else {
        	System.out.println("Yanlis sayi girdiniz ");
        }
        
        System.out.println("Basamak Sayilari Toplami: "+total);
        
	}

}
