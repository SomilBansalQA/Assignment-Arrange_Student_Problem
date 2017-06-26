import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author somilbansal
 * 
 */

/** Program for Arrange Student information by ID, FirstName, and CGPA **/
public class Main {

	static int N;
	static int id;
	static String name;
	static double cgpa;
	static ArrayList<Student> al;
	private static Scanner sc;
	

	/** Main Method */
	public static void main(String a[]) {
		sc = new Scanner(System.in);

		N = sc.nextInt();

		al = new ArrayList<Student>();

		/** for loop for entering Student data */
		for (int i = 0; i < N; i++) {
			int id = sc.nextInt();

			String name = sc.next();

			cgpa = sc.nextDouble();

			al.add(new Student(id, name, cgpa));

		}

		/** It is used to sort the Student data According the Problem */
		Collections.sort(al, Collections.reverseOrder(new Compare()));

		/** Traverse the Student Data **/
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.name);

		}

	}
}
