package design_patterns.factory_pattern.shape_draw;


/**
 * Client
 */
public class ShapeFactoryDriverClass {
	public static void main(String[] args) {
		GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
		if (circle != null) {
			circle.drawShap();
			circle.getAreaFormula();
			System.out.println();
        } else {
            System.out.println("Shape Circle can not be drawn.\n");
        }

		GeometricShape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
		if (triangle != null) {
			triangle.drawShap();
			triangle.getAreaFormula();
			System.out.println();
        } else {
            System.out.println("Shape Triangle can not be drawn.\n");
        }

		GeometricShape line = ShapeFactory.getShape(ShapeType.LINE);
		if (line != null) {
			line.drawShap();
			line.getAreaFormula();
			System.out.println();
        } else {
            System.out.println("Shape Line can not be drawn.\n");
        }

		GeometricShape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
		if (rectangle != null) {
			rectangle.drawShap();
			rectangle.getAreaFormula();
			System.out.println();
        } else {
            System.out.println("Shape Rectangle can not be drawn.\n");
        }
	}
}
