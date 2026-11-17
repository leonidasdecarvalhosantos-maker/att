import java.util.function.IntToDoubleFunction;

void main() {
  double nota1 = Double.parseDouble(IO.readln("Informe a nota da 1a unidade: "));
  double nota2 = Double.parseDouble(IO.readln("Informe a nota da 2a unidade: "));
  double nota3 = Double.parseDouble(IO.readln("Informe a nota da 3a unidade"));

  double media = (( nota1 + nota2 + nota3) / 3);

  if (media<5)
    IO.println("Você está reprovado com media " + media);
  else 
    IO.println("Você está aprovado com media " + media);
}