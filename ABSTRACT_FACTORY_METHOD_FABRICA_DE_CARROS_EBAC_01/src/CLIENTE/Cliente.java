package CLIENTE;

import CARROS.Carros;
import FABRICADECARROS.FabricaDeCarros;
import PLACA.Placas;

public class Cliente {

    private FabricaDeCarros fabricaDeCarros;

    public Cliente(FabricaDeCarros fabricaDeCarros) {
        this.fabricaDeCarros = fabricaDeCarros;
    }


    public void criarPedido(){

        System.out.println("PEDIDO SOLICITADO!");

        Carros car = fabricaDeCarros.criarCarro();
        Placas placa = fabricaDeCarros.criarPlaca();





    }
}
