package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int passwordSize = 15;
        PasswordGenerator password = new PasswordGenerator( passwordSize );
        System.out.println( password.get() );



    }

}
