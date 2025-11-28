package Polymorfis.Teori;

public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {

        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tj = (TelevisiJadul) perangkat;
            System.out.println("Nyalakan televisi jadul dengan input: " + tj.getModeInput());
        }

        else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tm = (TelevisiModern) perangkat;
            System.out.println("Nyalakan televisi modern dengan input: " + tm.getModeInput());
        }

        System.out.println("Voltase televisi: " + perangkat.getVoltase());
    }
}
 
    

