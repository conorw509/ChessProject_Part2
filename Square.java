class Square{
  public int xCoor;
  public int yCoor;
  public String pieceName; 

  ///this class allows us to create  square pass in the x and y cordinates and the name of the piece and then we can retrieve them from the square
  //also get the name of a string if there is a strng piece present on the square. 
  public Square(int x, int y, String name){
    xCoor = x;
    yCoor = y;
    pieceName = name;
  }

  public Square(int x, int y){
    xCoor = x;
    yCoor = y;
    pieceName = "";
  }

  public int getXC(){
    return xCoor;
  }

  public int getYC(){
    return yCoor;
  }

  public String getName(){
      return pieceName;
  }
}

//this is an object that can reprsent the squares on the board 
