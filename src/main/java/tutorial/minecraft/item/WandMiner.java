package tutorial.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WandMiner extends Item {
    public WandMiner(int par1) {
        super(par1);
        setUnlocalizedName("Miner Wand");
        setMaxStackSize(512);
        setCreativeTab(CreativeTabs.tabTools);
        setTextureName("examplemod:wandMinerItem");
        setMaxDamage(100000);
    }
}