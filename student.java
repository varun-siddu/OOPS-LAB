import java.util.Scanner;

class Student
{
    String USN, name;

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter USN:");
        USN = sc.nextLine();

        System.out.println("Enter name:");
        name = sc.nextLine();
    }
    void display()
    {
        System.out.println("Student USN: " + USN);
        System.out.println("Student Name: " + name);
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for(int i = 0; i < n; i++)
        {
            s[i] = new Student();
            s[i].accept();
        }
        for(int i = 0; i < n; i++)
        {
            s[i].display();
        }
    }
}