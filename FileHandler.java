import java.io.*;

class FileHandler{
  static void saveToFile(StudentManager sm) throws Exception{
    BufferedWriter writer=new BufferedWriter(new FileWriter("Students.txt"));
    
    for (Student s:sm.students){
      writer.write(s.id + "," + s.name + "," + s.marks);
      writer.newLine();
    }
    writer.close();
  }
  
  static void loadFromFile(StudentManager sm) throws Exception{
    BufferedReader reader=new BufferedReader(new FileReader("students.txt");
    String line;
    
    while((line=reader.readLine()) != null){
      String[]date=line.split(",");
      sm.addStudent(new Student(
        Integer.parseInt(date[0]),
        data[1],
        Double.parseDouble(data[2])
      ));
    }
    reader.close();
  }
}
