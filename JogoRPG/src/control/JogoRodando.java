package control;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JogoRodando {
	PersonagemPrincipal jogador;
	Bolsa bolsa = new Bolsa();
	TelaInicialJogo comeco;
	TelaInicialJogo hist1;
	EscolherPersonagem pClasses;
	Mapa1 mapa1;
	Mapa2 mapa2;
	MapaBoss mapaBoss;
	Equipamento capacete;
	Equipamento armadura;
	Equipamento arma;
	Equipamento botas;
	Equipamento acessorios;

	public void Jogo() throws IOException {
		//mapa1 = new Mapa1(null, null);
		BufferedImage myImage = ImageIO.read(JogoRodando.class.getResource("../imgs/vale.png"));
		TelaInicialJogo comeco = new TelaInicialJogo(myImage);
		EscolherPersonagem pClasses = new EscolherPersonagem();
		BufferedImage myImage2 = ImageIO.read(JogoRodando.class.getResource("../imgs/historia2.png"));
		hist1 = new TelaInicialJogo(myImage2);
		
		
		comeco.setVisible(true);
		comeco.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				hist1.setVisible(true);
			}
		});
		

		hist1.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pClasses.setVisible(true);
			}
		});

		pClasses.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				switch(pClasses.getPersonagem()) {

				case "Mago":
					jogador = new PersonagemPrincipal("Erickson", 1, 45, 35, 15, 23, 7, 20, "Mago", 1, 100, "M");
					capacete = new Equipamento("Chapéu Magico", "Capacete", 5, 15, 5, 7, 0, 2);
					armadura = new Equipamento("Manto", "Armadura", 20, 15, 10, 17, 0, 1);
					arma = new Equipamento("Cajado Ancestral", "armamento", 5, 15, 5, 7, 0, 25);
					botas = new Equipamento("Botas Élficas", "Calcado", 0, 25, 5, 7, 0, 1);
					acessorios = new Equipamento("Anel de doran", "Acessorio", 0, 10, 0, 7, 0, 5);
					Equipamento.equipar(jogador, capacete);
					Equipamento.equipar(jogador, armadura);
					Equipamento.equipar(jogador, arma);
					Equipamento.equipar(jogador, botas);
					Equipamento.equipar(jogador, acessorios);
					break;

				case "Maga":
					jogador = new PersonagemPrincipal("Julia", 1, 45, 35, 15, 23, 7, 20, "Mago", 1, 100, "F");
					capacete = new Equipamento("Chapéu Magico", "Capacete", 5, 15, 5, 7, 0, 2);
					armadura = new Equipamento("Manto", "Armadura", 20, 15, 10, 17, 0, 1);
					arma = new Equipamento("Cajado Ancestral", "Armamento", 0, 15, 0, 0, 0, 25);
					botas = new Equipamento("Botas Élficas", "Calcado", 0, 25, 5, 7, 0, 1);
					acessorios = new Equipamento("Anel de doran", "Acessorio", 0, 10, 0, 7, 0, 5);
					break;

				case "Guerreiro":
					jogador = new PersonagemPrincipal("Farmautic", 1, 85, 25, 25, 18, 20, 5, "Guerreiro", 1, 100, "M");
					capacete = new Equipamento("Elmo de aço", "Capacete", 15, 0, 25, 7, 0, 0);
					armadura = new Equipamento("Armadura Draconica", "Armadura", 20, 15, 25, 10, 0, 0);
					arma = new Equipamento("Espada de aço", "Armamento", 0, 0, 0, 0, 20, 0);
					botas = new Equipamento("Grevas de Batalha", "Calcado", 0, 25, 5, 7, 0, 1);
					acessorios = new Equipamento("Anel de doran", "Acessorio", 0, 10, 0, 7, 0, 5);	
					break;

				case "Guerreira":
					jogador = new PersonagemPrincipal("Hilary", 1, 85, 25, 25, 18, 20, 5, "Guerreiro", 1, 100, "F");
					capacete = new Equipamento("Chapéu Magico", "Capacete", 5, 15, 5, 7, 0, 2);
					armadura = new Equipamento("Manto", "Armadura", 20, 15, 10, 17, 0, 1);
					arma = new Equipamento("Cajado Ancestral", "Armamento", 5, 15, 5, 7, 0, 25);
					botas = new Equipamento("Botas Élficas", "Calcado", 0, 25, 5, 7, 0, 1);
					acessorios = new Equipamento("Anel de doran", "Acessorio", 0, 10, 0, 7, 0, 5);	
					break;

				case "Arqueiro":
					jogador = new PersonagemPrincipal("Marc", 1, 85, 25, 15, 15, 35, 10, "Arqueiro", 1, 100, "M");
					capacete = new Equipamento("Capacete Élfico", "Capacete", 5, 15, 5, 7, 3, 0);
					armadura = new Equipamento("Armadura de Couro", "Armadura", 20, 15, 10, 17, 0, 1);
					arma = new Equipamento("Arco de Caça", "Armamento", 0, 0, 0, 0, 30, 10);
					botas = new Equipamento("Botas Élficas", "Calcado", 0, 25, 5, 7, 0, 1);
					acessorios = new Equipamento("Aljava de Flechas", "Acessorio", 0, 10, 0, 0, 10, 2);
					break;

				case "Arqueira":
					jogador = new PersonagemPrincipal("Dougras", 1, 45, 25, 17, 15,35, 10, "Arqueiro", 1, 100, "F");
					capacete = new Equipamento("Capacete Élfico", "Capacete", 5, 15, 5, 7, 3, 0);
					armadura = new Equipamento("Armadura de Couro", "Armadura", 20, 15, 10, 17, 0, 1);
					arma = new Equipamento("Arco de Caça", "Armamento", 0, 0, 0, 0, 30, 10);
					botas = new Equipamento("Botas Élficas", "Calcado", 0, 25, 5, 7, 0, 1);
					acessorios = new Equipamento("Aljava de Flechas", "Acessorio", 0, 10, 0, 0, 10, 2);
					break;
				}
				Equipamento.equipar(jogador, capacete);
				Equipamento.equipar(jogador, armadura);
				Equipamento.equipar(jogador, arma);
				Equipamento.equipar(jogador, botas);
				Equipamento.equipar(jogador, acessorios);
				jogador.setHpAtual(jogador.getHpMax());
				jogador.setSpAtual(jogador.getSpMax());
				ItensUtilizaveis pocaoHp = new ItensUtilizaveis("Poção de Vida", "Hp", 100);
				ItensUtilizaveis pocaoSp = new ItensUtilizaveis("Poção de Mana", "Sp", 50);
				ItensUtilizaveis pocaoElixir = new ItensUtilizaveis("Elixir", "Elixir", 50);
				bolsa.setBolsaItens(pocaoHp, 99);
				bolsa.setBolsaItens(pocaoSp, 99);
				bolsa.setBolsaItens(pocaoElixir, 99);
				

				try {
					mapa1 = new Mapa1(jogador, bolsa);
					mapa2 = new Mapa2(jogador, bolsa);
					mapaBoss = new MapaBoss(jogador, bolsa);
				} catch (IOException e) {
					e.printStackTrace();
				}
				mapa1.setVisible(true);
				mapa1.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosed(java.awt.event.WindowEvent windowEvent) {
						mapa2.setVisible(true);
					}
				});

				mapa2.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosed(java.awt.event.WindowEvent windowEvent) {
						mapaBoss.setVisible(true);

					}
				});
			}
		});
	}

	public static void main(String[] args) throws IOException {
		JogoRodando jogo = new JogoRodando();
		jogo.Jogo();
	}
}
