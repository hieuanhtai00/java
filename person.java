class person {
    String nameperson;
    String sex;
    int birthdayperson;

    person() {
    }

    person(String nameperson, String sex, int birthdayperson) {
        this.nameperson = nameperson;
        this.sex = sex;
        this.birthdayperson = birthdayperson;
    }

    public int getBirthdayperson() {
        return birthdayperson;
    }

    public String getNameperson() {
        return nameperson;
    }

    public String getSex() {
        return sex;
    }

    public void setBirthdayperson(int birthdayperson) {
        this.birthdayperson = birthdayperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    void showinfor() {
        System.out.println("Name : " + nameperson);
        System.out.println("Sex : " + sex);
        System.out.println("Birthday : " + birthdayperson);
    }
}
