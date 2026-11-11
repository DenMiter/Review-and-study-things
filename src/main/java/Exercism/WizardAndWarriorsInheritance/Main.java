package Exercism.WizardAndWarriorsInheritance;

public class Main {

    public static void main(String[] args) {

//        Warrior warrior = new Warrior();
//        System.out.println(warrior);
//        System.out.println(warrior.isVulnerable());

//        Warrior warrior = new Warrior();
//        Wizard wizard = new Wizard();

//        System.out.println(warrior.getDamagePoints(wizard));

//        System.out.println(wizard);

//        Wizard wizard = new Wizard();
//        wizard.prepareSpell();
//        System.out.println(wizard.isVulnerable());

        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();

        wizard.prepareSpell();
        System.out.println(wizard.getDamagePoints(warrior));

    }

}
