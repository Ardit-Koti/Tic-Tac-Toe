public class Board {
    private String[][] spots;
    public static final String X = "X";
    public static final String O = "O";

    public Board(){
        spots = new String[3][3];
        for(int i =0;i<spots.length; i++){
            for(int a=0; a<spots.length; a++){
                spots[a][i] = " ";
            }
        }
    }

    private void win(String p){
        System.out.println("The " + p +  " player wins! Congratulations!");
    }
    public void setSpot(int row, int column, Boolean turn){
        if(turn){
            this.spots[row][column] = X;
        }
        else{
            this.spots[row][column] = O;
        }
    }

    public Boolean goalTest(String p){
        if(spots[0][0].equals(p) && spots[0][1].equals(p) && spots[0][2].equals(p)){
            win(p);
            return true;
        }
        else if (spots[1][0].equals(p) && spots[1][1].equals(p) && spots[1][2].equals(p)){
            win(p);
            return true;
        }
        else if (spots[2][0].equals(p) && spots[2][1].equals(p) && spots[2][2].equals(p)){
            win(p);
            return true;
        }
        else if(spots[0][0].equals(p) && spots[1][0].equals(p) && spots[2][0].equals(p)){
            win(p);
            return true;
        }
        else if(spots[0][1].equals(p) && spots[1][1].equals(p) && spots[2][1].equals(p)){
            win(p);
            return true;
        }
        else if(spots[0][2].equals(p) && spots[1][2].equals(p) && spots[2][2].equals(p)){
            win(p);
            return true;
        }
        else if(spots[0][0].equals(p) && spots[1][1].equals(p) && spots[2][2].equals(p)){
            win(p);
            return true;
        }
        else if(spots[2][0].equals(p) && spots[1][1].equals(p) && spots[0][2].equals(p)){
            win(p);
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return " | " + spots[0][0] + " | " + spots[0][1] + " | " + spots[0][2]
                + " |\n | "+ spots[1][0] + " | " + spots[1][1] + " | " +
                spots[1][2] + " |\n | " + spots[2][0] + " | " + spots[2][1] +
                " | " + spots[2][2] + " |\n";
    }
}
