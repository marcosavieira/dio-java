public class SmartTv {
   boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void onOff(){
        ligada = !ligada;
    }

    public void avancarCanal() {
        canal+=1;
    }
    public void voltarCanal() {
        if (canal == 0){
            return;
        }else
        canal-=1;
    }
    public void aumentarVolume() {
        volume+=1;
    }
    public void diminuirVolume() {
        if (volume == 0){
            return;
        }else
        volume-=1;
    }

}
