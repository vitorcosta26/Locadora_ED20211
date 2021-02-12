package br.unit;
// Questão 04.
public class Locadora {
	
	// Item a.
	private Disco[] listaDeDiscos = new Disco[2];
	
	// Item b.
	private Filme[] listaDeFilmes = new Filme[2];
	
	// Item c.
	private int indiceD;
	
	// Item d.
	private int indiceF;
    	
	// Item e.
    	public Locadora() {
    	}
    	
	// Item f.
    	public void novoDisco(Disco d) {
        	this.listaDeDiscos[this.indiceD++] = d;
    	}
    	
	// Item g.
    	public void novoFilme(Filme f) {
        	this.listaDeFilmes[this.indiceF++] = f;
    	}
    	
	// Item h.
    	public void listarDiscos() {
        	for (Disco disco : listaDeDiscos) {
            	disco.ListaInformacoes();
        	}
    	}
    	
	// Item i.
    	public void listarFilmes() {
        	for (Filme filme : listaDeFilmes) {
            	filme.ListaInformacoes();
        	}
    	}
}
