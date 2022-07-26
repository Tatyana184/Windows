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