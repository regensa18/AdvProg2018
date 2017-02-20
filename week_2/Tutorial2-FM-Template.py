#	Mandatory 6: Create a program so it implement Factory Method Pattern. Di bawah merupakan class template yang bisa kalian gunakan. Kalian dibebaskan untuk memakai class seperti apa. 

def main():
	board = Board3x3()
	print (board)

class AbstractBoard:
	
	def __init__(self, rows, columns):
		self.board = [[None for _ in range(columns)] for _ in range(rows)]
		self.populate_board()
		
	def populate_board(self):
		raise NotImplementedError()

	def __str__(self):
		squares = []
		for x, row in enumerate(self.board):
			for y, column in enumerate(self.board):
				squares.append(self.board[x][y])
			squares.append("\n")
		return "".join(squares)

class Board3x3(AbstractBoard):
	def __init__(self):
		super().__init__(3, 3)
		
	def populate_board(self):
		for row in range(3):
			for column in range(3):
				if (column % 2): self.board[row][column] = "o"
				else: self.board[row][column] = "x"

# Mandatory 6: Uncomment the codes below
# class Piece(str):
	# __slots__ = ()
	
# class Circle(Piece):
# Mandatory 6: Implement the Factory class in here

# class Cross(Piece):
# Mandatory 6: Implement the Factory class in here

if __name__ == "__main__":
    main()
				
