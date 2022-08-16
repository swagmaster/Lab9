import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>, Cloneable {
	
	private double GPA;
	private String name;

	public Student(String n, double gpa) {
		name = n;
		GPA = gpa;
	}
	
	@Override
	public Student clone() {
		return new Student(this);
	}
	
	public Student(Student newStudent) {
		this.setName(newStudent.getName());
		this.setGPA(newStudent.getGPA());
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		writeObjectToFile();
		Student a = readObjectFromFile();

		if(a != null) {
			System.out.println(a.toString());
		}
	}

	private static Student readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
		Student one = (Student) is.readObject();
		is.close();

		return one;
	}

	private static void writeObjectToFile() throws FileNotFoundException, IOException {
		Student student1 = new Student("student1", 3.5);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(student1);

		os.close();		
	}

	public int compareTo(Student other) {
		if(this.GPA < other.GPA) {
			return -1;
		}else if(this.GPA > other.GPA) {
			return 1;
		}
		return 0;
	}
	

	public String getName() {	
		return this.name;	
		
	}
	
	public double getGPA() {	
		return this.GPA;	
		
	}
	
	public void setName(String newName) {	
		this.name = newName;	
		
	}

	public void setGPA(double newGPA) {	
		this.GPA = newGPA;	
		
	}
}