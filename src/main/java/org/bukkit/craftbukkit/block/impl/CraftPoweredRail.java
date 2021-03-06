/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

import net.minecraft.block.PoweredRailBlock;
import net.minecraft.state.property.BooleanProperty;

public final class CraftPoweredRail extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.RedstoneRail, org.bukkit.block.data.Powerable, org.bukkit.block.data.Rail {

    public CraftPoweredRail() {
        super();
    }

    public CraftPoweredRail(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.CraftPowerable

    private static final net.minecraft.state.property.BooleanProperty POWERED = getBoolean(net.minecraft.block.PoweredRailBlock.class, "powered");

    @Override
    public boolean isPowered() {
        return get(POWERED);
    }

    @Override
    public void setPowered(boolean powered) {
        set(POWERED, powered);
    }

    // org.bukkit.craftbukkit.block.data.CraftRail

    private static final net.minecraft.state.property.EnumProperty<?> SHAPE = getEnum(net.minecraft.block.PoweredRailBlock.class, "shape");

    @Override
    public Shape getShape() {
        return get(SHAPE, Shape.class);
    }

    @Override
    public void setShape(Shape shape) {
        set(SHAPE, shape);
    }

    @Override
    public java.util.Set<Shape> getShapes() {
        return getValues(SHAPE, Shape.class);
    }


    // org.bukkit.craftbukkit.block.data.CraftWaterlogged

    private static final BooleanProperty WATERLOGGED = getBoolean(PoweredRailBlock.class, "waterlogged");

    @Override
    public boolean isWaterlogged() {
        return get(CraftPoweredRail.WATERLOGGED);
    }

    @Override
    public void setWaterlogged(boolean waterlogged) {
        set(CraftPoweredRail.WATERLOGGED, waterlogged);
    }

}
