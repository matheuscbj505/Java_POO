package aula06;

public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto () {
        
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado?" + this.getLigado());
        System.out.println ("Esta tocando?" + this.getTocando());
        System.out.println("Volume" + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.println("[]");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
    }

}
