package control;

import java.util.Random;

public class Ataques {
	
	//	Dois tipos Fisico e Magico
	private String nome;
	private int dano;
	private Random aleatorio = new Random();
	private int custoSp;
	private String tipo;

	public Ataques(String nome, int dano) {
		this.nome = nome;
		this.dano = dano;
		this.custoSp = 0;
	}
	
	public Ataques() {
	}

	//1 --------------------------------------------------------------------------------------------
	public Ataques Ataque1(String classe, int atq, int magic) {
		
		Ataques ataque1 = new Ataques();
		switch(classe) {
		
		case "Guerreiro":
		case "guerreiro":
			ataque1.setNome("Corte de espada"); //Dps muda esse nome :v
			ataque1.setDano((int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.2)-(atq * 0.9)))));
			ataque1.setCustoSp(0);
			ataque1.tipo = "Fisico";
			break;

		case "Mago":
		case "mago":
			ataque1.setNome("Disparo Magico");
			ataque1.setDano((int) ( magic +  aleatorio.nextInt((int)((magic * 1.3)- magic))));
			ataque1.setCustoSp(0);
			ataque1.tipo = "Magico";
			break;
			
		case "Arqueiro":
		case "arqueiro":
			ataque1.setNome("Flechada");
			ataque1.setDano(atq  + aleatorio.nextInt((int)((atq * 1.35) - atq))); 
			ataque1.setCustoSp(0);
			ataque1.tipo = "Fisico";
			break;
			
		default:
			ataque1.nome = "Soco";
			ataque1.dano = 10;
			ataque1.setCustoSp(0);
			ataque1.tipo = "Fisico";
			break;
		
		}
		return ataque1;
				
	}
	
	//2 --------------------------------------------------------------------------------------------
	public Ataques Ataque2(String classe, int atq, int magic) {
		Ataques ataque2 = new Ataques();
		
		switch(classe) {
		
		case "Guerreiro":
		case "guerreiro":
			ataque2.setNome("Corte duplo");
			ataque2.setDano(2 * (int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.3)-(atq * 0.9)))));
			ataque2.setCustoSp(4);
			ataque2.tipo = "Fisico";
			break;

		case "Mago":
		case "mago":
			ataque2.setNome("Mísseis Magicos");
			ataque2.setDano((int) (5 * ( aleatorio.nextInt((int) (( magic * 0.9 ) - (magic * 0.75)))) + magic * 0.75)) ;
			ataque2.setCustoSp(5);
			ataque2.tipo = "Magico";
			break;
			
		case "Arqueiro":
		case "arqueiro":
			ataque2.setNome("Disparo magico");
			ataque2.setDano( (magic * 2 )+ atq  + aleatorio.nextInt((int)((atq * 1.35) - atq))); 
			ataque2.setCustoSp(6);
			ataque2.tipo = "Magico";
			break;
			
		default:
			ataque2.nome = "Chute";
			ataque2.dano = 15;
			ataque2.setCustoSp(0);
			ataque2.tipo = "Fisico";
			break;
		
		}
		return ataque2;
	}
	
	
	//3 ------------------------------------------------------------------------------------
	public Ataques Ataque3(String classe, int atq, int magic) {
		Ataques ataque3 = new Ataques();
		
		switch(classe) {
		
		case "Guerreiro":
		case "guerreiro":
			ataque3.setNome("Lamina Magica");
			ataque3.setDano(2 * magic + (int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.2)-(atq * 0.9))))); 
			ataque3.setCustoSp(5);
			ataque3.tipo = "Magico";
			break;

		case "Mago":
		case "mago":
			ataque3.setNome("Pedras Afiadas");
			ataque3.setDano((int) (( aleatorio.nextInt((int) (( magic * 1.3 ) - (magic * 0.8)))) + magic * 0.8));
			ataque3.setCustoSp(9);
			ataque3.tipo = "Fisico";
			break;
		
		case "Arqueiro":
		case "arqueiro":
			ataque3.setNome("Tiro Preciso");
			ataque3.setDano(atq  + aleatorio.nextInt((int)((atq * 1.35) - atq))); 
			ataque3.setCustoSp(7);
			ataque3.tipo = "Fisico";
			break;
			
		default:
			ataque3.nome = "Voadora"; // 
			ataque3.dano = 25;
			ataque3.setCustoSp(0);
			ataque3.tipo = "Fisico";
			break;
		}
		return ataque3;
	}
	 
	//4 -------------------------------------------------------------------------------------
	public Ataques Ataque4(String classe, int atq, int magic) {
		Ataques ataque4 = new Ataques();
		
		switch(classe) {
		
		case "Guerreiro":
		case "guerreiro":
			ataque4.setNome("Lamina Explosiva");
			ataque4.setDano(2 * (int) ( atq * 1.5  +  aleatorio.nextInt((int)((atq * 2.5)-(atq * 1.5))))); 
			ataque4.setCustoSp(12);
			ataque4.tipo = "Fisico";
			break;

		case "Mago":
		case "mago":
			ataque4.setNome("Bola de Fogo");
			ataque4.setDano((int)(( aleatorio.nextInt((int) (( magic * 3.5 ) - (magic * 1.75)))) + magic * 1.75)) ;
			ataque4.setCustoSp(9);
			ataque4.tipo = "Magico";
			break;
			
		case "Arqueiro":
		case "arqueiro":
			ataque4.setNome("Flecha explosiva");
			ataque4.setDano( (int) (atq * 2 + aleatorio.nextInt((int)((atq * 3) - atq * 2 )))); 
			ataque4.setCustoSp(7);
			ataque4.tipo = "Fisico";
			break;
			
		default:
			ataque4.nome = "Pedrada"; // 
			ataque4.dano = 1;
			ataque4.setCustoSp(0);
			ataque4.tipo = "Fisico";
			break;
		}
		return ataque4;
	}
	
	// 5 ------------------------------------------------------------------------------------
	public Ataques Ataque5(String classe, int atq, int magic) {
		Ataques ataque5 = new Ataques();
		
		switch(classe) {
		
		case "Guerreiro":
		case "guerreiro":
			ataque5.setNome("Espada do Dragão");
			ataque5.setDano(2 * (int) ( atq * 3.5  +  aleatorio.nextInt((int)((atq * 6)-(atq * 3.5))))); 
			ataque5.setCustoSp(25);
			ataque5.tipo = "Fisico";
			break;

		case "Mago":
		case "mago":
			ataque5.setNome("Explosão Magica");
			ataque5.setDano(2 * (int)(( aleatorio.nextInt((int) (( magic * 5 ) - (magic * 3.75)))) + magic * 3.75)) ;
			ataque5.setCustoSp(25);
			ataque5.tipo = "Magico";
			break;
			
		case "Arqueiro":
		case "arqueiro":
			ataque5.setNome("Tempestade de Flechas");
			ataque5.setDano(10 * (int) (atq * 0.5 + aleatorio.nextInt((int)(atq - atq * 0.5 )))); 
			ataque5.setCustoSp(25);
			ataque5.tipo = "Fisico";
			break;
			
		default:
			ataque5.nome = "Pedrada"; // 
			ataque5.dano = 1;
			ataque5.setCustoSp(0);
			ataque5.tipo = "Fisico";
			break;
		}
		return ataque5;
	}

	
	//-----------------------------Monstros-----------------------------------------------
	//- Ataque 1----------------------------------------------------
	public Ataques monstroAtaque1(String tipo, int atq, int magic) {
		
		Ataques ataque1 = new Ataques();
		switch(tipo) {
		
		case "Fisico":
		case "Físico":
			ataque1.setNome("Corte Afiado");
			ataque1.setDano((int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.1)-(atq * 0.9)))));
			ataque1.setCustoSp(0);
			ataque1.tipo = "Fisico";
			break;

		case "Magico":
		case "magico":
			ataque1.setNome("Disparo Magico");
			ataque1.setDano((int) ( magic +  aleatorio.nextInt((int)((magic * 1.1)- magic))));
			ataque1.setCustoSp(0);
			ataque1.tipo = "Magico";
			break;
			
		case "BossMagico":
		case "bossMagico":
			ataque1.setNome("Disparo Arcano");
			ataque1.setDano(magic  + aleatorio.nextInt((int)((magic * 1.2) - magic))); 
			ataque1.setCustoSp(0);
			ataque1.tipo = "Magico";
			break;
			
		default:
			ataque1.nome = "Garras afiadas";
			ataque1.dano = (int) ( atq * 0.9+ aleatorio.nextInt((int) (atq * 1.1  - atq * 0.9)));
			ataque1.setCustoSp(0);
			ataque1.tipo = "Fisico";
			break;
		
		}
		return ataque1;
				
	}
	
	// - Ataque 2----------------------------------------- 
	public Ataques monstroAtaque2(String tipo, int atq, int magic) {
		
		Ataques ataque2 = new Ataques();
		switch(tipo) {
		
		case "Fisico":
		case "Físico":
			ataque2.setNome("Impacto Fuminante");
			ataque2.setDano((int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.2)-(atq * 0.9)))));
			ataque2.setCustoSp(5);
			ataque2.tipo = "Fisico";
			break;

		case "Magico":
		case "magico":
			ataque2.setNome("Misseis Magicos");
			ataque2.setDano((int) ( 3 *( magic * 0.6 +  aleatorio.nextInt((int)((magic * 0.7)- magic * 0.6)))));
			ataque2.setCustoSp(6);
			ataque2.tipo = "Magico";
			break;
			
		case "BossMagico":
		case "bossMagico":
			ataque2.setNome("Misseis Maagicos");
			ataque2.setDano((int) ( 3 *( magic * 0.6 +  aleatorio.nextInt((int)((magic * 0.8)- magic * 0.6)))));
			ataque2.setCustoSp(9);
			ataque2.tipo = "Magico";
			break;
			
		default:
			ataque2.nome = "Garras afiadas";
			ataque2.dano = ( atq * 2);
			ataque2.setCustoSp(0);
			ataque2.tipo = "Fisico";
			break;
		
		}
		return ataque2;
				
	}
	
	//-  Ataque 3 --------------------------------------------------
	public Ataques monstroAtaque3(String tipo, int atq, int magic) {
		
		Ataques ataque3 = new Ataques();
		switch(tipo) {
		
		case "Fisico":
		case "Físico":
			ataque3.setNome("Ataque Triplo");
			ataque3.setDano((int) (3 * ( atq * 0.7  +  aleatorio.nextInt((int)((atq * 1.2)-(atq * 0.7))))));
			ataque3.setCustoSp(8);
			ataque3.tipo = "Fisico";
			break;

		case "Magico":
		case "magico":
			ataque3.setNome("Misseis Arcanos");
			ataque3.setDano(3 * (int) ( magic +  aleatorio.nextInt((int)((magic * 1.1)- magic))));
			ataque3.setCustoSp(10);
			ataque3.tipo = "Magico";
			break;
			
		case "BossMagico":
		case "bossMagico":
			ataque3.setNome("Lança de gelo");
			ataque3.setDano(magic  + aleatorio.nextInt((int)((atq * 1.35) - magic))); 
			ataque3.setCustoSp(25);
			ataque3.tipo = "Magico";
			break;
			
		default:
			ataque3.nome = "Garras afiadas";
			ataque3.dano = ( atq * 2);
			ataque3.setCustoSp(0);
			ataque3.tipo = "Fisico";
			break;
		
		}
		return ataque3;
				
	}
	
	//- Ataque 4 --------------------------------------------------------------------------
	public Ataques monstroAtaque4(String tipo, int atq, int magic) {
		
		Ataques ataque4 = new Ataques();
		switch(tipo) {
		
		case "Fisico":
		case "Físico":
			ataque4.setNome("Mordida");
			ataque4.setDano((int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.2)-(atq * 0.9)))));
			ataque4.setCustoSp(10);
			ataque4.tipo = "Fisico";
			break;

		case "Magico":
		case "magico":
			ataque4.setNome("Raio da Morte");
			ataque4.setDano((int) ( magic +  aleatorio.nextInt((int)((magic * 1.3)- magic))));
			ataque4.setCustoSp(15);
			ataque4.tipo = "Magico";
			break;
			
		case "BossMagico":
		case "bossMagico":
			ataque4.setNome("Explosão de Mundos");
			ataque4.setDano(atq  + aleatorio.nextInt((int)((atq * 1.35) - magic))); 
			ataque4.setCustoSp(0);
			ataque4.tipo = "Magico";
			break;
			
		default:
			ataque4.nome = "Garras afiadas";
			ataque4.dano = ( atq * 2);
			ataque4.setCustoSp(0);
			ataque4.tipo = "Fisico";
			break;
		
		}
		return ataque4;
				
	}
	
	//- Ataque 5
	
	public Ataques monstroAtaque5(String tipo, int atq, int magic) {
		
		Ataques ataque5 = new Ataques();
		switch(tipo) {
		
		case "Fisico":
		case "Físico":
			ataque5.setNome("Dilacerar");
			ataque5.setDano((int) ( atq * 0.9  +  aleatorio.nextInt((int)((atq * 1.2)-(atq * 0.9)))));
			ataque5.setCustoSp(20);
			ataque5.tipo = "Fisico";
			break;

		case "Magico":
		case "magico":
			ataque5.setNome("Ataque Sombrio");
			ataque5.setDano((int) ( magic +  aleatorio.nextInt((int)((magic * 1.3)- magic))));
			ataque5.setCustoSp(40);
			ataque5.tipo = "Magico";
			break;
			
		case "BossMagico":
		case "bossMagico":
			ataque5.setNome("Raio Mortal");
			ataque5.setDano((int) (magic *1.5 + aleatorio.nextInt((int)((atq * 2) - magic * 1.5)))); 
			ataque5.setCustoSp(30);
			ataque5.tipo = "Magico";
			break;
			
		default:
			ataque5.nome = "Esmagamento";
			ataque5.dano = (int) ( atq * 1.5);
			ataque5.setCustoSp(30);
			ataque5.tipo = "Fisico";
			break;
		}
		return ataque5;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getCustoSp() {
		return custoSp;
	}

	public void setCustoSp(int custoSp) {
		this.custoSp = custoSp;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
