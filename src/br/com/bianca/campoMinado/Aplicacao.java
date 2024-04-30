package br.com.bianca.campoMinado;

import br.com.bianca.campoMinado.modelo.Tabuleiro;
import br.com.bianca.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
		
		tabuleiro.abrir(3, 3);
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);
		
		System.out.println(tabuleiro);
	}
}
