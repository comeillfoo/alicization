package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.SexesEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SexesService {

  List<SexesEntity> getAll();
}
