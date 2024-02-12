import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int topPointer = 6;
        int [] items = {55, 77,36,22,19,5,21};
        String input = "";
        String pointerSymbol = "    ";
        String arrowSymbol = "--->";
        int maxItems =7;

        while (input.equals("q")==false) {
            System.out.println("\nWELCOME TO THE STACK AST \n");
            System.out.println("Type V to view");
            System.out.println("PUSH to add item");
            System.out.println("POP to remove item");
            System.out.println("q to quit");

            Scanner inp = new Scanner (System.in);
            input = inp.nextLine();

            //input items
            if (input.equals("V")) {
                for (int i = maxItems - 1; i >= 0; i--) {
                    if (i == topPointer) {
                        System.out.println(arrowSymbol + items[i]);

                    } else {
                        System.out.println(pointerSymbol + items[i]);
                    }
                    System.out.println();

                }

            }  // end of view

                    //POP
                    if (input.equals("POP")){
                        if (topPointer ==0){
                            System.out.println("UNDERFLOW. \nStack empty. Can't remove anymore.");
                        }
                        else{
                            topPointer=topPointer-1;
                            System.out.println("Thank you, item popped.");
                        }

                    }  //end opf pop
                    if (input.equals("PUSH")){
                        if (topPointer==maxItems-1){
                            System.out.println("OVERFLOW.\nStack full. Can't add anymore.");}
                        else{
                            System.out.println("Please enter a whole number to PUSH onto the stack...");
                            input = inp.nextLine();
                            topPointer = topPointer +1;
                            items[topPointer]= Integer.parseInt(input);
                            System.out.println("Thank you, item added.");


                            }
                        } //end of push
                    }
                }  //end of main subroutine
            }  //end of Main class


