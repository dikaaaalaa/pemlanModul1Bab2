import java.util.Scanner;

public class MainStudent2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa:");
        int jumlah = input.nextInt();

        Student[] siswa = new Student[jumlah];

        for(int i=0; i<jumlah; i++){

            System.out.println("Masukkan data siswa ke-" + (i+1));

            System.out.print("Nama: ");
            String nama = input.next();

            System.out.print("Alamat: ");
            String alamat = input.next();

            System.out.print("Umur: ");
            int umur = input.nextInt();

            System.out.print("Nilai Matematika: ");
            double math = input.nextDouble();

            System.out.print("Nilai English: ");
            double english = input.nextDouble();

            System.out.print("Nilai Science: ");
            double science = input.nextDouble();

            siswa[i] = new Student(nama, alamat, umur, math, english, science);

        }

        System.out.println("\n== Data Siswa ==");

        for(int i=0; i<jumlah; i++){
            siswa[i].displayMessage();
            System.out.println("-----------------------------------");
        }



    }
}
