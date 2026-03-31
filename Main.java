import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    StudentManager sm=new StudentManager();
    
    while(true){
      System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Save 6.Load 7.Exit");
      int ch=sc.nextInt();
      
      try{
        switch(ch){
          case 1:
            System.out.print("Enter ID Name Marks: ");
            int id=sc.nextInt();
            String name=sc.next();
            double marks=sc.nextDouble();
            sm.addStudent(new Student(id, name, marks));
            break;
            
          case 2:
            sm.viewStudents();
            break;
            
          case 3:
            System.out.print("Enter ID: ");
            sm.searchStudent(sc.nextInt());
            break;
            
          case 4:
            System.out.print(Enter ID: ");
            sm.deleteStudent(sc.nextInt());
            break;
            
          case 5:
            FileHandler.saveToFile(sm);
            System.out.println("Saved!");
            break;
            
          case 6:
            FileHandler.loadFromFile(sm);
            System.out.println("Loaded!");
            break;
            
          case 7:
            return;
        }
      } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
      }
    }
  }
}
