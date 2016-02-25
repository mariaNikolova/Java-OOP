import java.util.List;

public class Restaurant implements IRestaurant {
	private String name;
	private String location;
	private List<IRecipe> recipes;
	
	public Restaurant(String newName, String newLocation){
		this.setName(newName);
		this.setLocation(newLocation);
	}
	public Restaurant(String newName, String newLocation, List<IRecipe> newRecipes){
		this.setName(newName);
		this.setLocation(newLocation);
		this.setRecipes(newRecipes);
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String value) {
		if(value.isEmpty()){
			throw new IllegalArgumentException("The name can not be empty!");
		}
		name = value;
	}
	@Override
	public String getLocation() {
		return location;
	}
	@Override
	public void setLocation(String value) {
		if(value.isEmpty()){
			throw new IllegalArgumentException("The location can not be empty!");
		}
		location = value;
	}
	@Override
	public List<IRecipe> getRecipes() {
		return this.recipes;
	}
	@Override
	public void setRecipes(List<IRecipe> value) {
		recipes = value;
	}
	@Override
	public void AddRecipes(IRecipe recipe) {
		this.recipes.add(recipe);
		
	}
	@Override
	public void RemoveRecipes(IRecipe recipe) {
		this.recipes.remove(recipe);
		
	}
	@Override
	public String PrintMenu() {
		StringBuilder result = new StringBuilder();
        result.append("Name: "+ getName() + "	").append("Location:" + getLocation()).append("\n\n");
        if(recipes.isEmpty()){
        	result.append("No recipes yet!");
        }
        else{
        	result.append("Menu:\n");
        	for(IRecipe recipe : recipes){
        		result.append(recipe.toString());
        	}
        }
        return result.toString();
        
		
	}
	
	
}
