public class HeyJude {

    public static void main (String[] args){

        final String hey = "Hey Jude";

        final String  dont = "don't";
        final String make_bad = "make it bad";
        final String be = "be afraid";
        final String down = "let me down";
        final String take = "Take a sad song and make it better";
        final String were = "You were made to go out and get her";
        final String found = "You have found her, now go and get her";

        final String remember = "Remember to";
        final String heart = "let her into your heart";
        final String skin = "let her under your skin";

        final String then = "Then you";
        final String start = "can start";
        final String begin = "begin";
        final String make_better = "to make it better";
        final String better = "better";
        final String OH = "oh";

        final String na = "na";
        //Número de parrafo
        int p = 0;
        //Contador de iteraciones
        int c = 0;

        while (p < 7){
           if( p == 0 || p == 1 || p == 3 || p == 5){

              System.out.print("\n" + hey + ", " + dont + " ");

              if(p == 0 || p == 5){
                  System.out.println(make_bad);
                  System.out.println(take);
              }else{
                 if(p == 1){
                     System.out.println(be);
                     System.out.println(were);
                 }else{
                     System.out.println(down);
                     System.out.println(found);
                 }
              }

              System.out.print(remember + " ");

              if (p == 0 || p == 3)
                 System.out.println(heart);
              else
                  System.out.println(skin);

              System.out.print(then  + " ");

              if(p == 1 || p == 5)
                   System.out.print(begin + " ");
              else
                   System.out.print(start + " ");

              System.out.println(make_better);

              if(p == 5){
                //Repetir better
                 while(c < 5){
                    System.out.print(better + " ");
                    c ++;
                 }
                 c = 0;
                 System.out.println(OH);
              }

            }else{
              System.out.println();
               //Repetir na
               while(c < 10){
                   System.out.print(na + " ");
                   c ++;
               }
               // Hey Jude al final
               if (p == 6)
                  System.out.print(hey);
               System.out.println();
               c = 0;
            }

            p ++;

      }

    }
}
