
public abstract class Recipe implements IRecipe {
	private String name;
	private double price;
	private int calories;
	private int quantityPerServing;
	public MetricUnit unit;
	private int timeToPrepare;
	
	public Recipe(String newName, double newPrice, int newCalories, int newQuantityPerServing,
			MetricUnit newUnit,int newTimeToPrepare){
		this.setName(newName);
		this.setPrice(newPrice);
		this.setCalories(newCalories);
		this.setQuantityPerServing(newQuantityPerServing);
		this.setUnit(newUnit);
		this.setTimeToPrepare(newTimeToPrepare);
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String value) {
		if(value.isEmpty()){
			throw new IllegalArgumentException("The name can't be empty!");
		}
		this.name = value;
		
	}
	@Override
	public double getPrice() {
		return this.price;
	}
	@Override
	public void setPrice(double value) {
		if(value <= 0){
			throw new IllegalArgumentException("The price can't be negative number!");
		}
		this.price = value;
		
	}
	@Override
	public int getCalories() {
		return this.calories;
	}
	@Override
	public void setCalories(int value) {
		if(value <= 0){
			throw new IllegalArgumentException("The calories can;t be negative number!");
		}
		this.calories = value;
		
	}
	@Override
	public int getQuantityPerServing() {
		return this.quantityPerServing;
	}
	@Override
	public void setQuantityPerServing(int value) {
		if(value <=0 ) {
			throw new IllegalArgumentException("The quantity per serving can't be negative number!");
		}
		this.quantityPerServing = value;
		
	}
	@Override
	public MetricUnit getUnit() {
		return this.unit;
	}
	@Override
	public void setUnit(MetricUnit unit) {
		this.unit = unit;		
	}
	@Override
	public int getTimeToPrepare() {
		return this.timeToPrepare;
	}
	@Override
	public void setTimeToPrepare(int value) {
		if(value <= 0){
			throw new IllegalArgumentException("The time to prepare can't be negative number");
		}
		this.timeToPrepare = value;
		
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
        result.append(getName() + " - " + getPrice() + "$").append("\n")
        	.append("Per serving:" + getQuantityPerServing())
        	.append(GetUnitString() + " - ")
        	.append(getCalories()+ "kcal" + "\n")
        	.append("Ready in "+ getTimeToPrepare() +" minutes");
        return result.toString();
     }
	
	public String GetUnitString(){
		switch(this.unit){
		case Grams:
			 return "g";
			
        case Milliliters:
        	 return "ml";
        	 
        default:
        	 return "Ilegal type of unit";
        	
		}
	}
	

}
