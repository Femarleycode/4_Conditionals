package numChecker;

public class Method {

	public int addOrMult(int numX, int numY, boolean addMult) {
		int z;
		if (addMult == true) {
			z = numX + numY;
		} else {
			z = numX * numY;
		}
		return z;
	}
}