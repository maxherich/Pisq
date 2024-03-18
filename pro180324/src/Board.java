public class Board {

    private int size;

    public void setBoardSize(int size){
        this.size = size;
    }
    // creates a board for a graphical output
    public String createBoard(){
        String board = "     ";
        String myChar = "‖    ";
        String myMidChar = "     ⩴ ";
        for(int i = 0; i < size; i++){
            myChar += "‖    ";
        }
        for(int i = 1; i < size; i++){
            myMidChar += "  ⩴ ";
            if(((i+1)%4)==0 && i < size){
                myMidChar += "   ⩴ ";
                i += 1;
            }
        }
        for(int i = 1; i < size; i++){
            board += i + "    ";
            if((i%4)==0 && i < size){
                board += i+1 + "   ";
                i += 1;
            }
        }
        board += "\n";
        for(int i = 0; i < size; i++){
            board += myMidChar + "\n";
            board += i+1 + "  " + myChar + "\n";
        }
        return board + myMidChar;
    }

   // public String

}
