package control;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Monstro extends AtributosBase {

	private int xpConcebida;
	private JLabel lblMonstro;
	private int tamanhoMonstro = 64;
	private JLabel imgMonstro;
	private Equipamento itemDropado = new Equipamento();
	private String tipo;
	private int sentido = 1;
	private int posicao = 1;
	private int posicao2 = 11;
	private boolean morto = false;

	protected Ataques ataques = new Ataques();

	private Ataques ataque1 = new Ataques();
	private Ataques ataque2 = new Ataques();
	private Ataques ataque3 = new Ataques();
	private Ataques ataque4 = new Ataques();
	private Ataques ataque5 = new Ataques();

	public Monstro(String nome, int lv, String tipo) {
		this.nome = nome;
		this.lv = lv;
		this.tipo = tipo;

		switch(tipo) {
		case "Fisico":
			hpMax = 30 + (5*lv);
			hpAtual = hpMax;
			spMax = 20 + (4*lv);
			spAtual = spMax;
			atq = 7 + (5*lv);
			magic = 3 + (2*lv);
			def = 5 +(4 *lv);
			defM = 3 +(3* lv);
			xpConcebida = 10 + (15 * lv);
			break;

		case "Magico":
			hpMax = 15 + (4*lv);
			hpAtual = hpMax;
			spMax = 20 + (5*lv);
			spAtual = spMax;
			atq = 5 + (2*lv);
			magic = 6 + (4*lv);
			def = 5 +(3 *lv);
			defM = 6 +(3* lv);
			xpConcebida = 15 + (15 * lv);
			break;

		case "bossMagico":
			hpMax = 50 + (10*lv);
			hpAtual = hpMax;
			spMax = 40 + (3*lv);
			spAtual = spMax;
			atq = 20 + (3*lv);
			magic = 30 + (2*lv);
			def = 15 +(4 *lv);
			defM = 12 +(3* lv);
			xpConcebida = 100 + (25 * lv);
			break;

		default:
			hpMax = 50 + (10*lv);
			hpAtual = hpMax;
			spMax = 40 + (3*lv);
			spAtual = spMax;
			atq = 20 + (3*lv);
			magic = 30 + (2*lv);
			def = 15 +(4 *lv);
			defM = 12 +(3* lv);
			xpConcebida = 100 + (25 * lv);
			break;
		}

		imgMonstro = new JLabel();
		imgMonstro.setIcon(new ImageIcon(Monstro.class.getResource("../imgs/esqueletoSoldado.png")));

		ataque1 = ataques.monstroAtaque1(tipo, atq, magic);
		ataque2 = ataques.monstroAtaque2(tipo, atq, magic);
		ataque3 = ataques.monstroAtaque3(tipo, atq, magic);
		ataque4 = ataques.monstroAtaque4(tipo, atq, magic);
		ataque5 = ataques.monstroAtaque5(tipo, atq, magic);

		lblMonstro = new JLabel(nome);
		lblMonstro.setIcon(new ImageIcon(SpriteCaveira.getSprite(posicao2, 9)));


		new Thread(new Runnable() {
			public void run() {

				while (true) {

					SwingUtilities.invokeLater(new Runnable() {
						public void run() {

							if(!morto) {
								if(Mapa1.largura - 30 < lblMonstro.getBounds().x + lblMonstro.getBounds().width)
								{
									sentido = sentido * -1;
									posicao2 = 9;
								}
								else if(lblMonstro.getBounds().x <= 30){
									sentido = sentido * -1;
									posicao2 = 11;
								}
								lblMonstro.setBounds(lblMonstro.getBounds().x + (5 * sentido) , lblMonstro.getBounds().y, tamanhoMonstro, tamanhoMonstro);
								lblMonstro.setIcon(new ImageIcon(SpriteCaveira.getSprite(posicao, posicao2 )));
								if(posicao == 8) {
									posicao = 0;
								}
								posicao++;
							}
						}
					});
					try {
						java.lang.Thread.sleep(100);
					}
					catch(Exception e) { }
				}
			}
		}).start();
	}

	public Monstro(String nome, int lv, String tipo, int tamanho) {
		this.nome = nome;
		this.lv = lv;
		this.tipo = tipo;
		this.tamanhoMonstro = tamanho;

		switch(tipo) {
		case "Fisico":
			hpMax = 20 + (5*lv);
			hpAtual = hpMax;
			spMax = 10 + (3*lv);
			spAtual = spMax;
			atq = 7 + (3*lv);
			magic = 3 + (2*lv);
			def = 5 +(4 *lv);
			defM = 3 +(3* lv);
			xpConcebida = 10 + (15 * lv);
			break;

		case "Magico":
			hpMax = 15 + (4*lv);
			hpAtual = hpMax;
			spMax = 20 + (5*lv);
			spAtual = spMax;
			atq = 5 + (2*lv);
			magic = 6 + (4*lv);
			def = 5 +(3 *lv);
			defM = 6 +(3* lv);
			xpConcebida = 15 + (15 * lv);
			break;

		case "bossMagico":
			hpMax = 50 + (10*lv);
			hpAtual = hpMax;
			spMax = 40 + (3*lv);
			spAtual = spMax;
			atq = 20 + (3*lv);
			magic = 30 + (2*lv);
			def = 15 +(4 *lv);
			defM = 12 +(3* lv);
			xpConcebida = 100 + (25 * lv);
			break;

		default:
			hpMax = 50 + (10*lv);
			hpAtual = hpMax;
			spMax = 40 + (3*lv);
			spAtual = spMax;
			atq = 20 + (3*lv);
			magic = 30 + (2*lv);
			def = 15 +(4 *lv);
			defM = 12 +(3* lv);
			xpConcebida = 100 + (25 * lv);
			break;
		}

		imgMonstro = new JLabel();
		imgMonstro.setIcon(new ImageIcon(Monstro.class.getResource("../imgs/blue2.png")));

		ataque1 = ataques.monstroAtaque1(tipo, atq, magic);
		ataque2 = ataques.monstroAtaque2(tipo, atq, magic);
		ataque3 = ataques.monstroAtaque3(tipo, atq, magic);
		ataque4 = ataques.monstroAtaque4(tipo, atq, magic);
		ataque5 = ataques.monstroAtaque5(tipo, atq, magic);

		lblMonstro = new JLabel();
		lblMonstro.setIcon(new ImageIcon(Monstro.class.getResource("../imgs/blue.png")));
		lblMonstro.setBounds(100,100,tamanho,tamanho);
	}

	public void mudarLocalizacaoMonstro(int x, int y) {
		lblMonstro.setBounds(x, y, this.tamanhoMonstro, this.tamanhoMonstro);
	}

	public JLabel getImgMonstro() {
		return imgMonstro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Ataques getAtaque1() {
		return ataque1;
	}

	public void setAtaque1(Ataques ataque1) {
		this.ataque1 = ataque1;
	}

	public Ataques getAtaque2() {
		return ataque2;
	}

	public void setAtaque2(Ataques ataque2) {
		this.ataque2 = ataque2;
	}

	public Ataques getAtaque3() {
		return ataque3;
	}

	public void setAtaque3(Ataques ataque3) {
		this.ataque3 = ataque3;
	}

	public Ataques getAtaque4() {
		return ataque4;
	}

	public void setAtaque4(Ataques ataque4) {
		this.ataque4 = ataque4;
	}

	public Ataques getAtaque5() {
		return ataque5;
	}

	public void setAtaque5(Ataques ataque5) {
		this.ataque5 = ataque5;
	}

	public int getXpConcebida() {
		return xpConcebida;
	}

	public void setXpConcebida(int xpConcebida) {
		this.xpConcebida = xpConcebida;
	}

	public Equipamento getItemDropado() {
		return itemDropado;
	}

	public void setItemDropado(Equipamento itemDropado) {
		this.itemDropado = itemDropado;
	}

	public JLabel getMonstroUI() {
		return lblMonstro;
	}

	public void Morrer() {
		if(!morto) {
			morto = true;
			posicao = 0;
			new Thread(new Runnable() {
				public void run() {

					while (true) {

						// Runs inside of the Swing UI thread
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								lblMonstro.setIcon(new ImageIcon(SpriteCaveira.getSprite(posicao, 20 )));
							}

						});

						try {
							java.lang.Thread.sleep(100);
						}
						catch(Exception e) { }
						if(posicao < 5) {
							posicao ++;
						}

					}
				}
			}).start();
		}
	}

}
