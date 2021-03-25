package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person();
	person1.setFirstName("Piotr");
	person1.setLastName("Mazur");
	person1.setAge(27);
        System.out.println(person1.isTeen());
        System.out.println(person1.getFullName());
    }
}
