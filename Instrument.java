//Abstraction-displays essential info
abstract class Instrument {
    public abstract void instrument();
    public void play(){
        System.out.println("Instrument plays music.");
    }
}
class Violin extends Instrument {
    public void instrument(){
        System.out.println("Violin : String instrument");
    }
}

class Main {
    public static void main(String[] args){
        Violin myViolin = new Violin();
        myViolin.play();
        myViolin.instrument();
    }
}