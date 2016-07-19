public class GuessingGame{
    Player p1;
    Player p2;
    Player p3;

    public void startgame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1correct = false;
        boolean p2correct = false;
        boolean p3correct = false;

        int targetnumber = (int) (Math.random() * 10);
        System.out.println("Guess the number between 0 and 9");

        while(true) {
            System.out.println("Number to guess = " + targetnumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed: " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player 2 guessed: " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player 3 guessed: " + guessp3);

            if (guessp1 == targetnumber) {
                p1correct = true;
            }
            if (guessp2 == targetnumber) {
                p2correct = true;
            }
            if (guessp3 == targetnumber) {
                p3correct = true;
            }

            if (p1correct || p2correct || p3correct) {

                System.out.println("Player 1 was " + p1correct);
                System.out.println("Player 2 was " + p2correct);
                System.out.println("Player 3 was " + p3correct);
                System.out.println("Game Over");
                break;
            }

            else {

                System.out.println("Try again...");

            }
        }
    }

};