package br.unit;

public class UsaLocadora {

	public static void main(String[] args) {
		
		Locadora aluguel = new Locadora();
		
		// Atribuindo Informa��es do Disco 1.
		Disco disco1 = new Disco("Samba Social Clube 5", 2014, "V�rios Sambas", "V�rios Artistas", 12, "CD");
	    // Atribuindo Informa��es do Disco 2.
		Disco disco2 = new Disco("Pode Entrar", 2009, "Ivete e Convidados", "Ivete Sangalo", 14, "DVD");
		// Instanciando os objetos discos a classe Disco.
		aluguel.novoDisco(disco1);
	    aluguel.novoDisco(disco2);
	    // Listando as informa�oes.
	    aluguel.listarDiscos();
		
		// Atribuindo Informa��es do Filme 1.
	    Filme filme1 = new Filme("Smurfs 2", 2013, "Gargamel cria a vers�o malvada dos Smurfs", "Raja Gosnell", 140, "Anima��o");
	    // Atribuindo Informa��es do Filme 2
	    Filme filme2 = new Filme("Os mercen�rios 2", 2012, "De volta ao mundo", "Simon West", 210, "Anima��o");
	    // Instanciando os objetos filmes a classe Filme.
	    aluguel.novoFilme(filme1);
	    aluguel.novoFilme(filme2);
	    // Listando as informa�oes.
	    aluguel.listarFilmes();

	}
}
