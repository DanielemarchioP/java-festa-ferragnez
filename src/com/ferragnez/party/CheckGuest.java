package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
					
		String [] nomi = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		System.out.println("Inserisci un nome da cercare all'interno della lista invitati ");
			Scanner scan = new Scanner(System.in);
			
			String cercaNome = scan.nextLine();
			 
			 System.out.println(cercaNome);
			 
			 cercaNome = cercaNome.toLowerCase();
			 
			for(int i = 0 ; i < nomi.length ; i++){
				
				if(cercaNome.equals(nomi[i])) {
					
					System.out.print("L'invitato puo entrare alla festa dei Ferragnez siuuum");
					
				}else if(i == nomi.length - 1){
					System.out.print("L'invitato non e ben accetto alla festa");
				}
			}
			scan.close();
	}

}

