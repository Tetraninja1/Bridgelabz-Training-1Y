package Com.gla;

import com.gla.libraryManagement.Branch;
import com.gla.libraryManagement.Person;

public class Student extends Person {
    private int rollNumber;
    private int year;
    private Branch branch;

    public Student(String name, int id) {
        super(name, id);
    }
}
