package com.noam.tutorialmod.block;


public class BlockPathLight extends BlockTM
{
    public BlockPathLight()
    {
        super();
        this.setBlockName("PathLight");
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setStepSound(soundTypePiston);
        this.setLightLevel(1.0F);

    }
}
