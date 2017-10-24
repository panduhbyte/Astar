import java.util.Random;

public class World {

    private int wSize, wSide, wBlocked, wRow, wCol;
    private Random rand;
    private char [][] wField;

    public World() {
        wSide = 15;
        wField = new char[wSide][wSide];
        wSize = wSide * wSide;
        wBlocked = 22;
    }

    public void makeBlocked(){

    }

    public boolean pathable(int row, int col){
        if(row >= 0 && row <= 14 && col >= 0 && col <= 14){
            if (wField == 0){ return true; }
            else return false;
        }
        else{ return false; }
    }

    public void  setTile(int row, int col, char ch){
        wField[row][col] = ch;
    }

    public void refreshField(){
        for(int r = 0; r < wSide; r++){
            for (int c = 0; c < wSide; c++){
                setTile(r,c,'#');
            }
        }
    }

}
