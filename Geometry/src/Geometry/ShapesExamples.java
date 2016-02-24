package Geometry;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ShapesExamples {

	public static void main(String[] args) {
		
		//3D SHAPES
		Vertice paramTwoFirst = new Vertice(1, 2, 3);

		List<Vertice> list3DVertices = new ArrayList<>();
		list3DVertices.add(paramTwoFirst);

		SquarePyramid squarePyramid = new SquarePyramid(list3DVertices, 50, 100);
		Sphere sphere = new Sphere(list3DVertices,50);
		Cuboid cuboid = new Cuboid(list3DVertices, 20, 40, 60);
		
		List<SpaceShape> shapes = new ArrayList<SpaceShape>();
		shapes.add(squarePyramid);
		shapes.add(sphere);
		shapes.add(cuboid);
		
		List<Shape> orderdByVolume = shapes.stream()
                .filter(s -> s instanceof IVolumeMeasurable)
                .filter(v -> ((IVolumeMeasurable) v).getVolume() >= 40)
                .collect(Collectors.toList());
		
		List<Shape> sortByArea = shapes.stream()
				.filter(s -> s instanceof IAreaMeasurable)
				.sorted((b1,b2) -> (int)(b1.getArea() - b2.getArea()))
				.collect(Collectors.toList());
		
		if(!shapes.isEmpty()){
			System.out.println("Information for 3D shapes");
			System.out.println("Shapes whose volume is over 40.00 \n");
			for(Shape shape : orderdByVolume){
				System.out.println(shape.toString());
			}
			System.out.println("Shapes sort by area \n");
			for (Shape shape : sortByArea  ) {
				System.out.println(shape.toString());
			}	
		}
		
		// 2D SHAPES
		Vertice vertex1 = new Vertice(1,2);
		Vertice vertex2 = new Vertice(5,2);
		Vertice vertex3 = new Vertice(3,6);
		
		List<Vertice> vertice2DList = new ArrayList<>();
		vertice2DList.add(vertex1);
		vertice2DList.add(vertex2);
		vertice2DList.add(vertex3);
		
		List<Vertice> vertex = new ArrayList<>();
		vertex.add(vertex1);
		
		Triangle triangle = new Triangle(vertice2DList);
		Rectangle rectangle = new Rectangle(vertex, 3, 4);
		Circle circle = new Circle(vertex, 4);
		
		List<PlaneShape> planeShapes = new ArrayList<PlaneShape>();
		planeShapes.add(triangle);
		planeShapes.add(rectangle);
		planeShapes.add(circle);
		
		if(!planeShapes.isEmpty()){
				System.out.println("Information for 2D shapes:");
				for(PlaneShape planeShape : planeShapes){
					System.out.println(planeShape.toString());
				}
		}
	}
}
