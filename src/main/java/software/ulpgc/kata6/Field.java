package software.ulpgc.kata6;

import static java.util.Arrays.fill;

public class Field {
    private static final char mine = 'x';
    private char[][] state;
    private char[][] display;

    public Field(char[][] state) {
        this.state = state;
        this.display = new char[state.length][state[0].length];
        blankDisplay();
    }

    private void blankDisplay() {
        for(int i = 0; i < state.length;i++){
            fill(display[i], '.');
        }
    }

    public String show(){
        String result = "";
        for(char[] i : display){
            for (char c : i){
                result+=c;
            }
            result+="\n";
        }
        return result;
    }

    public String play(int x,int y){
        if(!validCoords(x,y)) {return "Jugada x=" + x + ",y=" + y + " no válida\n";}
        if(state[y][x]==mine) {display[y][x] = 'x'; return show();}
        int result = 0;
        if(y>0) result += countLine(x,y-1);
        result+=countLine(x,y);
        if(y<state.length-1) result += countLine(x,y+1);

        display[y][x] = (char) (result+48);
        return show();
    }

    private int countLine(int x, int y) {
        int result = 0;
        for(int i = Math.max(x-1, 0); i<=Math.min(x,state[0].length);i++){
            if(state[y][i]==mine){result ++;}
        }
        return result;
    }

    private boolean validCoords(int x, int y) {
        return (x >= 0 && x <= state[0].length - 1) && (y >= 0 && y < state.length);
    }


}
