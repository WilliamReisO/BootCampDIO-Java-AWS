package EquipamentosInterface.multifuncional;

import EquipamentosInterface.copiadora.Copiadora;
import EquipamentosInterface.digitalizadora.Digitalizadora;
import EquipamentosInterface.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora , Digitalizadora ,Impressora {

	public void copiar() {
		System.out.println("Copiando Via Equipamento Multifuncional");
	}

	@Override
	public void Imprimir() {
		System.out.println("Imprimindo Via Equipamento Multifuncional");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando Via Equipamento Multifuncional");
		
	}
}
