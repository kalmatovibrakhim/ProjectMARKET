package market.sklad;

import market.product.Product;

import java.util.ArrayList;

public class Sklad {
    private ArrayList<Product> sklad;
    private ArrayList<Product> kunVitrina;

    public Sklad() {
    }

    public Sklad(ArrayList<Product> sklad) {
        this.sklad = sklad;
    }

    public ArrayList<Product> getSklad() {
        return sklad;
    }

    public ArrayList<Product> getKunVitrina() {
        return kunVitrina;
    }

    @Override
    public String toString() {
        return "Sklad{" +
                "sklad=" + sklad +
                ", AksiaVitrina=" + kunVitrina +
                '}';
    }
}