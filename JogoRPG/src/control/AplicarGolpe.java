package control;

import java.util.Random;

public class AplicarGolpe {

	private Random aleatorio = new Random();
	
	//Jogador atacando o monstro
	
	public void DanoFisico(int atacante, Monstro defensor) {
		int dano = 0;
		
		dano = (int) (atacante - (aleatorio.nextInt((int) (defensor.getDef() * 0.9 - defensor.getDef() * 0.5) ) + defensor.getDef() * 0.5));
		
		if(dano < 0) {
			dano = 1;
		}
		defensor.setHpAtual(defensor.getHpAtual() - dano);
	}

	public void DanoMagico(int atacante, Monstro defensor) {
		int dano = 0;
		
		dano = (int) (atacante - (aleatorio.nextInt((int) (defensor.getDefM() * 0.9 - defensor.getDefM() * 0.5) ) + defensor.getDefM() * 0.5));
		
		if(dano < 0) {
			dano = 1;
		}
		
		defensor.setHpAtual(defensor.getHpAtual() - dano);
		
	}

	
	// Monstro atacando jogador
	
	public void DanoFisico(int atacante, PersonagemPrincipal defensor) {
		int dano = 0;
			//arrumar aqui
		
		dano = (int) (atacante -  defensor.getDef() * 0.7);
		
		if(dano < 0) {
			dano = 1;
		}
		
		defensor.setHpAtual(defensor.getHpAtual() - dano);
	}
	
	public void DanoMagico(int atacante, PersonagemPrincipal defensor) {
		int dano = 0;
		dano = (int) (atacante -  defensor.getDef() * 0.9);
		
		if(dano < 0) {
			dano = 1;
		}
		
		defensor.setHpAtual(defensor.getHpAtual() - dano);
	}
}
