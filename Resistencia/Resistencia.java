
public class Resistencia
{
    //Classe de teste
    public static void teste(){
        double[] r = {1500, 100, 100, 1500};
        double vin = 12;
        double[] vout = Resistencia.Resistencia(vin, r);
        System.out.println("------------Resultados--------------");
        for(int i=0; i<vout.length;i++)
            System.out.println(vout[i]);
    }
    //Classe para calculo da resistência
    public static double[] Resistencia(double vin, double[] r)
    {
       //Declaração das variáveis
       double[] vout = new double[r.length - 1];
       double rt = 0;
       //Calculo da resistência total(rt)
       for(int i=0; i<r.length; i++)
            rt += r[i];
       //Declaração da resistencia relativa ao primeiro resistor
       double rr = rt - r[0];
       //Calculo da tensão em cada resistor
       for(int i=0; i<vout.length;i++){
            vout[i]=vin*(rr/rt);
            rr -= r[i+1];
        }
       return vout; 
    }
}
