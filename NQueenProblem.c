#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h> 
bool isSafe(int board[],int row, int column){
	int i;
	for(i = 0;i<row;i++) {
		if(board[i]==column) {
			return false;
		}
		if (abs(board[i]-column) == abs(i-row)){
			return false;
		}
	}
	return true;
}
void placeQueen(int board[],int n,int row) {
	if (row == n) {
		int i;
		for(i = 0;i<n;i++){
			printf("%d ",board[i]);
		}
	  	printf("\n");
		return;
	}
	int column;
	for(column = 0;column<n;column++) {
		if (isSafe(board,row,column)){
			board[row] = column;
			placeQueen(board,n,row+1);
			board[row] = -1;
		}
	}
}
int main() {
	int board[] = {-1,-1,-1,-1};
	int len = 4;
	placeQueen(board,len,0);
	int i;
}
