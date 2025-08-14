import java.util.Arrays;
import java.util.Scanner;

class cwh8{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] inputs = new int[5];
        // for(int i = 0;i<5;i++){
        //     System.out.println("enter any input");
        //     String input = s.nextLine();
        //     int intInput = Integer.parseInt(input);
        //     inputs[i] = intInput;
        // }
        
        int i =0;
        while(s.hasNextLine()){
            System.out.println("enter any input");
            String input = s.nextLine();
            try {
                int intInput = Integer.parseInt(input);
                inputs[i] = intInput;
                i++;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Something went wrong : "+ e);
            }

            if(i==5j){
                break;
            }
        }
        
        System.out.println(Arrays.toString(inputs));
    }
}
