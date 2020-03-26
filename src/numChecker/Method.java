package numChecker;

public class Method {

	public int addOrMult(int numX, int numY, boolean addMult) {
		int z;
		if (addMult == true) {
			z = numX + numY;
		} else {
			z = numX * numY;
		}
//q3, print 0 if either numX/numY == even, else print the number
		if (numX % 2 == 0 || numY % 2 == 0) {
			return 0;
		} else {
			return z;
		}
	}
}