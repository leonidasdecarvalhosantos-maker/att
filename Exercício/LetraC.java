void main() {
    int numero = Integer.parseint(IO.readln("Informe um valor qualquer (+/-) :"));
    int modulo = numero;

    if (numero<0)
 modulo = numero * -1;
IO.println("|" + numero + "|=" + modulo);
    
}
