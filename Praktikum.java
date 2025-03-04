package tugaspraktikum;

//tugas no 1
public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Halo, nama saya adalah Daniel Budianto ");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro ");
        System.out.println("Saya sedang berjualan litle trees");
      
//tugas no 2
int diameterling, alas, tinggiseg, diametertab, tinggitab;
diameterling = 10;
alas = 6;
tinggiseg = 8;
diametertab = 5;
tinggitab = 10;
float phi =22f/7f;

System.out.println("Keliling Lingkaran");
double KelilingLingkaran = 2 * phi * (0.5 * diameterling) ;  //keliling lingkaran
System.out.println("Keliling Lingkaran adalah: " +KelilingLingkaran);

System.out.println("Luas Segitiga Siku");
float LuasSegitiga = 0.5f * alas *  tinggiseg ;  //luas segitiga
System.out.println("Luas Segitiga adalah: " +LuasSegitiga);

System.out.println("VOlume Tabung");
float VolumeTabung = phi * (0.5f * diameterling ) * (0.5f * diameterling) * tinggitab  ;  //volume tabung
System.out.println("Volume Tabung adalah: " +VolumeTabung);

}
}