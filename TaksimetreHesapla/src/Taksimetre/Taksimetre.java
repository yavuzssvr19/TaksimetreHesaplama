package Taksimetre;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km;
		Scanner ınp=new Scanner(System.in);
		System.out.println("Km:  ");
		
		km=ınp.nextDouble();
		int acılısUcreti=10;
		double kmbasına=2.20;
		double totalUcret=acılısUcreti+km*kmbasına;
		
	    totalUcret=(totalUcret<20) ? 20 : totalUcret;
	    
	    System.out.println("Gidilen Kilometre: "+km+" Toplam Ücretiniz: "+totalUcret);
	    
	    
	   
	    
		
		
		
		

	}

}
