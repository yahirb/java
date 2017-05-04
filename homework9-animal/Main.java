import java.util.Scanner;
public abstract class Main extends Animal {
  //Cheats
  public String cry(){
    return "";
  }

  public static void main(String[] args) {

    AnimalShelter as = new AnimalShelter(); // creates new shelter object
    for (String parameter: args){ // goes through each inputted animal "c" "d"
      as.addAnimal(parameter);
    }
    boolean quit = false;
    // while loop runs interface until quit = true
    while(quit == false){
      //create a scanner so we can read the command-line input
      Scanner scanner = new Scanner(System.in);
      // Option Menu
      System.out.println("1: Add new animal");
      System.out.println("2: Adopt an animal");
      System.out.println("3: Adopt a cat");
      System.out.println("4: Adopt a dog ");
      System.out.println("5: Show anaimals in the shelter ");
      System.out.println("6: Show cats in the shelter ");
      System.out.println("7: Show dogs in the shelter ");
      System.out.println("0: Exit");
      // prompt for number choice
      System.out.print("Enter a number: ");
      // get choice as an int
      int choice = scanner.nextInt();
      switch (choice) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.print("input first animal character followed by name: ");
          String animalInput = scanner.next();
          as.addAnimal(animalInput);
          break;
        case 2:
          System.out.println("You adopted an animal!");
          as.adopt();
          break;
        case 3:
          System.out.println("You adopted a cat!");
          as.adoptCat();
          break;
        case 4:
          System.out.println("You adopted an dog!");
          as.adoptDog();
          break;
        case 5:
          as.remainingAnimals();
          break;
        case 6:
          as.remainingCats();
          break;
        case 7:
          as.remainingDogs();
          break;
        default:
          break;
        }
      }
      System.out.println(" ");

  }
}
