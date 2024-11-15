package Estabelecimento;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Deskjet;
import equipamentos.digitalizadora.Scanner;

public class Fabrica {
	
	public static void main (String[] args) {
		
		EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
		
		Deskjet deskjet = new Deskjet();
		
		Scanner scanner = new Scanner();
		
		Impressora impressora = deskjet;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}

}
