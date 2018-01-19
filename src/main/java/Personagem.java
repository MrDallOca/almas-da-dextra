public class Personagem {
    int vida;
    int forca;

    public Personagem(int vida, int forca) {
        this.setVida(vida);
        this.setForca(forca);
    }

    public void recebeAtaque(Personagem personagem) {
        this.setVida(this.getVida() - personagem.getForca());
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}