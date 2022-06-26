package design_patterns.factory_pattern.shape_draw;

public abstract class ShapeFactory {
	public static GeometricShape getShape(ShapeType shapeType) {
		GeometricShape geometricShape = null;
		switch (shapeType) {
		case LINE:
			geometricShape = new LineShape();
			break;

		case CIRCLE:
			geometricShape = new CircleShape();
			break;
		case RECTANGLE:
			geometricShape = new RectangleShape();
			break;
		}
		return geometricShape;
	}
}
