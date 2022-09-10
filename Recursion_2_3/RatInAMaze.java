package Recursion_2_3;

public class RatInAMaze {

    public static boolean solveMaze(int[][] maze,int startI,int startJ,int endI,int endJ, int[][] path,int n){
        if(startI<0 || startJ<0 || startI>n-1 || startJ>n-1 ||
                endI<0 || endJ<0 || endI>n-1 || endJ>n-1 ||
                maze[startI][startJ]==0 || path[startI][startJ]==1){
            return false;
        }
        path[startI][startJ]=1;
        if(startI==endI && startJ==endJ){
            for(int[] arr: path){
                for(int i: arr){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println();
            return true;
        }
        if(solveMaze(maze, startI-1, startJ, endI, endJ, path, n)){
            return true;
        }
        if(solveMaze(maze, startI, startJ+1, endI, endJ, path, n)){
            return true;
        }
        if(solveMaze(maze, startI+1, startJ, endI, endJ, path, n)){
            return true;
        }
        if(solveMaze(maze, startI, startJ-1, endI, endJ, path, n)){
            return true;
        }
        path[startI][startJ]=0;
        return false;
    }

    public static void main(String[] args) {
        int[][] maze={{1,1,0},
                      {1,1,0},
                      {1,1,1}
        };
        int[][] path={{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(solveMaze(maze,0,0,2,2,path,3));
    }
}
