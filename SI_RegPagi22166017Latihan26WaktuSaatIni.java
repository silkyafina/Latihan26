import java.util.Calendar;
import java.util.TimeZone;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan waktu saat ini
 * sesuai dengan lokasi kita berada
 */
public class SI_RegPagi22166017Latihan26WaktuSaatIni {
    public static void main(String[] args) {
       Calendar kalender = Calendar.getInstance();
       TimeZone zona_waktu= kalender.getTimeZone();
       
        System.out.println("Hari ini adalah hari : "+kalender.getTime());
    System.out.println("(Developed by: Silky Afina Saly)");
    }
}
