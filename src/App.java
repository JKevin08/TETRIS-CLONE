import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
//import javax.swing.border.LineBorder; 

public class App {
public static void main(String[] args) {
        JFrame frame=new JFrame();
        ImageIcon logo=new ImageIcon(App.class.getResource("/logo.png"));
        ImageIcon logo2=new ImageIcon(App.class.getResource("/logo2.png"));
        JPanel menu=new JPanel();
        GamePanel gamescreen=new GamePanel();
        JLabel TitleScreen=new JLabel();
        JButton restart=new JButton("RESTART");
        JButton pause=new JButton("PAUSE");
        restart.setBounds(440, 600, 100, 80);
        pause.setBounds(620,600,100,80);
        menu.setLayout(new BorderLayout());
        TitleScreen.setForeground(Color.CYAN);
        TitleScreen.setIcon(logo2);
        TitleScreen.setBounds(400,500,500,248);        
        frame.setLayout(null);
        menu.add(TitleScreen,BorderLayout.NORTH);
        frame.add(restart);
        frame.add(pause);
        frame.setIconImage(logo.getImage());
        frame.setTitle("TETRIS");
        frame.setSize(763,740);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
       // frame.pack();
      //  frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamescreen);
        frame.add(menu);
        gamescreen.setBounds(0, 0, 400, 760);
        menu.setBackground(Color.GRAY);
        menu.setBounds(400, 0, 500, 760);
    }
    }

