package com.YTrollman.CreativeWirelessTransmitter.gui.screen;

import com.YTrollman.CreativeWirelessTransmitter.CreativeWirelessTransmitter;
import com.YTrollman.CreativeWirelessTransmitter.container.CreativeWirelessTransmitterContainerMenu;
import com.mojang.blaze3d.vertex.PoseStack;
import com.refinedmods.refinedstorage.blockentity.NetworkNodeBlockEntity;
import com.refinedmods.refinedstorage.screen.BaseScreen;
import com.refinedmods.refinedstorage.screen.widget.sidebutton.RedstoneModeSideButton;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class CreativeWirelessTransmitterScreen extends BaseScreen<CreativeWirelessTransmitterContainerMenu> {
    public CreativeWirelessTransmitterScreen(CreativeWirelessTransmitterContainerMenu container, Inventory inventory, Component title) {
        super(container, 211, 137, inventory, title);
    }

    @Override
    public void onPostInit(int x, int y) {
        addSideButton(new RedstoneModeSideButton(this, NetworkNodeBlockEntity.REDSTONE_MODE));
    }

    @Override
    public void tick(int x, int y) {
        // NO OP
    }

    @Override
    public void renderBackground(PoseStack matrixStack, int x, int y, int mouseX, int mouseY) {
        bindTexture(CreativeWirelessTransmitter.MOD_ID, "gui/creative_wireless_transmitter.png");

        blit(matrixStack, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    public void renderForeground(PoseStack  matrixStack, int mouseX, int mouseY) {
        renderString(matrixStack, 7, 7, title.getString());
        renderString(matrixStack, 28, 25, "Infinite");
        renderString(matrixStack, 7, 43, I18n.get("container.inventory"));
    }
}
