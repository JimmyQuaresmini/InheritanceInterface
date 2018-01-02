package interfacePkg;

public interface CookingInterface extends RecipeInterface, IngredientsInterface {
	public void getIngredients(String... foodItems);
	public void cookFood();	
}
