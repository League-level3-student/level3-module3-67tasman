package _01_AnimalFarm;

import java.awt.List;
import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Chicken());
		farm.add(new Chicken());
		farm.add(new Chicken());
		farm.add(new Pig());
		farm.add(new Goat());
		farm.add(new Cow());
		
		for(int i = 0 ; i < 6 ; i++) {
			farm.get(i).makeNoise();
		}
	}

}
