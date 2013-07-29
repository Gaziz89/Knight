package com.epam.gaziz.equipment.weapon;

import com.epam.gaziz.main.Appendable;
import com.epam.gaziz.main.Payable;

/**
 * 
 * @author Gaziz
 * 
 */
public abstract class Weapon implements Appendable, Payable {
	private String material;
	private double length;
	private double weight;
	private double distance;

	/**
	 * 
	 * Create the constructor
	 * 
	 * @param mateial
	 * @param lenght
	 * @param weight
	 */
	public Weapon(String mateial, double lenght, double weight, double distance) {
		this.material = mateial;
		this.length = lenght;
		this.weight = weight;
		this.distance = distance;

	}

	public String getMaterial() {
		return material;
	}

	public double getLength() {
		return length;
	}

	public double getWeight() {
		return weight;
	}

	public double getDistance() {
		return distance;
	}

}
