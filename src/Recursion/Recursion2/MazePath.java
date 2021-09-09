package Recursion.Recursion2;

public class MazePath {
    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "" );
    }

    /*
    * cr ---> current row
    * cc ---> current column
    * er ---> end row
    * ec ---> end column
    */
    public static void mazePath(int cr, int cc, int er, int ec, String ans) {
        //+ base case
        if(cr == er && cc == ec){
            System.out.println(ans);
            return;
        }

        //- base case
        if(cr > er || cc > ec)
            return;

        mazePath(cr + 1, cc, er, ec, ans + 'H');
        mazePath(cr, cc + 1, er, ec, ans + 'V');
    }

    //Move the direction horizontally, vertically, and Diagonally
    public static void mazePathWithDiagonal(int cr, int cc, int er, int ec, String ans) {
        //+ base case
        if(cr == er && cc == ec){
            System.out.println(ans);
            return;
        }

        //- base case
        if(cr > er || cc > ec)
            return;

        mazePathWithDiagonal(cr + 1, cc, er, ec, ans + 'H');
        mazePathWithDiagonal(cr, cc + 1, er, ec, ans + 'V');
        mazePathWithDiagonal(cr + 1, cc + 1, er, ec, ans + 'D');
    }
}
