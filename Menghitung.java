package tugasjava;

public class Menghitung{
    public static void main (String[] args) {
        int tinggi, jarijari, sisi, alas;
        tinggi = 10;
        jarijari = 15;
        sisi = 8;
        alas = 7;
        float phi =22f/7f;

        System.out.println("\n=== RUMUS PERSEGI ===");
    
        int LuasPersegi = sisi * sisi;
        System.out.println("Luas Persegi adalah: " + LuasPersegi);

   
        int KelilingPersegi = 4 * sisi;
        System.out.println("Keliling Persegi adalah: " + KelilingPersegi);

        System.out.println("\n=== RUMUS SEGITIGA ===");
  
        float LuasSegitiga = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga adalah: " + LuasSegitiga);

  
        float KelilingSegitiga = sisi + sisi + sisi;
        System.out.println("Keliling Segitiga adalah: " + KelilingSegitiga);

        System.out.println("\n=== RUMUS LINGKARAN ===");
    
        float LuasLingkaran = phi * (jarijari * jarijari);
        System.out.println("Luas Lingkaran adalah: " + LuasLingkaran);

    
        float KelilingLingkaran = 2 * phi * jarijari;
        System.out.println("Keliling Lingkaran adalah: " + KelilingLingkaran);

        System.out.println("\n=== RUMUS KUBUS ===");
      
        int LuasKubus = 6 * (sisi * sisi);
        System.out.println("Luas Kubus adalah: " + LuasKubus);

      
        int KelilingKubus = 12 * sisi;
        System.out.println("Keliling Kubus adalah: " + KelilingKubus);
    }
}
