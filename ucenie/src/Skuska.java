import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Skuska{
    private JButton button1;
    private JTextField textField1;

    public Skuska() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText("AHoj");
            }
        });

    }
}
