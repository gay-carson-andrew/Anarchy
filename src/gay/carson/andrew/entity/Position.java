package gay.carson.andrew.entity;

import java.util.Random;


public class Position {
	int x,y,z;
	
	public Position() 
	{
		
	}
	public Position(int x, int y, int z) 
	{
		setX(x);
		setY(y);
		setZ(z);
	}
	
	void setX(int x)
	{
		this.x = x;
	}
	void setY(int y)
	{
		this.y = y;
	}
	void setZ(int z)
	{
		this.z = z;
	}
	void randomizePosition() {
		Random r = new Random();
		setX(r.nextInt(500));
		setY(r.nextInt(500));
		setZ(r.nextInt(500));
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getZ()
	{
		return z;
	}
	

}

