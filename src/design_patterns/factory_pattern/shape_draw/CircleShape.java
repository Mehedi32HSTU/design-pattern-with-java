package design_patterns.factory_pattern.shape_draw;

/**
 * Concrete Product
 */
public class CircleShape implements GeometricShape {

	@Override
	public void drawShap() {
		System.out.println("Circle shape is drawn.");
	}

	@Override
	public void getAreaFormula() {
		System.out.println("Formula for circle is \'PI*r*r\'");
	}

}
