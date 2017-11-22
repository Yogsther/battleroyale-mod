import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;


public class start implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        Main.players = new ArrayList<Player>(Bukkit.getOnlinePlayers());


        Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&2The Game has started! " + Main.players.size() + " players, only one winner."));
        return true;
    }

}
