import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		
		String name = "RestauranOne";
		String location = "Sofia";
		
		List<IRecipe> recipes = new ArrayList<IRecipe>();
       Restaurant restaurantOne = new Restaurant(name,location,recipes);
       
       Drink water = new Drink("Water", 1.00, 1, 100, MetricUnit.Milliliters, 3, false);       
       Dessert cake = new Dessert("Cake", 2.50, 100, 50, 30,false);
       Dessert creamCake = new Dessert("Cream cake", 3.00, 400, 150, 30, false);
       Salad vitamin = new Salad("Vitamin", 2.50, 40, 200, 10, true, false);
       MainCourse mainCourse = new MainCourse("Chicken",3.50, 200, 200, 20, false, MainCourseType.Meat );
       Drink juice = new Drink("Orange juice", 1.50, 10, 200, MetricUnit.Milliliters, 10, false);
       
       restaurantOne.AddRecipes(water);
       restaurantOne.AddRecipes(cake);
       restaurantOne.AddRecipes(creamCake);
       restaurantOne.AddRecipes(vitamin);
       restaurantOne.AddRecipes(mainCourse);
       restaurantOne.AddRecipes(juice);
       
       restaurantOne.RemoveRecipes(creamCake);
       System.out.println(restaurantOne.PrintMenu());
       
       
      
    }
}
