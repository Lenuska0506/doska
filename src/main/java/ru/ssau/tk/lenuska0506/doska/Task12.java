package ru.ssau.tk.lenuska0506.doska;

class Main7 {
    public static void main(String[] s) {
        Person1 o = new Person1();

        Person1 o1 = new Person1("х","e");
        Person1 o2 = new Person1(0);
        Person1 o3 = new Person1("х","e",0);
        System.out.println();
        System.out.println();
    }
};

class Person1 {
    private  int passportId;
    private  String firstName ;
    private  String lastName ;
    public Person1() {
        passportId=0;
        firstName="io";
         lastName="poi";
    }

    public Person1(String firstName1,String lastName1) {
        firstName = firstName1;
        lastName = lastName1;
        passportId = 0;
    }
    public Person1(  String firstName1,  String lastName1,int passportId1) {
        firstName = firstName1;
        lastName = lastName1;
        passportId=passportId1;
    }
    public Person1(int passportId1) {
        firstName = "123";
        lastName = "lastName1";
        passportId = passportId1;
    }


}