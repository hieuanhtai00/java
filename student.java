class student extends person {
    String msv;

    student() {
    }

    student(String nameperson, String sex, int birthdayperson, String msv) {
        super(nameperson, sex, birthdayperson);
        this.msv = msv;
    }
}
