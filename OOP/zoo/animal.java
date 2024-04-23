public abstract class animal {
    private String name;
    private int age;
    private String species;

    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public animal(int age,String name,String species){
        this.name=name;
        this.age=age;
        this.species=species;
    }

    public abstract String makeSound();
    
}
