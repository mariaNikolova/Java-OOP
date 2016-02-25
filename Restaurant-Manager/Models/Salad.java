
public class Salad  extends Meal implements ISalad{

	private boolean containsPasta;
	public Salad(String name, double price, int calories, int quantityPerServing, 
			int timeToPrepare, boolean isVegan,boolean containsPasta) {
		super(name, price, calories, quantityPerServing, timeToPrepare, true);
		this.containsPasta = containsPasta;
	}
		
	@Override
	public boolean getContainsPasta() {
		return this.containsPasta;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(super.toString());
		if(this.containsPasta){
			result.append("Contains pasta: yes");
		}
		else{
			result.append("Contains pasta: no \n\n");
		}
		return result.toString();
		
	}

}
