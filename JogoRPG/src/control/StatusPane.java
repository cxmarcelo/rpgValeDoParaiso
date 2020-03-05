package control;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class StatusPane extends javax.swing.JFrame {

	private JPanel contentPane;

	public StatusPane(PersonagemPrincipal jogador) {
		initComponents(jogador);
	}
	

	private void initComponents(PersonagemPrincipal jogador) {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel nomePersonagem = new JLabel(jogador.getNome());
		nomePersonagem.setFont(new Font("Georgia", Font.PLAIN, 24));
		nomePersonagem.setBounds(10, 10, 250, 28);
		contentPane.add(nomePersonagem);
		
		JLabel classePersonagem = new JLabel(jogador.getClasse());
		classePersonagem.setFont(new Font("Georgia", Font.PLAIN, 20));
		classePersonagem.setBounds(10, 50, 190, 28);
		contentPane.add(classePersonagem);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(10, 90, 250, 37);
		contentPane.add(lblStatus);
		
		JLabel hpPersonagem = new JLabel("HP: " + jogador.getHpAtual() + "/" + jogador.getHpMax());
		hpPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		hpPersonagem.setBounds(10, 155, 190, 30);
		contentPane.add(hpPersonagem);
		
		JLabel spPersonagem = new JLabel("SP: " + jogador.getSpAtual() + "/" + jogador.getSpMax());
		spPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		spPersonagem.setBounds(10, 210, 190, 30);
		contentPane.add(spPersonagem);
		
		JLabel atqPersonagem = new JLabel("Ataque: " + jogador.getAtq());
		atqPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		atqPersonagem.setBounds(10, 265, 190, 30);
		contentPane.add(atqPersonagem);
		
		JLabel magiaPersonagem = new JLabel("Magia: " + jogador.getMagic());
		magiaPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		magiaPersonagem.setBounds(10,320, 190, 30);
		contentPane.add(magiaPersonagem);
		
		
		JLabel defesaPersonagem = new JLabel("Defesa: " + jogador.getDef());
		defesaPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		defesaPersonagem.setBounds(10, 375 , 190, 30);
		contentPane.add(defesaPersonagem);
		
		JLabel defesaMPersonagem = new JLabel("Defesa Magica: " + jogador.getDefM());
		defesaMPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		defesaMPersonagem.setBounds(10, 430, 190, 30);
		contentPane.add(defesaMPersonagem);
		
		JLabel xpPersonagem = new JLabel("XP: " + jogador.getXpAtual() + "/" + jogador.getXpUpar());
		xpPersonagem.setFont(new Font("Lucida Sans", Font.PLAIN, 17));
		xpPersonagem.setBounds(10, 485, 190, 30);
		contentPane.add(xpPersonagem);
		
		// Lado Direito-------------------------------------------------------------------

		JLabel lblNewLabel = new JLabel("Equipamentos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(270, 10, 304, 68);
		contentPane.add(lblNewLabel);
		
		JLabel capaceteP = new JLabel(jogador.getCapacete().getNomeEquip());
		capaceteP.setIcon(new ImageIcon(StatusPane.class.getResource("../imgs/capacete.png")));
		capaceteP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		capaceteP.setBounds(270, 100, 304, 50);
		contentPane.add(capaceteP);
		
		JLabel armaduraP = new JLabel(jogador.getArmadura().getNomeEquip());
		armaduraP.setIcon(new ImageIcon(StatusPane.class.getResource("../imgs/armadura.png")));
		armaduraP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		armaduraP.setBounds(270, 180, 304, 50);
		contentPane.add(armaduraP);
		
		JLabel armamentoP = new JLabel(jogador.getArmamento().getNomeEquip());
		armamentoP.setIcon(new ImageIcon(StatusPane.class.getResource("../imgs/espada.png")));
		armamentoP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		armamentoP.setBounds(270, 260, 304, 50);
		contentPane.add(armamentoP);
		
		JLabel calcadosP = new JLabel(jogador.getCalcado().getNomeEquip());
		calcadosP.setIcon(new ImageIcon(StatusPane.class.getResource("../imgs/botas.png")));
		calcadosP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		calcadosP.setBounds(270, 340, 304, 50);
		contentPane.add(calcadosP);
		
		JLabel acessorioP = new JLabel(jogador.getAcessorio().getNomeEquip());
		acessorioP.setIcon(new ImageIcon(StatusPane.class.getResource("../imgs/anel.png")));
		acessorioP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		acessorioP.setBounds(270, 420, 304, 50);
		contentPane.add(acessorioP);
		
		JPanel painelBotao = new JPanel();
		painelBotao.setBounds(270, 485, 250, 50);
		contentPane.add(painelBotao);
		painelBotao.setLayout(new java.awt.BorderLayout());
		
		JButton voltarButton = new javax.swing.JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	dispose();
        	}
        });
		voltarButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		voltarButton.setBounds(270, 492, 261, 58);
		painelBotao.add(voltarButton);
		
	}
}
