package control;

import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Mapa2 extends JFrame {

	private BackgroundImagePanel mapa1;
	private PersonagemGame personagem;
	private ArrayList<Monstro> monstros;
	public static int largura = 600;
	public static int altura = 600;
	private Combate lutar = new Combate();
	Bolsa bolsa = new Bolsa();
	private JLabel portal;

	public Mapa2(PersonagemPrincipal jogador, Bolsa bolsa) throws IOException {
		InicializarComponentesMapa(jogador, bolsa);
		InicializarComponentesGame();		

	}
	private void InicializarComponentesGame() {
		personagem = new PersonagemGame("");
		personagem.mudarPosicaoInicial(245, 500);
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
						lutar.combateInicio(jogador, m, bolsa);
						setVisible(false);
						lutar.getMonstroMorto().addWindowListener(new java.awt.event.WindowAdapter() {
							public void windowClosed(java.awt.event.WindowEvent windowEvent) {
								setVisible(true);
							}
						});
						m.Morrer();
						m = null;
					}
				}
				ChecarColisaoPassagem();
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
		BufferedImage myImage = ImageIO.read(Mapa1.class.getResource("../imgs/mapa2.png"));
		mapa1 = new BackgroundImagePanel(myImage);
		mapa1.setBorder(new EmptyBorder(0, 0, 0, 0));
		mapa1.setBounds(100, 100, largura, altura);
		//setContentPane(mapa1);
		mapa1.setLayout(null);

		portal = new JLabel();
		portal.setIcon(new ImageIcon(Mapa1.class.getResource("../imgs/passagem.png")));
		portal.setHorizontalAlignment(SwingConstants.CENTER);
		portal.setBounds(299, 41, 3, 10);
		mapa1.add(portal);

		setContentPane(mapa1);
	}

	private void InicializarMonstros(int quantidade) {
		monstros = new ArrayList<Monstro>();

		for(int i = 0; i < quantidade; i++) {
			if(i < quantidade/2) {
				Monstro m = new Monstro("Esqueleto "  + (3 + i), 7, "Fisico");
				monstros.add(m);
				JLabel lblMonstro = m.getMonstroUI();
				mapa1.add(lblMonstro);

				Random r = new Random();
				int x = r.nextInt(400) - 64 + 100;
				int y = i * 64 + 50;

				x = x < 0 ? 0 : x;		
				y = y < 0 ? 0 : y;

				lblMonstro.setBounds(x, y, 64, 64);
			}else {
				Monstro m = new Monstro("Esqueleto "  + (1 + i), 4, "Fisico");
				monstros.add(m);
				JLabel lblMonstro = m.getMonstroUI();
				mapa1.add(lblMonstro);

				Random r = new Random();
				int x = r.nextInt(400) - 64 + 100;
				int y = i * 64 + 50;

				x = x < 0 ? 0 : x;		
				y = y < 0 ? 0 : y;

				lblMonstro.setBounds(x, y, 64, 64);
			}
		}

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

	private void ChecarColisaoPassagem() {
		Rectangle rp = personagem.getPersonagemUI().getBounds();
		Rectangle rPortal = portal.getBounds();

		if(rp.intersects(rPortal)) {
			dispose();

		}

	}

}
