package control;

import java.io.IOException;
import java.util.Random;

public class Combate {

	private Random aleatorio = new Random();
	private int atq;
	private CombateTexto inicio;
	private CombateTexto acoes;
	private CombateOqFazer oqFazer;
	private CombateEscolherAtaque atacar;
	private CombateEscolherItens itens;
	private StatusPane status;
	private AplicarGolpe golpe = new AplicarGolpe();
	private MonstroEliminado monstroMorto;
	private GameOver fim;

	public void combateInicio(PersonagemPrincipal jogador, Monstro monstro, Bolsa bolsa) {

		inicio = new CombateTexto(jogador, monstro);
		inicio.setTexto(monstro.getNome());

		acoes = new CombateTexto(jogador,monstro);
		oqFazer = new CombateOqFazer(jogador, monstro, bolsa);
		atacar = new CombateEscolherAtaque(jogador, monstro);
		itens = new CombateEscolherItens(jogador, monstro, bolsa);
		status = new StatusPane(jogador);
		monstroMorto = new MonstroEliminado(jogador, monstro);
		try {
			fim = new GameOver();
		} catch (IOException e) {
			e.printStackTrace();
		}
		inicio.setVisible(true);

		inicio.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				emLuta(jogador, monstro, bolsa);
			}
		});

	}

	public void emLuta(PersonagemPrincipal jogador, Monstro monstro, Bolsa bolsa) {
		oqFazer = new CombateOqFazer(jogador, monstro, bolsa);

		oqFazer.setVisible(true);
		oqFazer.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {

				switch(oqFazer.getAcao()) {

				case "Atacar":
					oqFazer.setAcao("");

					atacar = new CombateEscolherAtaque(jogador, monstro);
					atacar.setVisible(true);
					atacar.addWindowListener(new java.awt.event.WindowAdapter() {
						public void windowClosed(java.awt.event.WindowEvent windowEvent) {
							switch(atacar.getAcao()) {

							case "Ataque1":
								atacar(jogador, monstro, bolsa, jogador.getAtaque1());
								break;

							case "Ataque2":
								atacar(jogador, monstro, bolsa, jogador.getAtaque2());
								break;

							case "Ataque3":
								atacar(jogador, monstro, bolsa, jogador.getAtaque3());
								break;

							case "Ataque4":
								atacar(jogador, monstro, bolsa, jogador.getAtaque4());
								break;

							case "Ataque5":
								atacar(jogador, monstro, bolsa, jogador.getAtaque5());
								break;


							case "Voltar":
								emLuta(jogador, monstro, bolsa);
								break;

							}

						}
					});
					break;


				case "Itens":
					oqFazer.setAcao("");
					itens = new CombateEscolherItens(jogador, monstro, bolsa);
					itens.setVisible(true);
					itens.addWindowListener(new java.awt.event.WindowAdapter() {
						public void windowClosed(java.awt.event.WindowEvent windowEvent) {

							switch(itens.getAcao()) {
							case "Item":
								usarItem(jogador, monstro, bolsa, itens.getQualItem());
								break;

							case "Voltar":
								emLuta(jogador,monstro,bolsa);
								break;
							}
						}
					});
					break;


				case "Status":
					oqFazer.setAcao("");
					status = new StatusPane(jogador);
					status.setVisible(true);
					status.addWindowListener(new java.awt.event.WindowAdapter() {
						public void windowClosed(java.awt.event.WindowEvent windowEvent) {
							emLuta(jogador, monstro, bolsa);
						}
					});
					break;


				case "Fugir":
					break;
				}
			}
		});
	}

	private void monstroAtaca(Monstro monstro, PersonagemPrincipal jogador) {

		atq = 0;
		if(monstro.getAtaque2().getCustoSp() < monstro.getSpAtual()) {
			atq++;
		}
		if(monstro.getAtaque3().getCustoSp() < monstro.getSpAtual()) {
			atq++;
		}
		if(monstro.getAtaque4().getCustoSp() < monstro.getSpAtual()) {
			atq++;
		}
		if(monstro.getAtaque5().getCustoSp() < monstro.getSpAtual()) {
			atq++;
		}

		atq = aleatorio.nextInt(atq + 1);

		switch(atq) {

		case 1:
			if(monstro.getAtaque1().getTipo() == "Fisico") {
				golpe.DanoFisico(monstro.getAtaque1().getDano(), jogador);
			}else {
				golpe.DanoMagico(monstro.getAtaque1().getDano(), jogador);
			}

			monstro.setSpAtual(monstro.getSpAtual() - monstro.getAtaque1().getCustoSp());
			break;

		case 2:
			if(monstro.getAtaque2().getTipo() == "Fisico") {
				golpe.DanoFisico(monstro.getAtaque2().getDano(), jogador);
			}else {
				golpe.DanoMagico(monstro.getAtaque2().getDano(), jogador);
			}

			monstro.setSpAtual(monstro.getSpAtual() - monstro.getAtaque2().getCustoSp());
			break;

		case 3:
			if(monstro.getAtaque3().getTipo() == "Fisico") {
				golpe.DanoFisico(monstro.getAtaque3().getDano(), jogador);
			}else {
				golpe.DanoMagico(monstro.getAtaque3().getDano(), jogador);
			}

			monstro.setSpAtual(monstro.getSpAtual() - monstro.getAtaque3().getCustoSp());
			break;

		case 4:
			if(monstro.getAtaque4().getTipo() == "Fisico") {
				golpe.DanoFisico(monstro.getAtaque4().getDano(), jogador);
			}else {
				golpe.DanoMagico(monstro.getAtaque4().getDano(), jogador);
			}

			monstro.setSpAtual(monstro.getSpAtual() - monstro.getAtaque4().getCustoSp());
			break;

		case 5:
			if(monstro.getAtaque5().getTipo() == "Fisico") {
				golpe.DanoFisico(monstro.getAtaque5().getDano(), jogador);
			}else {
				golpe.DanoMagico(monstro.getAtaque5().getDano(), jogador);
			}

			monstro.setSpAtual(monstro.getSpAtual() - monstro.getAtaque5().getCustoSp());
			break;

		}

	}


	private void turnoMonstro(PersonagemPrincipal jogador, Monstro monstro,Bolsa bolsa) {
		if(monstro.getHpAtual() <= 0 ) {
			jogador.setXpAtual(jogador.getXpAtual() + monstro.getXpConcebida());
			monstroMorto.setVisible(true);
			monstroMorto.addWindowListener(new java.awt.event.WindowAdapter() {
				public void windowClosed(java.awt.event.WindowEvent windowEvent) {
					return;
				}
			});
		}else {

			int dano = jogador.getHpAtual();
			monstroAtaca(monstro, jogador);

			dano -= jogador.getHpAtual();

			acoes = new CombateTexto(jogador, monstro);
			
			switch(atq) {
			case 1:
				acoes.setTexto(monstro.getNome(), monstro.getAtaque1().getNome(), dano);
				break;
				
			case 2:
				acoes.setTexto(monstro.getNome(), monstro.getAtaque2().getNome(), dano);
				break;
				
			case 3:
				acoes.setTexto(monstro.getNome(), monstro.getAtaque3().getNome(), dano);
				break;
				
			case 4:
				acoes.setTexto(monstro.getNome(), monstro.getAtaque4().getNome(), dano);
				break;
				
			case 5:
				acoes.setTexto(monstro.getNome(), monstro.getAtaque5().getNome(), dano);
				break;
				
			default:
				acoes.setTexto(monstro.getNome(), monstro.getAtaque1().getNome(), dano);
				break;
			
			}
			
			acoes.setVisible(true);


			acoes.addWindowListener(new java.awt.event.WindowAdapter() {
				public void windowClosed(java.awt.event.WindowEvent windowEvent) {
					if(jogador.getHpAtual() <= 0) {
						fim.setVisible(true);
					}else {
						emLuta(jogador,monstro,bolsa);
					}
				}
			});
		}
	}

	private void atacar(PersonagemPrincipal jogador, Monstro monstro , Bolsa bolsa, Ataques atq) {
		int dano;
		dano = monstro.getHpAtual();

		if(atq.getTipo() == "Fisico") {
			golpe.DanoFisico(atq.getDano(), monstro);
		}else if(atq.getTipo() == "Magico") {
			golpe.DanoMagico(atq.getDano(), monstro);
		}
		jogador.setSpAtual(jogador.getSpAtual() - atq.getCustoSp());
		dano -= monstro.getHpAtual();

		acoes = new CombateTexto(jogador, monstro);
		acoes.setTexto(jogador.getNome(), atq.getNome(), dano);
		acoes.setVisible(true);

		acoes.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				turnoMonstro(jogador, monstro, bolsa);
			}
		});
	}

	public void usarItem(PersonagemPrincipal jogador, Monstro monstro, Bolsa bolsa, int qualItem) {
		ItensUtilizaveis.itemUsar(jogador, bolsa.getBolsaItens().get(qualItem).getItens());
		acoes = new CombateTexto(jogador, monstro);
		acoes.setTexto(jogador.getNome(),  bolsa.getBolsaItens().get(qualItem).getItens());
		acoes.setVisible(true);

		acoes.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				turnoMonstro(jogador, monstro, bolsa);
			}
		});
	}

	public MonstroEliminado getMonstroMorto() {
		return monstroMorto;
	}

}
