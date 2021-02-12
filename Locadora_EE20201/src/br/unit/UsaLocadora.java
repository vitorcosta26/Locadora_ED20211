package br.unit;

public class UsaLocadora {

	public static void main(String[] args) {
		
		Locadora aluguel = new Locadora();
		
		// Atribuindo Informações do Disco 1.
		Disco disco1 = new Disco("Samba Social Clube 5", 2014, "Vários Sambas", "Vários Artistas", 12, "CD");
	    	// Atribuindo Informações do Disco 2.
		Disco disco2 = new Disco("Pode Entrar", 2009, "Ivete e Convidados", "Ivete Sangalo", 14, "DVD");
		// Instanciando os objetos discos a classe Disco.
		aluguel.novoDisco(disco1);
	    	aluguel.novoDisco(disco2);
	    	// Listando as informaçoes.
	    	aluguel.listarDiscos();
		
		// Atribuindo Informações do Filme 1.
	    	Filme filme1 = new Filme("Smurfs 2", 2013, "Gargamel cria a versão malvada dos Smurfs", "Raja Gosnell", 140, "Animação");
	    	// Atribuindo Informações do Filme 2
	    	Filme filme2 = new Filme("Os mercenários 2", 2012, "De volta ao mundo", "Simon West", 210, "Animação");
	    	// Instanciando os objetos filmes a classe Filme.
	    	aluguel.novoFilme(filme1);
	    	aluguel.novoFilme(filme2);
	    	// Listando as informaçoes.
	    	aluguel.listarFilmes();

	}
}
