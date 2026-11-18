void main() {
    double nota1 = Double.parseDouble(IO.readln("Informe a nota da 1a unidade"));
    double nota2 = Double.parseDouble(IO.readln("Informe a nota da 2a unidade"));
    double nota3 = Double.parseDouble(IO.readln("Informe a nota da 3a unidade"));
    double nota4 = Double.parseDouble(IO.readln("Informe a nota da 4a unidade"));

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    if (media >= 7)
        System.out.printf("Aprovado com média: %.1f \n", media);
    else {
        System.out.printf("Media: %.1f - Exame Final!- \n", media);
        double provafinal = Double.parseDouble(IO.readln(" Informe a nota da prova final"));
        double novamedia = (provafinal + media) / 2;
        
        if (novamedia >= 7)
            System.out.printf("Aprovado com média: %.1f \n", novamedia);
        else 
            System.out.printf("Reprovado com media : %.1f \n", novamedia);


    }
    IO.println(" BOAS FÉRIAS (:)");
}