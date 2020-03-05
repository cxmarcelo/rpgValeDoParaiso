package control;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PersonagemGame {
	private int velocidade;
	private int restricaoEsquerda;
	private int restricaoDireita;
	private int restricaoCima;
	private int restricaoBaixo;
	private JLabel lblPersonagem;
	private int tamanho = 65;
	private int andar = 0;
	

	public void mudarPosicaoInicial(int x, int y) {
		lblPersonagem.setBounds(x, y, tamanho, tamanho);
	}

	public PersonagemGame(String nome) {
		lblPersonagem = new JLabel(nome);
		velocidade = 5;
		lblPersonagem.setBounds(0, 0, tamanho, tamanho);
		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(0, 0)));
		restricaoEsquerda = 0 + 25;
		restricaoCima = 50;
		restricaoBaixo = 600 - 30- lblPersonagem.getBounds().width;
		restricaoDireita = -27 +  600 - lblPersonagem.getBounds().width;
	}
	
	public JLabel getPersonagemUI() {
		return lblPersonagem;
	}
	
	public void Movimentar(KeyEvent e) throws InterruptedException {
		int keyCode = e.getKeyCode();
	    switch( keyCode ) { 
	        case KeyEvent.VK_UP:
	        	if(lblPersonagem.getBounds().y > restricaoCima)
	        		lblPersonagem.setBounds(lblPersonagem.getBounds().x, lblPersonagem.getBounds().y - velocidade, lblPersonagem.getBounds().width, lblPersonagem.getBounds().height);
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(andar, 0)));
	        	break;
	        	
	        case KeyEvent.VK_DOWN:
	        	if(lblPersonagem.getBounds().y < restricaoBaixo)
	        		lblPersonagem.setBounds(lblPersonagem.getBounds().x, lblPersonagem.getBounds().y + velocidade, lblPersonagem.getBounds().width, lblPersonagem.getBounds().height);
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(andar, 2)));
	        	break;
	        case KeyEvent.VK_LEFT:
	        	if(lblPersonagem.getBounds().x > restricaoEsquerda)
	        	lblPersonagem.setBounds(lblPersonagem.getBounds().x - velocidade, lblPersonagem.getBounds().y, lblPersonagem.getBounds().width, lblPersonagem.getBounds().height);
	        	lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(andar, 1)));
	        	break;
	        	
	        	
	        case KeyEvent.VK_RIGHT :
	        	if(lblPersonagem.getBounds().x < restricaoDireita) 
	        		lblPersonagem.setBounds(lblPersonagem.getBounds().x + velocidade, lblPersonagem.getBounds().y, lblPersonagem.getBounds().width, lblPersonagem.getBounds().height);
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(andar, 3)));
	        	break;
	     }
	    andar++;
	    if(andar > 8) {
	    	andar =1;
	    }
	}
	
	public void Parar(KeyEvent e) throws InterruptedException {
		int keyCode = e.getKeyCode();
	    switch( keyCode ) { 
	        case KeyEvent.VK_UP:
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(0, 0)));
	        	break;
	        case KeyEvent.VK_DOWN:
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(0, 2)));
	        	break;
	        case KeyEvent.VK_LEFT:
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(0, 1)));
	        	break;	        	
	        case KeyEvent.VK_RIGHT :
	        		lblPersonagem.setIcon(new ImageIcon(Sprite.getSprite(0, 3)));
	        	break;
	     }
	    andar =1;
	}
	
	public int getRestricaoEsquerda() {
		return restricaoEsquerda;
	}

	public void setRestricaoEsquerda(int restricaoEsquerda) {
		this.restricaoEsquerda = restricaoEsquerda;
	}

	public int getRestricaoDireita() {
		return restricaoDireita;
	}

	public void setRestricaoDireita(int restricaoDireita) {
		this.restricaoDireita = restricaoDireita;
	}

	public int getRestricaoCima() {
		return restricaoCima;
	}

	public void setRestricaoCima(int restricaoCima) {
		this.restricaoCima = restricaoCima;
	}

	public int getRestricaoBaixo() {
		return restricaoBaixo;
	}

	public void setRestricaoBaixo(int restricaoBaixo) {
		this.restricaoBaixo = restricaoBaixo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public JLabel getLblPersonagem() {
		return lblPersonagem;
	}
	
	public int getTamanho() {
		return tamanho;
	}

}
