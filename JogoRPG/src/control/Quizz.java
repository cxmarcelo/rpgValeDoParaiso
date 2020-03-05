package control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class Quizz extends JFrame {

	
	private JPanel contentPane;
	private JTextArea pergunta;
	private JTextArea alternativaA;
	private JTextArea alternativaB;
	private JTextArea alternativaC;
	private JTextArea alternativaD;
	private JTextArea alternativaE;
	private static int qualPergunta = 1;
	private static char alternativaCerta;
	private static int acertos = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quizz frame = new Quizz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Quizz() {
		inicializarComponentes();
		if(qualPergunta > 8) {
			qualPergunta = 1;
		}
		switch(qualPergunta) {
		case 1:
			getPergunta().setText("1) O que é reciclagem ?. ");
			getAlternativaA().setText("a) “Jogar fora” o lixo produzido.");
			getAlternativaB().setText("b) Coletar todo tipo de material existente em lixos recicláveis.");
			getAlternativaC().setText("c) Nome dado para todo o processo do lixo após seu descarte.");
			getAlternativaD().setText("d) Processo de transformação de materiais usados em novos produtos para consumo.");
			getAlternativaE().setText("e) Juntar todo tipo de lixo e descartar em ponto de coleta");
			alternativaCerta = 'd';
			qualPergunta++;
			break;
			
		case 2:
			getPergunta().setText("2) Como separar corretamente seu lixo?");
			getAlternativaA().setText("a) Juntar tudo na lixeira, pois os prédios já fazem o trabalho de separação.");
			getAlternativaB().setText("b) Separar o lixo orgânico (restos de alimentos, papel sujo e lixo sanitário dos resíduos sólidos (como plástico, vidro, papel, metal e embalagens longa vida).");
			getAlternativaC().setText("c) Deixar plásticos sujos junto com lixo orgânico.");
			getAlternativaD().setText("d) Juntar todo tipo de lixo e descartar em ponto de coleta");
			getAlternativaE().setText("e) Jogar tudo no esgoto");
			alternativaCerta = 'b';
			qualPergunta++;
			break;
			
		case 3:
			getPergunta().setText("3) O que é coleta seletiva ?.");
			getAlternativaA().setText("a) Processo de separação e recolhimento dos resíduos para o reaproveitamento por meio de reciclagem.");
			getAlternativaB().setText("b) Destinação de resíduos para lixões e aterros.");
			getAlternativaC().setText("c) Processo de envio de todo o lixo produzido para cooperativas ou entrega para catadores de rua.");
			getAlternativaD().setText("d) A escolha aleatória do melhor lixo produzido.");
			getAlternativaE().setText("e) Jogar tudo junto no aterro para decompor");
			alternativaCerta = 'a';
			qualPergunta++;
			break;
			
		case 4:
			getPergunta().setText("4) Como preservar árvores e florestas?");
			getAlternativaA().setText("a) Construindo uma casa na árvore.");
			getAlternativaB().setText("b) Reciclando papéis, jornais e revistas.");
			getAlternativaC().setText("c) Reutilizando metais e vidros.");
			getAlternativaD().setText("d) Indo em parques.");
			getAlternativaE().setText("e) Cortando árvores para criar campos de agropecuária");
			alternativaCerta = 'b';
			qualPergunta++;
			break;
			
		case 5:
			getPergunta().setText("5) Qual alternativa apresenta uma vantagem da energia solar?");
			getAlternativaA().setText("a) Não polui.");
			getAlternativaB().setText("b) Não é renovável");
			getAlternativaC().setText("c) É eficaz em qualquer clima.");
			getAlternativaD().setText("d) É disponível a todo momento");
			getAlternativaE().setText("e) Pode ser carregada em ambientes fechados");
			alternativaCerta = 'a';
			qualPergunta++;
			break;
			
		case 6:
			getPergunta().setText("6) Como consumir de forma consciente?");
			getAlternativaA().setText("a) Trocando todos os nossos objetos sempre que um novo do mesmo tipo for lançado.");
			getAlternativaB().setText("b) Usar a mangueira para lavar o quintal e o carro.");
			getAlternativaC().setText("c) Utilizando os recursos naturais para satisfazer nossas necessidades e das gerações futuras");
			getAlternativaD().setText("d) Adquirindo qualquer tipo de produto se for barato");
			getAlternativaE().setText("e) Cortando mais arvores para ter mais papel.");
			alternativaCerta = 'a';
			qualPergunta++;
			break;
			
		case 7:
			getPergunta().setText("7) Quanto tempo o vidro leva para se decompor na natureza?");
			getAlternativaA().setText("a) 300 anos.");
			getAlternativaB().setText("b) 1000 anos.");
			getAlternativaC().setText("c) 100 anos.");
			getAlternativaD().setText("d) O vidro não é biodegradável.");
			getAlternativaE().setText("e) 3000 anos.");
			alternativaCerta = 'd';
			qualPergunta++;
			break;
			
		case 8:
			getPergunta().setText("8) Quais são as consequências mais diretas do despejo inadequado do lixo?");
			getAlternativaA().setText("a) Enchentes e doenças.");
			getAlternativaB().setText("b) Chuvas ácidas e o buraco na camada de ozônio.");
			getAlternativaC().setText("c) Extinção de algumas espécies de animais, plantas e bactérias.");
			getAlternativaD().setText("d) Esgotamento dos reservatórios de água no planeta e estiagem.");
			getAlternativaE().setText("e) Não há consequências.");
			alternativaCerta = 'a';
			qualPergunta++;
			break;
		}
		
	}
	
	public void inicializarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setResizable(false);
		
		pergunta = new JTextArea();
		pergunta.setEditable(false);
		pergunta.setFont(new Font("Georgia", Font.PLAIN, 20));
		pergunta.setLineWrap(true);
		pergunta.setRows(5);
		pergunta.setBounds(10, 10, 560, 90);
		pergunta.setText("pergunta");
		getContentPane().add(pergunta);
		
		
		
		JButton btnAlternativaa = new JButton("A)");
		btnAlternativaa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlternativaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alternativaCerta == 'A' || alternativaCerta == 'a') {
					acertos++;
				}
				dispose();
			}
		});
		btnAlternativaa.setBounds(10, 130, 50, 70);
		getContentPane().add(btnAlternativaa);
		
		alternativaA = new JTextArea();
		alternativaA.setLineWrap(true);
		alternativaA.setFont(new Font("Georgia", Font.PLAIN, 15));
		alternativaA.setEditable(false);
		alternativaA.setRows(4);
		alternativaA.setBounds(80, 130, 490, 70);
		alternativaA.setText("alternativaA");
		contentPane.add(alternativaA);
		
		// -----------------------------------------------
		
		JButton btnAlternativab = new JButton("B)");
		btnAlternativab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlternativab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alternativaCerta == 'B' || alternativaCerta == 'b') {
					acertos++;
				}
				dispose();
			}
		});
		btnAlternativab.setBounds(10, 210, 50, 70);
		getContentPane().add(btnAlternativab);
		
		alternativaB = new JTextArea();
		alternativaB.setLineWrap(true);
		alternativaB.setFont(new Font("Georgia", Font.PLAIN, 15));
		alternativaB.setRows(4);
		alternativaB.setEditable(false);
		alternativaB.setBounds(80, 210, 490, 70);
		alternativaB.setText("alternativaB");
		contentPane.add(alternativaB);
		
		
		// ---------------------------------------------------
		
		JButton btnAlternativac = new JButton("C)");
		btnAlternativac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlternativac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alternativaCerta == 'C' || alternativaCerta == 'c') {
					acertos++;
				}
				dispose();
			}
		});
		btnAlternativac.setBounds(10, 290, 50, 70);
		getContentPane().add(btnAlternativac);
		
		alternativaC = new JTextArea();
		alternativaC.setLineWrap(true);
		alternativaC.setFont(new Font("Georgia", Font.PLAIN, 15));
		alternativaC.setRows(4);
		alternativaC.setEditable(false);
		alternativaC.setBounds(80, 290, 490, 70);
		alternativaC.setText("alternativaC");
		contentPane.add(alternativaC);
		
		// -------------------------------------------------------
		
		
		JButton btnAlternativad = new JButton("D)");
		btnAlternativad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlternativad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alternativaCerta == 'D' || alternativaCerta == 'd') {
					acertos++;
				}
				dispose();
			}
		});
		btnAlternativad.setBounds(10, 370, 50, 70);
		getContentPane().add(btnAlternativad);
		
		alternativaD = new JTextArea();
		alternativaD.setLineWrap(true);
		alternativaD.setFont(new Font("Georgia", Font.PLAIN, 15));
		alternativaD.setEditable(false);
		alternativaD.setRows(4);
		alternativaD.setBounds(80, 370, 490, 70);
		alternativaD.setText("alternativaD");
		contentPane.add(alternativaD);
		
		
		// -------------------------------------------------------
		JButton btnAlternativae = new JButton("E)");
		btnAlternativae.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlternativae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(alternativaCerta == 'E' || alternativaCerta == 'e') {
					acertos++;
				}
				dispose();
			}
		});
		btnAlternativae.setBounds(10, 450, 50, 70);
		getContentPane().add(btnAlternativae);
		
		alternativaE = new JTextArea();
		alternativaE.setLineWrap(true);
		alternativaE.setFont(new Font("Georgia", Font.PLAIN, 15));
		alternativaE.setRows(4);
		alternativaE.setEditable(false);
		alternativaE.setBounds(80, 450, 490, 70);
		alternativaE.setText("alternativaE");
		contentPane.add(alternativaE);
		
		
		setContentPane(contentPane);
		
	}
	
	public JTextArea getPergunta() {
		return pergunta;
	}

	public void setPergunta(JTextArea pergunta) {
		this.pergunta = pergunta;
	}


	public JPanel getContentPane() {
		return contentPane;
	}


	public JTextArea getAlternativaA() {
		return alternativaA;
	}

	public void setAlternativaA(JTextArea alternativaA) {
		this.alternativaA = alternativaA;
	}

	public JTextArea getAlternativaB() {
		return alternativaB;
	}

	public void setAlternativaB(JTextArea alternativaB) {
		this.alternativaB = alternativaB;
	}

	public JTextArea getAlternativaC() {
		return alternativaC;
	}

	public void setAlternativaC(JTextArea alternativaC) {
		this.alternativaC = alternativaC;
	}

	public JTextArea getAlternativaD() {
		return alternativaD;
	}

	public void setAlternativaD(JTextArea alternativaD) {
		this.alternativaD = alternativaD;
	}

	public JTextArea getAlternativaE() {
		return alternativaE;
	}

	public void setAlternativaE(JTextArea alternativaE) {
		this.alternativaE = alternativaE;
	}

	public static int getAcertos() {
		return acertos;
	}
}
