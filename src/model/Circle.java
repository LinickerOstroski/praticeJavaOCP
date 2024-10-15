package model;

import java.util.List;

public class Circle extends Calculator {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	protected String calculator() {
		Double area = 0.0;
		area = Math.PI * Math.pow(getRadius(), 2);
		return String.format("Círculo r: %.2f = %.2f", getRadius(), area);
	}
}