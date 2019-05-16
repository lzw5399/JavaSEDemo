package PlaneGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
  public static void main(String[] args) {
    MainFrame f = new MainFrame();
    f.launchFrame();
  }

  @Override
  public void paint(Graphics g) {
    g.drawLine(100, 100, 300, 300);
    g.drawRect(100, 100, 300, 300);
  }
  // 初始化窗口
  private void launchFrame() {
    setTitle("java jfeame test");
    setVisible(true);
    setSize(500, 500);
    setLocation(300, 300);

    // 关闭窗口，即关闭整个应用
    addWindowListener(
        new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }
        });
  }
}
