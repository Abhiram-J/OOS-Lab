interface Bouquet {
    String getDescription();
}

class BasicBouquet implements Bouquet {
    public String getDescription() {
        return "A simple bouquet of flowers";
    }
}

class RibbonDecorator implements Bouquet {
    private Bouquet bouquet;

    public RibbonDecorator(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public String getDescription() {
        return bouquet.getDescription() + " decorated with a ribbon";
    }
}

class FragranceDecorator implements Bouquet {
    private Bouquet bouquet;

    public FragranceDecorator(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public String getDescription() {
        return bouquet.getDescription() + " decorated with lovely fragrance";
    }
}

public class Q4 {
    public static void main(String[] args) {
        System.out.println();
        Bouquet basicBouquet = new BasicBouquet();
        System.out.println("Basic Bouquet: " + basicBouquet.getDescription());

        Bouquet ribbonBouquet = new RibbonDecorator(basicBouquet);
        System.out.println("Ribbon-decorated Bouquet: " + ribbonBouquet.getDescription());

        Bouquet fragrantBouquet = new FragranceDecorator(basicBouquet);
        System.out.println("Fragrance-decorated Bouquet: " + fragrantBouquet.getDescription());

    }
}
