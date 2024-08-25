/**
 * Wall Structure Task
 * ===================
 *
 * This project implements a wall structure composed of various types of blocks,
 * including simple blocks and composite blocks.
 *
 * @author Patryk Sioła
 * @since 2023-08-25
 *
 *
**/


package org.wall;

import org.wall.impl.CompositeBlockClass;
import org.wall.impl.SimpleBlock;
import org.wall.impl.Wall;
import org.wall.model.Block;
import org.wall.model.CompositeBlock;

import java.util.Optional;


public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall();

        Block blueBlock = new SimpleBlock("blue", "brick");
        Block redBlock = new SimpleBlock("red", "concrete");
        Block greenBlock = new SimpleBlock("green", "wood");

        CompositeBlock compositeBlock = new CompositeBlockClass("yellow", "mixed");

        ((CompositeBlockClass) compositeBlock).addBlock(new SimpleBlock("pink", "clay"));
        ((CompositeBlockClass) compositeBlock).addBlock(new SimpleBlock("purple", "marble"));

        wall.addBlocks(blueBlock, redBlock, greenBlock, compositeBlock);

        // Debug
        System.out.println("[wall-structure-task] \n");
        System.out.println("Total blocks: " + wall.count()+"\n");

        System.out.println("Searching for blue block...");
        Optional<Block> blueBlockFound = wall.findBlockByColor("blue");

        if (blueBlockFound.isPresent()) {
            System.out.println("Found block with color: " + blueBlockFound.get().getColor() + " and material: " + blueBlockFound.get().getMaterial()+ "\n");
        }


        System.out.println("Searching for brick blocks...");
        System.out.println("Brick blocks: " + wall.findBlocksByMaterial("brick").size());
    }
}