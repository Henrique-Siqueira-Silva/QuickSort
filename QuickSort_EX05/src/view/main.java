package view;

import controller.ordenar;

public class main {

	public static void main(String[] args) {
		ordenar m = new ordenar();
		int[] vet1 ={ 74, 20, 74, 87, 16, 25, 99, 44, 58 };
		int[] vet2 ={ 44, 43, 42, 41, 40, 39, 38 };
		int[] vet3 ={ 31 ,32, 33, 34, 99, 98, 97, 96 };
		
		vet1 = m.Quick(vet1);
		vet2 = m.Quick(vet2);
		vet3 = m.Quick(vet3);
		
		
		for (int i : vet1) {
			System.out.print( i +" ");
		}
		System.out.println(" ");
		
		for (int i : vet2) {
			System.out.print( i +" ");
		}
		
		System.out.println(" ");
		for (int i : vet3) {
			System.out.print( i +" ");
		}



	}

}
