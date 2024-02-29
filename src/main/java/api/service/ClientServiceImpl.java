package api.service;

import api.Numeros;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import respository.ClientRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    /**
     * Este método devuelve una lista de 100 números aleatorios.
     * @return
     */
    @Override
    public List<Integer> getAllNumbers() {
        ArrayList <Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add(Numeros.generaNumeroRandom());
        }
        return numeros;
    }

    /**
     * Este método recibe un número y devuelve un número aleatorio del mismo tamaño de digitos que el valor de este.
     * @param d
     * @return
     */
    @Override
    public String getNumberSize(int d) {
        return Numeros.numeroXDigito(d);
    }
}
