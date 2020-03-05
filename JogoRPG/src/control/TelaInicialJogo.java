package control;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class TelaInicialJogo extends JFrame {

	private JPanel contentPane;
	private BackgroundImagePanel valeImg;
	private JButton btnJogar;
	
	public TelaInicialJogo(BufferedImage img) throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		valeImg = new BackgroundImagePanel(img);
		valeImg.setBounds(0, 0, 600, 550);
		
		contentPane.add(valeImg);
		
		btnJogar = new JButton("Jogar");
		btnJogar.setBounds(0, 510, 600, 53);
		btnJogar.setFont(new Font("Georgia", Font.BOLD, 42));
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnJogar);
	}

	public void trocarImagem(BufferedImage img) {
		valeImg = new BackgroundImagePanel(img);
	}
	
	public void setNomeBotao(String texto) {
		btnJogar.setText(texto);
	}
}
