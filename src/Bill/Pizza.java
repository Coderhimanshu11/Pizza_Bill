package Bill;

public class Pizza {
    public int toppingPrice;
    public int cheesePrice;
    public int basePrice;
    public int paperBagPrice;
    public String bill;
    public int totalPrice;
    Boolean isCheeseAdded;
    Boolean isToppingAdded;
    Boolean isPaperBagAdded;
    Boolean isBillGenerated;

    public Pizza(Boolean isVeg) {
        if (isVeg) {
            basePrice = 300;
            toppingPrice = 70;

        } else {
            basePrice = 400;
            toppingPrice = 120;

            // paperBagPrice = 20;
        }
        cheesePrice = 80;
        paperBagPrice = 20;
        isCheeseAdded = false;
        isToppingAdded = false;
        isPaperBagAdded = false;
        isBillGenerated = false; // Initialize isBillGenerated here

        totalPrice = basePrice;
        bill = "Base price of the pizza: " + basePrice + "\n";
    }

    public int getPrice() {
        return totalPrice;
    }

    public void addExtraCheese() {
        if (!isCheeseAdded) {
            this.totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraTopping() {
        if (!isToppingAdded) {
            totalPrice += toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeAway() {
        if (!isPaperBagAdded) {
            totalPrice += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill() {
        if (!isBillGenerated) {
            if (isCheeseAdded) {
                bill += "Extra cheese added: " + cheesePrice + "\n";
            }
            if (isToppingAdded) {
                bill += "Extra topping added: " + toppingPrice + "\n";
            }
            if (isPaperBagAdded) {
                bill += "Paper bag added: " + paperBagPrice + "\n";
            }
            bill += "Total price: " + totalPrice + "\n";
            isBillGenerated = true;
        }
        return bill;
    }
}
