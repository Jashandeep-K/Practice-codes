class Solution:
    def finalPositionOfSnake(self, n, commands):
        i, j = 0, 0  # start at (0,0)

        for cmd in commands:
            if cmd == "UP":
                i -= 1
            elif cmd == "DOWN":
                i += 1
            elif cmd == "LEFT":
                j -= 1
            else:  # RIGHT
                j += 1

        return i * n + j
