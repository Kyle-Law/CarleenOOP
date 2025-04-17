//Inheritance-inherit attributes and methods from other classes
public class Woodwind {
    String family = "Woodwind instrument";
    public void playby() {
        System.out.println("It is played by mouth.");
    }
}

class Flute extends Woodwind {
    String name = "Flute";
     public static void main(String[] args) {
        Flute instrument = new Flute();
        System.out.println(instrument.name + " is a " + instrument.family + ".");
        instrument.playby();
    }
}
