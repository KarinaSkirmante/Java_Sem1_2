package service;

import java.util.Arrays;
import java.util.Random;



/**
 * 
 * @author Karina Skirmante Semināri Nr.1 uzdevumi
 *
 */
public class Excercises {

	public static void main(String[] args) {
		System.out.println(23);
		System.out.println("Sveiki!");
		float price = 23.45f;
		float finalPrice = price * 0.8999f;
		System.out.println("Cena pēc atlaides:" + finalPrice + " eur");
		System.out.printf("Cena pirms atlaides: %.2f eur, pēc atlaides: %.2f eur. Paldies!\n", price, finalPrice);

		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };// 16

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317 };// 15

		if (names.length == times.length) {
			for (int i = 0; i < names.length; i++) {
				System.out.println("[" + names[i] + ", " + times[i] + "]");
			}

		} else {
			System.out.println("Abi masīvi nav vienāda garumu,līdz ar to dati sajaukti");
		}

		for (String tempdsdsds : names) {
			System.out.println(tempdsdsds);
		}

		System.out.println(Arrays.toString(names));

		double ballResult = positionCalc(9.81, 10, 100, 30);
		System.out.println("Bumbiņas pozīcija ir " + ballResult + " m");
	}

	/**
	 * Apreķina bumbiņās atrašansā pozīciju
	 * 
	 * @param gravity
	 * @param initialVelocity
	 * @param initialPosition
	 * @param fallingTime
	 * @return double tipa bumbiņas pozīcija
	 */
	public static double positionCalc(double gravity, double initialVelocity, double initialPosition,
			double fallingTime) {
		// x(t) = 0.5 × a*t^2 + v_0*t + x_0
		double result = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
		return result;

	}

	/**
	 * Apreķina faktoriālu ar for ciklu
	 * 
	 * @param N
	 * @return int faktoriala vērtība
	 */
	public static int factorialForLoop(int N) {
		if (N < 0) {
			return 0;
		} else if (N == 0) {
			return 1;
		} else {
			int result = 1;

			for (int i = 1; i <= N; i++) {
				result = result * i;
			}

			return result;
		}
	}

	/**
	 * Apreķina faktoriālu ar rekursiju
	 * 
	 * @param N
	 * @return int faaktoriālu vērtību
	 */
	public static int factorialRecursive(int N)// 6!
	{
		if (N < 0) {
			return 0;
		} else if (N == 0) {
			return 1;
		} else {
			if (N == 1) {
				return 1;
			} else {
				int result = N * factorialRecursive(N - 1); // 1.solis-> 6 * 5!. 2.solis-> 6*5*4!
				return result;
			}
		}
	}

	
	/**
	 * Izveido 1D doule masīvu ar generētām vērtībam
	 * @param N
	 * @param lower
	 * @param upper
	 * @return double tipa 1D masīvs ar vērtībām
	 */
	public static double[] generateArray(int N, double lower, double upper)
	{
		if(N > 0)
		{
			if(lower <= upper)
			{
				Random rand = new Random();
				double[] result = new double[N];
				for (int i = 0; i < result.length; i++) {
					//lower  - upper
					//[12    -    35)
					//[0 - 1) * (35-12=23) ->[0 - 23)+12-> [12 - 35)
					double genRand = rand.nextDouble()*(upper-lower)+lower;//TODO pieveinot diapozonu
					result[i] = genRand;
				}
		
			return result;
			}
		}
		
		return (new double[0]);
		
		
	}
	
	/**
	 * apreķināt videjo aritmētisko 1D double masīvam
	 * @param array
	 * @return videjo aritmētiskā double vērtība
	 */
	public static double getMean(double[] array)
	{
		if(array!=null)
		{
			//1. izveidojam mainigo, kurā glabāsies visu elementu summa
			double result = 0;
			//2. for via foreach ciklā izstaigat visus masīva elementus
			/*for (int i = 0; i < array.length; i++) {
				result  += array[i];
			}
			*/
			for (double temp : array) {
				result+=temp;
			}
			//2.1. summējam katru elementu pe suumms mainīgā
			//3. apreķinām vidējo vērtību, summu dalot ar masībva izmēru
			
			//4. rezultātu atgriežaam
			return result/array.length;
		}
		//5. kaut ko atgriezt
		return 0;
	}
	/**
	 * preķina min vertību
	 * @param array
	 * @return
	 */
	public static double getMin(double[] array) // 3 6 1 
	{
		//1.pāŗbaudīt array
		if(array!=null )
		{
		//2. izvedot mainīgo, aks glabāš min vērtību
			double min = Double.MAX_VALUE; //463287429840298
		//3 iet cauri katram masīva elementam un to salīzināt ar min mainīgā vērtību
			for (int i = 0; i < array.length; i++) {
				if(min > array[i])
				{
					min = array[i];
				}
			}
			return min;
		//3.1.ja masīva elements ir mazāks, tad nomainām mn manīgā vērtēbu uz masīva elementa vērtību
		}
		
		//4. atgriež min mainīgā vērtību
		return 0;
	}
	
	public static double[] arraySort(double[] array)
	{
		if(array!=null)
		{
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if(array[i] < array[j])
					{
						double temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			
			Arrays.sort(array);
			
			return array;
		}
		return new double[0];
	}
	
	
	
	//1. funkcijais deklarācija
	public static double[][] generateMatrix(int N)
	{
		//2. paŗbaudīt N
		if(N > 1)
		{
		//3. izveidot 2D masīvu
			double[][] result = new double[N][N];
			Random rand = new  Random();
		//4. pakārtotaj cijklā iet cauri katrai ššunai 2D masīvā
			for (int i = 0; i < result.length; i++) { //cik rindas vispāŗ ir kopā
				for (int j = 0; j < result[i].length; j++) {// cik elenmebntu ir i tajā rindā
					result[i][j] = rand.nextDouble()*99+1;
				}
			}
			return result;
		//5. uzgenerēt katrā šūnā ele,enta vēetību no [1-100)
		}
					
		return new double[0][0];
	}
	//TODO dokumentāciju
	public static double getProduct(double[][] matrix, int i, int j) ///i=2, j=1
	{
		if(matrix!=null && i>=0 && j>=0)
		{
			
			if(matrix.length == matrix[0].length)
			{
				double result = 0;
				for (int j2 = 0; j2 < matrix.length; j2++) {
					result+=matrix[i][j2]*matrix[j2][j]; //[2][0]*[0][1] + [2][1]*[1][1]
				}
				return result;
			}
			
		}
		return 0;
	}

	
	public static double[] coinFlip(int N)
	{
		//1. pāŗbaudam N
		if(N > 0)
		{
		//2 izveidojam rezultātu masīvu ar 3 šūnām
			double [] result = new double[3];
		//3.veidoja for ciklu līdz N reizēm
			Random rand = new Random();
		
			for (int i = 0; i < N; i++) {
				//3.1. generējam monētas mešanu. 0/1
				int genTemp = rand.nextInt(2);
				result[genTemp]++;
				/*if(genTemp==0)
				{
					result[0]++;
				}
				else
				{
					result[1]++;
				}*/
				
			}
			
			result[2] = result[0]/result[1];
		//4. apkopotos rezultātu ieliek rezultātu masīvā un masību atgriež
			
			return result;
		}
		return new double[0];
	}
	
	
	//TODO izpildīt līdz galam visus uzdevyumus, izņemot zvaigznīšu
	//TODO sarkstīt vsām funkcijām dokumentācju komentārus
	//TODO izsaukt uztaisīts funkcijas main funkcijā
	
	
	
}
