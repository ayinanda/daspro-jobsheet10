import java.util.Scanner;

public class Siakad09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

       System.out.print("Masukkan jumlah siswa : ");
       int jumlahMhs = sc09.nextInt();

       System.out.print("Masukkan jumlah Mata kuliah :");
       int jumlahMatkul = sc09.nextInt();

       int [][] nilai = new int[jumlahMhs][jumlahMatkul];

       for (int i=0; i < jumlahMhs; i++) {
        System.out.println("Masukkan nilai mahasiswa ke- " + (i+1));
        double totalPerSiswa = 0;
        for (int j=0; j<jumlahMatkul; j++) {
            System.out.print("Nilai mata kuliah " + (j+1) + " : ");
            nilai[i][j] = sc09.nextInt();
            totalPerSiswa += nilai[i][j];
        }
       }
       System.out.println("rata- rata Nilai setiap Mata Kuliah : ");

       for (int j=0; j<jumlahMatkul; j++) {
        double totalPerMatkul = 0;
        for (int i=0; i<jumlahMhs; i++) {
            totalPerMatkul += nilai[i][j];
        }
        System.out.println("Mata Kuliah " + (j+1) + " : " + (totalPerMatkul/jumlahMhs));
       }

       
       sc09.close();
    }
}
