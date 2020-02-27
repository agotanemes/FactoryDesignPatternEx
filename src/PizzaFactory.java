public class PizzaFactory {

    public Pizza createPizza(String type) throws Exception {
        switch (type) {
            case "prosciuto":
                Prosciuto prosciuto = new Prosciuto();
                prosciuto.createPizza();
                return prosciuto;
            case "pepperoni":
                PeperoniPizza peperoniPizza = new PeperoniPizza();
                peperoniPizza.createPizza();
                return peperoniPizza;
            case "quatrofromagi":
                QuatroFromagi quatroFromagi = new QuatroFromagi();
                quatroFromagi.createPizza();
                return  quatroFromagi ;

            default: throw new Exception("The pizza selected is not in our offer");
        }
    }
}
