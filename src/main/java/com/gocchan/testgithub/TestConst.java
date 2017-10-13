package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestConst {


    private static final Map<String, List<String>> ROMAN_0 = new HashMap<String, List<String>>() {
    	{
    		put("", Arrays.asList(" ", "¢", "¤", "¦", "¨"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_1 = new HashMap<String, List<String>>() {
    	{
    		put("k", Arrays.asList("©", "«", "­", "¯", "±"));
    		put("g", Arrays.asList("ª", "¬", "®", "°", "²"));
    		put("s", Arrays.asList("³", "µ", "·", "¹", "»"));
    		put("z", Arrays.asList("´", "¶", "¸", "º", "¼"));
    		put("t", Arrays.asList("½", "¿", "Â", "Ä", "Æ"));
    		put("d", Arrays.asList("¾", "À", "Ã", "Å", "Ç"));
    		put("n", Arrays.asList("È", "É", "Ê", "Ë", "Ì"));
    		put("h", Arrays.asList("Í", "Ð", "Ó", "Ö", "Ù"));
    		put("b", Arrays.asList("Î", "Ñ", "Ô", "×", "Ú"));
    		put("p", Arrays.asList("Ï", "Ò", "Õ", "Ø", "Û"));
    		put("m", Arrays.asList("Ü", "Ý", "Þ", "ß", "à"));
    		put("y", Arrays.asList("â", "¢", "ä", "¢¥", "æ"));
    		put("r", Arrays.asList("ç", "è", "é", "ê", "ë"));
    		put("w", Arrays.asList("í", "¤¡", "¤", "¤¥", "ð"));
    		put("j", Arrays.asList("¶á", "¶", "¶ã", "¶¥", "¶å"));
    		put("f", Arrays.asList("Ó", "Ó¡", "Ó", "Ó¥", "Ó§"));
    		put("x", Arrays.asList("", "¡", "£", "¥", "§"));
    		put("v", Arrays.asList("", "¡", "", "¥", "§"));

    		// « ÌÙ¤ªGoogle API ÉÄ "G@QI"Æ³µ­Ï·³êé½ßB

    		put("q", Arrays.asList("­", "­¡", "­", "­¥", "­§"));
    		put("l", Arrays.asList("", "¡", "£" , "¥" , "§"));
    		put("c", Arrays.asList("©", "µ", "­", "¹", "±"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_2 = new HashMap<String, List<String>>() {
    	{
	    	put("wy", Arrays.asList("", "î", "", "ï", ""));
	    	put("ky", Arrays.asList("«á", "«¡", "«ã", "«¥", "«å"));
	    	put("gy", Arrays.asList("¬á", "¬¡", "¬ã", "¬¥", "¬å"));
	    	put("sy", Arrays.asList("µá", "µ¡", "µã", "µ¥", "µå"));
	    	put("sh", Arrays.asList("µá", "µ", "µã", "µ¥", "µå"));
	    	put("zy", Arrays.asList("¶á", "¶¡", "¶ã", "¶¥", "¶å"));
	    	put("ty", Arrays.asList("¿á", "¿¡", "¿ã", "¿¥", "¿å"));
	    	put("ch", Arrays.asList("¿á", "¿", "¿ã", "¿¥", "¿å"));
	    	put("dy", Arrays.asList("Àá", "À¡", "Àã", "À¥", "Àå"));
	    	put("ny", Arrays.asList("Éá", "É¡", "Éã", "É¥", "Éå"));
	    	put("hy", Arrays.asList("Ðá", "Ð¡", "Ðã", "Ð¥", "Ðå"));
	    	put("by", Arrays.asList("Ñá", "Ñ¡", "Ñã", "Ñ¥", "Ñå"));
	    	put("py", Arrays.asList("Òá", "Ò¡", "Òã", "Ò¥", "Òå"));
	    	put("my", Arrays.asList("Ýá", "Ý¡", "Ýã", "Ý¥", "Ýå"));
	    	put("ry", Arrays.asList("èá", "è¡", "èã", "è¥", "èå"));
	    	put("ts", Arrays.asList("Â", "Â¡", "Â", "Â¥", "Â§"));
	    	put("th", Arrays.asList("Äá", "Ä¡", "Äã", "Ä¥", "Äå"));
	    	put("dh", Arrays.asList("Åá", "Å¡", "Åã", "Å¥", "Åå"));
	    	put("xk", Arrays.asList("", "", "", "", ""));
	    	put("xt", Arrays.asList("", "", "Á", "", ""));
	    	put("xy", Arrays.asList("á", "¡", "ã", "¥", "å"));
	    	put("xw", Arrays.asList("ì", "", "", "", ""));
	    	put("wh", Arrays.asList("¤", "¤¡", "¤", "¤¥", "¤§"));
	    	put("vy", Arrays.asList("á", "¡", "ã", "¥", "å"));

	    	put("kw", Arrays.asList("­", "­¡", "­£", "­¥", "­§"));
	    	put("gw", Arrays.asList("®", "®¡", "®£", "®¥", "®§"));
	    	put("jy", Arrays.asList("¶á", "¶¡", "¶ã", "¶¥", "¶å"));
	    	put("cy", Arrays.asList("¿á", "¿¡", "¿ã", "¿¥", "¿å"));
	    	put("tw", Arrays.asList("Æ", "Æ¡", "Æ£", "Æ¥", "Æ§"));
	    	put("dw", Arrays.asList("Ç", "Ç¡", "Ç£", "Ç¥", "Ç§"));
	    	put("hw", Arrays.asList("Ó", "Ó¡", "", "Ó¥", "Ó§"));
	    	put("fy", Arrays.asList("Óá", "Ó¡", "Óã", "Ó¥", "Óå"));
	    	put("lk", Arrays.asList("", "", "", "", ""));
	    	put("lt", Arrays.asList("", "", "Á", "", ""));
	    	put("ly", Arrays.asList("á", "¡", "ã", "¥", "å"));
	    	put("lw", Arrays.asList("ì", "", "", "", ""));
	    	put("qw", Arrays.asList("­", "­¡", "­£", "­¥", "­§"));
	    	put("sw", Arrays.asList("·", "·¡", "·£", "·¥", "·§"));
	    	put("zw", Arrays.asList("¸", "¸¡", "¸£", "¸¥", "¸§"));
	    	put("fw", Arrays.asList("Ó", "Ó¡", "Ó£", "Ó¥", "Ó§"));
	    	put("qy", Arrays.asList("­á", "­¡", "­ã", "­¥", "­å"));
			put("t'", Arrays.asList("", "Ä¡", "Æ£", "", ""));
			put("d'", Arrays.asList("", "Å¡", "Ç£", "", ""));
    	}
    };


    private static final Map<String, List<String>> ROMAN_3 = new HashMap<String, List<String>>() {
	    {
	    	put("hwy", Arrays.asList("", "", "Óã", "", ""));
	    	put("xts", Arrays.asList("", "", "Á", "", ""));
	    	put("lts", Arrays.asList("", "", "Á", "", ""));
	    	put("t'y", Arrays.asList("", "", "Äã", "", ""));
	    	put("d'y", Arrays.asList("", "", "Åã", "", ""));
	    }
    };

	public static final List<String> BOIN = Arrays.asList("a","i","u","e","o");

	public static final Map<Character, Character> ZENKAKU = new HashMap<Character, Character>() {
	    {
	        put('!', 'I');
	        put('\"', 'h');
	        put('#', '');
	        put('$', '');
	        put('\\', '');
	        put('%', '');
	        put('&', '');
	        put('\'', 'f');
	        put('(', 'i');
	        put(')', 'j');
	        put('*', '');
	        put('+', '{');
	        put(',', 'A');

	        put('-', '[');
	        put('^', '['); // åI
	        put('.', 'B');
	        put('/', '^');
	        put('0', 'O');
	        put('1', 'P');
	        put('2', 'Q');
	        put('3', 'R');
	        put('4', 'S');
	        put('5', 'T');
	        put('6', 'U');
	        put('7', 'V');
	        put('8', 'W');
	        put('9', 'X');
	        put(':', 'F');
	        put(';', 'G');
	        put('<', '');
	        put('=', '');
	        put('>', '');
	        put('?', 'H');
	        put('@', '');
	        put('A', '`');
	        put('B', 'a');
	        put('C', 'b');
	        put('D', 'c');
	        put('E', 'd');
	        put('F', 'e');
	        put('G', 'f');
	        put('H', 'g');
	        put('I', 'h');
	        put('J', 'i');
	        put('K', 'j');
	        put('L', 'k');
	        put('M', 'l');
	        put('N', 'm');
	        put('O', 'n');
	        put('P', 'o');
	        put('Q', 'p');
	        put('R', 'q');
	        put('S', 'r');
	        put('T', 's');
	        put('U', 't');
	        put('V', 'u');
	        put('W', 'v');
	        put('X', 'w');
	        put('Y', 'x');
	        put('Z', 'y');
	        put('`', 'e');
	        put('[', 'u');
	        put(']', 'v');
	        put('a', '');
	        put('b', '');
	        put('c', '');
	        put('d', '');
	        put('e', '');
	        put('f', '');
	        put('g', '');
	        put('h', '');
	        put('i', '');
	        put('j', '');
	        put('k', '');
	        put('l', '');
	        put('m', '');
	        put('n', '');
	        put('o', '');
	        put('p', '');
	        put('q', '');
	        put('r', '');
	        put('s', '');
	        put('t', '');
	        put('u', '');
	        put('v', '');
	        put('w', '');
	        put('x', '');
	        put('y', '');
	        put('z', '');
	    }
    };

    public static Map<String, List<String>> ROMAN(int i) {
    	switch(i) {
			case 0:
				return ROMAN_0;
    		case 1:
    			return ROMAN_1;
    		case 2:
    			return ROMAN_2;
    		case 3:
    			return ROMAN_3;
    		default:
    			return null;
    	}
    }
}
