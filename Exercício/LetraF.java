void main() {
    IO.println("Informe os valores de a, b e c");
    int a = Integer.parseInt(IO.readln("a: "));
    int b = Integer.parseInt(IO readln("b: "));
    int c = Integer.parseInt(IO.readln("c :"));

    if (a > b){
        aux = a;
        a = b;
        b = aux;

    }
    if (a > c){
        aux = a;
        a = c;
        c = aux;
    }

    if ( b > c){
        aux = b;
        b = c;
        c = aux;
    }

    IO.println("Aqui estão seus valores ordenados:" + a + "-" + b + "-" + c);
}