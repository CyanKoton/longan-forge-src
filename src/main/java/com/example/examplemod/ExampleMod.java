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
    
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @Instance(ExampleMod.MODID)
    public static ExampleMod instance;
    
    // FML预初始化事件
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("hello 1");
    }
    
    // FML初始化事件
    @EventHandler
    public void init(FMLInitializationEvent event) {
        // 一些示例代码 DIRT BLOCK（泥土）
        System.out.println("hello 2");
        System.out.println("泥土 >> " + Blocks.dirt.getUnlocalizedName());
    }

    // FML初始化后事件
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("hello 3");
    }
}
