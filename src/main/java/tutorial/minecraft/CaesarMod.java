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
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.item.Item;

@Mod(modid = "ExampleModID", name = "ExampleMod", version = "1.0.0")
@NetworkMod(clientSideRequired = true)
public class CaesarMod {

    private final static Item swordItem = new SwordItem(1111);
    private final static Item wandMinerItem = new WandMinerItem(1112);
    private final static Block swordBlock = new SwordBlock(2500, Material.cactus);
    private final static Block bigGravel = new BigGravel(2501, MaterialLogic.sand);
    private final static Item unnamedAtomItem = new UnnamedAtomItem(1122);
    private final static Item lexiconBook = new LexiconBookItem(1123);
    private final static QuantumTab QUANTUM_TAB = new QuantumTab("Quantum Energy");
    public final static Item hydrogenAtomItem = new HydrogenAtomItem(1124);
    public final static Item oxygenAtomItem = new OxygenAtomItem(1125);
    public final static Item bigFlintItem = new BigFlintItem(1126);
    public final static Item protonItem = new ProtonItem(1127);
    public final static Item neutronItem = new NeutronItem(1128);
    public final static Item handCrusherItem = new HandCrusherItem(1129);
    public final static Item electronItem = new Electron(1130);
    public final static Item particleOfWaterItem = new ParticleOfWaterItem(1131);


    @SidedProxy(clientSide = "tutorial.minecraft.ClientProxy", serverSide = "tutorial.minecraft.CommonProxy")
    public static CommonProxy proxy;

    @Instance(value = "ExampleModID")
    public static CaesarMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        bigGravel.setCreativeTab(QUANTUM_TAB);
        unnamedAtomItem.setCreativeTab(QUANTUM_TAB);
        hydrogenAtomItem.setCreativeTab(QUANTUM_TAB);
        oxygenAtomItem.setCreativeTab(QUANTUM_TAB);
        bigFlintItem.setCreativeTab(QUANTUM_TAB);
        protonItem.setCreativeTab(QUANTUM_TAB);
        neutronItem.setCreativeTab(QUANTUM_TAB);
        handCrusherItem.setCreativeTab(QUANTUM_TAB);
        electronItem.setCreativeTab(QUANTUM_TAB);
        particleOfWaterItem.setCreativeTab(QUANTUM_TAB);


        GameRegistry.registerBlock(swordBlock, swordBlock.getUnlocalizedName());
        GameRegistry.registerBlock(bigGravel, bigGravel.getUnlocalizedName());
        GameRegistry.registerItem(swordItem, swordItem.getUnlocalizedName());
        GameRegistry.registerItem(wandMinerItem, wandMinerItem.getUnlocalizedName());
        GameRegistry.registerItem(unnamedAtomItem, unnamedAtomItem.getUnlocalizedName());
        GameRegistry.registerItem(lexiconBook, lexiconBook.getUnlocalizedName());
        GameRegistry.registerItem(hydrogenAtomItem, hydrogenAtomItem.getUnlocalizedName());
        GameRegistry.registerItem(oxygenAtomItem, oxygenAtomItem.getUnlocalizedName());
        GameRegistry.registerItem(bigFlintItem, bigFlintItem.getUnlocalizedName());
        GameRegistry.registerItem(protonItem, protonItem.getUnlocalizedName());
        GameRegistry.registerItem(neutronItem, neutronItem.getUnlocalizedName());
        GameRegistry.registerItem(handCrusherItem, handCrusherItem.getUnlocalizedName());
        GameRegistry.registerItem(electronItem, electronItem.getUnlocalizedName());
        GameRegistry.registerItem(particleOfWaterItem, particleOfWaterItem.getUnlocalizedName());
//        FurnaceRecipes.smelting().addSmelting(Block.oreIron.blockID, 10, new ItemStack(Item.book, 5), 1f);
    }


    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}