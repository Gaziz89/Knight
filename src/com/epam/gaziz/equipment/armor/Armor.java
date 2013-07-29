package com.epam.gaziz.equipment.armor;

import com.epam.gaziz.main.Appendable;
import com.epam.gaziz.main.Payable;

/**
 * 
 * @author Gaziz
 * 
 */
public abstract class Armor implements Appendable, Payable {
	private String color;
	private String material;
	private double thickness;
	private double weight;

	/**
	 * 
	 * Create the constructor
	 * 
	 * @param weight
	 * @param thickness
	 * @param material
	 * @param color
	 */
	public Armor(double weight, double thickness, String material, String color) {
		this.weight = weight;
		this.thickness = thickness;
		this.material = material;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public double getThickness() {
		return thickness;
	}

	protected double getWeight() {
		return weight;
	}

}
