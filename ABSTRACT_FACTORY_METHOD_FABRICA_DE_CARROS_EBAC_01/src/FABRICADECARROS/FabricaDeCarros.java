package FABRICADECARROS;

import CARROS.Carros;
import PLACA.Placas;

public interface FabricaDeCarros {
    Carros criarCarro();

    Placas criarPlaca();
}
