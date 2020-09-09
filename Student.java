import java.util.*;
public class Student
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name, address;
	long phone;
	int n;
	System.out.println("Enter your Name: ");
	name = sc.nextLine();
	System.out.println("Enter your Address: ");
	address = sc.nextLine();
	System.out.println("Enter your Phone number: ");
	phone = sc.nextLong();

	System.out.println("Enter no of subjects: ");
	n = sc.nextInt();
	int marks[] = new int[100];
	int sum = 0;
	for(int i = 1;i <= n; i++){
            System.out.print("Enter Marks you have secured in Subject "+i +"out of 100 :");
            marks[i] = sc.nextInt();
        }
    System.out.println("Details of the student \n Name: "+ name+ "\nPhone number: "+ phone+ "\nAddress: "+address +"\n");
	for(int i = 1; i <= n; i++){
	    System.out.println("Marks secured in the subject"+ i+ " "+ marks[i]);
	    sum = sum + marks[i];
	}
	n = n * 100;
	 System.out.println("Percentage : " + (sum * 100)/n + "%");
	 System.out.println("Total marks :" + sum);
	}
}