public class Main {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date();
        date1.addDays(738880);
        date1.showDate();
        System.out.println(date1.translationInDays());
    }
}
