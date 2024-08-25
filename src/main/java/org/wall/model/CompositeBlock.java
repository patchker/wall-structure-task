package org.wall.model;

import java.util.List;

public interface CompositeBlock extends Block {

    String getColor();

    String getMaterial();

    List<Block> getBlocks();
}
