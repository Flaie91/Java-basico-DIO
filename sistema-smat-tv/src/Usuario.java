public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Está em que canal? " + smartTv.canal);
        System.out.println("qual o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv está ligada? >novo status  " + smartTv.ligada);

        System.out.println("Está no canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Agora está no canal: " + smartTv.canal);

    }   
}
