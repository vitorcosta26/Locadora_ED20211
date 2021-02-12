package br.unit;
// Quest�o 03.
public class Filme extends Item {
	// Item a.
	private String diretor;
	private int duracao;
	private String genero;
	// Item b.
	public Filme() {
	}
	
	public Filme(String titulo, int anoLancamento, String comentario, String diretor, int duracao, String genero) {
        super(titulo, anoLancamento, comentario);
        this.diretor = diretor;
        this.duracao = duracao;
        this.genero = genero;
    }
	// Item c.
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	// Item d.
	@Override
	public void ListaInformacoes() {
		System.out.println("Informa��es do Filme\n"+
				"-----------------------------------------\n" +
                "T�tulo: " + this.getTitulo() + "\n" +
                "Ano de Lan�amento: " + this.getAnoLancamento() + "\n" +
                "Coment�rio: " + this.getComentario() + "\n" +
                "Diretor: " + this.diretor + "\n" +
                "Dura��o: " + this.duracao + "\n" +
                "G�nero: " + this.genero +
                "\n-----------------------------------------");
	}
}
