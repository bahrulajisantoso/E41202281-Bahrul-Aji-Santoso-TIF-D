package Tugas;

public class Tugas2ManagingPeople {

    public static void main(String[] args) {

        Tugas1Person p1 = new Tugas1Person("Arial", 37 );
        Tugas1Person p2 = new Tugas1Person("Joseph", 15);

        if (p1.getAge() == p2.getAge())
        {
            System.out.println(p1.getAge() +" is the same age as " + p2.getAge());
        } else {
            System.out.println(p1.getAge() +" is NOT the same as " + p2.getAge());
        }

    }
}
