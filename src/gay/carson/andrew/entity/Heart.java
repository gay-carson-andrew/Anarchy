package gay.carson.andrew.entity;


public class Heart extends Entity{

	Heart(int x, int y, int z) {
		P = new Position(x,y,z);
	}
	public Position getPosition() {
		return P;
	}

}
