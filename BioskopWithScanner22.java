import java.util.Scanner;  

public class BioskopWithScanner22 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int baris, kolom;  
        String nama, next;  
        String[][] penonton = new String[4][2];  
        int menu;  

        while (true) {  
            System.out.println("==== Menu ====");  
            System.out.println("1. Input data penonton");  
            System.out.println("2. Tampilkan daftar penonton");  
            System.out.println("3. Exit");  
            System.out.print("Pilih menu: ");  
            menu = sc.nextInt();  
            sc.nextLine(); 
            
            if (menu == 1) {  
                while (true) {  
                    System.out.print("Masukkan nama: ");  
                    nama = sc.nextLine();  
                    System.out.print("Masukkan baris: ");  
                    baris = sc.nextInt();  
                    System.out.print("Masukkan kolom: ");  
                    kolom = sc.nextInt();  
                    sc.nextLine();  
 
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {  
                        System.out.println("Nomor baris/kolom kursi tidak tersedia. Silakan masukkan nomor yang valid.");  
                        continue;  
                    }  

                    if (penonton[baris - 1][kolom - 1] != null) {  
                        System.out.println("Maaf, kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi. Silakan pilih kursi yang lain.");  
                        continue;  
                    }  

                    penonton[baris - 1][kolom - 1] = nama;  

                    System.out.print("Input penonton lainnya? (y/n): ");  
                    next = sc.nextLine();  

                    if (next.equalsIgnoreCase("n")) {  
                        break;  
                    }  
                }  
            } else if (menu == 2) {  
                System.out.println("==== Daftar Penonton ====");  
                for (int i = 0; i < penonton.length; i++) {  
                    for (int j = 0; j < penonton[i].length; j++) {  
                        if (penonton[i][j] != null) {  
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);  
                        } else {  
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");  
                        }  
                    }  
                }  
            } else if (menu == 3) {  
                System.out.println("Selesai");  
                System.exit(0);    
            }  
        }  
    }  
}