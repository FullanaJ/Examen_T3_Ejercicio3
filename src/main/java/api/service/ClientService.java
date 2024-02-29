package api.service;

import java.util.List;

public interface ClientService {

    List<Integer> getAllNumbers();

    String getNumberSize(int d);
}
