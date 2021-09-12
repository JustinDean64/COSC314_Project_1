
/**
 * Name: Justin Wynn
 * COSC 314
 * Date: 9/12/2021
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		truthValues truthCon1 = new truthValues(1, 1, 1);
		truthValues truthCon2 = new truthValues(1, 0, 1);
		truthValues truthCon3 = new truthValues(0, 1, 1);
		truthValues truthCon4 = new truthValues(0, 0, 1);
		
		System.out.println(truthCon1.startOperation());
		System.out.println(truthCon2.startOperation());
		System.out.println(truthCon3.startOperation());
		System.out.println(truthCon4.startOperation());
		
		/**Prints out:
		 * True
		 * False
		 * False
		 * False
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		truthValues truthDis1 = new truthValues(1, 1, 2);
		truthValues truthDis2 = new truthValues(1, 0, 2);
		truthValues truthDis3 = new truthValues(0, 1, 2);
		truthValues truthDis4 = new truthValues(0, 0, 2);
		
		System.out.println(truthDis1.startOperation());
		System.out.println(truthDis2.startOperation());
		System.out.println(truthDis3.startOperation());
		System.out.println(truthDis4.startOperation());
		
		/**Prints out:
		 * True
		 * True
		 * True
		 * False
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		truthValues truthXor1 = new truthValues(1, 1, 3);
		truthValues truthXor2 = new truthValues(1, 0, 3);
		truthValues truthXor3 = new truthValues(0, 1, 3);
		truthValues truthXor4 = new truthValues(0, 0, 3);
		
		System.out.println(truthXor1.startOperation());
		System.out.println(truthXor2.startOperation());
		System.out.println(truthXor3.startOperation());
		System.out.println(truthXor4.startOperation());
		
		/**Prints out:
		 * False
		 * True
		 * True
		 * False
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		truthValues truthImp1 = new truthValues(1, 1, 4);
		truthValues truthImp2 = new truthValues(1, 0, 4);
		truthValues truthImp3 = new truthValues(0, 1, 4);
		truthValues truthImp4 = new truthValues(0, 0, 4);
		
		System.out.println(truthImp1.startOperation());
		System.out.println(truthImp2.startOperation());
		System.out.println(truthImp3.startOperation());
		System.out.println(truthImp4.startOperation());
		
		/**Prints out:
		 * True
		 * False
		 * True
		 * True
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		truthValues truthBic1 = new truthValues(1, 1, 5);
		truthValues truthBic2 = new truthValues(1, 0, 5);
		truthValues truthBic3 = new truthValues(0, 1, 5);
		truthValues truthBic4 = new truthValues(0, 0, 5);
		
		System.out.println(truthBic1.startOperation());
		System.out.println(truthBic2.startOperation());
		System.out.println(truthBic3.startOperation());
		System.out.println(truthBic4.startOperation());
		
		/**Prints out:
		 * True
		 * False
		 * False
		 * True
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


	}

}
