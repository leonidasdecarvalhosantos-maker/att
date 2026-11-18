void main() {
    int a = Integer.parseInt(IO.readln("Informe o valor de a: "));
    int b = Integer.parseInt(IO.readln("Informe o valor de b: "));
    int c = Integer.parseInt(IO.readln("Informe o valor de c: "));

    int delta = ((b * b) - 4 * a * c);

    if (a == 0)
        IO.println(" Não é uma equação do segundo grau");
    else {
        if (delta < 0)
            IO.println(" Não há raizes reais");
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b -  Math.sqrt(delta)) / (2*a);

            IO.println("Suas raízes são respectivamente x1 = " + x1  + "e x2 = " + x2 
        }
    }

} 