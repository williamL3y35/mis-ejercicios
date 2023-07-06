package org.williamleyes.primer;

public class InicioThreads{
    public static void main(String[] args) {
            PrimerThread t = new PrimerThread("wl","1234");
            t.start();
            t.autentic();
    }
}
