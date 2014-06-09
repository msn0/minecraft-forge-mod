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
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}