package day17;

public class Task2 {
    public static void main(String[] args) {
        int lenght = 10;
        int bright = 9;
        ChessPiece[][] cp = new ChessPiece[lenght][bright];
        ChessBoard board = new ChessBoard(cp);


               /* {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_BLACK, ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY },
                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK },
                {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY, ChessPiece.KING_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,ChessPiece.EMPTY  },
                {ChessPiece.KING_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY },
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.KING_WHITE, ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY}
        });*/
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < bright; j++) {
                cp[i][j] = ChessPiece.EMPTY;
            }
        }
        cp[1][0] = ChessPiece.ROOK_BLACK;
        cp[2][1] = ChessPiece.KING_BLACK;
        cp[3][5] = ChessPiece.BISHOP_WHITE;
        cp[7][3] = ChessPiece.PAWN_WHITE;
        cp[7][8] = ChessPiece.QUEEN_WHITE;
        board.print();
    }
}
