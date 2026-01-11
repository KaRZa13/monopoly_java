package iterator.concrete;

import iterator.Iterator;
import iterator.models.BoardSpaces;


public class BoardIterator implements Iterator<BoardSpaces> {
    private final Board board;
    private int index = 0;

    public BoardIterator(Board board) {
        this.board = board;
    }

    @Override
    public boolean hasNext() {
        return index < board.getSize();
    }

    @Override
    public BoardSpaces next() {
        return board.getBoardSpace(index++);
    }
}
