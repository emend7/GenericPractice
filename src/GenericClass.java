public class GenericClass<M extends Number,T> {
    M val;
    T val2;

    GenericClass(M input, T input2){
        this.val = input;
        this.val2 = input2;
    }

    public void print() {
        System.out.println("This is the value for type param M: "+ this.val);
        System.out.println("This is the value for type param T: "+ this.val2);

    }
}
