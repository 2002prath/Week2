import java.util.*; 
public class School_student { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
         String board_name;  
        System.out.println("Enter board name"); 
          board_name = input.nextLine(); 
       
       School school1 = new School("Saraswati Sishu Mandir","1876",board_name); 

          Student alice = new Student("Alice","21M113","III"); 
          Student bob = new Student("Bob","21P112","V");
          Student julie = new Student("Julie","21P087","VII");  

          school1.add_student(alice); 
          school1.add_student(bob); 
          school1.add_student(julie); 
          
          Course math = new Course("Maths","1");
          Course physics = new Course("Physics","2"); 

          alice.add_course(math); 
          alice.add_course(physics);
          bob.add_course(physics);
          bob.add_course(math); 
          julie.add_course(physics); 
          julie.add_course(math); 

          alice.display_course(); 
          bob.display_course();  


          school1.display_schoolDetails();

          input.close(); 
    }
    
} 
class School
{ 
    public String name; 
    public String foundation_year; 
    public String board_name; 
    public ArrayList<Student> student = new ArrayList<>(); 
    public School(String school_name,String year,String board_name)
    { 
       this.name = school_name; 
       this.foundation_year = year; 
       this.board_name= board_name;          
    } 
    public void add_student(Student stu1)
    { 
      student.add(stu1); 
    } 
    public void display_schoolDetails()
    { 
      System.out.println("Students of a "+name);   
      System.out.println("Board name is "+board_name); 
      for(int i=0;i<student.size();i++)
      {  Student stud =student.get(i);  
            
          stud.display_name(); 
      } 
    }
}
class Student
{ 
   public String name; 
   public String id; 
   public String semester;  
   public ArrayList<Course> course = new ArrayList<>(); 

   public Student(String name,String id,String semester)
   { 
     this.name = name; 
     this.id = id; 
     this.semester = semester; 
   } 

   public void add_course(Course c1)
   { 
     course.add(c1);  
   } 

    public void display_course()
   { 
     System.out.println("Student "+name); 
     System.out.println("course are "); 
     for(int i=0;i<course.size();i++)
     { 
       Course course1 = course.get(i); 
         course1.view_course(); 
     }
    }
    
    public void display_name()
     {  
         for(int i=1;i<2;i++)
         { 
           System.out.println(i+". "+name); 
             
         }

     }

}
class Course
{ 
    public String name; 
    public String id; 
    public ArrayList<Student> student =new ArrayList<>(); 

    public Course(String course_name,String course_id)
    { 
        this.name = course_name; 
        this.id = course_id;  
    }  
    public void add_student(Student stu)
    { 
      student.add(stu); 
    } 
    public void view_course()
    { 
      System.out.println("Course name :"+ name);
      System.out.println("Course id  "+id +"\n");  
      System.out.println("==============="); 

    }

}
