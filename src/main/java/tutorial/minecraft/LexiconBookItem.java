package tutorial.minecraft;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LexiconBookItem extends Item {
    public LexiconBookItem(int par1) {
        super(par1);
        setUnlocalizedName("Lexicom Book For Quantum Energy");
        setTextureName("examplemod:lexiconBook");
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
