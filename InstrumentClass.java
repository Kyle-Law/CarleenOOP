//Polymorphism-many forms
public class InstrumentClass {
    public void plays(){
        System.out.println("Instrument plays sounds.");
    }
}

class Piano extends InstrumentClass{
    public void plays(){
        System.out.println("Piano is an instrument played by hands.");
    }
}

class Saxophone extends InstrumentClass{
    public void plays() {
        System.out.println("Saxophone is an instrument played by mouth.");
    }
}

class Main {
    public static void main(String[] args){
        InstrumentClass myInstrument = new InstrumentClass();
        Piano myPiano = new Piano();
        Saxophone mySaxophone = new Saxophone();
        myInstrument.plays();
        myPiano.plays();
        mySaxophone.plays();
    }
}
