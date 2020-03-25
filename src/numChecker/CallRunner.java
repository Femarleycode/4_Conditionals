package numChecker;

public class CallRunner {
	public static void main(String[] args) {

		// instance
		Method instanceMeth = new Method();

		// STYLE 1
		int rESULT = instanceMeth.addOrMult(1, 2, true);
		int rESULT2 = instanceMeth.addOrMult(3, 3, false);
		int rESULT3 = instanceMeth.addOrMult(1, 1, true);

		System.out.println(rESULT);
		System.out.println(rESULT2);
		System.out.println(rESULT3);

		// STYLE 2
//		System.out.println(instanceMeth.addOrMult(1, 2, true));
//		System.out.println(instanceMeth.addOrMult(3, 3, false));
//		System.out.println(instanceMeth.addOrMult(1, 1, true));

	}
}