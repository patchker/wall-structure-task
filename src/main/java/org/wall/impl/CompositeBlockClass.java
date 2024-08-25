package org.wall.impl;

import org.wall.model.Block;
import org.wall.model.CompositeBlock;

import java.util.ArrayList;
import java.util.List;

public class CompositeBlockClass implements CompositeBlock {

    private List<Block> blocks;
    private String color;
    private String material;

    public CompositeBlockClass(String color, String material) {
        this.color = color;
        this.material = material;
        this.blocks = new ArrayList<>();
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}

