package exam.example_20220706.exam01_field_polymorphism;

import sec05.exam01_field_polymorphism.HankookTire;
import sec05.exam01_field_polymorphism.KumhoTire;

public class Pedal {
    public void push();

    default void defaultmethod_install_pedal(Tire abc){
        if(abc instanceof HankookTire){
            System.out.println("한국 타이어 세팅으로 변경합니다");
        }
        else if(abx instanceof KumhoTire){
            System.out.println("금호 타이어 세팅으로 변경합니다");
        }
        else if(abx instanceof newHankookTire){
            System.out.println("세로운 한국 타이어 세팅으로 변경합니다");
        }
    }
}
