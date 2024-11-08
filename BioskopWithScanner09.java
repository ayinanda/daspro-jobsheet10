import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        int pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1.  Input data penonton ");
            System.out.println("2.  Tampilkan daftar penonton");
            System.out.println("3.  Exit ");
            System.out.println("Pilih menu");
            pilihan = sc09.nextInt();
            sc09.nextLine();

           switch (pilihan) {
            case 1:
                System.out.println("===== Input data penonton =====");
                boolean tambahPenonton = true;
                while (tambahPenonton) {
                    System.out.print(" Masukkan nama  :  ");
                    String nama = sc09.nextLine();
                    System.out.print(" Masukkan baris (1-4)  :  ");
                    int baris = sc09.nextInt();
                    System.out.print(" Masukkan kolom (1-2)  :  ");
                    int kolom = sc09.nextInt();
                    sc09.nextLine();

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print(" input penonton lainnya? (y/n) :  ");
                    String next = sc09.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        tambahPenonton = false;
                    }
                }
                break;
           case 2:
                System.out.println("===== Daftar Penonton =====");
                for (int i=0; i<penonton.length; i++) {
                    for (int j=0; j<penonton[i].length; j++) {
                        System.out.println(penonton[i][j] + "\t");
                    }
                    System.out.println();
                    break;
                }
            case 3 :
            System.out.println("Keluar dari program. Terima kasih! ");
            sc09.close();
            default:
            System.out.println(" Pilihan tidak valid. Silakan coba lagi. ");
                break;
           }
        }

    }
}
