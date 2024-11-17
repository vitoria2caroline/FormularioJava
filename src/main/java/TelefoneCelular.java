public class TelefoneCelular {
     private String marca;
     private String modelo;
     private int ano;
     private String cor;
     private double preco;
     public String getMarca() {
         return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public String getCor() { return cor; }
    public double getPreco() { return preco; }
    public void setMarca(String marca){
         this.marca = marca; }
    public void setModelo (String modelo) {
         this.modelo = modelo;}
    public void setAno(int ano)
    { this.ano = ano; } public void setCor(String cor)
    { this.cor = cor; } public void setPreco(double preco)
    { this.preco = preco;
    }
    public static void main(String[] args)
    { TelefoneCelular celular = new TelefoneCelular();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy ");
        celular.setAno(2021);
        celular.setCor("Preto");
        celular.setPreco(3000.99);

        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Ano: " + celular.getAno());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Preço: R$ " + celular.getPreco());
    }
}
