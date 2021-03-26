public class Main {
    public static int bonus (int price){
        int bonusCost = 20;
        int bonusMiles = price / bonusCost;
        return bonusMiles;
    }
    public static void main (String[] args){
        System.out.println("На счет зачислено " + bonus(10_000) + " миль");
    }
}