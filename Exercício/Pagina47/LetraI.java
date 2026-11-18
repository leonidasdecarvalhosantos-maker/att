void main(){
    String name = IO.readln("Informe seu nome pfv: ");

    String sexo = IO.readln("Informe seu sexo: (M/F)");

    switch (sexo. thim(). toUpperCase()) {
        case "M":
            IO.println("Ilmo senhor" + name);
            break;
            case "F":
                IO.println("Ilma senhora" + name);
                break;
                default:
                    IO.println("Você obrigatoriamente tem de ser M ou F");
                    
    }
}