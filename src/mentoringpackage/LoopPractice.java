package mentoringpackage;

public class LoopPractice {

    //create main method
    //psvm is a shortcut to create this main method
    public static void main(String[] args) {

        //for loop -- increment
        //for(int i=0;i<10;i++) {
        //System.out.println("Missed Call"+i);


        //for loop -- decrement
        //for(int i=0;i>-5;i--) {
        // System.out.println("Incoming Call" + i);


        for (int i = 0; i < 10; i++) {
            System.out.println("Missed Call" + i);

            for (int j = 0; j < 2; j++) {
                System.out.println("Incoming Call" + i);
            }


        }
    }
}
