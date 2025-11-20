package poly.car1;

public class G80 implements Car{

    @Override
    public void startEngine() {
        System.out.println("G80.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("G80.soffEngine");
    }

    @Override
    public void Acceleretor() {
        System.out.println("G80.Acceleretor");
    }

    @Override
    public void Break() {
        System.out.println("G80.Break");
    }


}
