public class Aims {
    public static void main(String args[]){
       
        Order anOrder = new Order();
        // add dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setCost(19.95f);
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);
        
        // add dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction ");
        dvd2.setDirector("Geogre Lucas");
        dvd2.setCost(24.95f);
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);


        // add dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setDirector("John Masker");
        dvd3.setCost(18.99f);
        dvd3.setLength(89);
        anOrder.addDigitalVideoDisc(dvd3);
        // anOrder.removeDigitalVideoDisc(dvd3);
        
        System.out.print("Total cost is:");
        System.out.print(anOrder.totalCost());
    }
}
