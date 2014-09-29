package org.github.msn0.minecraft.caesar.item;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LexiconBook extends Item {
    public LexiconBook(int par1) {
        super(par1);
        setUnlocalizedName("Lexicom Book For Quantum Energy");
        setTextureName("caesar:lexiconBook");
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
