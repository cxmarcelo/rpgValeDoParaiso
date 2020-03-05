package control;

import java.util.ArrayList;

public class Bolsa {


	// BolsaEquip
	private Equipamento equip = new Equipamento();
	private int quantEquip;
	private ArrayList<Bolsa> bolsaEquip = new ArrayList<Bolsa>();


	// BolsaItens
	private ItensUtilizaveis itens = new ItensUtilizaveis();
	private int quantItem;
	private ArrayList<Bolsa> bolsaItens = new ArrayList<Bolsa>();


	public Bolsa() {

	}

	public Bolsa(Equipamento equip, int quantEquip) {
		this.equip = equip;
		this.quantEquip = quantEquip;
	}

	public Bolsa(ItensUtilizaveis itens, int quantidade) {
		this.itens = itens;
		this.quantItem = quantidade;
	}

	public Equipamento getEquip() {
		return equip;
	}

	public void setEquip(Equipamento equip) {
		this.equip = equip;
	}

	public int getQuantEquip() {
		return quantEquip;
	}

	public void setQuantEquip(int quantEquip, int posicao) {
		if(quantEquip == 0) {
			getBolsaEquip().remove(posicao);
		}else
			this.quantEquip = quantEquip;
	}

	public void setQuantEquip(int quantEquip) {
		this.quantEquip = quantEquip;
	}

	public ArrayList<Bolsa> getBolsaEquip() {
		return bolsaEquip;
	}

	public void setBolsaEquip(ArrayList<Bolsa> bolsaEquip) {
		this.bolsaEquip = bolsaEquip;
	}

	public void setBolsaEquip(Equipamento equip, int quantidade) {
		for(int cont = 0; cont < bolsaEquip.size(); cont++) {
			if(bolsaEquip.get(cont).getEquip().getNomeEquip() == equip.getNomeEquip()) {
				bolsaEquip.get(cont).setQuantEquip( bolsaEquip.get(cont).getQuantEquip() + quantidade);
				return;
			}
		}

		Bolsa b = new Bolsa(equip, quantidade);
		bolsaEquip.add(b);
	}

	public ItensUtilizaveis getItens() {
		return itens;
	}

	public void setItens(ItensUtilizaveis itens) {
		this.itens = itens;
	}

	public int getQuantItem() {
		return quantItem;
	}

	public void setQuantItem(int quantItem) {
		this.quantItem = quantItem;
	}

	public ArrayList<Bolsa> getBolsaItens() {
		return bolsaItens;
	}

	public void setBolsaItens(ItensUtilizaveis itens, int quantidade) {
		for(int cont = 0; cont < bolsaItens.size(); cont++) {
			if(bolsaItens.get(cont).getItens().getNome() == itens.getNome() ) {
				bolsaItens.get(cont).setQuantItem( bolsaItens.get(cont).getQuantItem() + quantidade);
				return;
			}
		}
		Bolsa b = new Bolsa(itens, quantidade);
		bolsaItens.add(b);	
	}
}