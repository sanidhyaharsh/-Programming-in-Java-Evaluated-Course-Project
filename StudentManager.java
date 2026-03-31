import java.util.*;

class StudentManager{
  ArrayList<Student> students = new ArrayList<>();
  
  void addStudent(Student s){
    students.add(s);
  }
  
  void viewStudents(){
    for (Student s:students) {
      s.display();
    }
  }

  void searchStudent(int id){
    for (Student s:students){
      if(s.id==id){
        s.display();
        return;
      }
    }
    System.out.println("Student not found");
  }
  
  void deleteStudent(int id){
    students.removeIf(s->s.id==id);
  }
}
