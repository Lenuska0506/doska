package ru.ssau.tk.lenuska0506.doska;

public abstract class Operation {
   public abstract  double apply(double number);

    public  class IdenticalOperation extends Operation {

        @Override
        public double apply(double number) {
            return number;
        }
    }
    public  class SqrtOperation extends Operation {

        @Override
        public double apply(double number) {
            return Math.sqrt(number);
        }
    }
    public  class TangentOperation extends Operation {

        @Override
        public double apply(double number) {
            return Math.tan(number);
        }
    }
}

