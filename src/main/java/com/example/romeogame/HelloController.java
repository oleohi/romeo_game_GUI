package com.example.romeogame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloController {

    @FXML
    private ImageView card00;

    @FXML
    private ImageView card01;

    @FXML
    private ImageView card02;

    @FXML
    private ImageView card03;

    @FXML
    private ImageView card04;

    @FXML
    private ImageView card05;

    @FXML
    private ImageView card06;

    @FXML
    private ImageView card10;

    @FXML
    private ImageView card11;

    @FXML
    private ImageView card12;

    @FXML
    private ImageView card13;

    @FXML
    private ImageView card14;

    @FXML
    private ImageView card15;

    @FXML
    private ImageView card16;

    @FXML
    private ImageView card20;

    @FXML
    private ImageView card21;

    @FXML
    private ImageView card22;

    @FXML
    private ImageView card23;

    @FXML
    private ImageView card24;

    @FXML
    private ImageView card25;

    @FXML
    private ImageView card26;

    @FXML
    private ImageView card30;

    @FXML
    private ImageView card31;

    @FXML
    private ImageView card32;

    @FXML
    private ImageView card33;

    @FXML
    private ImageView card34;

    @FXML
    private ImageView card35;

    @FXML
    private ImageView card36;

    @FXML
    private ImageView card40;

    @FXML
    private ImageView card41;

    @FXML
    private ImageView card42;

    @FXML
    private ImageView card43;

    @FXML
    private ImageView card44;

    @FXML
    private ImageView card45;

    @FXML
    private ImageView card46;

    @FXML
    private ImageView card50;

    @FXML
    private ImageView card51;

    @FXML
    private ImageView card52;

    @FXML
    private ImageView card53;

    @FXML
    private ImageView card54;

    @FXML
    private ImageView card55;

    @FXML
    private ImageView card56;

    @FXML
    private ImageView card60;

    @FXML
    private ImageView card61;

    @FXML
    private ImageView card62;

    @FXML
    private ImageView card63;

    @FXML
    private ImageView card64;

    @FXML
    private ImageView card65;

    @FXML
    private ImageView card66;

    @FXML
    private ImageView blackKing; // Black chess counter (King)

    @FXML
    private ImageView redKing; // Red chess counter (King)

    @FXML
    private Label turnLabel;

    private static final int GRID_SIZE = 7;

    private List<String> imagePaths;

    private boolean isRedTurn = true; // Flag to track whose turn it is ==> Red starts first


    private int redChessRow; // Row coordinate of the red chess king
    private int redChessCol; // Column coordinate of the red chess king
    private int blackChessRow; // Row coordinate of the black chess king
    private int blackChessCol; // Column coordinate of the black chess king

    // Method to update the position of the red chess king
    private void updateRedChessPosition(int newRow, int newCol) {
        redChessRow = newRow;
        redChessCol = newCol;
    }

    // Method to update the position of the black chess king
    private void updateBlackChessPosition(int newRow, int newCol) {
        blackChessRow = newRow;
        blackChessCol = newCol;
    }


    @FXML
    private void initialize() {

        // Set font size and style
        turnLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        turnLabel.setTextFill(Color.RED); // Set text color to red for Red's turn

        // Load image file paths into a list
        loadImagePathList();

        // Shuffle the list to randomize the order of card images
        Collections.shuffle(imagePaths);

        // Set images to ImageView objects defined in FXML
        int index = 0;
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                try {
                    // Load image from the shuffled list
                    Image image = new Image(getClass().getResourceAsStream(imagePaths.get(index)));
//                    System.out.println("Image loaded successfully: " + imagePaths.get(index));
                    // Set the image to the corresponding ImageView object
                    if (row == 0 && col == 0) {
                        card00.setImage(image);
                    } else if (row == 0 && col == 1) {
                        card01.setImage(image);
                    } else if (row == 0 && col == 2) {
                        card02.setImage(image);
                    } else if (row == 0 && col == 3) {
                        card03.setImage(image);
                    } else if (row == 0 && col == 4) {
                        card04.setImage(image);
                    } else if (row == 0 && col == 5) {
                        card05.setImage(image);
                    } else if (row == 0 && col == 6) {
                        card06.setImage(image);
                    } else if (row == 1 && col == 0) {
                        card10.setImage(image);
                    } else if (row == 1 && col == 1) {
                        card11.setImage(image);
                    } else if (row == 1 && col == 2) {
                        card12.setImage(image);
                    } else if (row == 1 && col == 3) {
                        card13.setImage(image);
                    } else if (row == 1 && col == 4) {
                        card14.setImage(image);
                    } else if (row == 1 && col == 5) {
                        card15.setImage(image);
                    } else if (row == 1 && col == 6) {
                        card16.setImage(image);
                    } else if (row == 2 && col == 0) {
                        card20.setImage(image);
                    } else if (row == 2 && col == 1) {
                        card21.setImage(image);
                    } else if (row == 2 && col == 2) {
                        card22.setImage(image);
                    } else if (row == 2 && col == 3) {
                        card23.setImage(image);
                    } else if (row == 2 && col == 4) {
                        card24.setImage(image);
                    } else if (row == 2 && col == 5) {
                        card25.setImage(image);
                    } else if (row == 2 && col == 6) {
                        card26.setImage(image);
                    } else if (row == 3 && col == 0) {
                        card30.setImage(image);
                    } else if (row == 3 && col == 1) {
                        card31.setImage(image);
                    } else if (row == 3 && col == 2) {
                        card32.setImage(image);
                    } else if (row == 3 && col == 3) {
                        card33.setImage(image);
                    } else if (row == 3 && col == 4) {
                        card34.setImage(image);
                    } else if (row == 3 && col == 5) {
                        card35.setImage(image);
                    } else if (row == 3 && col == 6) {
                        card36.setImage(image);
                    } else if (row == 4 && col == 0) {
                        card40.setImage(image);
                    } else if (row == 4 && col == 1) {
                        card41.setImage(image);
                    } else if (row == 4 && col == 2) {
                        card42.setImage(image);
                    } else if (row == 4 && col == 3) {
                        card43.setImage(image);
                    } else if (row == 4 && col == 4) {
                        card44.setImage(image);
                    } else if (row == 4 && col == 5) {
                        card45.setImage(image);
                    } else if (row == 4 && col == 6) {
                        card46.setImage(image);
                    } else if (row == 5 && col == 0) {
                        card50.setImage(image);
                    } else if (row == 5 && col == 1) {
                        card51.setImage(image);
                    } else if (row == 5 && col == 2) {
                        card52.setImage(image);
                    } else if (row == 5 && col == 3) {
                        card53.setImage(image);
                    } else if (row == 5 && col == 4) {
                        card54.setImage(image);
                    } else if (row == 5 && col == 5) {
                        card55.setImage(image);
                    } else if (row == 5 && col == 6) {
                        card56.setImage(image);
                    } else if (row == 6 && col == 0) {
                        card60.setImage(image);
                    } else if (row == 6 && col == 1) {
                        card61.setImage(image);
                    } else if (row == 6 && col == 2) {
                        card62.setImage(image);
                    } else if (row == 6 && col == 3) {
                        card63.setImage(image);
                    } else if (row == 6 && col == 4) {
                        card64.setImage(image);
                    } else if (row == 6 && col == 5) {
                        card65.setImage(image);
                    } else if (row == 6 && col == 6) {
                        card66.setImage(image);
                    }

                    // Add more conditions for other ImageView objects if needed
                } catch (NullPointerException e) {
                    System.err.println("Error loading image: " + imagePaths.get(index));
                    e.printStackTrace();
                }
                // Increment index to move to the next image
                index++;
            }
        }
        // Swap the positions of spade Queen and heart Queen
        swapQueens();

        // Place black king and red king on the heart Queen and spade Queen positions
        placeKings();
    }

    private void placeKings() {
        // Load images for black king and red king
        Image blackKingImage = new Image(getClass().getResourceAsStream("/images/black_king.jpeg"));
        Image redKingImage = new Image(getClass().getResourceAsStream("/images/red_king.jpeg"));

        // Place black king on heart Queen position
        blackKing.setImage(blackKingImage);

        // Place red king on spade Queen position
        redKing.setImage(redKingImage);
    }

    private void swapQueens() {
        // Get the images for the spade Queen and heart Queen
        Image spadeQueen = new Image(getClass().getResourceAsStream("/images/queen_of_spades.png"));
        Image heartQueen = new Image(getClass().getResourceAsStream("/images/queen_of_hearts.png"));

        // Set the spade Queen to the bottom left corner
        card60.setImage(spadeQueen);

        // Set the heart Queen to the top right corner
        card06.setImage(heartQueen);
    }

    private void updateTurnLabel() {
        if (isRedTurn) {
            turnLabel.setText("Turn: Red player!");
            turnLabel.setTextFill(Color.RED); // Set text color to red for Red's turn
        } else {
            turnLabel.setText("Turn: Black player!");
            turnLabel.setTextFill(Color.BLACK); // Set text color to black for Black's turn
        }
    }

    boolean hasRedPlayerCompletedOpeningMove = false;
    boolean hasBlackPlayerCompletedOpeningMove = false;
    private boolean openingMovesCompleted = false;


    @FXML
    private void handleCardClick(MouseEvent event) {
        ImageView clickedCard = (ImageView) event.getSource();

        // Get the row and column index of the clicked card in the grid
        int row = GridPane.getRowIndex(clickedCard);
        int col = GridPane.getColumnIndex(clickedCard);

        // Check if opening moves phase is completed
        if (!openingMovesCompleted) {
            // If it's Red's turn
            if (isRedTurn && isRedOpeningMove(row, col)) {
                // Move the chess counter to the clicked card's position
                GridPane.setRowIndex(redKing, row);
                GridPane.setColumnIndex(redKing, col);
                updateRedChessPosition(row, col);
                hasRedPlayerCompletedOpeningMove = true;
                // Toggle the turn flag
                isRedTurn = !isRedTurn;
            } else if (!isRedTurn && isBlackOpeningMove(row, col)) { // If it's Black's turn
                // Move the chess counter to the clicked card's position
                GridPane.setRowIndex(blackKing, row);
                GridPane.setColumnIndex(blackKing, col);
                updateBlackChessPosition(row, col);
                hasBlackPlayerCompletedOpeningMove = true;
                // Toggle the turn flag
                isRedTurn = !isRedTurn;
            } else {
                // Show an error message for invalid move during opening moves
                showAlert("Invalid Opening Move", "You can only move to one of the 3 surrounding cards");
                return;
            }

            // Check if both players have completed their opening moves
//            if (isRedOpeningMoveCompleted() && isBlackOpeningMoveCompleted()) {
            if (hasRedPlayerCompletedOpeningMove && hasBlackPlayerCompletedOpeningMove) {
                openingMovesCompleted = true;
                // Update turn label
                updateTurnLabel();
            }
        } else {
            // Handle moves after opening moves phase is completed
            if (isValidMove(row, col)) {
                // Move the chess counter to the clicked card's position
                if (isRedTurn) {
                    GridPane.setRowIndex(redKing, row);
                    GridPane.setColumnIndex(redKing, col);
                    updateRedChessPosition(row, col);
                } else {
                    GridPane.setRowIndex(blackKing, row);
                    GridPane.setColumnIndex(blackKing, col);
                    updateBlackChessPosition(row, col);
                }
                // Toggle the turn flag
                isRedTurn = !isRedTurn;
                // Update turn label
                updateTurnLabel();
                // Check for win condition
                checkAndHandleWinCondition();
            } else {
                // Show an error message for invalid move
                showAlert("Invalid Move", "Invalid move.");
            }
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


    private boolean isValidMove(int row, int col) {
        // Check if the move is within the bounds of the grid
        if (row < 0 || row >= GRID_SIZE || col < 0 || col >= GRID_SIZE) {
            return false;
        }

        // Implement your specific rules for valid moves here
        // For example, you might allow movement to any adjacent card or any card on the grid after opening moves phase is completed
        if (!openingMovesCompleted) {
            // During opening moves phase, restrict movement to the surrounding cards for both players
            return isAdjacentToRedOpeningMove(row, col) || isAdjacentToBlackOpeningMove(row, col);
        } else {
            // After opening moves phase is completed, allow movement to any card on the grid
            return true;
        }
    }

    // Define methods to check if the clicked card is adjacent to Red's opening move
    private boolean isAdjacentToRedOpeningMove(int row, int col) {
        // Define the positions adjacent to Red's opening move
        int[] adjacentRows = {5, 6, 6}; // Define the row indices of adjacent positions
        int[] adjacentCols = {0, 0, 1}; // Define the column indices of adjacent positions
        for (int i = 0; i < adjacentRows.length; i++) {
            if (row == adjacentRows[i] && col == adjacentCols[i]) {
                return true;
            }
        }
        return false;
    }

    // Define methods to check if the clicked card is adjacent to Black's opening move
    private boolean isAdjacentToBlackOpeningMove(int row, int col) {
        // Define the positions adjacent to Black's opening move
        int[] adjacentRows = {0, 0, 1}; // Define the row indices of adjacent positions
        int[] adjacentCols = {5, 6, 6}; // Define the column indices of adjacent positions
        for (int i = 0; i < adjacentRows.length; i++) {
            if (row == adjacentRows[i] && col == adjacentCols[i]) {
                return true;
            }
        }
        return false;
    }


    private boolean isRedOpeningMove(int row, int col) {
        // Check if the clicked card is one of the valid opening moves for Red player
        return (row == 5 && (col == 0 || col == 1)) || (row == 6 && col == 1);
    }

    private boolean isBlackOpeningMove(int row, int col) {
        // Check if the clicked card is one of the valid opening moves for Black player
        return (col == 5 && (row == 0 || row == 1)) || (col == 6 && row == 1);
    }


    // Method to check for winning condition
    private boolean checkWinCondition() {
        // Check if Red has reached the Queen of Hearts
        int desiredRowRed = 0;
        int desiredColRed = 6;
        if (redChessRow == desiredRowRed && redChessCol == desiredColRed) {
            return true; // Red wins
        }

        // Check if Black has reached the Queen of Spades
        int desiredRowBlack = 6;
        int desiredColBlack = 0;
        if (blackChessRow == desiredRowBlack && blackChessCol == desiredColBlack) {
            return true; // Black wins
        }

        return false; // No winner yet
    }


    // Method to display winner in an alert
    private void displayWinner(String winner) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText("Winner: " + winner);
        alert.setContentText("Congratulations! " + winner + " has won the game.");
        alert.showAndWait();
    }

    // This method would be called after each move to check for a winner

    public void checkAndHandleWinCondition() {
        if (checkWinCondition()) {
            String winner;
            if (checkWinForPlayer("Red")) {
                winner = "Red Player";
            } else if (checkWinForPlayer("Black")) {
                winner = "Black Player";
            } else {
                winner = "No one"; // Handle the case if neither player has won
            }
            displayWinner(winner);

            // End the game or reset the board if needed
            initialize();
            isRedTurn = true;
            updateTurnLabel();
            resetChessCounters();
        }
    }

    private void resetChessCounters() {
        imagePaths.clear();
        hasRedPlayerCompletedOpeningMove = false;
        hasBlackPlayerCompletedOpeningMove = false;
        openingMovesCompleted = false;

        // Set the initial positions of the chess counters
        GridPane.setRowIndex(redKing, 6);  // Row index for the heart Queen
        GridPane.setColumnIndex(redKing, 0);  // Column index for the heart Queen

        GridPane.setRowIndex(blackKing, 0);  // Row index for the spade Queen
        GridPane.setColumnIndex(blackKing, 6);  // Column index for the spade Queen

        // Reset the positions of the chess counters
        redChessRow = 6;
        redChessCol = 6;
        blackChessRow = 0;
        blackChessCol = 0;
    }

    private boolean checkWinForPlayer(String player) {
        if (player.equals("Red")) {
            // Check if Red has reached the Queen of Hearts
            int desiredRowRed = 0;
            int desiredColRed = 6;
            return redChessRow == desiredRowRed && redChessCol == desiredColRed;
        } else if (player.equals("Black")) {
            // Check if Black has reached the Queen of Spades
            int desiredRowBlack = 6;
            int desiredColBlack = 0;
            return blackChessRow == desiredRowBlack && blackChessCol == desiredColBlack;
        }
        return false; // Invalid player name
    }

    private void loadImagePathList() {
        imagePaths = new ArrayList<>();
        // Add file paths of your card images to the list
        imagePaths.add("/images/back_of_card.png");
        imagePaths.add("/images/back_of_card.png");
        imagePaths.add("/images/back_of_card.png");
        imagePaths.add("/images/ace_of_clubs.png");
        imagePaths.add("/images/2_of_clubs.png");
        imagePaths.add("/images/3_of_clubs.png");
        imagePaths.add("/images/4_of_clubs.png");
        imagePaths.add("/images/5_of_clubs.png");
        imagePaths.add("/images/6_of_clubs.png");
        imagePaths.add("/images/8_of_clubs.png");
        imagePaths.add("/images/9_of_clubs.png");
        imagePaths.add("/images/10_of_clubs.png");
        imagePaths.add("/images/jack_of_clubs.png");
        imagePaths.add("/images/king_of_clubs.png");
        imagePaths.add("/images/ace_of_diamonds.png");
        imagePaths.add("/images/2_of_diamonds.png");
        imagePaths.add("/images/3_of_diamonds.png");
        imagePaths.add("/images/4_of_diamonds.png");
        imagePaths.add("/images/5_of_diamonds.png");
        imagePaths.add("/images/6_of_diamonds.png");
        imagePaths.add("/images/8_of_diamonds.png");
        imagePaths.add("/images/9_of_diamonds.png");
        imagePaths.add("/images/10_of_diamonds.png");
        imagePaths.add("/images/jack_of_diamonds.png");
        imagePaths.add("/images/king_of_diamonds.png");
        imagePaths.add("/images/ace_of_hearts.png");
        imagePaths.add("/images/2_of_hearts.png");
        imagePaths.add("/images/3_of_hearts.png");
        imagePaths.add("/images/4_of_hearts.png");
        imagePaths.add("/images/5_of_hearts.png");
        imagePaths.add("/images/6_of_hearts.png");
        imagePaths.add("/images/8_of_hearts.png");
        imagePaths.add("/images/9_of_hearts.png");
        imagePaths.add("/images/10_of_hearts.png");
        imagePaths.add("/images/jack_of_hearts.png");
        imagePaths.add("/images/king_of_hearts.png");
        imagePaths.add("/images/queen_of_hearts.png");
        imagePaths.add("/images/ace_of_spades.png");
        imagePaths.add("/images/2_of_spades.png");
        imagePaths.add("/images/3_of_spades.png");
        imagePaths.add("/images/4_of_spades.png");
        imagePaths.add("/images/5_of_spades.png");
        imagePaths.add("/images/6_of_spades.png");
        imagePaths.add("/images/8_of_spades.png");
        imagePaths.add("/images/9_of_spades.png");
        imagePaths.add("/images/10_of_spades.png");
        imagePaths.add("/images/jack_of_spades.png");
        imagePaths.add("/images/king_of_spades.png");
        imagePaths.add("/images/queen_of_spades.png");
        // Add more image paths as needed
    }
}
