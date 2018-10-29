import java.util.*;

public class AIAgent{
  Random rand;

  public AIAgent(){
    rand = new Random();
  }

/*
  The method randomMove takes as input a stack of potential moves that the AI agent
  can make. The agent uses a rondom number generator to randomly select a move from
  the inputted Stack and returns this to the calling agent.
*/

  public Move randomMove(Stack possibilities){

    int moveID = rand.nextInt(possibilities.size());
    System.out.println("Agent randomly selected move : "+moveID);
    for(int i=1;i < (possibilities.size()-(moveID));i++){
      possibilities.pop();
    }
    Move selectedMove = (Move)possibilities.pop();
    return selectedMove;
  }

  /**
   * This strategy doesnt care about what happens once the move is made...
   * this could mean the ai agent could take a piece even doe the player will immediatly gain some advantage.
   * 
   * example
   * The AI agent takes a pawn with his queen and in response to this the player takes the queen(AI agents queen) with another pawn
   * 
   * AI after making the move is up one point as the pawn is worth 1
   * however the Queen has a value of 9 points and when the player takes the AI agents queen it is down eight points
   * 
   * pawn-1
   * knight/bishop - 3
   * rook- 5
   * queen - 9 
   * king-the game
   * 
   * get all possible moves just like above with the random agent and apply utility function to work out which move to make. 
   */
  public Move nextBestMove(Stack possibilities){
    Move selectedMove = new Move();
    return selectedMove;
  }

  /**
   * This agent extends the function of the move above this agent looks ahead and tries to determine what the player is going to do next 
   * 
   * sounds familiar.... this is just like a min-max algo 
   * 
   * we know how to get the possible movement of all the pieces as we need this functionality for making random moves. we now need to be able to 
   * caputre the potential movemenets of the players pieces exactly as we did for the white pieces. Once we have this stack of movemenets 
   * we need a utitliy function to be able to calculate the value of the movements and then estimate which movement the player will make and then
   * the agent responds to this movement. 
   * 
   * Random moves ==> get all possible movements for white 
   * --> select a random move 
   * --> next best move 
   *
   * NextBestmove ==> get all possible movements for white
   * --> create a utility function based on the current move... this could mean if we take a piece we score some points
   * --> loop through the stack of movements and check if we are taking a piece and if so make this movement. 
   * 
   * twoLevelsDeep ==> get all possible movements for white
   * (stack)
   * then for each of these movements we find best possible response for the player
   * --> get all possible movements(stack) for black after the board changes for each of the movements for white 
    --> rank these according to a utility function 
    --> the agent makes the best possible that it can make with the least best response from the player.

    all done
   */
  public Move twoLevelsDeep(Stack possibilities){
    Move selectedMove = new Move();
    return selectedMove;
  }
}
