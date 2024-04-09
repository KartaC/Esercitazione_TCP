/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercitazione;

/*
 *
 * @author Cartaginesi
 */
public class MainClient {

    public static void main(String[] args) {
        Client c = new Client("Francesco", "verde");
        c.connetti("127.0.0.1", 2000);
        c.scrivi();
        c.leggi();
        c.chiudi();
    }
}
