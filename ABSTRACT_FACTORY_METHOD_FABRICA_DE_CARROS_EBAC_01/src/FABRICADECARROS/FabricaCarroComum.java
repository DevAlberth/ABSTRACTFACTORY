package FABRICADECARROS;

import CARROS.Carros;
import CARROS.CarrosComuns;
import PLACA.PlacaCarroComum;
import PLACA.PlacaDeLuxo;
import PLACA.Placas;

public class FabricaCarroComum implements FabricaDeCarros{
    @Override
    public Carros criarCarro() {
        Carros car = new CarrosComuns();
        car.contratoCarro();
        return car;
    }

    @Override
    public Placas criarPlaca() {
        Placas placa = new PlacaCarroComum();
        placa.placa();
        return placa;
    }
}
