public class Board {

    private int size;


    public void setBoardSize(int size){
        this.size = size;
    }
    // creates a board for a graphical output
    public String createBoard(){
        String board = "";
        String myChar = "‖    ";
        String myMidChar = "  ⩴ ";
        for(int i = 0; i < size; i++){
            myChar += "‖    ";
        }
        for(int i = 1; i < size; i++){
            myMidChar += "  ⩴ ";
        }
        for(int i = 0; i < size;i++){
            board += myMidChar + "\n";
            board += myChar + "\n";
        }
        return board + myMidChar;
    }

}
