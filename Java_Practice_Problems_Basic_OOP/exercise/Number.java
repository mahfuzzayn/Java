package exercise;

public class Number {
	Double x, y, z;
	
	Double getLargestNumber(Double x, Double y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		if (x > y) {
			if (x > z) return x;
		} else if (y > x) {
			if (y > z) return y;
		} 

		return z;
	}
}
