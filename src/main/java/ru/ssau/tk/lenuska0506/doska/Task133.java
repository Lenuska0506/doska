package ru.ssau.tk.lenuska0506.doska;
class coc {


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);

        System.out.println(number);
        System.out.println(person.getName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {

        person.setName("Oleg");
        System.out.println(person.getName());
    }
}