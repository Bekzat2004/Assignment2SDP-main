package OldSystem;

public class BasicOldBurger implements oldBurger {
    @Override
    public String getDescriptionOfOldBurger() {
        return "Base for Black burger";
    }

    @Override
    public double getCostOfOldBurger() {
        return 1000;
    }
}
