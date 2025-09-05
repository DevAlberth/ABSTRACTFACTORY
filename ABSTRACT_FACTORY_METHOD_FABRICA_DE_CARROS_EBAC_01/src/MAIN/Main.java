package MAIN;

import CARROS.Carros;
import CARROS.CarrosComuns;
import CARROS.CarrosDeLuxo;
import CLIENTE.Cliente;
import FABRICADECARROS.FabricaCarroComum;
import FABRICADECARROS.FabricaCarroLuxo;
import FABRICADECARROS.FabricaDeCarros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose = 0;
        boolean continu = true;

        FabricaDeCarros fabrica = null;

        System.out.println("VOCE DESEJA (1) CARRO COMUM OU (2) CARRO DE LUXO");

        choose = scan.nextInt();

    while (continu) {
        if (choose == 1) {
            fabrica = new FabricaCarroComum();
            fabrica.criarCarro();
            fabrica.criarPlaca();
            continu = false;
            break;
        } else if (choose == 2) {
            fabrica = new FabricaCarroLuxo();
            fabrica.criarCarro();
            fabrica.criarPlaca();
            continu = false;
            break;
        } else {
            System.out.println("OPÇÃO INVALIDA.");
            break;
        }
    }
        System.out.println("VOCÊ CHEGOU AO FIM DESSE PROGRAMA.");



    }
}