import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lecturer extends PersonProfile {
    
    private String[] courseCode, courseName;
    private int[] semester, session, student;
    private double[] creditHour;
    private String fileName;

    public Lecturer(String name, String gender, String dob, String n) {
        super(name, gender, dob);
        fileName = n;
        getInput();
    }

    public void getInput() {
        int i, cnt=0;
        String temp;

        try {
            Scanner input = new Scanner(new FileInputStream("C:\\Users\\Hi\\Downloads\\Lab09\\Lab09\\"+fileName));
            while(input.hasNextLine()) {
                i=0;
                while (i<6) {
                    temp = input.nextLine();
                    i++;
                }
                cnt++;
            }
            input.close();
            courseCode = new String[cnt];
            courseName = new String[cnt];
            semester = new int[cnt];
            session = new int[cnt];
            student = new int[cnt];
            creditHour = new double[cnt];

            input = new Scanner(new FileInputStream("C:\\Users\\Hi\\Downloads\\Lab09\\Lab09\\"+fileName));
            i=0;
            while(input.hasNextLine()) {
                courseCode[i] = input.nextLine();
                courseName[i] = input.nextLine();
                semester[i] = Integer.parseInt(input.nextLine());
                session[i] = Integer.parseInt(input.nextLine());
                creditHour[i] = Double.parseDouble(input.nextLine());
                student[i] = Integer.parseInt(input.nextLine());
                i++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }

    }

    public double getCreditHour(int num, double hour) {
       if (num >= 150) return hour*3;
       else if(num >= 100) return hour*2;
       else if(num >= 50) return hour*1.5;
       else
           return hour;
    }

    public void display() {
        super.display();
        System.out.println("A list of courses taken");
        for(int i=0; i<courseCode.length; i++) {
            System.out.print(courseCode[i] + " " + courseName[i] + " " + session[i] + " " + semester[i] + " ");
            System.out.println(student[i] + " " + getCreditHour(student[i], creditHour[i]));
        }
    }
}
