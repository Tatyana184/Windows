import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String[] items = {"800x600","1024x768","1200x600"};
        Object result =  JOptionPane.showInputDialog(frame,
                "Выберите подходящий размер:",
                "Выбор разрешения",
                JOptionPane.QUESTION_MESSAGE,null,items,items[0]);
  String str = String.valueOf(result);
  String[] res = str.split("x");
        frame.setSize(Integer.parseInt(res[0]),Integer.parseInt(res[0]));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE ){
                    int result =   JOptionPane.showConfirmDialog(frame,
                            "Вам нравится значок?", "",
                            JOptionPane.YES_NO_CANCEL_OPTION);
                    if (result == JOptionPane.YES_OPTION)
                        JOptionPane.showMessageDialog(frame,
                                "Отлично");
                    else if (result == JOptionPane.NO_OPTION)
                        JOptionPane.showMessageDialog(frame,
                                "Очень жаль");
                }

                }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}