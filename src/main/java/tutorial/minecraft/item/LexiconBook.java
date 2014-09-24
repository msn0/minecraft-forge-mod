package tutorial.minecraft.item;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LexiconBook extends Item {
    public LexiconBook(int par1) {
        super(par1);
        setUnlocalizedName("Lexicom Book For Quantum Energy");
        setTextureName("examplemod:lexiconBook");
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
