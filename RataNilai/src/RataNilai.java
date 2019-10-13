
import java.util.Scanner;

/**
 *Nama : Muhammad Ihsan
 * Nim   : 10118037
 * Kelas : IF-1 2018
 * Deskripsi program : Program ini menampilkan rata-rata nilai mahasiswa
 * @author Muhammad ihsan
 * 
 * */

public class RataNilai {

	public static int[] nilaiMhs = new int[10];
	public static int banyakMhs;
	public static double rataNilai;

	/**
	 * 
                      * @param bMhs
	 * @param args
	 */
                    public static void hitungRata2(int bMhs) {
                       double temp = 0;                       
                        Scanner scanner = new Scanner(System.in);
                        if(bMhs >10){
                            System.out.println("Maaf Banyak Mahasiswa terlalu banyak,silahkan isi ulang kembali ");
                        }
                        else{
                             for(int i = 1 ; i <= bMhs ; i++){
                                System.out.print("Nilai Mahasiswa ke- " + i + " : ");
                                nilaiMhs[i] = scanner.nextInt();
                                temp += nilaiMhs[i]; 
                            }
                           rataNilai = temp / bMhs;  
                        }
                       
	}
                    public static void main(String[] args) {
	//input
                      Scanner scanner = new Scanner(System.in);
                        System.out.print("Masukkan Banyaknya Mahasiswa : ");
                        banyakMhs = scanner.nextInt();
                        
                     //proses
                        hitungRata2(banyakMhs);
                        System.out.println("Maka rata-rata nilainya adalah : " + rataNilai);
                        System.out.println("(Developed by Muhammad Ihsan)");
        
                    
		
	}

	/**
	 * 
	 * @param bMhs
	 */
	

}