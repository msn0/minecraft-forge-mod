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
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tutorial.minecraft.block.BigGravel;
import tutorial.minecraft.item.Sword;
import tutorial.minecraft.item.BigFlint;
import tutorial.minecraft.item.Electron;
import tutorial.minecraft.item.HandCrusher;
import tutorial.minecraft.item.HydrogenAtom;
import tutorial.minecraft.item.LexiconBook;
import tutorial.minecraft.item.Neutron;
import tutorial.minecraft.item.OxygenAtom;
import tutorial.minecraft.item.ParticleOfWater;
import tutorial.minecraft.item.Proton;
import tutorial.minecraft.item.UnnamedAtom;
import tutorial.minecraft.item.WandMiner;

@Mod(modid = "ExampleModID", name = "ExampleMod", version = "1.0.0")
@NetworkMod(clientSideRequired = true)
public class CaesarMod {

    private final static QuantumTab quantumTab = new QuantumTab("Quantum Energy");
    private final static Block bigGravel = new BigGravel(2048, MaterialLogic.sand);
    private final static Item sword = new Sword(2049);
    private final static Item wandMiner = new WandMiner(2050);
    private final static Item unnamedAtom = new UnnamedAtom(2051);
    private final static Item lexiconBook = new LexiconBook(2052);
    private final static Item hydrogenAtom = new HydrogenAtom(2053);
    private final static Item oxygenAtom = new OxygenAtom(2054);
    private final static Item bigFlint = new BigFlint(2055);
    private final static Item proton = new Proton(2056);
    private final static Item neutron = new Neutron(2057);
    private final static Item handCrusher = new HandCrusher(2058);
    private final static Item electron = new Electron(2059);
    private final static Item particleOfWater = new ParticleOfWater(2060);


    @SidedProxy(clientSide = "tutorial.minecraft.ClientProxy", serverSide = "tutorial.minecraft.CommonProxy")
    public static CommonProxy proxy;

    @Instance(value = "ExampleModID")
    public static CaesarMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        bigGravel.setCreativeTab(quantumTab);
        unnamedAtom.setCreativeTab(quantumTab);
        hydrogenAtom.setCreativeTab(quantumTab);
        oxygenAtom.setCreativeTab(quantumTab);
        bigFlint.setCreativeTab(quantumTab);
        proton.setCreativeTab(quantumTab);
        neutron.setCreativeTab(quantumTab);
        handCrusher.setCreativeTab(quantumTab);
        electron.setCreativeTab(quantumTab);
        particleOfWater.setCreativeTab(quantumTab);

        GameRegistry.registerBlock(bigGravel, bigGravel.getUnlocalizedName());
        GameRegistry.registerItem(sword, sword.getUnlocalizedName());
        GameRegistry.registerItem(wandMiner, wandMiner.getUnlocalizedName());
        GameRegistry.registerItem(unnamedAtom, unnamedAtom.getUnlocalizedName());
        GameRegistry.registerItem(lexiconBook, lexiconBook.getUnlocalizedName());
        GameRegistry.registerItem(hydrogenAtom, hydrogenAtom.getUnlocalizedName());
        GameRegistry.registerItem(oxygenAtom, oxygenAtom.getUnlocalizedName());
        GameRegistry.registerItem(bigFlint, bigFlint.getUnlocalizedName());
        GameRegistry.registerItem(proton, proton.getUnlocalizedName());
        GameRegistry.registerItem(neutron, neutron.getUnlocalizedName());
        GameRegistry.registerItem(handCrusher, handCrusher.getUnlocalizedName());
        GameRegistry.registerItem(electron, electron.getUnlocalizedName());
        GameRegistry.registerItem(particleOfWater, particleOfWater.getUnlocalizedName());

        GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketWater), hydrogenAtom, hydrogenAtom, hydrogenAtom);
        GameRegistry.addShapedRecipe(new ItemStack(hydrogenAtom), "   ", " x ", "y  ", 'x', proton, 'y', electron);
    }


    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}