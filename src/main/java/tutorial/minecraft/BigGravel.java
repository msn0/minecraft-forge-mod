package tutorial.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BigGravel extends Block {
    public BigGravel(int id, Material sand) {
        super(id, sand);
        setHardness(10);
        setStepSound(Block.soundGravelFootstep);
        setUnlocalizedName("Big Gravel Block");
        setCreativeTab(CreativeTabs.tabDecorations);
    }
}
