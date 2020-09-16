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
    public Person() {
        passportId=0;
        firstName="io";
        lastName="poi";
    }

    public Person(String firstName1,String lastName1) {
        firstName = firstName1;
        lastName = lastName1;
        passportId = 0;
    }
    public Person(  String firstName1,  String lastName1,int passportId1) {
        firstName = firstName1;
        lastName = lastName1;
        passportId=passportId1;
    }
    public Person(int passportId1) {
        firstName = "123";
        lastName = "lastName1";
        passportId = passportId1;
    }


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
class Main2 {
    public static void main(String[] s) {
        Person1 o = new Person1();
        Person1 o1 = new Person1("х","e");
        Person1 o2 = new Person1(0);
        Person1 o3 = new Person1("х","e",0);
        System.out.println();
        System.out.println();
    }
};

