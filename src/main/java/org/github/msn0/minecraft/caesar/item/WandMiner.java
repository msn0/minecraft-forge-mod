package org.github.msn0.minecraft.caesar.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WandMiner extends Item {
    public WandMiner(int par1) {
        super(par1);
        setUnlocalizedName("Miner Wand");
        setMaxStackSize(512);
        setCreativeTab(CreativeTabs.tabTools);
        setTextureName("caesar:wandMinerItem");
        setMaxDamage(100000);
    }
}
