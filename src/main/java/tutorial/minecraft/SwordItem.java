package tutorial.minecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SwordItem extends Item {

    public SwordItem(int par1) {
        super(par1);
        setMaxStackSize(512);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("test-item");
        setTextureName("examplemod:swordItem");
    }
}