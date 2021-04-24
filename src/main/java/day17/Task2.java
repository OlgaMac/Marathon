package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_BLACK, ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY },
                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK },
                {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY, ChessPiece.KING_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,ChessPiece.EMPTY  },
                {ChessPiece.KING_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY },
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.KING_WHITE, ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY}
        });

        board.print();
    }
}
