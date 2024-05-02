package br.com.bianca.campoMinado.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.bianca.campoMinado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		 setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		 
		 tabuleiro.paraCadaCampo(campo -> add(new BotaoCampo(campo)));
		 
		 tabuleiro.registrarObservador(e -> {
			 
			 SwingUtilities.invokeLater(() -> {
				 if(e.isGanhou()) {
					 JOptionPane.showMessageDialog(this, "Ganhou! :)");
				 } else {
					 JOptionPane.showMessageDialog(this, "Perdeu :(");
				 }
				 
				 tabuleiro.reiniciar();
			 });
		 });
	}
}
