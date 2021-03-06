package com.oprotsen.JavaOOP.lesson4.messanger;

public class PictureText implements Text{
    private final Message message;

    public PictureText() {
       message = getMessage();
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String printMessage(Message message) {
        if (message.getText().equalsIgnoreCase("like"))
        return "________$$$$\n" +
                "_______$$__$\n" +
                "_______$___$$\n" +
                "_______$___$$\n" +
                "_______$$___$$\n" +
                "________$____$$\n" +
                "________$$____$$$\n" +
                "_________$$_____$$\n" +
                "_________$$______$$\n" +
                "__________$_______$$\n" +
                "____$$$$$$$________$$\n" +
                "__$$$_______________$$$$$$\n" +
                "_$$____$$$$____________$$$\n" +
                "_$___$$$__$$$____________$$\n" +
                "_$$________$$$____________$\n" +
                "__$$____$$$$$$____________$\n" +
                "__$$$$$$$____$$___________$\n" +
                "__$$_______$$$$___________$\n" +
                "___$$$$$$$$$__$$_________$$\n" +
                "____$________$$$$_____$$$$\n" +
                "____$$____$$$$$$____$$$$$$\n" +
                "_____$$$$$$____$$__$$\n" +
                "_______$_____$$$_$$$\n" +
                "________$$$$$$$$$$\n";
        else if (message.getText().equalsIgnoreCase("heart"))
            return "_______$$$$$$$$$$$___________$$$$$$$$$$$$_________\n" +
                    "______$$$$$$$$_____$$$$$___$$$$$$_____$$$$$$$______\n" +
                    "____$$$$$$$_____________$$$______________$$$$$_____\n" +
                    "___$$$$$$$_______________$_________________$$$$____\n" +
                    "__$$$$$$____________________________________$$$$___\n" +
                    "__$$$$$_____________________________________ $$$$__\n" +
                    "_$$$$$______________________________________$$$$$__\n" +
                    "_$$$$$_____________________________________$$$$$$__\n" +
                    "__$$$$$$_________________________________$$$$$$$___\n" +
                    "___$$$$$$$______________________________$$$$$$$____\n" +
                    "_____$$$$$$____________________________$$$$$$______\n" +
                    "_______$$$$$$________________________$$$$$$________\n" +
                    "__________$$$$$_____________________$$$$___________\n" +
                    "_____________$$$$_________________$$$$_____________\n" +
                    "_______________$$$$_____________$$$________________\n" +
                    "_________________$$$_________$$$___________________\n" +
                    "_________________ __$$$_____$$_____________________\n" +
                    "______________________$$__$$_______________________\n" +
                    "________________________$$_________________________\n";
        else
            return "";
    }
}
