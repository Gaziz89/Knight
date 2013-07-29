package com.epam.gaziz.equipment.armor;

/**
 * 
 * This part of armor which protected legs and feet of knights
 * 
 * @author Gaziz
 *
 */
public class Legging extends Armor {

	private static final int DEFAULT_COST = 400;

	public Legging(double weight, double thickness, String material,
			String color) {
		super(weight, thickness, material, color);
	}

	@Override
	public void append() {
		System.out.println("Legging added in knights ammunation");
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
