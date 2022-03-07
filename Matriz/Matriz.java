
public class Matriz
{
    public static void teste()
    {
        char[][] m = {{'o','v','o'}, {'a','l','o'} , {'p','i','a'}};
        System.out.println(Matriz.Matriz(m));
        
    }
    public static String Matriz(char in[][])
    {
        String solucao = "";
        for(int i=0; i<in.length;i++)
            solucao += in[i][i];
        return solucao;
    }

}
