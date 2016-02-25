import java.util.List;

public interface IRestaurant {
	
	public String getName();
	
	public void setName(String value);
	
	public String getLocation();
	
	public void setLocation(String value);
	
	public List<IRecipe> getRecipes();
	
	public void setRecipes(List<IRecipe> value);
	
	public void AddRecipes(IRecipe recipe);
	
	public void RemoveRecipes(IRecipe recipe);
	
	public String PrintMenu();
}