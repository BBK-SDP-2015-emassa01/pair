package connect4.userTest

import connect4.scala._


object TesterClass extends App{
  
  /***
   * Started testing makemove
   */
  //Tests makeMove method works! Yep!
  val b = new Board()
  b.makeMove(new Move(RED, 6))
  b.makeMove(new Move(YELLOW, 6))
  b.makeMove(new Move(RED, 6))
  b.makeMove(new Move(YELLOW, 6))
  //  b.makeMove(new Move(RED, 6))
  //  b.makeMove(new Move(YELLOW, 6))

//  val moves = b.getPossibleMoves(YELLOW)
//  println(moves.deep.mkString("\n"))


  val tempState = new State(RED, b, null)
  tempState.initializeChildren()

  println(tempState)

  // b.makeMove(new Move(YELLOW, 4))
  // b.makeMove(new Move(YELLOW, 4))
//  b.makeMove(new Move(YELLOW, 4))

  //b.makeMove(new Move(RED, 5))
  //val lastMove = new Move(RED, 6)
  //b.makeMove(lastMove)
//  val state = new State(b.getPlayer(5, 4), b,move)

  /***
   * Started testing testing initialiseChildren
   */
//  state.initializeChildren()
//  println("Length of children:" + state.children.length)
//  println("Level 0-Child elements: ")
//  for(child<-state.children) {
//
//    println("Child player:" + child.player)
//    println("Child board" + "\n" + child.board)
//    println("Child last move: " + child.lastMove)
//  }
//    state.children(0).initializeChildren()
//    println("Level 1-Child elements: ")
//    for(child2<-state.children(0).children){
//      println("Child player:"+child2.player)
//      println("Child board"+"\n"+child2.board)
//      println("Child last move: "+child2.lastMove)
//  }

 // println(b)
  
//  b.makeMove(new Move(RED, 4))
//  b.makeMove(new Move(RED, 4))
//  b.makeMove(new Move(RED, 4))
//  b.makeMove(new Move(YELLOW, 3))
//  b.makeMove(new Move(RED, 5))
 // println(b.toString())
 // println("hasConnectFour: "+b.hasConnectFour()) //returns colour of player
 // println("Length of poss moves: "+b.getPossibleMoves(YELLOW).length)
 // b.getPossibleMoves(YELLOW).foreach(println)
  
  /* Testing the moves that have been made persist on the board once players are instantiated
  *  checked that even if a player is put into column 3 or 4 (where moves have been made 
  *  already that this is not over-ridden in the GUI.
  */
  //  val p1 = new Human(RED)
  //  val p2 = new Human(YELLOW)
  //
  
//  println("final board looks like...")
//  println(b.toString());

  //var lastMove = new Move(RED, 4)

  //  var tempState = new State(YELLOW, b, null) //is this parameter move correct?? can it be a val? Doesn't get used in createGameTree, could it be for println?

  /***
   * Started testing createGameTree
   */
//  AI.createGameTree(tempState, 1) //depth of the tree includes the root?
  //  val ai = new AI(RED, 3)
  //  AI.minimax(ai, tempState)
  //
  //  var tempChildren = tempState.children
  ////  println("Parent of Temp State!")
  //  println(tempState)
//  println("Children of temp state: ")
//  for(c<-tempChildren){println(c)}
//
//  tempState.writeToFile() //Could also put this line of code inside the recursive method.
  
//  val game= new Game(p1, p2, b, true)
  //we realised that the game constructor with the 4th parameter set to 'false' does not work just yet
//  game.setGUI(new GUI(game, Board.NUM_COLS, Board.NUM_ROWS));
 // game.runGame()
 // println(b.toString())
  
  
  /***
   * Started testing minimax
   */
  //val ai = new AI(YELLOW, 2)
//  tempState.initializeChildren()
//  for (child <- tempState.children) {
//    ai.evaluateBoard(child.board)
//    println(child.board)
//    println("Child value: " + child.value)
//  }
//  val arr: Array[State] = tempState.children

  //println(AI.min(arr))
  //println(AI.max(arr))

  // AI.createGameTree(tempState, 2)
  //AI.minimax(ai, tempState)
//    for (child <- tempState.children) {
//    println(child.board)
//    println("Child value: " + child.value)
//  }
  // tempState.writeToFile()
//  
  
  /***
   * Started testing getMoves
   */
  
//    AI.createGameTree(tempState, 3)
  //   ai.getMoves(b)


  
}

