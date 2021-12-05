import java.util.Scanner;

public class RPS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Rock\n2. Paper\n3. Scissor");
        int choise = input.nextInt();
        switch (choise){
            case 1:
                randomToRPS(randomChoice(), choise);
                break;
            case 2:
                randomToRPS(randomChoice(), choise);
                break;
            case 3:
                randomToRPS(randomChoice(), choise);
                break;
            default:
                System.out.println("Wrong number just 1 or 2 or 3");
        }
        //randomChoice();
    }
    public static int randomChoice(){
        int choice = (int)(Math.random() * (3-1))+1;
        return choice;
    }
    public static void randomToRPS(int x, int y){
        if(x == 1){
            String rps = "Paper";
            if(y == 1){
                System.out.println("Human: Rock");
                System.out.println("AI: Paper");
                System.out.println("You loose!");
            }
            if (y == 2){
                System.out.println("Human: Paper");
                System.out.println("AI: Paper");
                System.out.println("Draw");
            }
            if (y == 3){
                System.out.println("Human: Scissor");
                System.out.println("AI: Paper");
                System.out.println("You won!");
            }
        }
        if(x == 2){
            String rps = "Rock";
            if(y == 1){
                System.out.println("Human: Rock");
                System.out.println("AI: Rock");
                System.out.println("Draw");
            }
            if (y == 2){
                System.out.println("Human: Paper");
                System.out.println("AI: Rock");
                System.out.println("You won!");
            }
            if (y == 3){
                System.out.println("Human: Scissor");
                System.out.println("AI: Rock");
                System.out.println("You loose!");
            }
        }
        if(x == 3){
            String rps = "Scissor";
            if(y == 1){
                System.out.println("Human: Scissor");
                System.out.println("AI: Paper");
                System.out.println("You won!");
            }
            if (y == 2){
                System.out.println("Human: Scissor");
                System.out.println("AI: Rock");
                System.out.println("You loose!");
            }
            if (y == 3){
                System.out.println("Human: Scissor");
                System.out.println("AI: Scissor");
                System.out.println("Draw");
            }
        }
    }
}
