public class SmartTv {
    
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        System.out.println("Ligando TV");
        ligada = true;
    }

    public void desligar(){
        System.out.println("Desligando TV");
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }    

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void diminuirCanal(){
        canal--;
    }

}
