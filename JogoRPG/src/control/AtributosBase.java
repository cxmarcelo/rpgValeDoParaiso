package control;

public abstract class AtributosBase {

	protected String nome;
	protected int lv;
	protected int hpAtual;
	protected int hpMax;
	protected int spAtual;
	protected int spMax;
	protected int def;
	protected int defM;
	protected int atq;
	protected int magic;
	protected boolean vivo;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getHpAtual() {
		return hpAtual;
	}

	public void setHpAtual(int hpAtual) {
		if(hpAtual > this.hpMax) {
			this.hpAtual = hpMax;
		}else
			this.hpAtual = hpAtual;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public int getSpAtual() {
		return spAtual;
	}

	public void setSpAtual(int spAtual) {
		if(spAtual > this.spMax) {
			this.spAtual = spMax;
		}else
			this.spAtual = spAtual;
	}

	public int getSpMax() {
		return spMax;
	}

	public void setSpMax(int spMax) {
		this.spMax = spMax;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getDefM() {
		return defM;
	}

	public void setDefM(int defM) {
		this.defM = defM;
	}

	public int getAtq() {
		return atq;
	}

	public void setAtq(int atq) {
		this.atq = atq;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
}
