package ru.ssau.tk.lenuska0506.doska;
class coc {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getName());
    }
    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setName("Ignat");
        System.out.println(person.getName());
    }

}