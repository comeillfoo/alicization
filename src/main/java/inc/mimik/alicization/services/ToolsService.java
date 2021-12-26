package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.ToolsEntity;

import java.util.List;

public interface ToolsService {
  List<ToolsEntity> findAllByFkResidentId( int id );

  void deleteById( int id );
}
