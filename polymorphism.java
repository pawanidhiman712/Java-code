public class polymorphism {
    public static void main(String[] args) {
        locker a = new locker();
        a.checkstatus();
        a.unlock(1111);
        a.unlock(1234);
        a.checkstatus();

    }
}
