package br.com.tv.model;

public class TV {

	private String marca;
	private double tamanho;
	private String resolucao;
	private double preco;
	
	 public TV() {}

	    public TV(String marca, double tamanho, String resolucao, double preco) {
	        this.marca = marca;
	        this.tamanho = tamanho;
	        this.resolucao = resolucao;
	        this.preco = preco;
	
	    }

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getTamanho() {
			return tamanho;
		}

		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}

		public String getResolucao() {
			return resolucao;
		}

		public void setResolucao(String resolucao) {
			this.resolucao = resolucao;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}	
	    
	    
	    

}
