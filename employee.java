class employee extends person {
    double salary;
    double hsluong;

    employee() {
    }

    employee(String nameperson, String sex, int birthdayperson, double salary, double hsluong) {
        super(nameperson, sex, birthdayperson);
        this.salary = salary;
        this.hsluong = hsluong;
    }

    double getSalary() {
        return hsluong * salary;
    }
}
