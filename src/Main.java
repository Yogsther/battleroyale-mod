import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;


public class Main extends JavaPlugin{

    public static List<Player> players;

    public static int waiting_x = 715;
    public static int waiting_y = 109;
    public static int waiting_z = 203;
    public static int waiting_width = 8;


    public void onEnable(){

        // Get commands
        this.getCommand("start").setExecutor((CommandExecutor)new start());

        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/difficulty peaceful");
        // Set up waiting island border
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/worldborder center " + waiting_x + " " + waiting_z);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/worldborder set " + waiting_width);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/setworldspawn " + waiting_x + " " + waiting_y + " " + waiting_z);

        System.out.println("Battle Royale is ready!");

    }


    public void onDisable(){
        System.out.println("mcBR disabled.");

    }

}
