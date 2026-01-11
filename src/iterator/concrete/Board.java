package iterator.concrete;

import iterator.Aggregate;
import iterator.Iterator;
import iterator.models.BoardSpaces;

import java.util.ArrayList;
import java.util.List;

public class Board implements Aggregate<BoardSpaces> {
    private final List<BoardSpaces> boardSpaces;

    public Board() {
        this.boardSpaces = new ArrayList<>();
    }

    public void addBoardSpace(BoardSpaces bs) {
        boardSpaces.add(bs);
    }

    public BoardSpaces getBoardSpace(int index) {
        return boardSpaces.get(index);
    }

    public int getSize() {
        return boardSpaces.size();
    }

    @Override
    public Iterator<BoardSpaces> createIterator() {
        return new BoardIterator(this);
    }
}
