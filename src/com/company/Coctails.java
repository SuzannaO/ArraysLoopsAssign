package com.company;
public class Coctails {


    public enum IngredientUnit {
        GIN(85), TONIC_WATER(20), GREEN_STUFF(10), RUM(65), GRENADINE(10), LIME_JUICE(10);

        public int price;

        IngredientUnit(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static int priceGT() {
        return IngredientUnit.GIN.getPrice() + IngredientUnit.TONIC_WATER.getPrice() + IngredientUnit.GREEN_STUFF.getPrice();

    }

    public static int priceBacardiSpecial() {
        return IngredientUnit.GIN.getPrice() + IngredientUnit.RUM.getPrice() + IngredientUnit.GRENADINE.getPrice() + IngredientUnit.LIME_JUICE.getPrice();
    }

    public enum CoctailsPrice {
        GT(priceGT()), BACARDI_SPECIAL(priceBacardiSpecial());

        public int price;

        CoctailsPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}