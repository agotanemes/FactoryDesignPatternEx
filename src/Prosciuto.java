public class Prosciuto implements Pizza {

    boolean hasCheese;

    @Override
    public void createPizza() {
        System.out.println(" Prosciuto pizza, it has prodsciuto from italty");
        hasCheese = true;
    }

    public void hasCheese(){
        System.out.println("Has chees " + hasCheese);
    }


}
