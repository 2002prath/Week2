import java.util.Scanner; 
public class Student
{   

   public static void main(String[] mmg)
   {   
     Scanner sc = new Scanner(System.in);

      System.out.println("Enter your name"); 
       String name = sc.nextLine(); 
     
      System.out.println("Enter your roll_number"); 
        String roll = sc.nextLine(); 
         
        int[] marks = new int[5]; 
        System.out.println("Enter your marks"); 
         for(int i=0;i<marks.length;i++)
         { 
             marks[i] = sc.nextInt(); 
         } 

     Grade student = new Grade(name,roll,marks); 
     
   
        student.display();  
         student.grade();
        
   //      sc.close(); 
   }
}
class Grade 
{ 
    public String name; 
    public String roll_no; 
    public int[] marks;
    public int sum =0;   
    public double marks_percent=0; 
  
    public Grade( String name,String roll_no,int[] marks)
    { 
        this.name = name; 
        this.roll_no = roll_no; 
        this.marks = marks; 
    } 
    public int total_marks()
    { 
      for(int i=0;i<marks.length;i++)
      { 
         sum = sum + marks[i]; 
      } 
       return sum; 
    }

    public double  calculate()
    {   
       return marks_percent = sum/marks.length; 
    } 
     public void grade()
     { 
        if(marks_percent>90)
        System.out.print("Achieved Grade : A"); 
        else  if(marks_percent>70 && marks_percent <=90)
        System.out.print("Achieved Grade : B"); 
        else  if(marks_percent>50 && marks_percent <=70)
        System.out.print("Achieved Grade : C"); 
        else  if(marks_percent>39 && marks_percent <=50)
        System.out.print("Achieved Grade : D");
        else 
        System.out.print("Better Luck Next time");  
     }

     void display()
     { 
        System.out.println("Name of Student :"+ name); 
        System.out.println("Roll number of student :"+ roll_no);
        System.out.println("Total Marks of student :"+ total_marks());
        System.out.println("Marks percent of student :"+ calculate()); 

     }

}