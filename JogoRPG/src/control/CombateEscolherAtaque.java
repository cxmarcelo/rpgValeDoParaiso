package control;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CombateEscolherAtaque extends JFrame {

	private String acao = "";
	private JPanel contentPane;
	private JPanel principal;
	private String textoCombate;
	private boolean acaoRealizada = false;

	public CombateEscolherAtaque(PersonagemPrincipal jogador, Monstro monstro) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

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

		//ataque 1
		JButton ataque1Button = new JButton(jogador.getAtaque1().getNome());
		ataque1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Ataque1";
				dispose();
			}
		});
		ataque1Button.setBounds(50, 440, 200, 25);
		principal.add(ataque1Button);



		//ataque 2
		if(jogador.getSpAtual() >= jogador.getAtaque2().getCustoSp()) {
			JButton ataque2Button = new JButton(jogador.getAtaque2().getNome());
			ataque2Button.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					acao = "Ataque2";
					dispose();
				}
			});
			ataque2Button.setBounds(50, 480, 200, 25);
			principal.add(ataque2Button);
		}else{	
			JButton ataque2Button = new JButton("Sp Insuficiente");
			ataque2Button.setBounds(50, 480, 200, 25);
			principal.add(ataque2Button);

		}

		//ataque 3
		if(jogador.getSpAtual() >= jogador.getAtaque3().getCustoSp()) {
		JButton ataque3Button = new JButton(jogador.getAtaque3().getNome());
		ataque3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Ataque3";
				dispose();
			}
		});
		ataque3Button.setBounds(50, 520, 200, 25);
		principal.add(ataque3Button);
		}else {
			JButton ataque3Button = new JButton("Sp insuficiente");
			ataque3Button.setBounds(50, 520, 200, 25);
			principal.add(ataque3Button);
		}
		
		//Ataque 4
		if(jogador.getSpAtual() >= jogador.getAtaque4().getCustoSp()) {
		JButton ataque4Button = new JButton(jogador.getAtaque4().getNome());
		ataque4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Ataque4";
				dispose();
			}
		});
		ataque4Button.setBounds(350, 440, 200, 25);
		principal.add(ataque4Button);
		}else {
			JButton ataque4Button = new JButton("Sp Insuficiente");
			ataque4Button.setBounds(350, 440, 200, 25);
			principal.add(ataque4Button);
		}


		if(jogador.getSpAtual() >= jogador.getAtaque5().getCustoSp()) {
		JButton ataque5Button = new JButton(jogador.getAtaque5().getNome());
		ataque5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Ataque5";
				dispose();
			}
		});
		ataque5Button.setBounds(350, 480, 200, 25);
		principal.add(ataque5Button);
		}else {
			JButton ataque5Button = new JButton("Sp Insuficiente");
			ataque5Button.setBounds(350, 480, 200, 25);
			principal.add(ataque5Button);
		}


		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = "Voltar";
				dispose();
			}
		});
		voltarButton.setBounds(350, 520, 200, 25);
		principal.add(voltarButton);

		contentPane.add(principal);
	}

	public String getTextoCombate() {
		return textoCombate;
	}

	public void setTextoCombate(String textoCombate) {
		this.textoCombate = textoCombate;
	}

	public boolean isAcaoRealizada() {
		return acaoRealizada;
	}

	public void setAcaoRealizada(boolean acaoRealizada) {
		this.acaoRealizada = acaoRealizada;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

}
