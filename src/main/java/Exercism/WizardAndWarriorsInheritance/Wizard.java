package Exercism.WizardAndWarriorsInheritance;

public class Wizard extends Fighter {

    private boolean isSpellPrepared;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        isSpellPrepared = true;
    }

    public boolean isVulnerable() {
        return !isSpellPrepared;
    }

    public int getDamagePoints(Fighter wizard) {
        int damage;
        if (isSpellPrepared) {
            damage = 12;
        } else {
            damage = 3;
        }
        return damage;
    }

}
