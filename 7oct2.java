class Student {
    int age;
    String name;

    Student() {
        age = 20;
        name = "Prasanna";
    }

    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}