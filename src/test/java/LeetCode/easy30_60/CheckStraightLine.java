package LeetCode.easy30_60;
/**
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 * Input: coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}   Output: true
 * Input: coordinates ={{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}  Output: false
 * */

public class CheckStraightLine {


    public static boolean checkStraightLine(int[][] coordinates) {
        // Apr 1
     /*double slope = calculate(coordinates[0], coordinates[1]);
     for(int i=2;i<coordinates.length;i++){
         double value = calculate(coordinates[0], coordinates[i]);
         System.out.println(value);
         if(slope != value)
             return false;
     }
     return true;
    }

    private static double calculate(int[]p1, int[]p2){
        return ((p1[1]-p2[1]) * 1.0)/ ((p1[0]-p2[0]) * 1.0);*/

        // Apr 2
        for(int i=2;i<coordinates.length;i++){
            if((coordinates[1][1] - coordinates[0][1]) * (coordinates[i][0] - coordinates[0][0]) !=
                    (coordinates[1][0] - coordinates[0][0]) * (coordinates[i][1] - coordinates[0][1])){
                return false;
            }
        }
        return true;

    }

    public static void main(String[]args){
      int [][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};

         System.out.println(checkStraightLine(coordinates));
    }
}
