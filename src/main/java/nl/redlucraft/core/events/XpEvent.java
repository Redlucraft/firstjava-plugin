package nl.redlucraft.core.events;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XpEvent implements Listener {


    @EventHandler
    public void onXpBottleBreak(ExpBottleEvent e){
        e.setShowEffect(false);
    }
}
