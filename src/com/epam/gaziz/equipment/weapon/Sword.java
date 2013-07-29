package com.epam.gaziz.equipment.weapon;

public class Sword extends Weapon {

	private static final int DEFAULT_COST = 1200;

	public Sword(String mateial, double lenght, double weight, double distance) {
		super(mateial, lenght, weight, distance);
	}

	@Override
	public void append() {
		System.out.println("Sword added in knights ammunation");
		System.out.println("Weight = " + getWeight() + " kg");
		System.out.println("Lenght = " + getLength() + " mm");
		System.out.println("Material = " + getMaterial());
		System.out.println("Distance = " + getDistance() + " meter");

	}

	@Override
	public int getCost() {
		return DEFAULT_COST;
	}

}
