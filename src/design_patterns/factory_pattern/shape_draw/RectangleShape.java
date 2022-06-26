package design_patterns.factory_pattern.shape_draw;

/**
 * Concrete Product
 */
public class RectangleShape implements GeometricShape{

	@Override
	public void drawShap() {
		System.out.println("Rectangle shape is drawn.");
		
	}

	@Override
	public void getAreaFormula() {
		System.out.println("Formula for rectangle is \'H*W\'");
		
	}

}
