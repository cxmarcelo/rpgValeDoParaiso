package control;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class CombateOqFazer extends javax.swing.JFrame {

	private JPanel contentPane;
	private JPanel principal;
	private String texto = "O que fazer ?";
	private boolean fugir = false;
	private String acao = "";

	public CombateOqFazer(PersonagemPrincipal jogador, Monstro monstro, Bolsa bolsa) {
		initComponents(jogador, monstro, bolsa);
	}
	
	private void initComponents(PersonagemPrincipal jogador, Monstro monstro, Bolsa bolsa) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		principal = new JPanel();
		principal.setLayout(null);
		principal.setBounds(0, 0, 600, 600);
		
		//Personagem---------------------------------------------------------------
		JLabel nomePersonagem = new JLabel(jogador.getNome());
		nomePersonagem.setFont(new Font("Georgia", Font.PLAIN, 24));
		nomePersonagem.setBounds(10, 11, 250, 23);
		principal.add(nomePersonagem);
		
		JProgressBar hpPersonagem = new JProgressBar();
		hpPersonagem.setForeground(Color.GREEN);
		hpPersonagem.setStringPainted(true);
		hpPersonagem.setMaximum(jogador.getHpMax());
		hpPersonagem.setValue(jogador.getHpAtual());
		hpPersonagem.setBounds(10, 36, 250, 20);
		principal.add(hpPersonagem);
		
		JProgressBar spPersonagem = new JProgressBar();
		spPersonagem.setStringPainted(true);
		spPersonagem.setMaximum(jogador.getSpMax());
		spPersonagem.setValue(jogador.getSpAtual());
		spPersonagem.setBounds(10, 59, 146, 14);
		principal.add(spPersonagem);
		
		JLabel lblFotoPersonagem = new JLabel("");
		lblFotoPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoPersonagem.setIcon(jogador.getImgPersonagem().getIcon());
		lblFotoPersonagem.setBounds(10, 101, 224, 330);
		principal.add(lblFotoPersonagem);
		
		//Monstro ---------------------------------------------------------------
		JLabel nomeMonstro = new JLabel(monstro.getNome());
		nomeMonstro.setHorizontalAlignment(SwingConstants.RIGHT);
		nomeMonstro.setFont(new Font("Georgia", Font.PLAIN, 24));
		nomeMonstro.setBounds(334, 11, 250, 23);
		principal.add(nomeMonstro);
		
		JProgressBar hpMonstro = new JProgressBar();
		hpMonstro.setForeground(Color.RED);
		hpMonstro.setStringPainted(true);
		hpMonstro.setMaximum(monstro.getHpMax());
		hpMonstro.setValue(monstro.getHpAtual());
		hpMonstro.setBounds(334, 36, 250, 20);
		principal.add(hpMonstro);
		
		JProgressBar spMonstro = new JProgressBar();
		spMonstro.setMaximum(monstro.getSpMax());
		spMonstro.setValue(monstro.getSpAtual());
		spMonstro.setStringPainted(true);
		spMonstro.setBounds(438, 61, 146, 14);
		principal.add(spMonstro);
		
		JLabel lblFotoMonstro = new JLabel("");
		lblFotoMonstro.setIcon(monstro.getImgMonstro().getIcon());
		lblFotoMonstro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoMonstro.setBounds(360, 101, 224, 330);
		principal.add(lblFotoMonstro);
		
		
		//--------------------------------------------------------------------------------------------------
		JButton AtacarButton = new JButton("Atacar");
		AtacarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acao = "Atacar";
				dispose();
			}
		});
		AtacarButton.setBounds(300, 446, 125, 50);
		principal.add(AtacarButton);

		
		
		JButton itensButton = new JButton("Itens");
		itensButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Itens";
				dispose();
			}
		});
		itensButton.setBounds(438, 446, 125, 50);
		principal.add(itensButton);
		
		
		
		JButton statusButton = new JButton("Status");
		statusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Status";
				dispose();
			}
		});
		statusButton.setBounds(378, 507, 125, 50);
		principal.add(statusButton);
		
		
		JLabel textoCombate = new JLabel(texto);
		textoCombate.setHorizontalAlignment(SwingConstants.CENTER);
		textoCombate.setBounds(10, 452, 249, 105);
		principal.add(textoCombate);
		
		contentPane.add(principal);
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isFugir() {
		return fugir;
	}

	public void setFugir(boolean fugir) {
		this.fugir = fugir;
	}


	public String getAcao() {
		return acao;
	}


	public void setAcao(String acao) {
		this.acao = acao;
	}
}
