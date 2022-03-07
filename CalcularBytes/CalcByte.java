//Classe para converter bytes em KB/MB/GB...

public class CalcByte
{
    //classe para converter Bytes em KB, MB, GB ...
    public static void CalcByte(long b) {
        //Declaração das variáveis
        double[] x = new double[9];
        String[] y = {"B" , "KB" , "MB" , "GB" , "TB" , "PB" , "EB" , "ZB" , "YB" };
        int i=0;
        //Equação matemática pra conversão
        for(i=0; i<9;i++)
           x[8-i] = Math.floor((b%Math.pow(1024, (9-i)))/(Math.pow(1024, (8-i))));
        //Exibição dos resultados
        for(i=0; i<9;i++)
           if(x[8-i]!=0)
              System.out.println(x[8-i]+" "+y[8-i]);
    }
        public static void Teste()
    {
        CalcByte.CalcByte(Teclado.leInt("Qual o número?"));
    }

}
