//Encapsulation-hide sensitive info
public class Student {
    private int student_id;

    public int getId() {
        return student_id;
    }

    public void setId (int newId){
        this.student_id = newId;
    }
}

class Main {
    public static void main(String[] args){
        Student id1 = new Student();
        id1.setId(1001);
        System.out.println("Student ID: " + id1.getId());
    }
}

