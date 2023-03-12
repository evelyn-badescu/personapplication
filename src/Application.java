public class Application {
    public static void main(String[] args) {

        Person firstperson = new Person("Maria",12);
        System.out.println("First person's name is "+firstperson.getName()+" and the age is "+firstperson.getAge());
        firstperson.married=true;
        System.out.println(firstperson.name+"'s marital status is "+firstperson.isMarried());


        Person secondperson = new Person("Octavian",22);
        System.out.println("Second person's name is "+secondperson.getName()+" and the age is "+secondperson.getAge());
        secondperson.married=false;
        System.out.println(secondperson.name+"'s marital status is "+secondperson.isMarried());


        Person thirdperson = new Person("Radu",32);
        System.out.println("Third person's name is "+thirdperson.getName()+" and the age is "+thirdperson.getAge());
        thirdperson.married=true;
        System.out.println(thirdperson.name+"'s marital status is "+thirdperson.isMarried());





    }
}

