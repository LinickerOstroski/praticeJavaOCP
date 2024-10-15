package model;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	private List<String> areas = new ArrayList<String>();

	public void calculateArea(Calculator c) {
		this.areas.add(c.calculator());
	}
	
	public List<String> getAreas() {
		return new ArrayList<String>(areas);
	}
}
