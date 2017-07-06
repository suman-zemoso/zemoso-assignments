package suman;

import java.util.Scanner;

public class Suman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		boolean notValidInput = true;
		while(notValidInput && !input.equals("NO")){
			try{
				for(String indexNumber: input.split(",")){//this for loop checks if index numbers are valid.
					if(Integer.parseInt(indexNumber) > 0 && Integer.parseInt(indexNumber) < 5){
						notValidInput = false;
					}else{ notValidInput = true;}
				}
			}catch(NumberFormatException e){}
			if(notValidInput){
				System.out.print("please enter valid Index numbers of the AddOns,"
						+ "separating it with a comma (, ) eg:'1,3' for AddOns 1 and 3 or 'NO': ");
				input = sc.nextLine();
			}else{System.out.println("valid");}
		}
		System.out.println("end");
		
	}

}
