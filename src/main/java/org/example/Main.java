package org.example;

public class Main {

        //Kad sam vodio DnD, hteo sam za igrace da napravim kod koji ce automatski da rolluje statove
        public static void main(String[] args) {

            //Prvo sam napravio varijable za statove
            int strength = 0;
            int dexterity = 0;
            int constitution = 0;
            int intelligence = 0;
            int wisdom = 0;
            int charisma = 0;
            // zatim placeholder varijablu
            double a;

            //Petlja koja ce da rolluje statove dok se uslov ne ispuni
            for (int i = 0; i < 10; ) {
                a = Math.random() * 19;
                strength = (int) a;
                a = Math.random() * 19;
                dexterity = (int) a;

                a = Math.random() * 19;
                constitution = (int) a;

                a = Math.random() * 19;
                intelligence = (int) a;
                a = Math.random() * 19;
                wisdom = (int) a;
                a = Math.random() * 19;
                charisma = (int) a;
                a = strength + dexterity + constitution + intelligence + wisdom + charisma;
                //Zelim da likovi budu izbalansirani, zato ce zbir svih statova da bude tacno 75
                if (a == 75) {
                    break;

                }
            }
            //Eureka, zadnji korak!
            System.out.println("STR: " + strength);
            System.out.println("DEX: " + dexterity);
            System.out.println("CON: " + constitution);
            System.out.println("INT: " + intelligence);
            System.out.println("WIS: " + wisdom);
            System.out.println("CHA: " + charisma);


        }

    }
