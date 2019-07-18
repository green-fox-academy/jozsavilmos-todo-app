import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    if (args.length > 0){
      if (args[0].equals("-l")){
        DisplayTodo.main();
      }
      else if (args[0].equals("-a")){
        AddTask.usingBufferedWritter(args[1]);
      }
      else if(args[0].equals("-r")){
        try {
          RemoveTask.useDelete(Integer.parseInt(args[1]));
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    else
      System.out.println("Command Line Todo application\n" +
            "=============================\n" +
            "\n" +
            "Command line arguments:\n" +
            "    -l   Lists all the tasks\n" +
            "    -a   Adds a new task\n" +
            "    -r   Removes an task\n" +
            "    -c   Completes an task");
  }
}
