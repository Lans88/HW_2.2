public class Main {
    public static void main(String[] args) {
        int restocking = 2300;
        int oneBonus = 100;
        int mountBonus = 0;
        if (restocking > 1_000) {
            mountBonus = restocking / oneBonus;
            int total = restocking + mountBonus;
            System.out.println("Сумма начисленных бонусов составляет: " + mountBonus);
            System.out.println("Общий счет составляет: " + total);
        } else {
            System.out.println("Сумма пополнения меньше заявленной для начисления, бонусы не начислены.");
        }
    }
}