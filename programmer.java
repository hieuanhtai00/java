class programmer extends student {
    int yearexp;

    programmer() {
    }

    programmer(String nameperson, String sex, int birthdayperson, String msv, int yearexp) {
        super(nameperson, sex, birthdayperson, msv);
        this.yearexp = yearexp;
    }
}
