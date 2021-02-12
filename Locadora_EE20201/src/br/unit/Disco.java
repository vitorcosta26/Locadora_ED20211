package br.unit;
// Quest�o 02.
public class Disco extends Item {
	// Item a.
	private String artista;
	private int qtdFaixas;
	private String midia;
	// Item b.
    public Disco() {
    }

    public Disco(String titulo, int anoLancamento, String comentario, String artista, int qtdFaixas, String midia) {
        super(titulo, anoLancamento, comentario);
        this.artista = artista;
        this.qtdFaixas = qtdFaixas;
        this.midia = midia;
    }
	// Item c.
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getQtdFaixas() {
		return qtdFaixas;
	}

	public void setQtdFaixas(int qtdFaixas) {
		this.qtdFaixas = qtdFaixas;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}
	// Item d.
	@Override
	public void ListaInformacoes() {
		System.out.println("Informa��es do Disco\n"+
				"-----------------------------------------\n" +
                "T�tulo: " + this.getTitulo() + "\n" +
                "Ano de Lan�amento: " + this.getAnoLancamento() + "\n" +
                "Coment�rio: " + this.getComentario() + "\n" +
                "Artista: " + this.artista + "\n" +
                "Quantidade de Faixas: " + this.qtdFaixas + "\n" +
                "Tipo de M�dia: " + this.midia +
                "\n-----------------------------------------");
	}
}
