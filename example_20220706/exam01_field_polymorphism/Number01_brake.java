package exam.example_20220706.exam01_field_polymorphism;

public class Number01_brake implements Brake, Pedal{
    public void stop(){
        System.out.println("Number01 브레이크 실험");
    }

    public void push(){
        System.out.println("Number01 패달 실패");
    }

}
