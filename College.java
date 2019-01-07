
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

class College {

    int j;
    String collegename;
   ArrayList<Department> departments = new ArrayList<>();
   ArrayList<Student> Students = new ArrayList<>();

    public ArrayList<Department> createDepartment() throws IOException, ParseException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            while (true) {
                Department department = new Department();
                System.out.println("enter Department");
                while (true) {
                    department.departmentname = in.readLine();
                    if (department.departmentname.length() <= 15) {
                        departments.add(department);
                        Students = department.createStudent();
                        j = 0;
                        break;
                    } else {
                        System.out.println("Enter valid department");
                    }
                    if (j == 0) {
                        break;
                    }
                }
            }
        }
        return departments;
    }

    public static void main(String args[]) throws IOException, ParseException {
       ArrayList<Department> department1 = new ArrayList<>();
        College college = new College();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter College name");
        while (true) {
            college.collegename = in.readLine();

            if (college.collegename.length() <= 15) {
                // Department department = new Department();
                department1 = college.createDepartment();
                break;
            } else {
                System.out.println("enter valid Collegename:");
            }

        }
    }

}
