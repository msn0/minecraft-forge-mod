package tutorial.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sword extends Item {

    public Sword(int par1) {
        super(par1);
        setMaxStackSize(512);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("test-item");
        setTextureName("examplemod:swordItem");
    }
}