package FABRICADECARROS;

import CARROS.Carros;
import CARROS.CarrosDeLuxo;
import PLACA.PlacaDeLuxo;
import PLACA.Placas;

public class FabricaCarroLuxo implements FabricaDeCarros{
    @Override
    public Carros criarCarro() {
        Carros car = new CarrosDeLuxo();
        car.contratoCarro();
        return car;

    }

    @Override
    public Placas criarPlaca() {
        Placas placa = new PlacaDeLuxo();
        placa.placa();
        return placa;
    }
}
