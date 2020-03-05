package control;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PersonagemPrincipal extends AtributosBase {

	private String classe;
	private int xpAtual;
	private int xpUpar;
	private Equipamento armamento = new Equipamento();
	private Equipamento armadura = new Equipamento();
	private Equipamento capacete = new Equipamento();
	private Equipamento calcado = new Equipamento();
	private Equipamento acessorio = new Equipamento();
	private JLabel imgPersonagem = new JLabel();

	public JLabel getImgPersonagem() {
		return imgPersonagem;
	}

	protected Ataques ataques = new Ataques();
	
	private Ataques ataque1 = new Ataques();
	private Ataques ataque2 = new Ataques();
	private Ataques ataque3 = new Ataques();
	private Ataques ataque4 = new Ataques();
	private Ataques ataque5 = new Ataques();
	
	public PersonagemPrincipal(String nome, int lv, int hpMax, int spMax, int def, int defM, int atq, int magic,
			String classe, int xpAtual, int xpUpar, String sex) {
		this.nome = nome;
		this.lv = lv;
		this.hpMax = hpMax;
		this.hpAtual = hpMax;
		this.spMax = spMax;
		this.spAtual = spMax;
		this.atq = atq;
		this.magic = magic;
		this.classe = classe;
		this.xpAtual = xpAtual;
		this.xpUpar = xpUpar;
		levelUp();
		
		ataque1 = ataques.Ataque1(getClasse(), super.getAtq(), super.getMagic());
		ataque2 = ataques.Ataque2(getClasse(), super.getAtq(), super.getMagic());
		ataque3 = ataques.Ataque3(getClasse(), super.getAtq(), super.getMagic());
		ataque4 = ataques.Ataque4(getClasse(), super.getAtq(), super.getMagic());
		ataque5 = ataques.Ataque5(getClasse(), super.getAtq(), super.getMagic());
		
		switch(classe) {
		
		case "Guerreiro":
		case "guerreiro":
			if(sex == "M" || sex == "m" ) {
			imgPersonagem.setIcon(new ImageIcon(PersonagemPrincipal.class.getResource("../imgs/guerreiro.png")));
			}else
			imgPersonagem.setIcon(new ImageIcon(PersonagemPrincipal.class.getResource("../imgs/guerreira.png")));
			break;
			
		case "Mago":
		case "mago":
			if(sex == "M" || sex == "m") {
			imgPersonagem.setIcon(new ImageIcon(PersonagemPrincipal.class.getResource("../imgs/mago.png")));
			}else
			imgPersonagem.setIcon(new ImageIcon(PersonagemPrincipal.class.getResource("../imgs/maga.png")));
			break;
			
		case "Arqueiro":
		case "arqueiro":
			if(sex == "M" || sex == "m") {
			imgPersonagem.setIcon(new ImageIcon(PersonagemPrincipal.class.getResource("../imgs/arqueiro.png")));
			}else
			imgPersonagem.setIcon(new ImageIcon(PersonagemPrincipal.class.getResource("../imgs/arqueira.png")));
			break;
		}
	}
	

	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getXpAtual() {
		return xpAtual;
	}
	public void setXpAtual(int xpAtual) {
		if(xpAtual > xpUpar) {
			xpAtual = xpAtual - xpUpar;
			super.setLv(super.getLv() + 1);
			levelUp();
		}
		this.xpAtual = xpAtual;
	}

	public int getXpUpar() {
		return xpUpar;
	}
	public void setXpUpar(int xpUpar) {
		this.xpUpar = xpUpar;
	}
	public Equipamento getArmamento() {
		return armamento;
	}
	public void setArmamento(Equipamento armamento) {
		if(getArmamento().getNomeEquip() == "Nada Equipado") {
			this.armamento = armamento;
		}else {
			setHpMax(getHpMax() - getArmamento().getHpMaxEquip());
			setSpMax(getSpMax() - getArmamento().getSpMaxEquip());
			setDef(getDef() - getArmamento().getDefEquip());
			setDefM(getDefM() - getArmamento().getDefMEquip());
			setAtq(getAtq() - getArmamento().getAtqEquip());
			setMagic(getMagic() - getArmamento().getMagicEquip());
			this.armamento = armamento;
		}
		
	}
	public Equipamento getArmadura() {
		return armadura;
	}
	public void setArmadura(Equipamento armadura) {
		if(getArmadura().getNomeEquip() == "Nada Equipado") {
			this.armadura = armadura;
		}else {
			setHpMax(getHpMax() - getArmadura().getHpMaxEquip());
			setSpMax(getSpMax() - getArmadura().getSpMaxEquip());
			setDef(getDef() - getArmadura().getDefEquip());
			setDefM(getDefM() - getArmadura().getDefMEquip());
			setAtq(getAtq() - getArmadura().getAtqEquip());
			setMagic(getMagic() - getArmadura().getMagicEquip());
			this.armadura = armadura;
		}
		
	}
	public Equipamento getCapacete() {
		return capacete;
	}
	public void setCapacete(Equipamento capacete) {
		if(getCapacete().getNomeEquip() == "Nada Equipado") {
			this.capacete = capacete;
		}else {
			setHpMax(getHpMax() - getCapacete().getHpMaxEquip());
			setSpMax(getSpMax() - getCapacete().getSpMaxEquip());
			setDef(getDef() - getCapacete().getDefEquip());
			setDefM(getDefM() - getCapacete().getDefMEquip());
			setAtq(getAtq() - getCapacete().getAtqEquip());
			setMagic(getMagic() - getCapacete().getMagicEquip());
			this.capacete = capacete;
		}
		
		}

	
	public Equipamento getCalcado() {
		return calcado;
	}
	public void setCalcado(Equipamento calcado) {
		if(getCalcado().getNomeEquip() == "Nada Equipado") {
			this.calcado = calcado;
		}else {
			setHpMax(getHpMax() - getCalcado().getHpMaxEquip());
			setSpMax(getSpMax() - getCalcado().getSpMaxEquip());
			setDef(getDef() - getCalcado().getDefEquip());
			setDefM(getDefM() - getCalcado().getDefMEquip());
			setAtq(getAtq() - getCalcado().getAtqEquip());
			setMagic(getMagic() - getCalcado().getMagicEquip());
			this.calcado = calcado;
		}
		
	}

	
	public Equipamento getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(Equipamento acessorio) {
		if(getAcessorio().getNomeEquip() == "Nada Equipado") {
			this.acessorio = acessorio;
		}else {
			setHpMax(getHpMax() - getAcessorio().getHpMaxEquip());
			setSpMax(getSpMax() - getAcessorio().getSpMaxEquip());
			setDef(getDef() - getAcessorio().getDefEquip());
			setDefM(getDefM() - getAcessorio().getDefMEquip());
			setAtq(getAtq() - getAcessorio().getAtqEquip());
			setMagic(getMagic() - getAcessorio().getMagicEquip());
			this.acessorio = acessorio;
		}
	}

	
	public void levelUp() {
		if(super.getLv() > 1) {
			switch(classe) {
			case "Guerreiro":
				super.setHpMax(super.getHpMax() + (10 * (super.getLv() -1)));
				super.setHpAtual(super.getHpAtual() + 10 );
				super.setSpMax(super.getSpMax() + (3 * (super.getLv() -1)));
				super.setSpAtual(super.getSpAtual() + 3 );
				super.setDef(super.getDef() + (6 * (super.getLv() -1)));
				super.setDefM(super.getDefM() + (5 * (super.getLv() -1)));
				super.setAtq(super.getAtq() + (7 * (super.getLv() -1)));
				super.setMagic(super.getMagic() + (2 * (super.getLv() - 1)));
				setXpUpar( getXpUpar() + (super.getLv() * 120));
				break;
			
			case "Mago":
				super.setHpMax(super.getHpMax() + (5 * (super.getLv() -1)));
				super.setHpAtual(super.getHpAtual() + 5 );
				super.setSpMax(super.getSpMax() + (10 * (super.getLv() -1)));
				super.setSpAtual(super.getSpAtual() + 10 );
				super.setDef(super.getDef() + (3 * (super.getLv() -1)));
				super.setDefM(super.getDefM() + (7 * (super.getLv() -1)));
				super.setAtq(super.getAtq() + (2 * (super.getLv() -1)));
				super.setMagic(super.getMagic() + (9 * (super.getLv() - 1)));
				setXpUpar( getXpUpar() + (super.getLv() * 120));
				break;
			
			case "Arqueiro":
				super.setHpMax(super.getHpMax() + (5 * (super.getLv() -1)));
				super.setHpAtual(super.getHpAtual() + 5 );
				super.setSpMax(super.getSpMax() + (5 * (super.getLv() -1)));
				super.setSpAtual(super.getSpAtual() + 5 );
				super.setDef(super.getDef() + (4 * (super.getLv() -1)));
				super.setDefM(super.getDefM() + (4 * (super.getLv() -1)));
				super.setAtq(super.getAtq() + (7 * (super.getLv() -1)));
				super.setMagic(super.getMagic() + (5 * (super.getLv() - 1)));
				setXpUpar( getXpUpar() + (super.getLv() * 120));
				break;
			
			}
		}
	}
	
	public String imprimirEquipamentos() {
		String valor = null;
		valor = "Armamento: " + (getArmamento().getNomeEquip() + "\n" +
				"Armadura: " + (getArmadura()).getNomeEquip() + "\n" +
				"Capacete: " + (getCapacete()).getNomeEquip() + "\n" +
				"Calçado: " + (getCalcado()).getNomeEquip() + "\n") +
				"Acessório: " + (getAcessorio().getNomeEquip()) + "\n";
		return valor;
	}
	
	public Ataques getAtaque1() {
		return ataque1;
	}

	public Ataques getAtaque2() {
		return ataque2;
	}

	public Ataques getAtaque3() {
		return ataque3;
	}

	public Ataques getAtaque4() {
		return ataque4;
	}

	public Ataques getAtaque5() {
		return ataque5;
	}
}
