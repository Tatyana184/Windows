import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {

     JFrame frame = new JFrame();
        frame.setSize(600,600);
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
                    String result = JOptionPane.showInputDialog(
                            "<html><h2>¬ведите ваше им€","");

                    JOptionPane.showMessageDialog(frame,result);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}