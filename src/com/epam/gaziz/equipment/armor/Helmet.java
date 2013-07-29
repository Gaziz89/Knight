package com.epam.gaziz.equipment.armor;

/**
 * This part of armor which knights worn on the head
 * 
 * @author Gaziz
 * 
 */
public class Helmet extends Armor {

	private static final int DEFAULT_COST = 250;

	/**
	 * 
	 * @param weight
	 * @param thickness
	 * @param material
	 * @param color
	 */
	public Helmet(double weight, double thickness, String material, String color) {
		super(weight, thickness, material, color);
	}

	@Override
	public void append() {
		System.out.println("Hemlet  added in knights ammunation");
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
