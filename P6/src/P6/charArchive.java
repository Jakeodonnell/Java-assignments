package P6;

/**
 *
 * The class creates Array7x7 objects to desired characters. 
 * The objects are made to be used in a flowing text.
 * 
 * @author Marcus Nordström, Anna Klingberg Brondin, Stefan von Freytag-Loringhoven, 
 * Benjamin Jonsson Zakrisson, Sebastian Carlsson, Jake O´Donnell
 * 
 *
 */

public class charArchive {
	private Array7x7 currentChar;							
	
	/**
	 *  Returns an array7x7 for the character which is assigned as argument. 
	 *  If a character cant't be found, the method returns the "UNKNOWN" character.
	 *  
	 *   @param  param : Desired character 
	 *   @return Character as Array7x7 object. 
	 */
	
	public Array7x7 returnLabel(char param) {				
		switch(param) {
		case 'A' :{
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
		case '0':{
			return get_0();
		}
		case '1':{
			return get_1();
		}
		case '2':{
			return get_2();
		}
		case '3':{
			return get_3();
		}
		case '4':{
			return get_4();
		}
		case '5':{
			return get_5();
		}
		case '6':{
			return get_6();
		}
		case '7':{
			return get_7();
		}
		case '8':{
			return get_8();
		}
		case '9':{
			return get_9();
		}
		case '.': {
			return get_DOT();
		}
		case ',': {
			return get_COMMA();
		}
		case '+':{
			return get_PLUS();
		}
		case '-': {
			return get_MINUS();
		}
		case '*': {
			return get_ASTERISK();
		}
		case '=': {
			return get_EQUALS();
		}
		case '?':{
			return get_QUESTION_MARK();
		}
		case '!': {
			return get_XCLAMATION_MARK();
		}
		case '(': {
			return get_OPEN_BRACKET();
		}
		case ')': {
			return get_CLOSED_BRACKET();
		}
		case '/': {
			return get_SLASH();
		}
		case '\\': {
			return get_BACKSLASH();
		}
		case ':': {
			return get_COLON();
		}
		case ';': {
			return get_SEMICOLON();
		}
		case '_': {
			return get_UNDERSCORE();
		}
		case '#': {
			return get_HASHTAG();
		}
		case '@': {
			return get_AT_SIGN();
		}
		case '&': {
			return get_AMPERSAND();
		}
		case '"': {
			return get_QUOTATION_MARK();
		}
		case ' ':{
			return get_SPACE();
		}
		}
		return get_UNKNOWN(); 

	/**
	 *  Returns an array7x7 for the character which is assigned as argument. 
	 *  If a character cant't be found, the method returns the array "UNKNOWN".
	 *  
	 *   @param Desired character 
	 *   @return Character as Array7x7 object. 
	 */
			
	}
	public Array7x7 returnLabel(char[] param) { 							
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
			case '0':{
				return get_0();
			}
			case '1':{
				return get_1();
			}
			case '2':{
				return get_2();
			}
			case '3':{
				return get_3();
			}
			case '4':{
				return get_4();
			}
			case '5':{
				return get_5();
			}
			case '6':{
				return get_6();
			}
			case '7':{
				return get_7();
			}
			case '8':{
				return get_8();
			}
			case '9':{
				return get_9();
			}
			case '.': {
				return get_DOT();
			}
			case ',': {
				return get_COMMA();
			}
			case '+':{
				return get_PLUS();
			}
			case '-': {
				return get_MINUS();
			}
			case '*': {
				return get_ASTERISK();
			}
			case '=': {
				return get_EQUALS();
			}
			case '?':{
				return get_QUESTION_MARK();
			}
			case '!': {
				return get_XCLAMATION_MARK();
			}
			case '(': {
				return get_OPEN_BRACKET();
			}
			case ')': {
				return get_CLOSED_BRACKET();
			}
			case '/': {
				return get_SLASH();
			}
			case '\\': {
				return get_BACKSLASH();
			}
			case ':': {
				return get_COLON();
			}
			case ';': {
				return get_SEMICOLON();
			}
			case '_': {
				return get_UNDERSCORE();
			}
			case '#': {
				return get_HASHTAG();
			}
			case '@': {
				return get_AT_SIGN();
			}
			case '&': {
				return get_AMPERSAND();
			}
			case '"': {
				return get_QUOTATION_MARK();
			}
			}
		}
		return get_UNKNOWN();
	}

	public Array7x7 get_SPACE()  {
		int[][] space = { 
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 } };
		Array7x7 charSpace = new Array7x7(space);
		return charSpace;
	}
	
	public Array7x7 get_UNKNOWN() {
		int[][] unknown = {
				{ 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 0, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1 } };
		Array7x7 charUnknown = new Array7x7(unknown);
		return charUnknown;
		}
	
	
	public Array7x7 get_A() {
		int[][] A = { 
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charA = new Array7x7(A);
		return charA;
	}

	public Array7x7 get_B() {
		int[][] B = { 
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		Array7x7 charB = new Array7x7(B);
		return charB;
	}

	public Array7x7 get_C() {
		int[][] C = {
				{ 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 0 } };
		Array7x7 charC = new Array7x7(C);
		return charC;
	}

	public Array7x7 get_D() {
		int[][] D = { 
				{ 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 0, 0, 0 } };
		Array7x7 charD = new Array7x7(D);
		return charD;
	}

	public Array7x7 get_E() {
		int[][] E = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		Array7x7 charE = new Array7x7(E);
		return charE;
	}

	public Array7x7 get_F() {
		int [][] F =  {
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 } };
		Array7x7 charF = new Array7x7(F);
		return charF;
	}

	public Array7x7 get_G() {
		int [][] G = {
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		Array7x7 charG  = new Array7x7(G);
		return charG;
	}

	public Array7x7 get_H() {
		int [][] H = {
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charH = new Array7x7(H);
		return charH;
	}

	public Array7x7 get_I() {
		int [][] I = {
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		Array7x7 charI = new Array7x7(I);
		return charI;
	}

	public Array7x7 get_J() {
		int [][] J = {
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0 } };
		Array7x7 charJ = new Array7x7(J);
		return charJ;
	}

	public Array7x7 get_K() {
		int [][] K = {
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charK = new Array7x7(K);
		return charK;
	}

	public Array7x7 get_L() {
		int [][] L = {
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		Array7x7 charL = new Array7x7(L);
		return charL;
	}

	public Array7x7 get_M() {
		int [][] M = {
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 1, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charM = new Array7x7(M);
		return charM;	
	}

	public Array7x7 get_N() {
		int [][] N = {
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charN = new Array7x7(N);
		return charN;
	}

	public Array7x7 get_O() {
		int [][] O = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 } };
		Array7x7 charO = new Array7x7(O);
		return charO;
	}

	public Array7x7 get_P() {
		int[][] P = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 } };
		Array7x7 charP = new Array7x7(P);
		return charP;
	}

	public Array7x7 get_Q() {
		int[][] Q = { 
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 } };
		Array7x7 charQ = new Array7x7(Q);
		return charQ;
	}

	public Array7x7 get_R() {
		int[][] R = { 
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charR = new Array7x7(R);
		return charR;
	}

	public Array7x7 get_S() {
		int[][] S = { 
				{ 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 } };
		Array7x7 charS = new Array7x7(S);
		return charS;
	}

	public Array7x7 get_T() {
		int[][] T = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		Array7x7 charT = new Array7x7(T);
		return charT;
	}

	public Array7x7 get_U() {
		int[][] U = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 } };
		Array7x7 charU = new Array7x7(U);
		return charU;
	}

	public Array7x7 get_V() {
		int[][] V = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		Array7x7 charV = new Array7x7(V);
		return charV;
	}

	public Array7x7 get_W() {
		int[][] W = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 } };
		Array7x7 charW = new Array7x7(W);
		return charW;
	}

	public Array7x7 get_X() {
		int[][] X = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 } };
		Array7x7 charX = new Array7x7(X);
		return charX;
	}

	public Array7x7 get_Y() {
		int[][] Y = { 
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 } };
		Array7x7 charY = new Array7x7(Y);
		return charY;
	}

	public Array7x7 get_Z() {
		int[][] Z = { 
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		Array7x7 charZ = new Array7x7(Z);
		return charZ;
	}

	public Array7x7 get_0() {
		int [][] zero = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 }};
		Array7x7 charZero = new Array7x7(zero);
		return charZero;
	}

	public Array7x7 get_1() {
		int [][] one = {
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 } };
		Array7x7 charOne = new Array7x7(one);
		return charOne;
	}

	public Array7x7 get_2() {
		int [][] two = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },			
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 } };
		Array7x7 charTwo = new Array7x7(two);
		return charTwo;
	}

	public Array7x7 get_3() {
		int [][] three = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 }};
		Array7x7 charThree = new Array7x7(three);
		return charThree;
	}

	public Array7x7 get_4() {
		int [][] four = {
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 }};
		Array7x7 charFour = new Array7x7(four);
		return charFour;
	}

	public Array7x7 get_5() {
		int [][] five = {
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 }};
		Array7x7 charFive = new Array7x7(five);
		return charFive;
	}

	public Array7x7 get_6() {
		int [][] six = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 }};
		Array7x7 charSix = new Array7x7(six);
		return charSix;
	}

	public Array7x7 get_7() {
		int [][] seven = {
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 }};
		Array7x7 charSeven = new Array7x7(seven);
		return charSeven;
	}

	public Array7x7 get_8() {
		int [][] eight = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 }};
		Array7x7 charEight = new Array7x7(eight);
		return charEight;
	}

	public Array7x7 get_9() {
		int [][] nine = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 }};
		Array7x7 charNine = new Array7x7(nine);
		return charNine;
	}

	public Array7x7 get_DOT() {
		int [][] dot = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 }};
		Array7x7 charDot = new Array7x7(dot);
		return charDot;
	}

	public Array7x7 get_COMMA() {
		int [][] comma = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 }};
		Array7x7 charComma = new Array7x7(comma);
		return charComma;
	}

	public Array7x7 get_PLUS() {
		int [][] plus = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charPlus = new Array7x7(plus);
		return charPlus;
	}

	public Array7x7 get_MINUS() {
		int [][] minus = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charMinus = new Array7x7(minus);
		return charMinus;
	}

	public Array7x7 get_ASTERISK() {
		int [][] asterisk = {
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 }};
		Array7x7 charAsterisk = new Array7x7(asterisk);
		return charAsterisk;
	}

	public Array7x7 get_EQUALS() {
		int [][] equals = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charEquals = new Array7x7(equals);
		return charEquals;
	}

	public Array7x7 get_QUESTION_MARK() {
		int [][] questionMark = {
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 }};
		Array7x7 charQuestionMark = new Array7x7(questionMark);
		return charQuestionMark;
	}

	public Array7x7 get_XCLAMATION_MARK() {
		int [][] xclamationMark = {
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 }};
		Array7x7 charXclamationMark = new Array7x7(xclamationMark);
		return charXclamationMark;
	}

	public Array7x7 get_OPEN_BRACKET() {
		int [][] openBracket = {
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 }};
		Array7x7 charOpenBracket = new Array7x7(openBracket);
		return charOpenBracket;
	}

	public Array7x7 get_CLOSED_BRACKET() {
		int [][] closedBracket = {
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 }};
		Array7x7 charClosedBracket = new Array7x7(closedBracket);
		return charClosedBracket;
	}

	public Array7x7 get_SLASH() {
		int [][] slash = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charSlash = new Array7x7(slash);
		return charSlash;
	}

	public Array7x7 get_BACKSLASH() {
		int [][] Backslash = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charBackslash = new Array7x7(Backslash);
		return charBackslash;
	}

	public Array7x7 get_COLON() {
		int [][] colon = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charColon = new Array7x7(colon);
		return charColon;
	}

	public Array7x7 get_SEMICOLON() {
		int [][] semicolon = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 }};
		Array7x7 charSemicolon = new Array7x7(semicolon);
		return charSemicolon;
	}

	public Array7x7 get_UNDERSCORE() {
		int [][] underscore = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1, 1, 1 }};
		Array7x7 charUnderscore = new Array7x7(underscore);
		return charUnderscore;
	}

	public Array7x7 get_HASHTAG() {
		int [][] hashtag = {
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		Array7x7 charHashtag = new Array7x7(hashtag);
		return charHashtag;
	}

	public Array7x7 get_AT_SIGN() {
		int [][] atSign = {
				{ 0, 1, 1, 1, 1, 1, 0 },
				{ 1, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 1 },
				{ 0, 1, 1, 1, 1, 0, 0 }};
		Array7x7 charAtSign = new Array7x7(atSign);
		return charAtSign;
	}

	public Array7x7 get_AMPERSAND() {
		int [][] ampersand = {
				{ 0, 0, 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 1, 0, 1, 0 }};
		Array7x7 charAmpersand = new Array7x7(ampersand);
		return charAmpersand;
	}

	public Array7x7 get_QUOTATION_MARK() {
		int [][] quotationMark = {
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }};

		Array7x7 charQuotationMark = new Array7x7(quotationMark);
		return charQuotationMark;
	}
	public Array7x7 getCurrent() {
		return this.currentChar;
	}
	public void setCurrent(Array7x7 param) {
		this.currentChar = param;
	}
}
