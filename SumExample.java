class SumExample{

    int sum(int a , int b){
        return a + b;
    }
    int sum(int a , int b , int c){
        return a + b + c;
    }
    double sum(double a , double b){
        return a + b;
    }
    double sum(int a , double b){
        return a + b;
    }
    public static void main(String[] args) {
        SumExample obj = new SumExample();

        System.out.println("Sum of 2 integers: " + obj.sum(10, 20));
        System.out.println("Sum of 3 integers: " + obj.sum(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + obj.sum(10.5, 20.5));
        System.out.println("Sum of int and double: " + obj.sum(10, 5.5));

}

}
