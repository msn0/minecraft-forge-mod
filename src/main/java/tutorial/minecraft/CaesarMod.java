package tutorial.minecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "ExampleModID", name = "ExampleMod", version = "1.0.0")
@NetworkMod(clientSideRequired = true)
public class CaesarMod {

    private final static Item swordItem = new SwordItem(1);
    private final static Item wandMinerItem = new WandMinerItem(2);
    private final static Block swordBlock = new SwordBlock(2500, Material.cactus);

    @SidedProxy(clientSide = "tutorial.minecraft.ClientProxy", serverSide = "tutorial.minecraft.CommonProxy")
    public static CommonProxy proxy;

    @Instance(value = "ExampleModID")
    public static CaesarMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerItem(swordItem, swordItem.getUnlocalizedName());
        GameRegistry.registerItem(wandMinerItem, wandMinerItem.getUnlocalizedName());
        GameRegistry.registerBlock(swordBlock, swordBlock.getUnlocalizedName());
        MinecraftForge.setBlockHarvestLevel(swordBlock, "shovel", 0);
        GameRegistry.addShapelessRecipe(new ItemStack(swordItem, 1), Item.coal);
        GameRegistry.addShapelessRecipe(new ItemStack(swordBlock, 1), Item.coal, swordItem);
        GameRegistry.addShapedRecipe(new ItemStack(wandMinerItem, 1), "xx", "xy", 'x', new ItemStack(Block.dirt), 'y', new ItemStack(swordBlock));
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}