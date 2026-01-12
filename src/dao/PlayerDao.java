package dao;

import java.util.List;

public interface PlayerDao {

    List<Player> getAllPlayers();

    void addPlayer(Player player);

    void updatePlayer(Player player);

    void deletePlayer(Player player);
}
