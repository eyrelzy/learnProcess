<<<<<<< HEAD
package algorithm.CrackingTheCodingInterview.ArrayAndString;

import java.util.HashSet;

/**
 *question1.1 
 *implement an algorithm to determine if a string has all unique characters.
 *What if you can not use additional data structures?
 *
 * è€ƒè™‘ï¼š
 * å­—ç¬¦æ˜¯å¦ä¸ºASCIIç¼–ç 
 * 
 * method1ï¼š
 * ä½¿ç”¨ hashæ¥æ“ä½œï¼šé¡ºåºè®¿é—®å­—ç¬¦ä¸²ä¸­çš„æ¯ä¸€ä¸ªå…ƒç´ ï¼Œè®¿é—®æ¯ä¸€ä¸ªå­—ç¬¦å‰ï¼Œåˆ¤æ–­è¯¥å­—ç¬¦æ˜¯å¦å­˜åœ¨äºŽhashè¡¨å†…ï¼Œ
 * å¦‚æžœä¸å­˜åœ¨ï¼Œåˆ™åŠ å…¥hashè¡¨ä¸­ï¼Œå¦‚æžœå­˜åœ¨ï¼Œè¡¨æ˜Žæœ‰é‡å¤å­—ç¬¦ï¼Œè¿”å›žfalseã€‚
 * 
 * method2ï¼š
 * å¦‚æžœæ˜¯ASCIIç¼–ç çš„è¯ï¼Œé‚£ä¹ˆä¸€å…±åªæœ‰256ä¸ªæ•°ï¼Œå¯ä»¥è€ƒè™‘ä½¿ç”¨ä½å›¾æ¥å®žçŽ°ï¼Œjavaä¸­ä¸€ä¸ªintå 4ä¸ªå­—èŠ‚ï¼Œ32ä½ã€‚é‚£ä¹ˆåªéœ€è¦ä¸€ä¸ªé•¿åº¦ä¸º8çš„intæ•°ç»„
 * å³å¯è¡¨ç¤ºæ‰€æœ‰çš„å­—ç¬¦ï¼ŒéšåŽé¡ºåºè®¿é—®å­—ç¬¦ä¸²ä¸­çš„å­—ç¬¦ï¼Œå¦‚æžœå­˜åœ¨å°†å¯¹åº”å­—ç¬¦çš„ASCIIç ç¼–å·çš„ä½è®¾ç½®ä¸º1å³å¯ã€‚
 */

public class q1 {

	public static boolean method1(String str){
		char[] cc = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(char c:cc){
			if(set.contains(c)){
				return false;
			}
			set.add(c);
		}
		return true;
	}

	public static  boolean method2(String str){
		char[] cc= str.toCharArray();
		int[] bitmap = new int[8];
		for(char c:cc){
			int i = (int)c;
			int idx=i/32;
			int offset=i%32;
			if(((bitmap[idx])&(1<<offset))!=0){
				return false;
			}
			bitmap[idx]=bitmap[idx]|(1<<offset);
		}
		return true;
	}

	//test
	public static void main(String[] args) {
		String s = "abcdaefg";
		System.out.println(method1(s));
		System.out.println(method2(s));
	}
}
=======
package algorithm.CrackingTheCodingInterview.ArrayAndString;

import java.util.HashSet;

/**
 *question1.1 
 *implement an algorithm to determine if a string has all unique characters.
 *What if you can not use additional data structures?
 *
 * ¿¼ÂÇ£º
 * ×Ö·ûÊÇ·ñÎªASCII±àÂë
 * 
 * method1£º
 * Ê¹ÓÃ hashÀ´²Ù×÷£ºË³Ðò·ÃÎÊ×Ö·û´®ÖÐµÄÃ¿Ò»¸öÔªËØ£¬·ÃÎÊÃ¿Ò»¸ö×Ö·ûÇ°£¬ÅÐ¶Ï¸Ã×Ö·ûÊÇ·ñ´æÔÚÓÚhash±íÄÚ£¬
 * Èç¹û²»´æÔÚ£¬Ôò¼ÓÈëhash±íÖÐ£¬Èç¹û´æÔÚ£¬±íÃ÷ÓÐÖØ¸´×Ö·û£¬·µ»Øfalse¡£
 * 
 * method2£º
 * Èç¹ûÊÇASCII±àÂëµÄ»°£¬ÄÇÃ´Ò»¹²Ö»ÓÐ256¸öÊý£¬¿ÉÒÔ¿¼ÂÇÊ¹ÓÃÎ»Í¼À´ÊµÏÖ£¬javaÖÐÒ»¸öintÕ¼4¸ö×Ö½Ú£¬32Î»¡£ÄÇÃ´Ö»ÐèÒªÒ»¸ö³¤¶ÈÎª8µÄintÊý×é
 * ¼´¿É±íÊ¾ËùÓÐµÄ×Ö·û£¬ËæºóË³Ðò·ÃÎÊ×Ö·û´®ÖÐµÄ×Ö·û£¬Èç¹û´æÔÚ½«¶ÔÓ¦×Ö·ûµÄASCIIÂë±àºÅµÄÎ»ÉèÖÃÎª1¼´¿É¡£
 */

public class q1 {
	
	public static boolean method1(String str){
		char[] cc = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(char c:cc){
			if(set.contains(c)){
				return false;
			}
			set.add(c);
		}
		return true;
	}
	
	public static  boolean method2(String str){
		char[] cc= str.toCharArray();
		int[] bitmap = new int[8];
		for(char c:cc){
			int i = (int)c;
			int idx=i/32;
			int offset=i%32;
			if(((bitmap[idx])&(1<<offset))!=0){
				return false;
			}
			bitmap[idx]=bitmap[idx]|(1<<offset);
		}
		return true;
	}
	
	//test
	public static void main(String[] args) {
		String s = "abcdaefg";
		System.out.println(method1(s));
		System.out.println(method2(s));
	}
}
>>>>>>> parent of e57ad75... Revert "crackingthecodingInterview"
