package software.ulpgc.kata6;

import static java.util.Arrays.fill;

public class Field {
    public static char mine = 'x';
    public static char unselected = '.';
    private char[][] state;
    private char[][] display;

    public Field(char[][] state) {
        this.state = state;
        this.display = new char[state.length][state[0].length];
        clearDisplay();
    }

    private void clearDisplay() {
        for (int i = 0 ; i<state.length;i++){
            fill(display[i], unselected);
        }
    }

    public String displayToString(){
        String result = "";
        for(char[] i : display){
            for(char j : i){
                result += j;
            }
            result+="\n";
        }
        return result;
    }

    public String play(int x, int y){
        if(!validCoords(x,y)) {return "Illegal Move\n";}
        checkForMines(x,y);
        return displayToString();
    }

    private void checkForMines(int x, int y) {
        display[y][x] = (state[y][x]==mine) ?  'x' : '0';
    }

    private boolean validCoords(int x, int y) {
        return (x>=0 && x<=state[0].length-1 && y>=0 && y<=state.length-1);
    }

}
