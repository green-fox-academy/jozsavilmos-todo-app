import java.io.*;

public class RemoveTask {
  public static void useDelete(int line) throws IOException {
    File inputFile = new File("/home/vilmos/Downloads/projects/greenfox/jozsavilmos-todo-app/src/tasks.txt");
    File tempFile = new File("/home/vilmos/Downloads/projects/greenfox/jozsavilmos-todo-app/src/tasksTemp.txt");

    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

    int lineToRemove = line;
    String currentLine;
    int count = 0;

    while ((currentLine = reader.readLine()) != null) {
      count++;
      if (count == lineToRemove) {
        continue;
      }
      writer.write(currentLine + System.getProperty("line.separator"));
    }
    writer.close();
    reader.close();
    inputFile.delete();
    tempFile.renameTo(inputFile);
  }
}