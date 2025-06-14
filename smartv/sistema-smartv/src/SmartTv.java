public class SmartTv {

    boolean ligada= false;
    int volume= 0;
    int canal= 1;

    public void ligar (){
        ligada= true;
    }

    public void desligar (){
        ligada= false;
    }

    public void aumentarVolume (){
        volume= volume+1;
    }

    public void diminuirVolume (){
        volume= volume-1;
    }
        
    
}
