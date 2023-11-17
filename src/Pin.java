import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        int PinNya = 2930;
        int Kesempatan = 3;
        Scanner scanner = new Scanner(System.in);

        while (Kesempatan > 0) {
            System.out.print("Masukkan 4 Digit PIN Anda: ");
            int MasukkanPin = scanner.nextInt();

            if (MasukkanPin == PinNya) {
                System.out.println("PIN benar! Selamat datang.");
                break;
            } else {
                Kesempatan--;
                System.out.println("PIN salah. Sisa kesempatan: " + Kesempatan);
            }
        }

        if (Kesempatan == 0) {
            System.out.println("Anda telah melebihi batas kesempatan. Akun terkunci.");
        }

        scanner.close();
    }
}
