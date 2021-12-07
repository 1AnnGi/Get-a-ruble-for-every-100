public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenishment = 1100;
        int bonusRubles;

        if (replenishment > 1000) {
            bonusRubles = replenishment / 100;
        }

        else {
            bonusRubles = 0;
        }

        int balance = score + replenishment + bonusRubles;
        System.out.println(" Your balance is: " + balance + "___" +  "Your bonus is : " + bonusRubles);
    }
}
