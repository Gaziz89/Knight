package com.epam.gaziz.equipment.armor;

/**
 * 
 * This part of armor which protected back of knights
 * 
 * @author Gaziz
 * 
 */
public class Backplate extends Armor {

	private static final int DEFAULT_COST = 450;

	public Backplate(double weight, double thickness, String material,
			String color) {
		super(weight, thickness, material, color);
	}

	@Override
	public void append() {
		System.out.println("Backplate added in knights ammunation");
		System.out.println("Weight = " + getWeight() + " kg");
		System.out.println("Thickness = " + getThickness() + " mm");
		System.out.println("Material = " + getMaterial());
		System.out.println("Color = " + getColor());

	}

	@Override
	public int getCost() {
		return DEFAULT_COST;
	}

}
