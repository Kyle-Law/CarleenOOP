
class Main {
    public static void main(String[] args){
        System.out.println("---Polymorphism---");

        InstrumentClass myInstrument = new InstrumentClass();
        Piano myPiano = new Piano();
        Saxophone mySaxophone = new Saxophone();
        myInstrument.plays();
        myPiano.plays();
        mySaxophone.plays();

        System.out.println("------");
        InstrumentClass inst = new Piano(); // Upcasting, parent class reference pointing to child object
        inst.plays();

        System.out.println("--- Encapsulation ---");
        Student id1 = new Student();
        id1.setId(1001);
        System.out.println("Student ID: " + id1.getId());

        System.out.println("--- Abstraction ---");
        Violin myViolin = new Violin();
        myViolin.play();
        myViolin.instrument();
    }
}