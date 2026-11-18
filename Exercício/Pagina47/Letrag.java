void main(){
    int num1 = Integer.parseInt(IO.readln("Informe um número qualquer: "));
    int num2 = Integer.parseInt(IO.readln("Informe um n qualquer: "));
    int num3 = Integer.parseInt(IO.readln("Informe um n qualquer;"));
    int num4 = Integer.parseInt(IO.readln(" Informe: "));

    if ((num1%3== 0) && (num1%2==0))
        IO.println(num1 + "é divisível por 2 e 3");
    if ((num2%3==0) && (num2%2==0))
        IO.println(num2 + "É divisível por 2 e 3");
    if ((num3%3==0) && (num3%2==0))
        IO.print(num3 + " é divisível por 2 e 3");
    if ((num4%2==0) && (num4%3==0))
        IO.println(num4 + "é divisível por 2 e 3");


}