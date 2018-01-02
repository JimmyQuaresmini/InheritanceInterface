package mainPkg;

import abstractPkg.Gun;
import abstractPkg.Knife;
import inheritancePkg.American;
import inheritancePkg.British;
import interfacePkg.CookingImplementation;
import interfacePkg.CookingInterface;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Inheritance examples");
		System.out.println("-------------------------------------");
		System.out.println();
		
		British	br = new British();
		System.out.println();
		American am = new American();
		
		System.out.println();
		System.out.println("British speaks first, then the American");
		br.speak();
		am.speak();
		
		System.out.println();
		System.out.println("British enjoys first, then the American");
		br.enjoy();
		am.enjoy();
		
		//American amBr = br;
		British brAm = am;
		System.out.println();
		System.out.println("British American");
		brAm.speak();//what will "brAm" say?
		brAm.enjoy();//what will this print?
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Interface examples");
		System.out.println("-------------------------------------");
		
		//interface & implementation
		CookingImplementation cookImpl = new CookingImplementation();
		System.out.println();
		cookImpl.readRecipe("Spaghetti with meat sauce");
		System.out.println();
		cookImpl.getIngredients("Spaghetti", "Meat sauce", "Ketchup", "Salad");
		System.out.println();
		cookImpl.cookFood();		
		
		//uses the interface on the left side
		System.out.println();
		System.out.println("with the interface on the left side");
		System.out.println();
		CookingInterface cookI = new CookingImplementation();
		//cannot instantiate an interface like below
		//CookingImplementation cookI = new CookingInterface();
		cookI.readRecipe("Pancakes with jam");
		System.out.println();
		cookI.getIngredients("Pancakes", "Jam");
		System.out.println();
		cookI.cookFood();
		System.out.println();
		cookI.studyIngredients();
		
		//abstract		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Abstract examples");
		System.out.println("-------------------------------------");
		System.out.println();
		Gun magnum = new Gun();
		magnum.attack();
					
		System.out.println();
		Knife bayonet = new Knife();
		bayonet.attack();
	}
}
