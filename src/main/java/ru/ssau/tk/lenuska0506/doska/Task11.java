package ru.ssau.tk.lenuska0506.doska;

class Main {
    public static void main(String[] s) {
        Person o = new Person();
        o.setLastName("Tank");
        o.setFirstName("Lena");
        o.setPassportId(1234567);
        Person o1 = new Person();
        o1.setLastName("Samoletik");
        o1.setFirstName("Gosha");
        o1.setPassportId(7654321);
    }
};

class Person {
    private  int passportId;
    private  String firstName ;
    private  String lastName ;



    public void setFirstName(String firstName1) {
        firstName = firstName1;
    }

    public void setLastName(String lastName1) {
        lastName = lastName1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setPassportId(int passportId1) {
        passportId = passportId1;
    }

    public int getPassportId() {
        return passportId;
    }
}