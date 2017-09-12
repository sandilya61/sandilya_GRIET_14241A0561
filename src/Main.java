import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
	
	Student ob=new Student;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numofStu = input.nextInt();
        int[] ids = new int[numOfStu]; 
	String[] names = new String[numOfStu];
	Date birthdate=new Date[numOfStu];
	double AvgMark=new double[numOfStu];
	       int id = 0;
        String name = "";
	Date bdate=" ";
	double AvgMarks=0.00;
	System.out.println("The details of folowing students enter/n");
        for(int i = 0; i < numOfStu; i++)
{
        name = input.next();
        id = input.nextInt();
        bdate=input.nextDate();
	AvgMark=input.next
        ob.names[i] = name;
        ob.ids[i] = id;
	ob.birthdate[i]=bdate;
	ob.AvgMark[i]=AvgMarks;
        
}

}



