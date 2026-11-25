package techstore;

public class Main {
    public static void main(String[] args) {
        SystemeExploitation s1 = SystemeExploitation.Windows;
        SystemeExploitation s2 = SystemeExploitation.Ubuntu;
        System.out.println(s1);
        System.out.println(s2);

        for (SystemeExploitation s : SystemeExploitation.values()) {
            System.out.println(s);
        }

        Mobile m = new Mobile(1, "Galaxy S", "REF-M1", 1500, 6.1, "Snapdragon",
                8, SystemeExploitation.Android, 50, 12, 2, 4500);
        OrdinateurPortable p = new OrdinateurPortable(2, "ThinkPad", "REF-P1", 2200,
                15.6, "Intel i7", 16, SystemeExploitation.Windows, 512,
                "NVIDIA", 5000);
        OrdinateurDeBureau d = new OrdinateurDeBureau(3, "Tour PC", "REF-D1", 1800,
                24, "Ryzen 5", 16, SystemeExploitation.Ubuntu, 1000,
                "AMD", "650W");
        ComposantStockage c = new ComposantStockage(4, "SSD", "REF-S1", 120, 512);
        Peripheriques per = new Peripheriques(5, "Souris", "REF-X1", 35,
                "Bluetooth", "sans fil");

        System.out.println(m + "\n  garantie : " + m.garantirAppareil() + " an(s)");
        System.out.println(p + "\n  garantie : " + p.garantirAppareil() + " an(s)");
        System.out.println(d + "\n  garantie : " + d.garantirAppareil() + " an(s)");
        System.out.println(c + "\n  garantie : " + c.garantirAppareil() + " an(s)");
        System.out.println(per);
    }
}
