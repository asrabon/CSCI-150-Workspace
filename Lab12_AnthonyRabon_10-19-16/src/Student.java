
public class Student implements Comparable<Student> {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.setName(name);
		this.setGrade(grade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	

	public int compareTo(Student other) {
		if(name.compareTo(other.getName()) < 0) { return -1;}
		if(name.compareTo(other.getName()) > 0) { return 1;}
		if(grade < other.getGrade()) { return -1;}
		if(grade > other.getGrade()) { return 1;}
		return 0;
	}

}
