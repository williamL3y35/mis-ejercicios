package org.williamleyes.primer;

import javax.swing.*;

public class PrimerThread extends Thread{
    private String user;
    private String pas;
    private boolean bandera;

    public PrimerThread(String user, String pas) {
        this.user = user;
        this.pas = pas;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
    public boolean autentic(){
        String user = JOptionPane.showInputDialog(null,"ingresa usuario");
        String contraseña = JOptionPane.showInputDialog(null,"ingresa contraseña");
        if (this.user.equals(user)&& this.pas.equals(contraseña)){
            this.bandera = true;
        }else {
            this.bandera = false;
        }
        return this.bandera;
    }

    @Override
    public void run() {
        while (!this.bandera){
            System.out.println(1);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
