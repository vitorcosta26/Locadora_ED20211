package br.unit;
// Questão 01.
public abstract class Item {
	// Item a.
	public String titulo;
	public int anoLancamento;
	public String comentario;
	// Item b.
	public Item() {
	}
	
	public Item(String titulo, int anoLancamento, String comentario) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.comentario = comentario;
	}
	// Item c.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	// Item d.
	public abstract void ListaInformacoes();
}
