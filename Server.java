package com.mycompany.esercitazione;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 *
 * @author Cartaginesi
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

import java.net.Socket;

public class Server {

    private ServerSocket server = null;
    private Socket client = null;
    private int porta;

    public Server(int porta) {
        try {
            this.porta = porta;
            server = new ServerSocket(porta);
            System.out.println("S1 - Il server è in ascolto sulla porta " + porta);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println("Si è verificato un errore durante la fase di apertura ed ascolto");
        }
    }

    public Socket attendi() {
        try {
            client = server.accept();
            System.out.println("S2 - Connessione stabilita con il client");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println("Si è verificato un errore durante la connessione con il server");
        }
        return client;
    }

    public void scrivi() {
        try {
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println("Ciao client");
            System.out.println("Messaggio inviato al client");
        } catch (IOException e) {
            System.err.println("Errore durante l'invio del messaggio al client: " + e.getMessage());
        }
    }

    public void leggi() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String message = in.readLine();
            System.out.println("Messaggio ricevuto dal client: " + message);
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del messaggio dal client: " + e.getMessage());
        }
    }
}
