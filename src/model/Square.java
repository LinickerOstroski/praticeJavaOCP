package model;

public class Square extends Calculator{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	protected String calculator() {
		Double area = 0.0;
		area = getSide() * getSide();
		return String.format("Quadrado l: %.2f = %.2f", getSide(), area);
	}
}
