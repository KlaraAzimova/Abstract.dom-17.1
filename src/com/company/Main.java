package com.company;

public class Main {

    public static void main(String[] args) {
        DomesticAnimal sheep = new Sheep(45, 1, 'M', "Pffa");
        DomesticAnimal sheep1 = new Sheep(50, 1, 'M', "Kara");
        DomesticAnimal sheep2 = new Sheep(15, 1, 'M', "Kozu");
        DomesticAnimal sheep3 = new Sheep(75, 1, 'M', "Chon");


        DomesticAnimal cow1 = new Cow(100, 5, 'j', "Burka");
        DomesticAnimal cow2 = new Cow(120, 4, 'm', "Pups");
        DomesticAnimal cow3 = new Cow(100, 5, 'm', "Mups");
        DomesticAnimal cow4 = new Cow(100, 5, 'j', "Wilk");
        DomesticAnimal cow5 = new Cow(100, 5, 'j', "Zita");
        DomesticAnimal cow6 = new Cow(80, 4, 'm', "Cow");


        DomesticAnimal horse = new Horse(300, 3, 'M', "Tulpar", "black");
        DomesticAnimal horse1 = new Horse(200, 3, 'M', "Kara-Jorgo", "kara");
        DomesticAnimal horse2 = new Horse(250, 3, 'M', "Kashka", "chernyi");


        DomesticAnimal[] domesticAnimal1s = {cow1, cow2, cow3, cow4, cow5, sheep, sheep1, sheep2, horse, horse1};
        DomesticAnimal[] domesticAnimals2 = {cow6, sheep3, horse2};

        Cow[] cows1 = new Cow[5];
        Sheep[] sheeps1 = new Sheep[3];
        Horse[] horses1 = new Horse[2];

        Cow[] cows2 = new Cow[1];
        Sheep[] sheeps2 = new Sheep[1];
        Horse[] horses2 = new Horse[1];


        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;

        for (DomesticAnimal i : domesticAnimal1s) {
            if (i instanceof Cow) {
                cows1[counter] = (Cow) i;
                counter++;
            }
            if (i instanceof Sheep) {
                sheeps1[counter1] = (Sheep) i;
                counter1++;
            }
            if (i instanceof Horse) {
                horses1[counter2] = (Horse) i;
                counter2++;
            }
        }

        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        for (DomesticAnimal j : domesticAnimals2) {
            if (j instanceof Cow) {
                cows2[counter3] = (Cow) j;
                counter3++;
            }
            if (j instanceof Sheep) {
                sheeps2[counter4] = (Sheep) j;
                counter4++;
            }
            if (j instanceof Horse) {
                horses2[counter5] = (Horse) j;
                counter5++;
            }
        }

        Farm farm1 = new Farm("Kara-Shoro", "Andrey", sheeps1, horses1, cows1);
        Farm farm2 = new Farm("Arashan", "Vladimir", sheeps2, horses2, cows2);

        System.out.println("Farm 1: " + farm1);
        System.out.println();
        System.out.println("Farm 2: " + farm2);


    }
}
