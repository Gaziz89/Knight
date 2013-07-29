package com.epam.gaziz.equipment.armor;

/**
 * 
 * This part of armor which protected sholders of knights
 * 
 * @author Gaziz
 * 
 */
public class ShoulderPlates extends Armor {

	private static final int DEFAULT_COST = 200;

	/**
	 * 
	 * @param weight
	 * @param thickness
	 * @param material
	 * @param color
	 */
	public ShoulderPlates(double weight, double thickness, String material,
			String color) {
		super(weight, thickness, material, color);
	}

	@Override
	public void append() {
		System.out.println("Solders Plates added in knights ammunation");
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
