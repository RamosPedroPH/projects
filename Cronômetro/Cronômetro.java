import java.text.DecimalFormat;
import java.io.IOException;
//Esse cronômetro é mais simples, porém perde alguns segundos a longo prazo
public class Cronômetro
{
    public static void main(String[] args) throws IOException, InterruptedException {
        //Declaração das variáveis + scan dos valores
        int x=0;
        int i = Teclado.leInt("Quantos segundos você quer contar? ");
        int j = Teclado.leInt("Quantos minutos você quer contar? ");
        int p = Teclado.leInt("Quantas horas você quer contar? ");
        //utilizar valores com 2 algarismos
        DecimalFormat f = new DecimalFormat("00");
        //tranforma os valores scaneados para segundos
        i= i + j*60 + p*36000;
        //laço de repetição do cronômetro
        while(x<=i){
            //declaração das variáveis de hora, minuto e segundo
            int h=x/3600;
            int m=(x%3600)/60;
            int s=(x%3600)%60; 
            //limpa o console pra ficar bonito :)
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
            //exibe o tempo do cronômetro
            System.out.println(f.format(h)+":"+f.format(m)+":"+f.format(s));
            //Delay de 1 segundo(tive que deixar 930 ms de delay, pois
            //um delay de 1 segundo tava atrasando 4 s por minuto)
            try {
                Thread.sleep(930);
            }            
            catch (Exception e) {
                e.printStackTrace();
            }
            //acrescenta 1 a varável de controle dos segundos
            x++;
        }
        //finalização da contagem;
        System.out.print("->Acabou");
    }
}