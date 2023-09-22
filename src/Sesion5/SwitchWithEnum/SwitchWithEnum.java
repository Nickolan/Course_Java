package Sesion5.SwitchWithEnum;

import java.awt.*;

public class SwitchWithEnum {
    public static void main(String args[]){
        ButtonState bt = ButtonState.OFF;
        switch (bt){
            case ON:System.out.println("ON");break;
            case OFF:System.out.println("OFF"); break;
        }
    }
}

 enum ButtonState{
    ON, OFF;
}
