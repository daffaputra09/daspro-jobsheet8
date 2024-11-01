import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Politeknik yang berpartisipasi: ");
        int jumlahPoltek = input.nextInt();
        input.nextLine(); 
        
        for (int i = 1; i <= jumlahPoltek; i++) {
            System.out.println("\n======= DATA POLITEKNIK KE-" + i + " =======");
            System.out.print("Masukkan nama Politeknik: ");
            String namaPoltek = input.nextLine();
            
            for (int j = 1; j <= 4; j++) {
                System.out.println("\nCabang Olahraga ke-" + j);
                String namaCabor = "";
                
                switch(j) {
                    case 1:
                        namaCabor = "Badminton";
                        break;
                    case 2:
                        namaCabor = "Tenis Meja";
                        break;
                    case 3:
                        namaCabor = "Basket";
                        break;
                    case 4:
                        namaCabor = "Bola Voly";
                        break;
                }
                System.out.println("Cabang Olahraga: " + namaCabor);
                
                for (int k = 1; k <= 5; k++) {
                    System.out.print("Masukkan nama atlet ke-" + k + ": ");
                    String namaAtlet = input.nextLine();
                    
                    System.out.println("Data atlet " + k + " " + namaCabor + 
                                     " dari " + namaPoltek + ": " + namaAtlet);
                }
            }
            System.out.println("\n===================================");
        }
    }
}