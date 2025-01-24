package bfw.oop;

public class Fakultaet {
	public long fakultaet(int number) throws IllegalArgumentException {
		if (number < 1) {
			throw new IllegalArgumentException("Zahl muss groesser gleich 1 sein!");
		}
		long result = 1;
		for (int i = 2; i <= number; i++) {
			long tmp = result;
			result *= i;
			if (tmp > result) {
				throw new IllegalArgumentException("Overflow!");
			}
		}
		return result;
	}

	public void print(int number) {
		System.out.printf("%3d! = %,d %n", number, fakultaet(number));
	}
}


