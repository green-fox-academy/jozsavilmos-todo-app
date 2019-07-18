import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayTodo extends JPanel {
  public DisplayTodo() {
    initializeUI();
  }

  private void initializeUI() {
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    try {
      textArea.read(new InputStreamReader(
                      getClass().getResourceAsStream("tasks.txt")),
              null);
    } catch (IOException e) {
      e.printStackTrace();
    }

    this.setPreferredSize(new Dimension(500, 200));
    this.setLayout(new BorderLayout());
    this.add(scrollPane, BorderLayout.CENTER);
  }

  public static void showFrame() {
    JPanel panel = new DisplayTodo();
    panel.setOpaque(true);

    JFrame frame = new JFrame("ToDo");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setContentPane(panel);
    frame.pack();
    frame.setVisible(true);
  }

  public static void main() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        DisplayTodo.showFrame();
      }
    });
  }
}