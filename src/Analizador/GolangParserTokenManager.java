/* Generated By:JavaCC: Do not edit this line. GolangParserTokenManager.java */
package Analizador;

/** Token Manager. */
public class GolangParserTokenManager implements GolangParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10000000L) != 0L)
            return 14;
         if ((active0 & 0xffff80L) != 0L)
         {
            jjmatchedKind = 51;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x40000L) != 0L)
            return 1;
         if ((active0 & 0xfbff80L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x24400L) != 0L)
            return 1;
         if ((active0 & 0xf9bb80L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x281200L) != 0L)
            return 1;
         if ((active0 & 0xd1a980L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0xd02180L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x18800L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x400100L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x902080L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 37:
         return jjStopAtPos(0, 29);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 40:
         return jjStopAtPos(0, 43);
      case 41:
         return jjStopAtPos(0, 44);
      case 42:
         return jjStopAtPos(0, 27);
      case 43:
         return jjStopAtPos(0, 25);
      case 44:
         return jjStopAtPos(0, 49);
      case 45:
         return jjStopAtPos(0, 26);
      case 46:
         return jjStopAtPos(0, 24);
      case 47:
         return jjStartNfaWithStates_0(0, 28, 14);
      case 58:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 59:
         return jjStopAtPos(0, 50);
      case 60:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 61:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 62:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 91:
         return jjStopAtPos(0, 47);
      case 93:
         return jjStopAtPos(0, 48);
      case 94:
         return jjStopAtPos(0, 30);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200800L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20200L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40080L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x810000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x10a000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 123:
         return jjStopAtPos(0, 45);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 125:
         return jjStopAtPos(0, 46);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 61:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x214500L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000L);
      case 70:
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 1);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x88000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x20800L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 124:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x108000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x10a00L);
      case 80:
      case 112:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x1080L);
      case 82:
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 1);
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x280000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 67:
      case 99:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 69:
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 1);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 1);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 1);
         break;
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x802000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x102000L);
      case 69:
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 1);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800080L);
      case 84:
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 1);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 71:
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 72:
      case 104:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 1);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 78:
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 1);
         break;
      case 84:
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 1);
         else if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(6, 8, 1);
         break;
      case 84:
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 30;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(20, 21);
                  else if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     jjCheckNAddStates(3, 5);
                  }
                  else if (curChar == 47)
                     jjAddStates(6, 7);
                  else if (curChar == 34)
                     jjCheckNAddStates(8, 10);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     jjCheckNAddStates(8, 10);
                  break;
               case 3:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 5:
                  if ((0x8400002400L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 6:
                  if (curChar == 34 && kind > 54)
                     kind = 54;
                  break;
               case 7:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(11, 14);
                  break;
               case 8:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 9:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 11:
                  if (curChar == 10)
                     jjCheckNAddStates(8, 10);
                  break;
               case 12:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 47)
                     jjAddStates(6, 7);
                  break;
               case 15:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 16:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 17:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 18:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 20:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 21:
                  if (curChar == 42)
                     jjCheckNAddStates(15, 17);
                  break;
               case 22:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(23, 21);
                  break;
               case 23:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(23, 21);
                  break;
               case 24:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddStates(3, 5);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(26);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 28:
                  if (curChar != 46)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(29);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(29);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 4:
                  if (curChar == 92)
                     jjAddStates(18, 21);
                  break;
               case 5:
                  if ((0x14404410144044L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 15:
                  jjAddStates(0, 2);
                  break;
               case 20:
                  jjCheckNAddTwoStates(20, 21);
                  break;
               case 22:
               case 23:
                  jjCheckNAddTwoStates(23, 21);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 10);
                  break;
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 22:
               case 23:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(23, 21);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 30 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   15, 16, 18, 26, 27, 28, 14, 19, 3, 4, 6, 3, 4, 8, 6, 21, 
   22, 24, 5, 7, 9, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, "\56", "\53", 
"\55", "\52", "\57", "\45", "\136", "\75\75", "\75", "\41\75", "\72", "\72\75", 
"\74", "\76", "\76\75", "\74\75", "\46\46", "\174\174", "\41", "\50", "\51", "\173", 
"\175", "\133", "\135", "\54", "\73", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7fffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[30];
private final int[] jjstateSet = new int[60];
protected char curChar;
/** Constructor. */
public GolangParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public GolangParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 30; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
