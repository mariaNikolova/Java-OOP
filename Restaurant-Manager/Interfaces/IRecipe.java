
public interface IRecipe {
	
	public String getName();
	
	public void setName(String value);
	
	public double getPrice();
	
	public void setPrice(double value);
	
	public int getCalories();
	
	public void setCalories(int value);
	
	public int getQuantityPerServing();
	
	public void setQuantityPerServing(int value);
	
    public MetricUnit getUnit();
    
    public void setUnit(MetricUnit unit);
    
    public int getTimeToPrepare();
    
    public void setTimeToPrepare(int value);
	
}
