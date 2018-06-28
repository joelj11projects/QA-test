package Pair;

public class Goldy {

    private int chairWeight;
    private int temp;
    private int goldyTemp;
    private int goldyWeight;

    public static void main(String[] args) {
      Goldy chair1 = new Goldy(270, 90, 100,120);
      System.out.println(chair1);
    }

    private Goldy(int chairWeight, int temp, int goldyWeight, int goldyTemp) {
        this.chairWeight = chairWeight;
        this.temp = temp;
        this.goldyTemp = goldyTemp;
        this.goldyWeight = goldyWeight;
    }
    public int getGoldyTemp() {
        return this.goldyTemp;
    }

    public int getGoldyWeight() {
        return this.goldyWeight;
    }
    public int getChairWeight() {
        return this.chairWeight;
    }

    public int getTemp() {
        return this.temp;
    }

    public void setChairWeight(int chairWeight) {
        this.chairWeight = chairWeight;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setGoldyTemp(int goldyTemp) {
        this.goldyTemp = goldyTemp;
    }

    public void setGoldyWeight(int goldyWeight) {
        this.goldyWeight = goldyWeight;


    }
    }


