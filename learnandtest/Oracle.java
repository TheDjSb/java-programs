package learnandtest;

class Super {
    void Sample() {
        System.out.println("method of super class");
    }
}

class Sub extends Super {
    void Sample() {
        System.out.println("method of sub class");
    }

    public static void main(String args[]) {
        Super obj = new Sub();
        Sub sub = (Sub) obj; sub.Sample();
    }
}






