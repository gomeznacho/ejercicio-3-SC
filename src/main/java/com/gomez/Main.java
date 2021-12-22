package com.gomez;

public class Main {

    public static void main(String[] args) {
        UsersRepo.addUser("jimy", "1234");
        UsersRepo.addUser("jimbo", "5678");

        //casos de prueba de registro
        Registro.register("james", "4321");
        Registro.register("james", "4321");

        //casos de prueba de login
        System.out.println(Login.login("jimbo", "5678"));
        System.out.println(Login.login("jimbo", "567"));
        System.out.println(Login.login("jim", "567"));
    }
}


