import javax.swing.*;

public class GameFrame extends JFrame
{
    GameFrame()
    {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
