package ru.netology.sqr;
public class SQRService {
        public int searchForSquares(int beginningRange, int endRange) {
            int squareCountCounter = 0;
            for (int i = 10; i <= 99; i++) {
                if (beginningRange <= i * i && i * i <= endRange) {
                    squareCountCounter++;
                }
            }
            return squareCountCounter;

        }
}
