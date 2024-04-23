public class zoo {
    int averageAge=0;
    public void animalInfo(animal[] arr){
        System.out.println("The animals that belongs to the zoo:");

        for(int i=0; i < arr.length ; i++){
            System.out.println("Name: " +arr[i].getName()+ "\t" + "Age: " +arr[i].getAge() + "\t\t" + "Species: " +arr[i].getSpecies() + "\t" + arr[i].getName() +" says: " + arr[i].makeSound()); 
        }
    }

    public void avAge(animal[] arr){
        for(int i=0; i<arr.length; i++){
            averageAge+=arr[i].getAge();
        }
        System.out.println("Average age is: " +averageAge);
    }
    public static void main(String[] args){
        zoo zoo1 = new zoo();
        animal[] members = new animal[]{new cat(2,"Behlul"),new cow(10,"Danacik"),new dog(5,"Pascal")};

       zoo1.avAge(members);
       System.out.println("\n");
       zoo1.animalInfo(members);
    
    }
}
