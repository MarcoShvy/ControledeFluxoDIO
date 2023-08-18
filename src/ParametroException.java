public class ParametroException {
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; parametroUm < parametroDois; i++) {
            System.out.println(i);
            parametroUm++;
        }
    }
}

