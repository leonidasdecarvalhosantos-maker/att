void main(){
    int num1 = Integer.parseInt(IO.readln("Informe"));
    int maior = num1;
    int menor = num1;
    int num2 = Integer.parseInt(IO.readln("Informe"));
    if (num2 > maior)
        maior = num2;
    if (num2 < menor)
        menor = num2;
    int num3 = Integer.parseInt(IO.readln("Informe"));
    if (num3 < menor)
        menor = num3;
    if (num3 > maior)
        maior = num3;

    IO.println(" O maior valor digitado foi " + maior);
    IO.print(" E o menor valor digitado foi " + menor);

}