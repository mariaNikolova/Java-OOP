
public class Drink extends Recipe implements IDrink {
	private final int MaxDrinkCalories = 100;
	private final int MaxDrinkTimeToPrepare = 20;
	private boolean isCarbonated;

	public Drink(String name, double price, int calories, int quantityPerServing, MetricUnit unit,
            int timeToPrepare, boolean isCarbonated){
		super(name, price, calories, quantityPerServing, MetricUnit.Milliliters, timeToPrepare);
		this.isCarbonated = isCarbonated;
	}
	@Override
	public boolean getIsCarbonated() {
		
		return this.isCarbonated;
	}
	
	@Override
	public void setIsCarbonated(boolean value) {
		this.isCarbonated = value;
		
	}
	
	@Override
	public int getCalories() {
		return super.getCalories();
	}
	@Override
	public void setCalories(int value){
		if(value > MaxDrinkCalories){
			throw new IllegalArgumentException("The calories in a drink must not be greater than " + MaxDrinkCalories);
		}
		int calories = super.getCalories();
		calories = value;
	}
	@Override
	public int getTimeToPrepare(){
		return super.getTimeToPrepare();
	}
	
	@Override
	public void setTimeToPrepare(int value) {
		if(value > MaxDrinkTimeToPrepare){
			throw new IllegalArgumentException("The time to prepare a drink must not be greater than " + MaxDrinkTimeToPrepare + " minutes.");
		}
		int timeToPrepare = super.getTimeToPrepare();
		timeToPrepare = value;
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(super.toString() + "\n");
		if(this.isCarbonated){
			result.append("Carbonated: yes");
		}
		else{
			result.append("Carbonated: no \n\n");
		}
		return result.toString();
			
	}
}