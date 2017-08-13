import java.util.Arrays;
import java.util.Comparator;

public class Lab13 {
	
	/**
	 * 
	 * @programName Lab12
	 * @class CSCI 150
	 * @programmer Anthony Rabon
	 * @lastRevised 10-21-16
	 */
	
	public static void main(String[] args) {
		Student[] stu = new Student[6];
		stu[0] = new Student ("Sam",100);
		stu[1] = new Student ("John",80);
		stu[2] = new Student ("Sue",95);
		stu[3] = new Student ("Sam",65);
		stu[4] = new Student ("Sam",85);
		stu[5] = new Student ("Sue",70);
		
		System.out.println("Sorting the Student by Grade\n");
		Arrays.sort(stu, new GradeComparator());
		for(int i = 0; i < stu.length; i++) {
			Student currentStudent = stu[i];
			System.out.println(currentStudent.getName() + " " + currentStudent.getGrade());
		}
		
		stu[0] = new Student ("Sam",100);
		stu[1] = new Student ("John",80);
		stu[2] = new Student ("Sue",95);
		stu[3] = new Student ("Sam",65);
		stu[4] = new Student ("Sam",85);
		stu[5] = new Student ("Sue",70);
		
		System.out.println("\nSorting the Students by name\n");
		Arrays.sort(stu, new NameComparator());
		for(int i = 0; i < stu.length; i++) {
			Student currentStudent = stu[i];
			System.out.println(currentStudent.getName() + " " + currentStudent.getGrade());
		}
		
		stu[0] = new Student ("Sam",100);
		stu[1] = new Student ("John",80);
		stu[2] = new Student ("Sue",95);
		stu[3] = new Student ("Sam",65);
		stu[4] = new Student ("Sam",85);
		stu[5] = new Student ("Sue",70);
		
		System.out.println("\nSorting the Students by name and grade\n");
		Arrays.sort(stu, new NameGradeComparator());
		for(int i = 0; i < stu.length; i++) {
			Student currentStudent = stu[i];
			System.out.println(currentStudent.getName() + " " + currentStudent.getGrade());
		}
	}

}
