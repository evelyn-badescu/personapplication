class Person {
    String name;
    int age;
    boolean married ;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isMarried(){
        return married;

    }
}