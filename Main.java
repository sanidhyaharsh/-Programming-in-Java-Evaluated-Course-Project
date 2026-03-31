import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    StudentManager sm=new StudentManager();
    
    while(true){
      System.out.println("\n1.Add 2.View 3.Search by ID 4.Search by Name 5.Delete 6.Save 7.Load 8.Exit");
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
            System.out.print("Enter name: );
            String name = sc.next();
            sm.searchStudent(name);
            break;
            
          case 5:
            System.out.print(Enter ID: ");
            sm.deleteStudent(sc.nextInt());
            break;
            
          case 6:
            FileHandler.saveToFile(sm);
            System.out.println("Saved!");
            break;
            
          case 7:
            FileHandler.loadFromFile(sm);
            System.out.println("Loaded!");
            break;
            
          case 8:
            return;
        }
      } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
      }
    }
  }
}
