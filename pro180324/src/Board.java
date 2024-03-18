public class Board {

    private int size;

    public void setBoardSize(int size){
        this.size = size;
    }
    // creates a board for a graphical output
    public String createBoard(){
        String board = "    ";
        String myChar = "‖    ";
        String myMidChar = "    ⩴ ";
        for(int i = 0; i < size; i++){
            myChar += "‖    ";
        }
        for(int i = 1; i < size; i++){
            myMidChar += "  ⩴ ";
            if((i%4)==0){
                myMidChar += "   ⩴ ";
                i = 7;
            }
        }
        for(int i = 0; i < size; i++){
            board += i + "    ";
            if((i%3)==0){
                board += i + "     ";
                i=6;
            }
        }
        board += "\n";
        for(int i = 0; i < size; i++){
            board += myMidChar + "\n";
            board += i + " " + myChar + "\n";
        }
        return board + myMidChar;
    }

   // public String

}
