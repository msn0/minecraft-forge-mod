package com.github.msn0.minecraft.caesar.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BigGravel extends Block {
    public BigGravel(int id, Material sand) {
        super(id, sand);
        setHardness(10f);
        setStepSound(Block.soundGravelFootstep);
        setUnlocalizedName("Big Gravel Block");
        setTextureName("caesar:bigGravel");
    }
}
