public class Teste {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5, 10);
        retangulo.setCor("Azul");
        System.out.println("Retangulo - Cor: " + retangulo.getCor());
        System.out.println("Retangulo - Área: " + retangulo.area());


        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.setCor("Vermelho");
        System.out.println("Triangulo - Cor: " + triangulo.getCor());
        System.out.println("Triangulo - Área: " + triangulo.area());


        Circulo circulo = new Circulo(5);
        circulo.setCor("Verde");
        System.out.println("Circulo - Cor: " + circulo.getCor());
        System.out.println("Circulo - Diâmetro: " + circulo.getDiametro());


        Quadrado quadrado = new Quadrado(5);
        quadrado.setCor("Amarelo");
        System.out.println("Quadrado - Cor: " + quadrado.getCor());
        System.out.println("Quadrado - Área: " + quadrado.area());
    }
}
