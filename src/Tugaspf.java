import java.util.Scanner;

public class Tugaspf {
	public static void main(String[] Args){
		int[] Jumbar = new int [5];
		int[] Harga = {2500, 3000,4000,5000,6000};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input jumlah barang belanja");
		
		for(int i = 0; i < Jumbar.length; i++){
			System.out.print ("Jumlah belanja item-" + i + " Rp " + Harga[i] + ": ");
			Jumbar[i] = sc.nextInt();
		}
		System.out.println("Daftar Belanja dan harga:");
		int Harva = 0;
		for(int i = 0; i < Jumbar.length; i++){
			Harva = Harga[i] * Jumbar[i];
		System.out.println("Harga Barang ke-" + i + " " + Harga[i] +" " + Jumbar[i] + " item: " + Harva);
		}
		
		int TotalItem = 0;
		for(int i = 0; i < Jumbar.length; i++){
			TotalItem += Jumbar[i];
		}
		System.out.println("TOTAL ITEM BELANJA: " + TotalItem);
		
		int Tobel = 0;
		for(int i = 0; i < Jumbar.length; i++){
			Tobel += Harga[i] * Jumbar [i];
		}
		System.out.println("TOTAL BELANJA: " + Tobel);
		
		sc.close();
	}
}
	
		