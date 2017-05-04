import java.util.*;


public abstract class Animal {

  public String name;
  public String order;

  public String getName() { return name; }
  public String getOrder() { return order; }

  public abstract String cry();
  public void setName(String s){
    name = s;
  }
}

class Dog extends Animal {
  public String cry(){
    return "Bark!";
  }
}

class Cat extends Animal {
  public String cry(){
    return "Meow!";
  }
}


class AnimalShelter extends Animal {
  //This is a hack since Animal class is abstract and needs this defined
  public String cry(){
    return "";
  }

  ArrayList <Animal> animalList = new ArrayList <Animal> ();
// method that creates and adds animals to list
  public void addAnimal(String a){
    if(a.charAt(0) == 'd'){ // charAt used to get first character
      Dog doggo = new Dog();
      doggo.cry();
      doggo.setName("Dog");
      animalList.add(doggo);
    }
    if(a.charAt(0) == 'c'){
      Cat gatto = new Cat();
      gatto.cry();
      gatto.setName("Cat");
      animalList.add(gatto);
    }
  }
  // adopt either animal
  public void adopt(){
    if(animalList.size() == 0){
      System.out.println("Error: No Animals in List.");
    }
    animalList.remove(0);
  }
  // adopt cat
  public void adoptCat(){
    for(int i = 0; i < animalList.size(); i++){
      if(animalList.get(i).getName() == "Cat"){
        animalList.remove(i);
        break;
      }
    }
  }
  public void adoptDog(){
    for(int i = 0; i < animalList.size(); i++){
      if(animalList.get(i).getName() == "Dog"){
        animalList.remove(i);
        break;
      }
    }
  }

// prints remaining animals in list
  public void remainingAnimals(){
    if(animalList.size() == 0){
      System.out.println("Error: No Animals in List.");
    }
    else{
      for(int i = 0; i < animalList.size(); i++){
        System.out.println(animalList.get(i).getName() + " | "
        + "Order: " + i + " | " + animalList.get(i).cry());
      }
    }
  }

  // prints remaining cats
  public void remainingCats(){
    if(animalList.size() == 0){ // checks for empty list
      System.out.println("Error: No Animals in List.");
    }
    else{
      for(int i = 0; i < animalList.size(); i++){ // goes through list
        if(animalList.get(i).getName() == "Cat"){
          System.out.println(animalList.get(i).getName() + " | "
          + "Order: " + i + " | " + animalList.get(i).cry()); // prints cats
        }
      }
    }
  }
  // prints remaining dogs
  public void remainingDogs(){
    if(animalList.size() == 0){ // checks for empty list
      System.out.println("Error: No Animals in List.");
    }
    else{
      for(int i = 0; i < animalList.size(); i++){ // goes through list
        if(animalList.get(i).getName() == "Dog"){
          System.out.println(animalList.get(i).getName() + " | "
          + "Order: " + i + " | " + animalList.get(i).cry()); // prints dogs
        }
      }
    }
  }
}
