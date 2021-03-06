package com.epam.gaziz.equipment.armor;

/**
 * 
 * This part of armor which protected arms of knights
 * 
 * @author �����
 *
 */

public class MittenGauntlet extends Armor {

	private static final int DEFAULT_COST = 150;

	public MittenGauntlet(double weight, double thickness, String material,
			String color) {
		super(weight, thickness, material, color);
	}

	@Override
	public void append() {
		System.out.println("Mitten Gauntlet added in knights ammunation");
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
