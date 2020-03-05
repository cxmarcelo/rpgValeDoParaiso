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
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class CombateTexto extends JFrame {

	private JPanel contentPane;
	private JPanel principal;
	private String texto = "";
	private JTextArea combateTexto;

	public void setTexto(String nome, String ataque, int dano) {
		texto = nome + " Usou " + ataque + " e causou " + dano + " de dano";
		combateTexto.setText(texto);
	}
	
	public void setTexto(String nomeMonstro) {
		texto = "Entrou em combate contra " + nomeMonstro;
		combateTexto.setText(texto);
	}
	
	public void setTexto(String nome, ItensUtilizaveis item) {
		if(item.getTipo() == "Hp" || item.getTipo() == "hp") {
		texto = nome + " usou " + item.getNome() + " e restaurou " + item.getRecuperacao() + " de vida";
		}else if(item.getTipo() == "Sp" || item.getTipo() == "sp") {
		texto = nome + " usou " + item.getNome() + " e restaurou " + item.getRecuperacao() + " de Sp";
		}else {
			texto = nome + " usou " + item.getNome() + " e restaurou " + item.getRecuperacao() + " de Vida e Sp";
		}
		combateTexto.setText(texto);
	}
	
	
	public CombateTexto(PersonagemPrincipal jogador, Monstro monstro) {
		inicializarComponentes(jogador, monstro);
	}
	
	public void inicializarComponentes(PersonagemPrincipal jogador, Monstro monstro) {
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
		
		contentPane.add(principal);
		
		combateTexto = new JTextArea();
		combateTexto.setEditable(false);
		combateTexto.setRows(4);
		combateTexto.setLineWrap(true);
		combateTexto.setText(texto);
		combateTexto.setForeground(Color.BLACK);
		combateTexto.setFont(new Font("Georgia", Font.PLAIN, 18));
		combateTexto.setBounds(20, 442, 312, 107);
		principal.add(combateTexto);
		
		JButton continueButton = new JButton("OK");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		continueButton.setBounds(360, 470, 190, 50);
		principal.add(continueButton);
		
		contentPane.add(principal);
	
	}

	public String getTexto() {
		return texto;
	}
}
