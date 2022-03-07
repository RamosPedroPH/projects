


public class senha
{
    //classe para conferir a efetividade de uma senha
    //caso a senha tenha 8 caracteres, pelo menos 1 letra minúscula, 1 letra
    //maiúscula e 1 número, o retorno é verdadeiro
    public static boolean validaComplexidade(String pword)
    {
      //Declaração das variáveis utilizadas
      int i;
      boolean up = false, low = false, num = false , val = true, result;
      //Confere se as exigências foram atingidas
      for(i=0; i<pword.length(); i++){
          if(pword.charAt(i)>64 && pword.charAt(i)<91)
            up = true; 
          else if(pword.charAt(i)>96 && pword.charAt(i)<123)
            low = true;
          else if(pword.charAt(i)>47 && pword.charAt(i)<58)
            num = true;
          else
            val = false;
        }
      //Retorna o valor, caso as exigências forem atingidas
      if(num && low && num && val && pword.length()>7)
        result = true;
      else
        result = false;
      return result;  
    }
        public static void teste(){
        String str= Teclado.leString("qual a sua senha?");
        boolean t = senha.validaComplexidade(str);
        if(t == true)
            System.out.println("Senha registrada com sucesso");
        else
            System.out.println("Senha inválida");
    }

}
