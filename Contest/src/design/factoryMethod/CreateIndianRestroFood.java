package design.factoryMethod;

import design.factory.Food;

public class CreateIndianRestroFood implements FactoryInterface {

	@Override
	public Food createFood(int code) {
		Food food = null;
		switch (code) {
		case 01:

			break;

		default:
			break;
		}
		return null;
	}

}
