package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.ToolsEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface ToolsService {
  List<ToolsEntity> findAllByFkResidentId( int id );

  void deleteById( int id );

  @Transactional
  ToolsEntity addNewTool( int residentId, String name, int suit );
}
