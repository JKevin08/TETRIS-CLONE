import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;
public class GamePanel extends JPanel {
    private final int rows = 19;
    private final int cols = 10;
    private final int blockSize = 40;
    public GamePanel() {
        setPreferredSize(new Dimension(400,760));
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
    }
       @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                g.drawRect(col * blockSize, row * blockSize, blockSize, blockSize);
            }
        }
    }
}

