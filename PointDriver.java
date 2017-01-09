
public class Point {
	int x;
	int y;
	int z;
	
	public Point (int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString(){
	
		
		//First try be me :)
		//return ("(" + x + ", " + y + ", " +  z + ")");
		
		//Teacher version 1
		//String result1 = "";
		//result1 += x;
		//result1 += y;
		//result1 += z;
		
		//Preferred method
		//Ex. String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
		//https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
		String  result2 = String.format("(%d, %d, %d)", x, y, z); 
		return result2;
	}
	
}
