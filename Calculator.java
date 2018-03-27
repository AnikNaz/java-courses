public class Calculator {

    private int resalt;

    public void add (int... params) {

        for (Integer param: params) {

            this.resalt += param;

        }
    }

    public int getResult() {

        return this.resalt;
    }


    public void cleanResalt() {

        this.resalt = 0;

    }

}