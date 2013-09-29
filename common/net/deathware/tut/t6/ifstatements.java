package net.deathware.tut.t6;

public class ifstatements {

    public static void main(String[] args) {
        boolean cond = 8 == 3;
        int pineapple = 35;
        if (pineapple <= 30 & pineapple < 10) {
            System.out.println("Yes it is true!");
        }
        else if (pineapple >= 10) {
            System.out.println("Da Fuck?");
        }
        else {
            System.out.println("Fuck you it's flase.");
        }
        ///////////////////////////////////////////////////////////
        pineapple = 0;
       while(pineapple<1000){
           if(pineapple==0){
               System.out.println("Oh no I have no pineapples.");
           }
           else if(pineapple == 1){
               System.out.println("I have one pineapple. hahahaha.");
           }
           else if(pineapple>150)
           {
               System.out.println("OH NO TOO MANYPINEAPPLES STOPPPPPPPPPPP!!!!!!!!!!!!!!");
           }
           else if (pineapple == 200){
               break;
           }
           else if(pineapple >1){
               System.out.println("I have "+pineapple+" pineapples. HAHAHAHA!");
           }
           pineapple++;
       }
    }

}
