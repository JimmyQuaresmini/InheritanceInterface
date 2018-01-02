package interfacePkg;

public class CookingImplementation implements CookingInterface {
	String[] foodStuffs;
	
	@Override
	public void getIngredients(String... foodItems) {
		foodStuffs = foodItems;
		
		for (int i = 0; i < foodItems.length; i++) {
			System.out.println("Getting ingredient " + foodItems[i]);
		}

	}

	@Override
	public void cookFood() {
		System.out.println("Making a meal with these items:");

		//foreach loop
		for (String food : foodStuffs) {
			System.out.println(food);
		}
	}	

	@Override
	public void readRecipe(String dish) {
		System.out.println("Reads the recipe for dish " + dish);		
	}

	@Override
	public void studyIngredients() {
		System.out.println("Study facts about different ingredients");		
	}
}
