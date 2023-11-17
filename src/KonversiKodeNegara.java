import java.util.Scanner;

public class KonversiKodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode negara (2 huruf): ");
        String kodeNegara = input.next().toUpperCase(); // Ubah ke huruf besar untuk penanganan yang lebih baik

        String namaNegara;

        switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "TUNISIA";
                break;
            case "ID":
                namaNegara = "INDONESIA";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "INDIA";
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                return;
        }

        System.out.println("Kode Negara: " + kodeNegara);
        System.out.println("Nama Negara: " + namaNegara);
    }
}
