package control;

import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MapaBoss extends JFrame {

	private BackgroundImagePanel mapa1;
	private PersonagemGame personagem;
	private ArrayList<Monstro> monstros;
	public static int largura = 600;
	public static int altura = 620;
	private Combate lutar = new Combate();
	QuizzTelas questionario = new QuizzTelas();
	
	public MapaBoss(PersonagemPrincipal jogador, Bolsa bolsa) throws IOException {
		InicializarComponentesMapa(jogador, bolsa);
		InicializarComponentesGame();		

	}
	private void InicializarComponentesGame() {
		personagem = new PersonagemGame("");
		personagem.mudarPosicaoInicial(245, 500);
		personagem.setRestricaoDireita(349);
		personagem.setRestricaoEsquerda(190);
		mapa1.add(personagem.getPersonagemUI());
		InicializarMonstros(7);
	}

	private void InicializarComponentesMapa(PersonagemPrincipal jogador, Bolsa bolsa) throws IOException{
		addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				try {
					personagem.Movimentar(e);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				Monstro m = ChecarColisaoMonstro();
				if(m != null) {
					if(m.getHpAtual() >= 0) {
						setVisible(false);
						questionario.QuizzJogo();

						questionario.getPergunta8().addWindowListener(new java.awt.event.WindowAdapter() {
							public void windowClosed(java.awt.event.WindowEvent windowEvent) {
								Monstro m = new Monstro("Guardião ", 16 - Quizz.getAcertos(), "bossMagico",5);
								lutar.combateInicio(jogador, m, bolsa);
								lutar.getMonstroMorto().addWindowListener(new java.awt.event.WindowAdapter() {
									public void windowClosed(java.awt.event.WindowEvent windowEvent) {
										TelaInicialJogo histFinal;
										try {
											BufferedImage myImage1 = ImageIO.read(JogoRodando.class.getResource("../imgs/historiaFinal.png"));
											histFinal = new TelaInicialJogo(myImage1);
											histFinal.setNomeBotao("Fim");
											
											histFinal.setVisible(true);
											histFinal.addWindowListener(new java.awt.event.WindowAdapter() {
												public void windowClosed(java.awt.event.WindowEvent windowEvent) {
													System.exit(0);
												}
											});
										} catch (IOException e) {
											e.printStackTrace();
										}
										
									}
								});
							}
						});
						m.Morrer();
						m = null;
					}
				}
			}
		});

		addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent e) {
				try {
					personagem.Parar(e);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, largura, altura);

		setResizable(false);
		BufferedImage myImage = ImageIO.read(Mapa1.class.getResource("../imgs/mapaBoss.png"));
		mapa1 = new BackgroundImagePanel(myImage);
		mapa1.setBorder(new EmptyBorder(0, 0, 0, 0));
		mapa1.setBounds(100, 100, largura, altura);
		mapa1.setLayout(null);


		setContentPane(mapa1);
	}

	private void InicializarMonstros(int quantidade) {
		monstros = new ArrayList<Monstro>();
		Monstro m = new Monstro("Esqueleto ", 7, "Fisico",5);
		JLabel lblMonstro = m.getMonstroUI();
		lblMonstro.setBounds(250,200,100,150);
		mapa1.add(lblMonstro);
		monstros.add(m);
	}

	private Monstro ChecarColisaoMonstro() {
		Monstro m = null;
		Rectangle rp = personagem.getPersonagemUI().getBounds();
		for(int i = 0; i < monstros.size(); i++) {
			Rectangle rm = monstros.get(i).getMonstroUI().getBounds();

			if(rp.intersects(rm)) {
				m = monstros.get(i);
			}
		}
		return m;
	}
}
