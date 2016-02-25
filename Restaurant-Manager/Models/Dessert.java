
public class Dessert extends Meal implements IDessert {
	
	private boolean withSugar;
	
	public Dessert(String name, double price, int calories, int quantityPerServing, 
            int timeToPrepare, boolean isVegan){
            super(name, price, calories, quantityPerServing, timeToPrepare, isVegan);
            this.withSugar = true;
        }

	@Override
	public boolean WithSugar() {
		return this.withSugar;
	}

	@Override
	public void ToggleSugar() {
		this.withSugar = !this.withSugar;
		
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		if(!this.withSugar){
			result.append("[NO SUGAR]");
		}
		result.append(super.toString() + "\n");
		return result.toString();
	}

}
