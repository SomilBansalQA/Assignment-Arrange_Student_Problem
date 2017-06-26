import java.util.Comparator;

/**
 * Class Compare is used to comparing the Student Data According to the Problem
 */
class Compare implements Comparator<Student> {

	/**
	 * Method compare is used to comparing the Student Data According to the
	 * Problem
	 */

	public int compare(Student s1, Student s2) {
		/** Here is the logic for compare */

		if (s1.cgpa == s2.cgpa) {
			int cmp_name = s1.name.compareTo(s2.name);
			if (cmp_name == 0) {
				if (s1.id == s2.id) {
					return 0;
				} else if (s1.id > s2.id) {
					return 1;
				} else {
					return -1;
				}
			}

			else if (cmp_name == 1) {
				return 1;
			} else {
				return -1;
			}
		} else if (s1.cgpa < s2.cgpa)
			return -1;
		else
			return 1;
	}

}