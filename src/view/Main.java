package view;

import model.AreaCalculator;
import model.Calculator;
import model.Circle;
import model.Rectangle;
import model.Square;

public class Main {

	public static void main(String[] args) {
		AreaCalculator calculator = new AreaCalculator();
		
		Calculator shape;
		
		shape = new Rectangle(5.0, 10.0);
		calculator.calculateArea(shape);
		
		shape = new Circle(8.5);
		calculator.calculateArea(shape);
		
		shape = new Square(12.0);
		calculator.calculateArea(shape);
		
		for (String s : calculator.getAreas())
			System.out.println(s);
	}
}
