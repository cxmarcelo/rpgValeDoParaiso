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
public class MonstroEliminado extends JFrame {

	private JPanel contentPane;
	private static int qualDica = 1;
	private JTextArea lblQuestao;
	
	public MonstroEliminado(PersonagemPrincipal jogador, Monstro monstro) {
		inicializarComponentes(jogador, monstro);
		
		if(qualDica > 8) {
			qualDica = 1;
		}
		switch(qualDica) {
		
		case 1:
			lblQuestao.setText("Vocês humanos jogam todo o seu lixo fora poluindo o ambiente em vez de reciclar-los. \n"
					+ " Vocês pagarão...");
			qualDica++;
			break;
			
		case 2:
			lblQuestao.setText("Humano, separe sempre o seu lixo organico de residos solidos, assim talvez suas terras prosperem novamente...");
			qualDica++;
			break;
			
		case 3:
			lblQuestao.setText("A coleta seletiva é muito importante, para que possam reaproveitar resíduos e reaproveita-lós, não se esqueça disso...");
			qualDica++;
			break;
			
		case 4:
			lblQuestao.setText("Isso humanos, continuem a não reciclar papeis, pois assim nunca conseguiram ter arvores novamente...");
			qualDica++;
			break;
			
		case 5:
			lblQuestao.setText("humanos idiotas, usam energias poluentes ao invés de usarem energia solar...");
			qualDica++;
			break;
			
		case 6:
			lblQuestao.setText("Se voces apenas consumissem o necessario de forma conciente isso nunca teria acontecido com o seu mundo...");
			qualDica++;
			break;
			
		case 7:
			lblQuestao.setText(" Não importa quanto tempo passe humano, aquele vidro que jogou fora nunca irá se decompor...");
			qualDica++;
			break;
			
		case 8:
			lblQuestao.setText(" Humano, sempre jogue lixo em locais inadequados, adoeça e acabe de vez com a sua espécie maldita...");
			qualDica++;
			break;
		}

		if(monstro.getTipo() == "bossMagico") {
			lblQuestao.setText("O guardião foi Derrotado. Você se provou digno");
		}
		
	}
	
	public void inicializarComponentes(PersonagemPrincipal jogador, Monstro monstro) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomePersonagem = new JLabel(jogador.getNome());
		nomePersonagem.setFont(new Font("Georgia", Font.PLAIN, 24));
		nomePersonagem.setBounds(10, 11, 250, 23);
		contentPane.add(nomePersonagem);

		JProgressBar hpPersonagem = new JProgressBar();
		hpPersonagem.setForeground(Color.GREEN);
		hpPersonagem.setStringPainted(true);
		hpPersonagem.setMaximum(jogador.getHpMax());
		hpPersonagem.setValue(jogador.getHpAtual());
		hpPersonagem.setBounds(10, 36, 250, 20);
		contentPane.add(hpPersonagem);

		JProgressBar spPersonagem = new JProgressBar();
		spPersonagem.setStringPainted(true);
		spPersonagem.setMaximum(jogador.getSpMax());
		spPersonagem.setValue(jogador.getSpAtual());
		spPersonagem.setBounds(10, 59, 146, 14);
		contentPane.add(spPersonagem);

		JLabel lblFotoPersonagem = new JLabel("");
		lblFotoPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoPersonagem.setIcon(jogador.getImgPersonagem().getIcon());
		lblFotoPersonagem.setBounds(10, 101, 224, 330);
		contentPane.add(lblFotoPersonagem);
		
		lblQuestao = new JTextArea("Questão");
		lblQuestao.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblQuestao.setEditable(false);
		lblQuestao.setLineWrap(true);
		lblQuestao.setRows(10);
		lblQuestao.setBounds(300, 101, 250, 330);
		contentPane.add(lblQuestao);
		
		JLabel lblXpRecebida = new JLabel("XP recebida: " + monstro.getXpConcebida());
		lblXpRecebida.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblXpRecebida.setBounds(21, 489, 200, 35);
		contentPane.add(lblXpRecebida);
		
		JLabel lblMonstroDerrotado = new JLabel("Monstro Derrotado");
		lblMonstroDerrotado.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblMonstroDerrotado.setBounds(21, 442, 200, 35);
		contentPane.add(lblMonstroDerrotado);
		
		JButton okButton = new JButton("Ok");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		okButton.setFont(new Font("Georgia", Font.PLAIN, 24));
		okButton.setBounds(327, 461, 194, 73);
		contentPane.add(okButton);
	}
}
