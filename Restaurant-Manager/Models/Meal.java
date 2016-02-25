

public abstract class Meal extends Recipe implements IMeal {
	
	private boolean isVegan;
	
	public Meal(String name, double price, int calories, int quantityPerServing, 
            int timeToPrepare, boolean isVegan){
		
            super(name, price, calories, quantityPerServing, MetricUnit.Grams, timeToPrepare);
            this.isVegan = isVegan;
        }
	@Override
	public boolean getIsVegan(){
		return this.isVegan;
	}
	@Override
	public void ToggleVegan()
    {
        this.isVegan = !this.isVegan;
    }
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		if(this.isVegan){
			result.append("[VEGAN]");
		}
		result.append(super.toString() + "\n");
		return result.toString();
	}
}
