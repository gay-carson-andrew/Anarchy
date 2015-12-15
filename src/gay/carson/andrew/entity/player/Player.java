package gay.carson.andrew.entity.player;

import gay.carson.andrew.entity.Position;


public class Player {
	EffectHandler E;//PowerUps and PowerDowns
	Position P;//X Y Z positions on the field
	Skills S;//Agility Health Defense
	Armor A;//Durability Slots
	Weapons W;//
	Badges B;//Achievements
	
	int points,score,level;
	
	Player() {
		
	}
}
