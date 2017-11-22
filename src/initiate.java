import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;


public class initiate implements CommandExecutor{

    public static int waiting_x = 715;
    public static int waiting_y = 109;
    public static int waiting_z = 203;
    public static int waiting_width = 8;

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "difficulty peaceful");
        // Set up waiting island border
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "worldborder center " + waiting_x + " " + waiting_z);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "worldborder set " + waiting_width);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "setworldspawn " + waiting_x + " " + waiting_y + " " + waiting_z);

        System.out.println("Battle Royale is ready!");
        Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&2Battle Royale is ready."));
        return true;
    }
}