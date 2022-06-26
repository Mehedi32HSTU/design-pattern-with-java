package design_patterns.factory_pattern.shape_draw;

/**
 * Concrete Product
 */
public class LineShape implements GeometricShape {

	@Override
	public void drawShap() {
		System.out.println("Line shape is drawn.");

	}

	@Override
	public void getAreaFormula() {
		System.out.println("Formula for line is \'L\'");

	}

}
