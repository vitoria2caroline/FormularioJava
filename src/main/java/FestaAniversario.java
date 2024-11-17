public class FestaAniversario {
    private String nomeAniversariante;
    private String local;
    private String data;
    private int numeroConvidados;
    private String tema;
     public String NomeAniversariante() {
         return nomeAniversariante; }
    public String getLocal() { return local; }
    public String getData() { return data; }
    public int getNumeroConvidados() {
         return numeroConvidados; }
    public String getTema() {
         return tema; }
    public void
    NomeAniversariante(String nomeAniversariante) {
         this.nomeAniversariante = nomeAniversariante; }
    public void setLocal(String local)
    { this.local = local; }
    public void setData(String data)
    { this.data = data; }
    public void setNumeroConvidados(int numeroConvidados)
    { this.numeroConvidados = numeroConvidados; }
    public void setTema(String tema)
    { this.tema = tema; }
    public static void main(String[] args) {
         FestaAniversario festa = new FestaAniversario();
         festa.NomeAniversariante("João");
         festa.setLocal("Salão de Festas");
         festa.setData("20/11/2024");
         festa.setNumeroConvidados(50);
         festa.setTema("Super-Heróis");

         System.out.println("Nome do Aniversariante: " + festa.NomeAniversariante());
         System.out.println("Local: " + festa.getLocal());
         System.out.println("Data: " + festa.getData());
         System.out.println("Número de Convidados: " + festa.getNumeroConvidados());
         System.out.println("Tema: " + festa.getTema());
     }
}
