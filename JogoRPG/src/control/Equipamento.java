package control;

public class Equipamento {


	private String nomeEquip;
	private final String tipo;
	private int hpMaxEquip;
	private int spMaxEquip;
	private int defEquip;
	private int defMEquip;
	private int atqEquip;
	private int magicEquip;

	public Equipamento() {
		this.nomeEquip = "Nada Equipado";
		this.tipo = "Nenhum";
		this.hpMaxEquip = 0;
		this.spMaxEquip = 0;
		this.defEquip = 0;
		this.defMEquip = 0;
		this.atqEquip = 0;
		this.magicEquip = 0;
	}
	//nome, hp, sp, def, defm , atq , atqm
	public Equipamento(String nomeEquip,String tipo, int hpMaxEquip, int spMaxEquip, int defEquip, int defMEquip, int atqEquip, int magicEquip ) {
		this.nomeEquip = nomeEquip;
		this.tipo = tipo;
		this.hpMaxEquip = hpMaxEquip;
		this.spMaxEquip = spMaxEquip;
		this.defEquip = defEquip;
		this.defMEquip = defMEquip;
		this.atqEquip = atqEquip;
		this.magicEquip = magicEquip;
	}

	public Equipamento(String vazio) {
		this.nomeEquip = "Vazio";
		this.tipo = "vazio";
		this.hpMaxEquip = 0;
		this.spMaxEquip = 0;
		this.defEquip = 0;
		this.defMEquip = 0;
		this.atqEquip = 0;
		this.magicEquip = 0;
	}

	public String getTipo() {
		return tipo;
	}
	public String getNomeEquip() {
		return nomeEquip;
	}
	public void setNomeEquip(String nomeEquip) {
		this.nomeEquip = nomeEquip;
	}
	public int getHpMaxEquip() {
		return hpMaxEquip;
	}
	public void setHpMaxEquip(int hpMaxEquip) {
		this.hpMaxEquip = hpMaxEquip;
	}
	public int getSpMaxEquip() {
		return spMaxEquip;
	}
	public void setSpMaxEquip(int spMaxEquip) {
		this.spMaxEquip = spMaxEquip;
	}
	public int getDefEquip() {
		return defEquip;
	}
	public void setDefEquip(int defEquip) {
		this.defEquip = defEquip;
	}
	public int getDefMEquip() {
		return defMEquip;
	}
	public void setDefMEquip(int defMEquip) {
		this.defMEquip = defMEquip;
	}
	public int getAtqEquip() {
		return atqEquip;
	}
	public void setAtqEquip(int atqEquip) {
		this.atqEquip = atqEquip;
	}
	public int getMagicEquip() {
		return magicEquip;
	}
	public void setMagicEquip(int magicEquip) {
		this.magicEquip = magicEquip;
	}


	public static void bonus(PersonagemPrincipal personagem,Equipamento equip) {
		personagem.setHpMax(personagem.getHpMax() + equip.getHpMaxEquip());
		personagem.setSpMax(personagem.getSpMax() + equip.getSpMaxEquip());
		personagem.setDef(personagem.getDef() + equip.getDefEquip());
		personagem.setDefM(personagem.getDefM() + equip.getDefMEquip());
		personagem.setAtq(personagem.getAtq() + equip.getAtqEquip());
		personagem.setMagic(personagem.getMagic() + equip.getMagicEquip());
	}


	public void desequipar(PersonagemPrincipal personagem, Equipamento equip) {
		personagem.setHpMax(personagem.getHpMax() - equip.getHpMaxEquip());
		personagem.setSpMax(personagem.getSpMax() - equip.getSpMaxEquip());
		personagem.setDef(personagem.getDef() - equip.getDefEquip());
		personagem.setDefM(personagem.getDefM() - equip.getDefMEquip());
		personagem.setAtq(personagem.getAtq() - equip.getAtqEquip());
		personagem.setMagic(personagem.getMagic() - equip.getMagicEquip());
		personagem.getArmamento().setNomeEquip("Nada Equipado");
	}

	public static void equipar(PersonagemPrincipal personagem ,Bolsa bolsa, int posicao) {
		Equipamento equipado;
		equipado = bolsa.getBolsaEquip().get(posicao).getEquip();

		switch(bolsa.getBolsaEquip().get(posicao).getEquip().getTipo()) {		
		case "Armamento":
		case "armamento":
			personagem.setArmamento(equipado);
			bonus(personagem , bolsa.getBolsaEquip().get(posicao).getEquip());
			break;

		case "Capacete":
		case "capacete":
			personagem.setCapacete(equipado);
			bonus(personagem , equipado);
			break;

		case "Armadura":
		case "armadura":
			personagem.setArmadura(bolsa.getBolsaEquip().get(posicao).getEquip());
			bonus(personagem , equipado);
			break;

		case "Calcado":
		case "calcado":
		case "Calçado":
		case "calçado":
			personagem.setCalcado(equipado);
			bonus(personagem , equipado);
			break;

		case "Acessorio":
		case "acessorio":
		case "Acessório":
		case "acessório":
			personagem.setAcessorio(equipado);
			bonus(personagem, equipado);
			break;
			
		default: 
			System.exit(0);
			break;
		}

	}

	public static void equipar(PersonagemPrincipal personagem, Equipamento equipamento) {
		Equipamento equipado;
		equipado = equipamento;

		switch(equipamento.getTipo()) {		
		case "Armamento":
		case "armamento":
			personagem.setArmamento(equipado);
			bonus(personagem , equipamento);
			break;

		case "Capacete":
		case "capacete":
			personagem.setCapacete(equipado);
			bonus(personagem , equipado);
			break;

		case "Armadura":
		case "armadura":
			personagem.setArmadura(equipamento);
			bonus(personagem , equipado);
			break;

		case "Calcado":
		case "calcado":
		case "Calçado":
		case "calçado":
			personagem.setCalcado(equipado);
			bonus(personagem , equipado);
			break;

		case "Acessorio":
		case "acessorio":
		case "Acessório":
		case "acessório":
			personagem.setAcessorio(equipado);
			bonus(personagem, equipado);
			break;
		
		default: 
			System.out.println("Erro");
			break;
		}
	}
}
