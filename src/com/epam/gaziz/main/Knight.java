package com.epam.gaziz.main;

import com.epam.gaziz.equipment.armor.Armor;
import com.epam.gaziz.equipment.weapon.Weapon;

public class Knight {
	private Armor[] armors;
	private Weapon[] weapons;

	public Knight(Armor[] armors, Weapon[] weapons) {
		this.armors = armors;
		this.weapons = weapons;
	}

	public void Completable() {
		for (Armor armor : armors) {
			armor.append();
		}
		for (Weapon weapon : weapons) {
			weapon.append();
		}
	}

	public int calculateTotalPrice() {
		int armorPrice = 0;
		for (Payable armor : armors) {
			armorPrice += armor.getCost();
		}
		
		int weaponPrice = 0;
		for (Payable weapon : weapons) {
			weaponPrice += weapon.getCost();
		}
		
		return armorPrice + weaponPrice;

	}
}
