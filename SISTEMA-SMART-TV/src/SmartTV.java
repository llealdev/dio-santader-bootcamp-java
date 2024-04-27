public class SmartTV {

    public boolean ligada = false;
    public int volume = 25;
    public int canal = 1;

    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void abaixarVolume(){
        volume--;
    }

    public void mudarCanal(int canal){
        this.canal = canal;
    }
    
}
