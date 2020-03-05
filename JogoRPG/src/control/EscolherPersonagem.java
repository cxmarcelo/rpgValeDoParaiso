package control;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class EscolherPersonagem extends JFrame {

	private JPanel contentPane;
	private String aparencia = "masculina";
	private String personagem;
	
	public String getPersonagem() {
		return personagem;
	}

	public EscolherPersonagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Superior
		JLabel lblEscolhaSeuPersonagem = new JLabel("Escolha seu Personagem");
		lblEscolhaSeuPersonagem.setFont(new Font("Georgia", Font.PLAIN, 28));
		lblEscolhaSeuPersonagem.setBounds(80, 11, 345, 53);
		contentPane.add(lblEscolhaSeuPersonagem);

		//Mago
		JLabel magoImagem = new JLabel();
		magoImagem.setBounds(15, 112, 170, 250);
		magoImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/mago.png")));
		contentPane.add(magoImagem);

		JButton criarMago = new JButton("Mago");
		criarMago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aparencia == "masculina") {
					personagem = "Mago";
				}else if(aparencia == "feminina") {
					personagem = "Maga";
				}
				dispose();
			}
		});
		criarMago.setBounds(15, 495, 170, 30);
		contentPane.add(criarMago);

		//Guerreiro
		JLabel guerreiroImagem = new JLabel();
		guerreiroImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/guerreiro.png")));
		guerreiroImagem.setBounds(205, 112, 170, 250);
		contentPane.add(guerreiroImagem);

		JButton criarGuerreiro = new JButton("Guerreiro");
		criarGuerreiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aparencia == "masculina") {
					personagem = "Guerreiro";
				}else if(aparencia == "feminina") {
					personagem = "Guerreira";
				}
				dispose();
			}
		});
		criarGuerreiro.setBounds(205, 495, 170, 30);
		contentPane.add(criarGuerreiro);


		//Arqueiro
		JLabel arqueiroImagem = new JLabel();
		arqueiroImagem.setBounds(395, 112, 170, 250);
		arqueiroImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/arqueiro.png")));
		contentPane.add(arqueiroImagem);

		JButton criarArqueiro = new JButton("Aqueiro");
		criarArqueiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aparencia == "masculina") {
					personagem = "Arqueiro";
				}else if(aparencia == "feminina") {
					personagem = "Arqueira";
				}
				dispose();
			}
		});
		criarArqueiro.setBounds(395, 495, 170, 30);
		contentPane.add(criarArqueiro);


		JButton girlButton = new JButton();
		girlButton.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/fem.png")));
		girlButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aparencia == "feminina") {
				}else {
					magoImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/maga.png")));
					guerreiroImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/guerreira.png")));
					arqueiroImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/arqueira.png")));
					criarMago.setText("Maga");
					criarGuerreiro.setText("Guerreira");
					criarArqueiro.setText("Arqueira");
					revalidate();
					repaint();
					aparencia = "feminina";
				}
			}
		});
		girlButton.setBounds(539, 11, 26, 26);
		contentPane.add(girlButton);
		
		JButton boyButton = new JButton();
		boyButton = new javax.swing.JButton();
		boyButton.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/masc.png")));
		boyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aparencia == "masculina") {

				}else {
					magoImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/mago.png")));
					guerreiroImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/guerreiro.png")));
					arqueiroImagem.setIcon(new ImageIcon(EscolherPersonagem.class.getResource("../imgs/arqueiro.png")));
					criarMago.setText("Mago");
					criarGuerreiro.setText("Guerreiro");
					criarArqueiro.setText("Arqueiro");
					aparencia = "masculina";
					revalidate();
					repaint();
					
				}


			}
		});
		boyButton.setBounds(480, 11, 26, 26);
		contentPane.add(boyButton);
	}
}
