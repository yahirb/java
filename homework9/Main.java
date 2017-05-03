public abstract class Main extends Animal {
  //Cheats
  public String cry(){
    return "";
  }

  public static void main(String[] args) {

    AnimalShelter as = new AnimalShelter();
    for (String parameter: args){ // goes through each inputted animal "c" "d"
      as.addAnimal(parameter);
    }

    as.remainingAnimals();
  }
}
