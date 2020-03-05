package control;

public class QuizzTelas {
	
	private Quizz pergunta1;
	private Quizz pergunta2;
	private Quizz pergunta3;
	private Quizz pergunta4;
	private Quizz pergunta5;
	private Quizz pergunta6;
	private Quizz pergunta7;
	private Quizz pergunta8;
	
	public QuizzTelas() {
		pergunta1 = new Quizz();
		pergunta2 = new Quizz();
		pergunta3 = new Quizz();
		pergunta4 = new Quizz();
		pergunta5 = new Quizz();
		pergunta6 = new Quizz();
		pergunta7 = new Quizz();
		pergunta8 = new Quizz();
	}
	
	public Quizz getPergunta8() {
		return pergunta8;
	}


	public void QuizzJogo() {
		pergunta1.setVisible(true);
		pergunta1.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta2.setVisible(true);
			}
		});
		
		pergunta2.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta3.setVisible(true);
			}
		});
		
		pergunta3.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta4.setVisible(true);
			}
		});
		
		pergunta4.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta5.setVisible(true);
			}
		});
		
		pergunta5.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta6.setVisible(true);
			}
		});
		
		pergunta6.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta7.setVisible(true);
			}
		});
		
		pergunta7.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent windowEvent) {
				pergunta8.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		QuizzTelas t1 = new QuizzTelas();
		
		t1.QuizzJogo();
	}
}
