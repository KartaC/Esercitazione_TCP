/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercitazione;

/*
 *
 * @author Cartaginesi
 */
public class MainServer {

    public static void main(String[] args) {
        Server s = new Server(2000);
        s.attendi();
        s.leggi();
        s.scrivi();
    }
}
