class locker {
    private int pin = 1234;
    private boolean isopen = false;

    public void unlock(int Enterpin){
        if (Enterpin == pin){
            isopen = true;
            System.out.println("locker is open");
        } else {
            isopen = false;
            System.out.println("locker is closed");
        }
    }

    public void checkstatus(){
        if(isopen){
            System.out.println("locker is open");
        } else {
            System.out.println("locker is closed");
        }
    }

    public static void main(String[] args) {
        locker a = new locker();
        a.checkstatus();
        a.unlock(1111);
        a.unlock(1234);
        a.checkstatus();
    }
}