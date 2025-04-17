
class Main {
    public static void main(String[] args){
        InstrumentClass myInstrument = new InstrumentClass();
        Piano myPiano = new Piano();
        Saxophone mySaxophone = new Saxophone();
        myInstrument.plays();
        myPiano.plays();
        mySaxophone.plays();

        Student id1 = new Student();
        id1.setId(1001);
        System.out.println("Student ID: " + id1.getId());

        Violin myViolin = new Violin();
        myViolin.play();
        myViolin.instrument();
    }
}