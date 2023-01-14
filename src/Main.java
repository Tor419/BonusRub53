public class Main {
    public static void main(String[] args) {
        long initialAccount = 100;
        long addend = 5000;

        long bonus = addend > 1000 ? addend / 100 : 0;

        long finalAccount = initialAccount + bonus + addend;

        System.out.println("Итоговый счёт:" + finalAccount);
        System.out.println("Бонус:" + bonus);

    }
}
