package org.wall.impl;

import org.wall.model.Block;
import org.wall.model.CompositeBlock;
import org.wall.model.Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall() {
        this.blocks = new ArrayList<>();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return findBlockByColorRecursive(blocks, color);
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return findBlocksByMaterialRecursive(blocks, material);
    }

    @Override
    public int count() {
        return countRecursive(blocks);
    }

    private Optional<Block> findBlockByColorRecursive(List<Block> blocks, String color) {
        for (Block block : blocks) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
            if (block instanceof CompositeBlock) {
                Optional<Block> found = findBlockByColorRecursive(((CompositeBlock) block).getBlocks(), color);
                if (found.isPresent()) {
                    return found;
                }
            }
        }
        return Optional.empty();
    }

    private List<Block> findBlocksByMaterialRecursive(List<Block> blocks, String material) {
        List<Block> result = new ArrayList<>();
        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                result.add(block);
            }
            if (block instanceof CompositeBlock) {
                result.addAll(findBlocksByMaterialRecursive(((CompositeBlock) block).getBlocks(), material));
            }
        }
        return result;
    }

    private int countRecursive(List<Block> blocks) {
        int count = 0;
        for (Block block : blocks) {
            count++;
            if (block instanceof CompositeBlock) {
                count += countRecursive(((CompositeBlock) block).getBlocks());
            }
        }
        return count;
    }

    public void addBlocks(Block... blocks) {
        this.blocks.addAll(Arrays.asList(blocks));
    }

    public void removeBlock(Block block) {
        blocks.remove(block);
    }
}
