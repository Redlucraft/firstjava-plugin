package nl.redlucraft.core.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheepEvent implements Listener {

    @EventHandler
    public void Sheepevent(PlayerShearEntityEvent e){
        Player player = e.getPlayer();
        Entity entity = e.getEntity();

        if (entity.getType() == EntityType.SHEEP){
            player.sendMessage("You can not shear a sheep.");
            e.setCancelled(true);
        }else{
            player.sendMessage("This is not a sheep.");
        }
    }
}
