package estabelecimento;

import EquipamentosInterface.copiadora.Copiadora;
import EquipamentosInterface.digitalizadora.Digitalizadora;
import EquipamentosInterface.impressora.Impressora;
import EquipamentosInterface.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main (String[]args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();		
		Impressora impressora = em ;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.Imprimir();
		copiadora.copiar();
		digitalizadora.digitalizar();
		
		
	}
}
