package control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CombateEscolherItens extends JFrame {

	private JPanel contentPane;
	private JPanel principal;
	private String acao;
	private int posicaoItem;
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public int getQualItem() {
		return posicaoItem;
	}

	public void setQualItem(int posicaoItem) {
		this.posicaoItem = posicaoItem;
	}

	public CombateEscolherItens(PersonagemPrincipal jogador, Monstro monstro, Bolsa bolsa) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
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


		JPanel painelDeItens = new JPanel();
		painelDeItens.setBounds(10, 421, 390, 120);
		principal.add(painelDeItens);
		painelDeItens.setLayout(null);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(373, 0, 17, 119);
		painelDeItens.add(scrollBar);


		if(bolsa.getBolsaItens().size() == 0) {

			JLabel lblItem = new JLabel("Nenhum Item");
			lblItem.setFont(new Font("Georgia", Font.BOLD, 12));
			lblItem.setBounds(10, 11, 220, 23);
			painelDeItens.add(lblItem);

		}else {

			int quantidade = bolsa.getBolsaItens().size();
			JLabel lblItens[] = new JLabel[quantidade];
			JButton botoes[] = new JButton[quantidade];
			int posicao = 11;

			for(int cont = 0; cont < bolsa.getBolsaItens().size(); cont ++) {

				lblItens[cont] = new JLabel(bolsa.getBolsaItens().get(cont).getItens().getNome());
				lblItens[cont].setFont(new Font("Georgia", Font.BOLD, 12));
				lblItens[cont].setBounds(10,posicao, 220,23);
				painelDeItens.add(lblItens[cont]);

				botoes[cont] = new JButton("Usar");
				botoes[cont].setFont(new Font("Georgia", Font.BOLD, 12));
				botoes[cont].setBounds(258, posicao, 89, 23);
				painelDeItens.add(botoes[cont]);
				posicaoItem++;
				posicao += 25;
			}
			
			botoes[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					acao = "Item";
					posicaoItem = 0;
					dispose();
				}
			});
			botoes[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					acao = "Item";
					posicaoItem = 1;
					dispose();
				}
			});
			botoes[2].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					acao = "Item";
					posicaoItem = 2;
					dispose();
				}
			});
		}
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.setFont(new Font("Georgia", Font.BOLD, 24));
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acao = "Voltar";
				dispose();
			}
		});
		voltarButton.setBounds(438, 442, 126, 70);
		principal.add(voltarButton);
		contentPane.add(principal);
	}
}
