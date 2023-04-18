package aula08.ex01;

import aula08.ex01.classes.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*empresa*/
        EmpresaViaturas empresa = new EmpresaViaturas("Autorepairs", "5846-547", "auto-01@autorepairs.com");


        /*ligeiro*/
        AutomovelLigeiro ligeiro = new AutomovelLigeiro("55-HE-68", "Opel", "Astra", 128, "WOF4053739234", 50);
        System.out.println(ligeiro);
        System.out.println();
        
        ligeiro.trajeto(254);
        ligeiro.trajeto(876);
        
        System.out.println(ligeiro.ultimoTrajeto());
        System.out.println();
        System.out.println(ligeiro);
        System.out.println();

        empresa.addVeiculo(ligeiro.getRegistration(), ligeiro); //add to empresa
        
        
        /*taxi*/
        Taxi taxi = new Taxi("HT-57-AI", "Mercedes Benz", "A45", 130, "DHE54412365", 35, 543658);
        System.out.println(taxi);
        System.out.println();
        
        taxi.setPower(135);
        taxi.trajeto(547);
        taxi.setLicense(541244);
        
        System.out.println(taxi);
        System.out.println();

        empresa.addVeiculo(taxi.getRegistration(), taxi);
        System.out.println();


        /*motociclo*/

        Motociclo moto = new Motociclo("58-SW-47", "Kawasaki", "Ninja", 254, Motociclo.MotorcycleType.Desportivo);
        System.out.println(moto);
        System.out.println();

        moto.trajeto(547);
        moto.trajeto(695);
        moto.setPower(300);

        System.out.println(moto);
        System.out.println();


        /*pesado passageiros eletrico*/
        PesadoPassageirosEletrico pesadoeletrico = new PesadoPassageirosEletrico("17-WE-SA", "Volvo", "9700", 174, "DJF874512365", 4781, 30, 75);

        System.out.println(pesadoeletrico);
        System.out.println();

        pesadoeletrico.carregar(30);

        System.out.println(pesadoeletrico.autonomia() + "%");
        System.out.println();

        pesadoeletrico.trajeto(985);
        pesadoeletrico.descarregar(80);

        empresa.addVeiculo(pesadoeletrico.getRegistration(), pesadoeletrico);

        System.out.println(pesadoeletrico);
        System.out.println();

        System.out.println("Veículos da empresa " + empresa.getName() + ": \n");
        for (Veiculo veiculo : empresa.getVeiculos().values() ) {
            System.out.println(veiculo);
            System.out.println();
        }
    }
}
