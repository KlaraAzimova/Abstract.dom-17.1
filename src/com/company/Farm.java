package com.company;

import java.util.Arrays;

public class Farm {
    private String adress;
    private String ownerName;
    private Sheep[] Sheep;
    private Horse[] horses;
    private Cow[] cows;

    public Farm() {
    }

    public Farm(String adress, String ownerName, com.company.Sheep[] sheep, Horse[] horses, Cow[] cows) {
        this.adress = adress;
        this.ownerName = ownerName;
        Sheep = sheep;
        this.horses = horses;
        this.cows = cows;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public com.company.Sheep[] getSheep() {
        return Sheep;
    }

    public void setSheep(com.company.Sheep[] sheep) {
        Sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    @Override
    public String toString() {
        return "\nFarm: " +
                " adress - " + adress +
                " ownerName - " + ownerName + '\n' +
                " Sheep - " + Arrays.toString(Sheep) + '\n' +
                " horses - " + Arrays.toString(horses) + '\n' +
                " cows - " + Arrays.toString(cows);

    }
}

