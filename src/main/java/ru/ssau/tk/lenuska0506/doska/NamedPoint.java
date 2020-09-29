package ru.ssau.tk.lenuska0506.doska;

public class NamedPoint extends Point {
    public String name;
    public NamedPoint( double x1, double y1, double z1){
            super(x1, y1, z1);
        }
    public NamedPoint( double x1, double y1, double z1, String name ){
            this(x1, y1, z1);
        this.name=name;
        }
    public NamedPoint( ){
        this(0, 0, 0,"Origin");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

