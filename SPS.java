import java.util.*;
class SPS
{
    void main()
    {
        Scanner y = new Scanner (System.in);
        String cchoice = "";
        String pchoice = "";
        int cp = 0;
        int pp = 0;
        int c = 0;
        int w =0;
        String ch;
        do
        {
            c = (int) (Math.rint(Math.random()*2));
            if(c == 0)
            cchoice = "STONE";
            else if(c == 1)
            cchoice = "PAPER";
            else
            cchoice = "SCISSORS";
            
            System.out.println("Enter Your Choice : STONE , PAPER or SCISSORS NOTE : JUST TYPE \"ST\" FOR \"STONE\" \"PA\" FOR \"PAPER\" AND \"SC\" FOR \"SCISSORS\".");
            ch = y.next().toUpperCase();
            ch = ch.replaceAll(" ","");
            
            if(ch.equals("ST"))
            pchoice = "STONE";
            else if(ch.equals("PA"))
            pchoice = "PAPER";
            else
            pchoice = "SCISSORS";
            
            if(cchoice.equals("STONE") && pchoice.equals("SCISSORS"))
            cp++;
            else if(cchoice.equals("PAPER") && pchoice.equals("STONE"))
            cp++;
            else if(cchoice.equals("SCISSORS") && pchoice.equals("PAPER"))
            cp++;
            else if(pchoice.equals("STONE") && cchoice.equals("SCISSORS"))
            {pp++;w = 1;}
            else if(pchoice.equals("PAPER") && cchoice.equals("STONE"))
            {pp++;w = 1;}
            else if(pchoice.equals("SCISSORS") && cchoice.equals("PAPER"))
            {pp++;w = 1;}
            
            System.out.println("COMPUTER : " + cchoice);
            System.out.println("PLAYER : " + pchoice);
            System.out.println("*********************");
            System.out.println("POINTS : ");
            System.out.println("COMPUTER : " + cp);
            System.out.println("PLAYER : " + pp);
            System.out.println("*********************");
            System.out.println("---------------------");
            
        }
        while(cp<5 && pp<5);
        
        if(cp == 5)
        System.out.println("COMPUTER WINS!");
        else
        System.out.println("PLAYER WINS!");
    }
}