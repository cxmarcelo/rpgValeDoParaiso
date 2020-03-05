package control;

public class ItensUtilizaveis {

	private String nome;
	private String tipo;
	private int Recuperacao;

	public ItensUtilizaveis() {
		
	}
	
	public ItensUtilizaveis(String nome, String tipo, int recuperacao) {

		this.nome = nome;
		this.tipo = tipo;
		this.Recuperacao = recuperacao;

	}


	public static void itemUsar(PersonagemPrincipal jogador, ItensUtilizaveis item) {

		switch(item.tipo) {
		case "Hp":
		case "hp":
			jogador.setHpAtual(jogador.getHpAtual() + item.getRecuperacao());
			break;

		case "Sp":
		case "sp":
			jogador.setSpAtual(jogador.getSpAtual() + item.getRecuperacao());
			break;
			
		case "Elixir":
		case "elixir":
			jogador.setHpAtual(jogador.getHpAtual() + item.getRecuperacao());
			jogador.setSpAtual(jogador.getSpAtual() + item.getRecuperacao());
			break;
			
		default:
			break;
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getRecuperacao() {
		return Recuperacao;
	}


	public void setRecuperacao(int recuperacao) {
		Recuperacao = recuperacao;
	}



}
