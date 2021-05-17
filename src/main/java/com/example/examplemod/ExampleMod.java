package com.example.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {

    // MODID 标识符，请用英文个MODID，可以使用 小写 或 小写加下划线，比如examplemod、example_mod
    public static final String MODID = "examplemod";
    // MOD 版本号
    public static final String VERSION = "1.0";

    @Instance(ExampleMod.MODID)
    public static ExampleMod instance;

    // FMLPreInitializationEvent（FML预初始化事件）
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("hello 1");
    }

    // FMLInitializationEvent（FML初始化事件）
    @EventHandler
    public void init(FMLInitializationEvent event) {
        // 一些示例代码 DIRT BLOCK（泥土）
        System.out.println("hello 2");
        System.out.println("泥土 >> " + Blocks.dirt.getUnlocalizedName());
    }

    // FMLPostInitializationEvent（FML初始化后事件）
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("hello 3");
    }

}
