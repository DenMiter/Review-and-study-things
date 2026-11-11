package Exercism.WizardAndWarriorsInheritance;

public class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    public boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(Fighter warrior) {
        int damage;
        if (isVulnerable()) {
            damage = 6;
        } else {
            damage = 10;
        }
        return damage;
    }


}
