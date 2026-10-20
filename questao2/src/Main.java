public class Main {
    public static void main(String[] args) {
        
        System.out.println("PROCESSANDO MATRÍCULA: BRASIL");
        abstFactoryPais fabricaBR = new FactoryBrasil(1500.00, "Lenao", "123.456.789-00");
        Matricula matriculaBR = new Matricula(fabricaBR);
        matriculaBR.confirmarMatricula();

        System.out.println("PROCESSANDO MATRÍCULA: CHILE");
        abstFactoryPais fabricaCL = new FactoryChile(250000.00, "Alino", "12.345.678-9");
        Matricula matriculaCL = new Matricula(fabricaCL);
        matriculaCL.confirmarMatricula();

    }
}