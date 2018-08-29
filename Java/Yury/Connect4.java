    import java.util.Scanner;
public class Connect4
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
            
        // initialize array
          char [][] Grid = new char [6][7];
          for(int i= 0 ; i < Grid.length; i++)
          {
           for (int j = 0; j < Grid[i].length; j++)
            {Grid[i][j] = ' ';
           }
          }
              
        //ask if two players are ready
       System.out.println("Are the 2 playes ready to play connect four? If yes, type Y. If no, type N.");
       String playersReady = scanner.nextLine();
            
          if (playersReady.equalsIgnoreCase ("y")) {      
                // if yes,
                System.out.println("Let's start Connect4 Game!Team O vs. Team X.");
                display(Grid);
       }
          else{
                //if no,
                System.out.println("You are not ready. Exiting.");
                System.exit(0);
       }
            
            //check if someone has won
            boolean notWin = true;
            int g = 5;            
          while (notWin)
       {
              // first player places coin
              System.out.println("player O turn. Enter the column number, 1-7");
              int column = scanner.nextInt();
                       
               //check if column number is < width
              if (column > 7)
              {
                  System.out.println("That is not a valid column.");
              }
               //place number
               else
               {for (g =5; g >=0; g--)
                {
                   if(Grid[g][column - 1] == ' ')
                   {
                       Grid[g][column - 1] = 'O';
                       display(Grid);
                       winnerCheck(Grid);
                       
                       if (winnerCheck(Grid) == 'O')
                       {
                            
                            System.out.println("Player O won! Congrats!");
                            notWin = false;
                            break;
                       }
                       break;
                   }
                }
             }
             // second player places coin
              System.out.println("player X turn. Enter the column number, 1-7");
              column = scanner.nextInt();
             //check if column number is < width
                 if (column > 7)
              {
                  System.out.println("That is not a valid column.");
              }
               //place number
               else
               {for (g =5; g >=0; g--)
                {
                   if(Grid[g][column - 1] == ' ')
                   {
                       Grid[g][column - 1] = 'X';
                       display(Grid);
                       winnerCheck(Grid);
                       if (winnerCheck(Grid) == 'X')
                       {
                            System.out.println("Player X won! Congrats!");
                            notWin = false;
                            break;
                       }
                       break;
                   }
                }
             }
            }
       }
     
       // printing grid 
       
       public static void display(char[][] Grid)
    {
            for(int i= 0 ; i < Grid.length; i++)
       {
            for(int j = 0; j < Grid[i].length; j++)
                
                System.out.print("| " + Grid[i][j]);
                System.out.println("| ");
          }
    } 
    
        
    public static char winnerCheck(char[][] Grid)
    {
        //check if four vertically
            for (int v =0;v<=2;v++)
        {
           for (int h =0;h<=6;h++)
           {
                 if 
                 (
                      (Grid[v][h] != ' ')
                   && (Grid[v+1][h] !=' ')
                   && (Grid[v+2][h] !=' ')
                   && (Grid[v+3][h] !=' ')
                   && (Grid[v][h] == Grid[v+1][h]) 
                   && (Grid[v+1][h] == Grid[v+2][h])
                   && (Grid[v+2][h] == Grid[v+3][h])
                  )
                    return Grid[v][h];
                                  }
        }
    
        //check if four horizontally
           for (int v =0;v<=5;v++)
        {
           for (int h =0;h<=3;h++)
           {             
                 if 
                 (
                      (Grid[v][h] != ' ')
                   && (Grid[v][h+1] !=' ')
                   && (Grid[v][h+2] !=' ')
                   && (Grid[v][h+3] !=' ')
                   && (Grid[v][h] == Grid[v][h+1]) 
                   && (Grid[v][h+1] == Grid[v][h+2])
                   && (Grid[v][h+2] == Grid[v][h+3])
                  )
                 {
                     return Grid[v][h];
                 }
           }
         }
     
        //check diagonally left-up to right-down
           for (int v =0;v<=2;v++)
        {
           for (int h =0;h<=3;h++)
           {
                  if 
                 (
                      (Grid[v][h] != ' ')
                   && (Grid[v+1][h+1] !=' ')
                   && (Grid[v+2][h+2] !=' ')
                   && (Grid[v+3][h+3] !=' ')
                   && (Grid[v][h] == Grid[v+1][h+1]) 
                   && (Grid[v+1][h+1] == Grid[v+2][h+2])
                   && (Grid[v+2][h+2] == Grid[v+3][h+3])
                  )
                 {
                     return Grid[v][h];
                 }
           }
        }
   
        //check diagonally right-up to left-down
           for (int v =0;v<=2;v++)
        {
           for (int h =6;h>=3;h--)
           {
                  if 
                 (
                      (Grid[v][h] != ' ')
                   && (Grid[v+1][h-1] !=' ')
                   && (Grid[v+2][h-2] !=' ')
                   && (Grid[v+3][h-3] !=' ')
                   && (Grid[v][h] == Grid[v+1][h-1]) 
                   && (Grid[v+1][h-1] == Grid[v+2][h-2])
                   && (Grid[v+2][h-2] == Grid[v+3][h-3])
                  )
                 {
                     return Grid[v][h];
                 }
           }
        }
        return 'N';
    }
}