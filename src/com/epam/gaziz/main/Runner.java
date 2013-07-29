package com.epam.gaziz.main;

import com.epam.gaziz.equipment.armor.Armor;
import com.epam.gaziz.equipment.armor.ShoulderPlates;
import com.epam.gaziz.equipment.weapon.Lance;
import com.epam.gaziz.equipment.weapon.Weapon;

public class Runner {
	public static void main(String[] args) {
		Armor[] armors = { new ShoulderPlates(10, 5, "Steel", "Metal"),
				new ShoulderPlates(10, 5, "Steel", "Metal")

		};

		Weapon[] weapons = { new Lance("Steel", 1000, 5, 3) };

		Knight knight = new Knight(armors, weapons);
		knight.Completable();
		System.out.println("Total price of ammunation = "
				+ knight.calculateTotalPrice());

	}

}
