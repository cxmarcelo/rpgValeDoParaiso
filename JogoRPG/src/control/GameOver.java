package control;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class GameOver extends JFrame {

	private BackgroundImagePanel fimDeJogo;
	public GameOver() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		BufferedImage myImage = ImageIO.read(GameOver.class.getResource("../imgs/gameover.png"));
		fimDeJogo = new BackgroundImagePanel(myImage);
		fimDeJogo.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		setContentPane(fimDeJogo);
		fimDeJogo.setLayout(null);
		
		
		JButton fimButton = new JButton("Fim");
		fimButton.setBackground(Color.BLACK);
		fimButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		fimButton.setFont(new Font("Georgia", Font.PLAIN, 40));
		fimButton.setBounds(225, 185, 125, 50);
		fimDeJogo.add(fimButton);
	}

}
