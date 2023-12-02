import java.util.ArrayList;
import java.util.Scanner;

interface Player {
    public void play();

    public void field();

    public void addFieldingSkill(String skill);

}

class PlayerFactory {
    PlayerFactory() {
    }

    public Player getPlayer(String type) {
        if (type.equals("batsman")) {
            return new Batsman();
        } else {
            return new Bowler();
        }
    }
}

class Batsman implements Player {
    public String name;
    public ArrayList<String> skills;

    public Batsman() {
        this.skills = new ArrayList<String>();

    }

    public void play() {
        System.out.println("Batsman is playing");
    }

    public void addFieldingSkill(String skill) {
        skills.add(skill);
    }

    public void field() {
        for (String skill : skills) {
            System.out.println(skill);
        }
    }

}

class Bowler implements Player {
    public String name;
    public ArrayList<String> skills;

    public Bowler() {
        this.skills = new ArrayList<String>();
    }

    public void play() {
        System.out.println("Bowler is playing");
    }

    public void addFieldingSkill(String skill) {
        skills.add(skill);
    }

    public void field() {
        for (String skill : skills) {
            System.out.println(skill);
        }
    }

}

abstract class SkillDecorator implements Player {
    protected Player decoratedPlayer;

    public SkillDecorator(Player decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    public void play() {
        decoratedPlayer.play();
    }

    public void addFieldingSkill(String skill) {
        decoratedPlayer.addFieldingSkill(skill);
    }

    public void field() {
        decoratedPlayer.field();
    }
}

class WicketKeeperDecorator extends SkillDecorator {
    public WicketKeeperDecorator(Player p) {
        super(p);
        p.addFieldingSkill("wicketkeeper");
    }
}

class SlipDecorator extends SkillDecorator {
    public SlipDecorator(Player p) {
        super(p);
        p.addFieldingSkill("slip");
    }
}

class GullyDecorator extends SkillDecorator {
    public GullyDecorator(Player p) {
        super(p);
        p.addFieldingSkill("gully");
    }
}

class CoverDecorator extends SkillDecorator {
    public CoverDecorator(Player p) {
        super(p);
        p.addFieldingSkill("cover");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players ");
        int n = sc.nextInt();

        ArrayList<Player> players = new ArrayList<Player>();

        PlayerFactory factory = new PlayerFactory();
        for (int i = 1; i <= n; i++) {

            System.out.print("Type of player " + i + ": ");
            String type = sc.next();
            Player p = factory.getPlayer(type);
            System.out.print("Fielding skills for player " + i + ": ");
            String[] skills = sc.next().split(",");

            for (String skill : skills) {
                if (skill.equals("wicketkeeper")) {
                    p = new WicketKeeperDecorator(p);
                }
                if (skill.equals("slip")) {
                    p = new SlipDecorator(p);
                }
                if (skill.equals("gully")) {
                    p = new GullyDecorator(p);
                }
                if (skill.equals("cover")) {
                    p = new CoverDecorator(p);
                }
            }
            players.add(p);
        }
        for (int i = 0; i < players.size(); i++) {
            System.out.println(String.format("Skills of players %d:", i + 1));
            players.get(i).field();
        }

        sc.close();

    }
}
