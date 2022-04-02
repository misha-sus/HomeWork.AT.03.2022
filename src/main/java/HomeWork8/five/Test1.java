package HomeWork8.five;


class Test1 {
    void mountain() {
        System.out.println("Как дела?");
    }
    static Test1 favorite(){
        System.out.print("Привет! ");
        return null;
    }
    public static void main(String[] args) {
        favorite();
        Test1 test1 = new Test1();
        test1.mountain();
    }
}


