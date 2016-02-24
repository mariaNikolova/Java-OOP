package Geometry;

import java.util.List;

public abstract class PlaneShape extends Shape implements IPerimeterMeasurable{
	
	public PlaneShape(List<Vertice> newListOfVertices){
		super(newListOfVertices);
	}
	
	public void setListOfVertices(List<Vertice> newListOfVertices){
		
		for(int i = 0; i < newListOfVertices.size(); i++){
			
			if((newListOfVertices.get(i).getZ()) == null &&  (newListOfVertices.get(i).getY())  == null){
				
				throw new IllegalArgumentException("Invalid points");
			}
			
		}
		super.setListOfVertices(newListOfVertices);
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
