package conditions;

public class Labeled_UnLabeled_Break {
    public static void main(String[] args) {


        int[][] table = {{1, 2, 3}, {25, 37, 49}, {55, 68, 93}};// 1 row, 3 columns
        int [][]table2 = { { 1, 15, 3 }, { 25, 15, 49 }, { 15, 68, 93 } };

        boolean found = false;
        int loopCycles = 0;

        outer:
        for (int[] rows : table) { // returns first column
            for (int row : rows) { // verifies the condition with each value in a column
                loopCycles++; // in this execution it breaks at loopcycle 5
                if (row == 37) {
                    found = true;
                    break  outer;
                }
            }
        }
        System.out.println(found);
        outer:
        for (int[] rows : table2) { // returns first column in table2
            for (int row : rows) { // verifies the condition with each value in a column untill the condition is true then continues with next column
                loopCycles++; // in this execution it breaks at loopcycle 2 for first & second columns,
                if (row == 15) {
                    found = true;
                    continue   outer;
                }
            }
        }
        System.out.println(found);



    }
}
