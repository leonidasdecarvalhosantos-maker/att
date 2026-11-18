void main() {
    int valor1 = Integer.parseint(IO.readln("Informe um valor qualquer:" ));
    int valor2 = Integer.parseint(IO.readln("Informe um valor qualquer:")); 
    
    if (valor1 > valor2)
     IO.println(valor1 + "-" + valor2 + "=" + (valor1 - valor2));
    else
     IO.println(valor2 + "-" + valor1 + "=" + (valor2 - valor1));

}