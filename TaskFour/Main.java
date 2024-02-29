import java.util.ArrayList;

class Main {
    
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("0) Start game");
        actions.add("1) Resume game");
        actions.add("2) Pause game");
        actions.add("3) End game");

        GameMenu gm = new GameMenu(actions);

     
        String choice = gm.getAction();

        int action = Integer.parseInt(choice);
        doAction(action);
    }

    public static void doAction(int action) {
        switch (action) {
            case 0:
                System.out.println("Starting the game...");
                break;
            case 1:
                System.out.println("Resuming the game...");
                break;
            case 2:
                System.out.println("Pausing the game...");
                break;
            case 3:
                System.out.println("Ending the game...");
                break;
            default:
                System.out.println("Invalid action!");
                break;
        }
    }
}
