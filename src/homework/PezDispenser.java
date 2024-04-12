package homework;

public class PezDispenser {
    private String pezModel;

    private String color;

    private String modelSeries;

    private final int MAX_CANDIES = 12;
    private int currentCandies;

    public PezDispenser(String pezModel, String color, String modelSeries) {
        this.pezModel = pezModel;
        this.color = color;
        this.modelSeries = modelSeries;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "pezModel='" + pezModel + '\'' +
                ", color='" + color + '\'' +
                ", modelSeries='" + modelSeries + '\'' +
                '}';
    }

    public String getPezModel() {
        return pezModel;
    }

    public String getColor() {
        return color;
    }

    public String getModelSeries() {
        return modelSeries;
    }

    public int getCurrentCandies() {
        return currentCandies;
    }

    public void amam() {
        if (getCurrentCandies() <= 0) {
            System.out.println("Ne am am, konfet net");
        } else {
            System.out.println("Am am am am am");
            currentCandies--;
        }
    }
        public void zagruzka () {
            currentCandies = MAX_CANDIES;
            System.out.println("UHH vozna pojdet");
        }
public void poelPoOdnojCandie (int candiePoel){
        if (candiePoel>MAX_CANDIES){
            System.out.println("Pereborwil");
        } else {
            if (currentCandies - candiePoel <0 ){
                System.out.println("Candie no more");
            } else {
                currentCandies = currentCandies - candiePoel;
            }

        }
    }
    public void zagruzPoOdnojCandie (int candieZagruzil){
        if (candieZagruzil>MAX_CANDIES) {
            System.out.println("Sliwkom mnogo konfet");
        } else {
            if (candieZagruzil+currentCandies>MAX_CANDIES){
                System.out.println("Net mesta v Peze");
            } else {
                currentCandies = currentCandies + candieZagruzil;
            }
        }
    }
    }

