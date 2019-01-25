package ExternalResources;

public class panelChar {
	
	public int[][] returnLabel(char param) {
		switch(param) {
		case 'A':{
			return get_A();
		}
		case 'B':{
			return get_B();
		}
		case 'C':{
			return get_C();
		}
		case 'D':{
			return get_D();
		}
		case 'E':{
			return get_E();
		}
		case 'F':{
			return get_F();
		}
		case 'G':{
			return get_G();
		}
		case 'H':{
			return get_H();
		}
		case 'I':{
			return get_I();
		}
		case 'J':{
			return get_J();
		}
		case 'K':{
			return get_K();
		}
		case 'L':{
			return get_L();
		}
		case 'M':{
			return get_M();
		}
		case 'N':{
			return get_N();
		}
		case 'O':{
			return get_O();
		}
		case 'P':{
			return get_P();
		}
		case 'Q':{
			return get_Q();
		}
		case 'R':{
			return get_R();
		}
		case 'S':{
			return get_S();
		}
		case 'T':{
			return get_T();
		}
		case 'U':{
			return get_U();
		}
		case 'V':{
			return get_V();
		}
		case 'W':{
			return get_W();
		}
		case 'X':{
			return get_X();
		}
		case 'Y':{
			return get_Y();
		}
		case 'Z':{
			return get_Z();
		}
		}
		return get_SPACE();
	}
	public int[][] returnLabel(char[] param) {
		for(int i = 0; i < param.length; i++) {
		switch(param[i]) {
		case 'A':{
			return get_A();
		}
		case 'B':{
			return get_B();
		}
		case 'C':{
			return get_C();
		}
		case 'D':{
			return get_D();
		}
		case 'E':{
			return get_E();
		}
		case 'F':{
			return get_F();
		}
		case 'G':{
			return get_G();
		}
		case 'H':{
			return get_H();
		}
		case 'I':{
			return get_I();
		}
		case 'J':{
			return get_J();
		}
		case 'K':{
			return get_K();
		}
		case 'L':{
			return get_L();
		}
		case 'M':{
			return get_M();
		}
		case 'N':{
			return get_N();
		}
		case 'O':{
			return get_O();
		}
		case 'P':{
			return get_P();
		}
		case 'Q':{
			return get_Q();
		}
		case 'R':{
			return get_R();
		}
		case 'S':{
			return get_S();
		}
		case 'T':{
			return get_T();
		}
		case 'U':{
			return get_U();
		}
		case 'V':{
			return get_V();
		}
		case 'W':{
			return get_W();
		}
		case 'X':{
			return get_X();
		}
		case 'Y':{
			return get_Y();
		}
		case 'Z':{
			return get_Z();
		}
		}
		}
		return get_SPACE();
	}
	public int[][] get_SPACE(){
		int[][] panel = { 
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_A() {
		int[][] panel = { 
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_B(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		return panel;
	}
	public int[][] get_C(){
		int[][] panel = { 
				{ 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 0 } };
		return panel;
	}
	public int[][] get_D(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_E(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		return panel;
	}
	public int[][] get_F(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_G(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		return panel;
	}
	public int[][] get_H(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_I(){
		int[][] panel = { 
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_J(){
		int[][] panel = { 
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_K(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_L(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		return panel;
	}
	public int[][] get_M(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 1, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_N(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_O(){
		int[][] panel = { 
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 } };
		return panel;
	}
	public int[][] get_P(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_Q(){
		int[][] panel = { 
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_R(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_S(){
		int[][] panel = { 
				{ 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 } };
		return panel;
	}
	public int[][] get_T(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_U(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 } };
		return panel;
	}
	public int[][] get_V(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_W(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 } };
		return panel;
	}
	public int[][] get_X(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		return panel;
	}
	public int[][] get_Y(){
		int[][] panel = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		return panel;
	}
	public int[][] get_Z(){
		int[][] panel = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		return panel;
	}
	public int[][] get_Test(){
		int[][] panel = { 
				{ 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 4, 3, 4, 0, 1 },
				{ 1, 0, 3, 2, 3, 0, 1 },
				{ 1, 0, 4, 3, 4, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1 } };
		return panel;
	}
	
}
