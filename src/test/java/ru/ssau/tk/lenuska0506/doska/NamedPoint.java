package ru.ssau.tk.lenuska0506.doska;

public class NamedPoint implements Resettable{

    public String name;

    @Override
    public void reset() {
        name= "Absent";

    }
}
