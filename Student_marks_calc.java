import java.util.*;
public class Student_marks_calc {

    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String Name=sc.nextLine();
        System.out.print("\nEnter Your Roll Number : ");
        int Roll=sc.nextInt();
        System.out.print("\nEnter Number of subjects : ");
        int sub=sc.nextInt();
        int total_marks=0;
        for(int i=1;i<=sub;i++){
            System.out.print("\nEnter Marks of Subject "+i+" (out of 100) : ");
            int mark=sc.nextInt();
            total_marks=total_marks+mark;
        }
        float average_per=(float) total_marks/sub;

        char grade;
        if(average_per>=90){
            grade='A';
        }
        else if (average_per<90 && average_per>=80) {
            grade='B';
        }
        else if(average_per<80 && average_per>=70){
            grade='C';
        }
        else if(average_per<70 && average_per>=60){
            grade='D';
        }
        else if(average_per<60 && average_per>=33){
            grade='E';
        }
        else{
            grade='F';
        }

        System.out.println("Student's_Name  RollNo.  Percen.   Grade");
            System.out.print(Name+"       "+Roll+"     ");
            System.out.printf("%.2f", average_per);
            System.out.println("      "+grade);
            
    }
    
}
