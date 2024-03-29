package test.java.com.aula;

public class Corpo {

	// atributos

	private String nome;
	private int anos, comida, vida, felicidade, dinheiro;
	private boolean vivo;
	
	//constructor
	
	public Corpo (String nome) {
		this.setNome(nome);
		this.setVida(5);
		this.setFelicidade(5);
		this.setVivo(true);
	}

	// Metodos

	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Vida: " + this.getVida());
		System.out.println("Anos: " + this.getAnos());
		System.out.println("Felicidade: " + this.getFelicidade());
		System.out.println("Dinheiro: " + this.getDinheiro() + "D");
		morto();
	}

	public void comer(int comida) {

		if (dinheiro == 0) {
			System.out.println("Sem dinheiro :(");

		} else {
			switch (comida) {

			case 1:

				this.setDinheiro(getDinheiro() - 5);
				System.out.println("Comendo Frango");

				break;
			case 2:

				this.setDinheiro(getDinheiro() - 2);
				System.out.println("Hmm Coxinha");

				break;
			case 3:
				this.setDinheiro(getDinheiro() -10);
				System.out.println("Hmm Bife");
			}
		}
	}

	public void jogar() {
		this.setDinheiro(getDinheiro() + 5);
		this.setFelicidade(getFelicidade() + 1);
		System.out.println(" ======================== \n Jogando Bola \n ============================");
	}

	public void darCarinho() {
		this.setFelicidade(getFelicidade() + 5);
		System.out.println(" ============================ \n Fazendo Carinho \n ============================");
	}
	
	public void dormir() {
		this.setAnos(getAnos()+1);
		this.setFelicidade(getFelicidade()- 4);

		System.out.println("============================ \n Dormiu Por um ano :O \n ============================ ");
	}
	
	public void morto() {
		if(this.getAnos() == 5) {
			System.out.println("Ficou velhinho e não acordou mais :C");
			this.setVivo(false);
		}if (getFelicidade() == 0) {
			System.out.println("Morreu de Tristeza T-T");
			this.setVivo(false);
		}
	}

	// Metodos especiais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getComida() {
		return comida;
	}

	public void setComida(int comida) {
		this.comida = comida;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getFelicidade() {
		return felicidade;
	}

	public void setFelicidade(int felicidade) {
		this.felicidade = felicidade;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

}
