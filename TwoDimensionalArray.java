
package Array;



public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][]nums= new int[2][3];
        nums[0][0]= 20;
        nums[0][1]= 10;
        nums[0][2]= 30;
        nums[1][0]= 40;
        nums[1][1]= 50;
        nums[1][2]= 10;
//        System.out.println(" "+nums[0][0]+"\n "+nums[0][1]+"\n "+nums[0][2]+"\n "+nums[1][1]+"\n "+nums[1][2]+"\n "+nums[1][2]);
//   


        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+nums[row][col]);
                
            }
            System.out.println("");
            
        }

    }
}
