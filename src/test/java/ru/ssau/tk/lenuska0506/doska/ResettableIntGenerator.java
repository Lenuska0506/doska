package ru.ssau.tk.lenuska0506.doska;

public class ResettableIntGenerator extends IntGeneratorImpl implements Resettable, IntGenerator {
    @Override
    public int nextInt() {
        return super.nextInt();
    }

    @Override
    public void reset() {
        super.s = 0;
    }
}
