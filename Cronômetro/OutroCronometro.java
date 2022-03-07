import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Calendar;

//Esse cronômetro não perde segundos a longo prazo
public class OutroCronometro
{
    public static void main(String[] args) throws IOException, InterruptedException {
        //Declaração das variáveis + scan dos valores
        int x=0;
        int i = Teclado.leInt("Quantos segundos você quer contar? ");
        int j = Teclado.leInt("Quantos minutos você quer contar? ");
        int p = Teclado.leInt("Quantas horas você quer contar? ");
        int segundos =0;
        int minutos=0;
        int horas=0;
        Calendar data;
        Calendar time = Calendar.getInstance();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        int minute = time.get(Calendar.MINUTE);
        int second = time.get(Calendar.SECOND);
        //utilizar valores com 2 algarismos
        DecimalFormat f = new DecimalFormat("00");
        //tranforma os valores scaneados para segundos
        i= i + j*60 + p*36000;
        //laço de repetição do cronômetro
        while(x+1<=i){
            //declaração das variáveis de hora, minuto e segundo
            try{
                Thread.sleep(900);
                data = Calendar.getInstance();
                horas = data.get(Calendar.HOUR_OF_DAY);
                minutos = data.get(Calendar.MINUTE);
                segundos = data.get(Calendar.SECOND);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            int w= (horas*3600 + minutos*60 + segundos) - (hour*3600 + minute*60 +second);
            int h=w/3600;
            int m=(w%3600)/60;
            int s=(w%3600)%60; 
            //limpa o console pra ficar bonito :)
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
            System.out.println(f.format(h)+":"+f.format(m)+":"+f.format(s));
            //acrescenta 1 a varável de controle dos segundos
            if((s + m*60 + h*3600)>x)
            x++;
        }
        //finalização da contagem;
        System.out.print("->Acabou");
    }
}