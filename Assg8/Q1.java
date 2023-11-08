interface Character {
    String getName();

    String getAbilities();
}

class Warrior implements Character {
    public String getName() {
        return "Warrior";
    }

    public String getAbilities() {
        return "Melee combat, heavy armor";
    }
}

class Mage implements Character {
    public String getName() {
        return "Mage";
    }

    public String getAbilities() {
        return "Magic spells, ranged attacks";
    }
}

class CharacterFactory {
    public Character createCharacter(String type) {
        if ("Warrior".equalsIgnoreCase(type)) {
            return new Warrior();
        } else if ("Mage".equalsIgnoreCase(type)) {
            return new Mage();
        } else {
            return null;
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character warrior = factory.createCharacter("Warrior");
        Character mage = factory.createCharacter("Mage");

        if (warrior != null) {
            System.out.println("Character Type: " + warrior.getName());
            System.out.println("Abilities: " + warrior.getAbilities());
        }

        if (mage != null) {
            System.out.println("Character Type: " + mage.getName());
            System.out.println("Abilities: " + mage.getAbilities());
        }
    }
}
