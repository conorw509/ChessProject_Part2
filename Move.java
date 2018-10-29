class Move{
  Square start;
  Square landing;

  //move extends square a move takes in two diff squares
  /** 
   * if you extend the class move to include the evalutation of the move.. the output of the utility 
   * function you wont neeed to create an additional data structure for keeping track of scores 
   * for each of the movements. 
   */
  public Move(Square x, Square y){
    start = x;
    landing = y;
  }

  public Move(){
    
  }

  public Square getStart(){
    return start;
  }

  public Square getLanding(){
    return landing;
  }
}
