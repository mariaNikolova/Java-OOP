
public class MainCourse extends Meal implements IMainCourse {
	
	private MainCourseType type;
	
	public MainCourse(String name, double price, int calories, int quantityPerServing, int timeToPrepare,
			boolean isVegan, MainCourseType type) {
		super(name, price, calories, quantityPerServing, timeToPrepare, isVegan);
		this.type = type;
	}

	@Override
	public MainCourseType getType() {
		
		return this.type;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(super.toString());
		result.append("Type: " + this.getType().toString() + "\n\n");
		return result.toString();
	}
	
}
