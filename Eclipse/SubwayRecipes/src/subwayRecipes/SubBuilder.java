package subwayRecipes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class SubBuilder {

	protected Sub sub;
	
	static Scanner sc = new Scanner(System.in);
	
	public abstract void addBread();
	
	public abstract void addSalad();
	
	public abstract void addSauce();
	
	public void addAddOns(){//adds AddOns to the sub.
		
		List<AddOn> addOns = new ArrayList<AddOn>();
		System.out.println("Available AddOns are:");//available addOns are printed.
		System.out.println("1. Cheese");
		System.out.println("2. Eggs");
		System.out.println("3. Veggies");
		System.out.println("4. Chicken");
		System.out.print("Enter the index numbers of the AddOns you want,"
				+ " separating it with a comma (,), enter NO for skipping AddOns: ");//expected input is either 'NO' or something like '1,2,3'
		
		
		String input = null;
		if(sc.hasNextLine()){
			input = sc.nextLine();
		
		if(!input.equals("NO")){//if customer wants addOns then if condition is satisfied other wise addOns list will be empty.
			
			boolean InValidInput = true;
			
			while(InValidInput && !input.equals("NO")){//this While loop makes sure that input is in the expected format.
				try{
					for(String indexNumber: input.split(",")){//this for loop checks if index numbers are valid.
						if(Integer.parseInt(indexNumber) > 0 && Integer.parseInt(indexNumber) < 5){
							InValidInput = false;
						}else{ InValidInput = true;}
					}
				}catch(NumberFormatException e){
					//notValidInput = true;
				}
				if(InValidInput){//if index numbers are not valid then this if block again asks for valid input.
					System.out.print("please enter valid Index numbers of the AddOns,"
							+ "separating it with a comma (, ) eg:'1,3' for AddOns 1 and 3 or 'NO': ");
					input = sc.nextLine();
				}
			}
			
			if(!InValidInput){
				for(String indexNumber: input.split(",")){//using valid input this for loop adds AddOns to list addOns.
					switch(Integer.parseInt(indexNumber)){
					case 1: addOns.add(new Cheese()); break;
					case 2: addOns.add(new Eggs()); break;
					case 3: addOns.add(new Veggies()); break;
					case 4: addOns.add(new Chicken()); break;
					}
				}
			}
		}
		}
		
		
		sub.setAddOn(addOns);
		
	}
	
	public Sub getSub(){
		System.out.println("Your sub is ready.");
		return sub;
	}
}
