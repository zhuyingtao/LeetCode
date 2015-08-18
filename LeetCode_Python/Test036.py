__author__ = 'zyt'


class Solution:
    # @param {character[][]} board
    # @return {boolean}
    def isValidSudoku(self, board):
        length = len(board)
        for i in range(length):
            row, column = set(), set()
            if i % 3 == 0:
                group = [set(), set(), set()]
            for j in range(length):
                if board[i][j] in row or board[j][i] in column or board[i][j] in group[j // 3]:
                    return False
                else:
                    if board[i][j] != '.':
                        row.add(board[i][j])
                        group[j // 3].add(board[i][j])
                    if board[j][i] != '.':
                        column.add(board[j][i])
        return True
