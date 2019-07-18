import java.io.*;

abstract class AddTask {
  static void usingBufferedWritter(String task) {
    try {
      String taskAdd = linesFile("/home/vilmos/Downloads/projects/greenfox/jozsavilmos-todo-app/src/tasks.txt") + " - " + task;

      BufferedWriter writer = new BufferedWriter(new FileWriter("/home/vilmos/Downloads/projects/greenfox/jozsavilmos-todo-app/src/tasks.txt", true));
      writer.write(taskAdd);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  static int linesFile(String path){
    int lines = 0;
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.readLine() != null) lines++;
      reader.close();
    }catch (IOException e) {
      e.printStackTrace();
    }
    return lines + 1;
  }
}
