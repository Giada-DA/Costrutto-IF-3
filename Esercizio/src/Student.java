import java.util.Random;

public class Student {
    public String name;
    public int age;
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void guessingAge(){
        Random random = new Random();
        int numero = random.nextInt(35);
        System.out.printf("I generated the random number %d for student %s %n", numero, name);

        if(numero<this.age){
            System.out.println("The number is smaller than the age");
        }else if(numero>this.age){
            System.out.println("The number is greater than the age");
        }else System.out.println("You guessed!");
    }
}
