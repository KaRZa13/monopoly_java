package dao;

import java.util.ArrayList;

public class PlayerDaoImpl implements PlayerDao {

    private ArrayList<Player> players = new ArrayList<>();

    public PlayerDaoImpl() {
        players.add(new Player("Rafael", 200));
        players.add(new Player("Papiou", 500));
        players.add(new Player("Mokiii", 10000));
    }

    @Override
    public ArrayList<Player> getAllPlayers() {
        return players;
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void updatePlayer(Player player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(player.getName())) {
                players.set(i, player);
                break;
            }
        }
    }

    @Override
    public void deletePlayer(Player player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(player.getName())) {
                players.remove(i);
                break;
            }
        }
    }
}
