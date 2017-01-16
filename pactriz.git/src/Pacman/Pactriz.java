package Pacman;

public class Pactriz {
	public static void main(String [] args){
		
		
		
		String [][] grid = new String [9][9];
		
		grid[0][0]="."; 
		grid[0][1]=".";
		grid[0][2]=".";
		grid[0][3]=".";
		grid[0][4]=".";
		grid[0][5]=".";
		grid[0][6]=".";
		grid[0][7]=".";
		grid[0][8]=".";
		
		grid[1][0]=".";
		grid[1][1]=".";
		grid[1][2]="F";
		grid[1][3]=".";
		grid[1][4]=".";
		grid[1][5]=".";
		grid[1][6]=".";
		grid[1][7]=".";
		grid[1][8]=".";
		
		grid[2][0]=".";
		grid[2][1]=".";
		grid[2][2]=".";
		grid[2][3]=".";
		grid[2][4]=".";
		grid[2][5]=".";
		grid[2][6]="F";
		grid[2][7]=".";
		grid[2][8]=".";
		
		grid[3][0]=".";
		grid[3][1]=".";
		grid[3][2]=".";
		grid[3][3]=".";
		grid[3][4]=".";
		grid[3][5]=".";
		grid[3][6]=".";
		grid[3][7]=".";
		grid[3][8]=".";
		
		grid[4][0]=".";
		grid[4][1]=".";
		grid[4][2]=".";
		grid[4][3]=".";
		grid[4][4]="V";
		grid[4][5]=".";
		grid[4][6]=".";
		grid[4][7]=".";
		grid[4][8]=".";
		
		grid[5][0]=".";
		grid[5][1]=".";
		grid[5][2]=".";
		grid[5][3]=".";
		grid[5][4]=".";
		grid[5][5]=".";
		grid[5][6]=".";
		grid[5][7]=".";
		grid[5][8]=".";
			
		grid[6][0]=".";
		grid[6][1]=".";
		grid[6][2]=".";
		grid[6][3]=".";
		grid[6][4]=".";
		grid[6][5]=".";
		grid[6][6]=".";
		grid[6][7]=".";
		grid[6][8]=".";
		
		grid[7][0]=".";
		grid[7][1]=".";
		grid[7][2]=".";
		grid[7][3]=".";
		grid[7][4]=".";
		grid[7][5]=".";
		grid[7][6]="F";
		grid[7][7]=".";
		grid[7][8]=".";
		
		grid[8][0]=".";
		grid[8][1]=".";
		grid[8][2]=".";
		grid[8][3]=".";
		grid[8][4]=".";
		grid[8][5]=".";
		grid[8][6]=".";
		grid[8][7]=".";
		grid[8][8]=".";
		
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			
			
			System.out.println();
			}
		
		grid[4][4]=".";
		grid[4][5]="V";
		grid[4][6]=" ";
		grid[4][5]=".";
		grid[4][6]=".";
		grid[4][6]="V";
		
		System.out.println("SCORE 0 Ponto");{
		}
				
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			
			System.out.println();
	
		}
		grid[4][5]=".";
		grid[4][6]="V";
		grid[4][6]=" ";
		grid[4][7]="V";
		
		System.out.println();
		
		System.out.println("SCORE 1 Ponto");{
		}
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	}
		
		grid[4][7]=" ";
		grid[4][8]="V";
		
		System.out.println();
		
		System.out.println("SCORE 2 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		grid[4][7]=" ";
		grid[4][8]=" ";
		grid[5][8]="V";
		
		System.out.println();
		
		System.out.println("SCORE 3 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	}
		grid[4][8]=" ";
		grid[5][8]="V";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		grid[2][6]=".";
		grid[2][7]="F";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	}
		grid[2][7]=".";
		grid[2][8]="F";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		grid[2][8]=".";
		grid[3][8]="F";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
}
		grid[3][8]=".";
		grid[4][8]="F";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}	
		
		grid[4][8]=" ";
		grid[5][8]="F";
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Perdeu uma chance");{
	}
		System.out.println();
		
		System.out.println("Nova Chance");	
		
		grid[4][4]="V";
				
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			
			System.out.println();
		}
		grid[4][8]=" ";
		grid[4][8]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	}
		grid[4][4]=".";
		grid[4][5]="V";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		grid[4][5]=" ";
		grid[4][6]="V";
		grid[4][4]=" ";
		grid[4][7]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
		System.out.println();
	}
		grid[4][6]=" ";
		grid[4][7]="V";
		grid[4][5]=" ";
		grid[4][4]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
		System.out.println();
		}
		grid[4][7]=" ";
		grid[4][8]="V";
		grid[4][6]=" ";
		grid[4][5]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
}
		grid[5][8]=".";
		grid[4][8]="F";
		grid[4][6]=" ";
		grid[4][7]=" ";
		grid[4][5]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	
	}
		System.out.println("Perdeu mais uma chance");{
			
		}
		System.out.println();
		
		System.out.println("Nova Chance");
		
		grid[4][4]="V";
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			
			System.out.println();
}
		grid[4][6]=" ";
		grid[4][8]=".";
		grid[4][7]="F";
		grid[4][5]=" ";
		grid[4][4]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	}
		grid[4][6]=" ";
		grid[4][7]=".";
		grid[4][6]="F";
		grid[4][5]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
				System.out.println();
		}
		grid[4][6]=".";
		grid[4][5]="F";
		grid[4][7]=" ";
		grid[4][4]=" ";
		grid[4][3]=" ";
		
		System.out.println();
		
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
}
		grid[4][5]=".";
		grid[4][4]="F";
		grid[4][7]=" ";
		grid[4][6]=" ";
		grid[4][8]=" ";
		grid[4][3]=" ";
		System.out.println();
		System.out.println("SCORE 4 Pontos");{
		}
		
		System.out.println();
		
		for(int i =0;i<grid.length; i++){
			for(int j=0;j<grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
	}
				System.out.println("Última chance");{
					System.out.println();
					
					System.out.println("Nova Chance");
					
					grid[4][4]="V";
					grid[5][4]="F";
					grid[4][5]=" ";
					grid[4][6]=" ";
					grid[4][7]=" ";
					grid[4][8]=" ";
					System.out.println();
					System.out.println("SCORE 4 Pontos");{
					}
					
					System.out.println();
		}
				System.out.println();
				
				for(int i =0;i<grid.length; i++){
					for(int j=0;j<grid[i].length; j++){
						System.out.print(grid[i][j] + " ");
					}
					
					System.out.println();
				
		}
				grid[5][4]=".";
				grid[4][4]="F";
				grid[4][7]=" ";
				grid[4][6]=" ";
				grid[4][5]=" ";
				grid[4][8]=" ";
				System.out.println();
				
				
				System.out.println("SCORE 4 Pontos");{
				}
				
				System.out.println();
				
				for(int i =0;i<grid.length; i++){
					for(int j=0;j<grid[i].length; j++){
						System.out.print(grid[i][j] + " ");
					}
					System.out.println();
}
				
				
				System.out.println("GAME OVER!");{
					
					
					System.out.println();
					
	}
}
		}

