import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class TaskReader {

  public static void readFile(String path){
    try {
      List<String> allLines = Files.readAllLines(Paths.get(path));
      if (allLines.size() == 0){
        System.out.println("No todos for today! :)");
      }
      for (String line : allLines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}