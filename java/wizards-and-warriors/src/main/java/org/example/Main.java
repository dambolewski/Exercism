package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    abstract static class Fighter {

        boolean isVulnerable() {
            return false;
        }

        abstract int damagePoints(Fighter fighter);


    }

    static class Warrior extends Fighter {

        @Override
        public String toString() {
            return "Fighter is a Warrior";
        }

        @Override
        int damagePoints(Fighter wizard) {
            if (wizard.isVulnerable())
                return 10;
            else return 6;
        }
    }

    static class Wizard extends Fighter {

        @Override
        public String toString() {
            return "Fighter is a Wizard";
        }

        boolean prepared = false;

        @Override
        boolean isVulnerable() {
            return !prepared;
        }

        @Override
        int damagePoints(Fighter warrior) {
            if (prepared)
                return 12;
            else
                return 3;
        }

        void prepareSpell() {
            prepared = true;
        }

    }

}

