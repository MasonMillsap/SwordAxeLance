package sample;

/**
 * Created by Mason Millsap on 2/17/2017.
 */
public class Fighter {
    private Integer hitpoints;
    private String name;
    private Weapon weapon;

    public Fighter() {
        this.hitpoints = 10;
        this.weapon = null;
    }

    public String getName() {return name;}
    public Integer getHP() {return hitpoints;}
    public Weapon getWeapon() {return weapon;}

    public void setName(String name) {this.name = name;}
    public void setHP(Integer hp) {this.hitpoints = hp;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    public void takeHit() {this.hitpoints -= 1;}

    public void battle(String opponentWeapon) {
    }

}

