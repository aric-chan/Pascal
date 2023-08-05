//********************************************************************
//  triangle.java
//  Print up to the Nth line of Pascal’s Triangle
//********************************************************************
public class triangle {
    private int[] tri;
    //Constructor of triangle
    public triangle(int x) {

        for (int u = 0; u <= x; u++) {
            //create integer array to hold the line of Pascal Triangle
            tri = new int[x - u + 1];
            System.out.println("\n");
            for (int k = 0; k < tri.length; k++) {
                //print the element of the row of triangle
                tri[k] = value(x - u, k);
                System.out.println(tri[k]);
            }
        }
    }
    //Method of recursive algorithm for base case and other element of triangle
    public int value(int n, int d) {
        //base case
        if (d == 0 || n == d) {
            return 1;
        } else {
            return value(n - 1, d - 1) + value(n - 1, d);
        }
    }
}