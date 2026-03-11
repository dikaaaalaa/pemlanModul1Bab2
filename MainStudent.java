public class MainStudent {
    public static void main(String[] args) {
        Student anna= new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        //Menggunakan constructor lain
        System.out.println("===============================");
        Student chris= new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

    

    // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor lain
    System.out.println("===============================");
    anna= new Student("Anna", "Batu", 18);
    anna.displayMessage();

    //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
    System.out.println("===============================");
    chris.setAddress("Surabaya");
    chris.setAge(22);
    chris.displayMessage();

    // siswa dengan nama anna dengan constructor baru
    System.out.println("===============================");
    anna= new Student("Anna","Bukittinggi", 19, 90, 80, 70);
    anna.displayMessage();

    
    //menampilkan jumlah objek Student yang telah dibuat
    System.out.println("===============================");
    Student.jumlahObjek();

    }
}

