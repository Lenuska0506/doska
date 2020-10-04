package ru.ssau.tk.lenuska0506.doska;

public  class IntGeneratorImpl implements IntGenerator {
    public int s=0;
    @Override
    public int nextInt() {
        s+=1;
        return s-1;
    }
}
