package tutorial.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SwordBlock extends Block {

    public static final String UNLOCALIZED_NAME = "SwordItem block";
    public static final float HARDNESS = 0.5f;

    public SwordBlock(int par, Material material) {
        super(par, material);
        setHardness(HARDNESS);
        setStepSound(Block.soundGravelFootstep);
        setUnlocalizedName(UNLOCALIZED_NAME);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
