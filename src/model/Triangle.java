package model;

public class Triangle {
	private double leftSide;
	private double rightSide;
	private double bottomSide;
	
	public Triangle(double leftSide, double rightSide, double bottomSide) {
		super();
		this.leftSide = leftSide;
		this.rightSide = rightSide;
		this.bottomSide = bottomSide;
	}
	public double getLeftSide() {
		return leftSide;
	}
	public void setLeftSide(double leftSide) {
		this.leftSide = leftSide;
	}
	public double getRightSide() {
		return rightSide;
	}
	public void setRightSide(double rightSide) {
		this.rightSide = rightSide;
	}
	public double getBottomSide() {
		return bottomSide;
	}
	public void setBottomSide(double bottomSide) {
		this.bottomSide = bottomSide;
	}

}
