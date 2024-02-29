import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> actions;

    
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;

    }

public void displayMenu(){
    	for(String action: actions){
    		System.out.println(action);
    	}

    }
public String getAction(){
    System.out.println("Type a number to choose an action");
    for(String action: actions){
        System.out.println(action);
    }
    String choice = scanner.nextLine();
    return choice;
    }


}
