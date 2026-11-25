package techstore;

public class TestHeritage {
    public static void main(String[] args) {
        Adulte a1 = new Adulte("Amine", 35, "20123456", "Ingénieur");
        a1.afficherIdentite();
        Enfant e1 = new Enfant("Sami", 10, "21123456", "École primaire");
        Bebe b1 = new Bebe("Lina", 1, "22123456", true);

        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);
        System.out.println(a1.getNom());

        TypePersonne type = TypePersonne.ADULTE;
        System.out.println(type);
        for (TypePersonne t : TypePersonne.values()) {
            System.out.println(t);
        }
    }
}
