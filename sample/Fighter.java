
package sample;

/**
 * Created by Mason Millsap on 2/17/2017.
 */
public class Fighter {
    private Integer hitpoints;
    private String name;
    private Weapon weapon;
    private HashMap<String, Integer> stats;

    public Fighter() {
        this.hitpoints = 10;
        this.weapon = null;
        initializeStats();

    }
    
    private void initializeStats() {
        stats = new HashMap();
        stats.put("Attack", 0);
        stats.put("Defense", 0);
        stats.put("Vitality", 0);
        stats.put("Speed", 0);
    }

    public String toString() {
        String out = new String();
        out += "Name:" + name + ":";
        out += "HP:" + hitpoints.toString() + ":";
        out += "Attack:" + stats.get("Attack") + ":";
        out += "Defense:" + stats.get("Defense") + ":";
        out += "Vitality:" + stats.get("Vitality") + ":";
        out += "Speed:" + stats.get("Speed") + ":";
        return out;
    }
 

    public String getName() {return name;}
    public Integer getHP() {return hitpoints;}
    public Weapon getWeapon() {return weapon;}

    public void setName(String name) {this.name = name;}
    public void setHP(Integer hp) {this.hitpoints = hp;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}
    public void setStats(String stat, Integer value) {
    stats.replace(stat, value);
    }


    public void takeHit() {this.hitpoints -= 1;}

    public void battle(String opponentWeapon) {
    }

}

