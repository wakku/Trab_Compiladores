/* AnalisadorLexicoTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. AnalisadorLexicoTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class AnalisadorLexicoTokenManager implements AnalisadorLexicoConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1fe007ffc0L) != 0L)
         {
            jjmatchedKind = 61;
            return 9;
         }
         if ((active0 & 0x6000000000L) != 0L)
         {
            jjmatchedKind = 63;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x1fe007bfc0L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 1;
            return 9;
         }
         if ((active0 & 0x6000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 63;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x4000L) != 0L)
            return 9;
         return -1;
      case 2:
         if ((active0 & 0x1fe0079fc0L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 2;
            return 9;
         }
         if ((active0 & 0x2000L) != 0L)
            return 9;
         return -1;
      case 3:
         if ((active0 & 0x6a00593c0L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 3;
            return 9;
         }
         if ((active0 & 0x1940020c00L) != 0L)
            return 9;
         return -1;
      case 4:
         if ((active0 & 0x200412c0L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 4;
            return 9;
         }
         if ((active0 & 0x680018100L) != 0L)
            return 9;
         return -1;
      case 5:
         if ((active0 & 0x240L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 5;
            return 9;
         }
         if ((active0 & 0x20041080L) != 0L)
            return 9;
         return -1;
      case 6:
         if ((active0 & 0x240L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 6;
            return 9;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 5);
      case 32:
         return jjStopAtPos(0, 3);
      case 33:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 37:
         jjmatchedKind = 57;
         return jjMoveStringLiteralDfa1_0(0x8000000000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 42:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 43:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x400800000000000L);
      case 44:
         return jjStopAtPos(0, 19);
      case 45:
         jjmatchedKind = 54;
         return jjMoveStringLiteralDfa1_0(0x801000000000000L);
      case 46:
         return jjStopAtPos(0, 27);
      case 47:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 59:
         return jjStopAtPos(0, 26);
      case 60:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 61:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 62:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 91:
         return jjStopAtPos(0, 22);
      case 93:
         return jjStopAtPos(0, 23);
      case 94:
         jjmatchedKind = 60;
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      case 95:
         return jjStopAtPos(0, 28);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200004000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x820000080L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 113:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100001000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0xc0000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8040L);
      case 123:
         return jjStopAtPos(0, 24);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 125:
         return jjStopAtPos(0, 25);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 43:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 45:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         break;
      case 61:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000840L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x120041000L);
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 9);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2200L);
      case 113:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10100L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000400L);
      case 124:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x780000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x18400L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000200L);
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 9);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000040L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x800020000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000001000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 100:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 9);
         break;
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 9);
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x40080L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80008000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 111:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 9);
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x600000000L);
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 9);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 9);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 9);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 9);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 9);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 9);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 9);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 107:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 9);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 116:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 9);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000080L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 9);
         break;
      case 104:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 29, 9);
         break;
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 9);
         return jjMoveStringLiteralDfa6_0(active0, 0x240L);
      case 115:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(7, 9, 9);
         break;
      case 121:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(7, 6, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
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
               case 0:
                  if ((0xffffffff00000000L & l) != 0L)
                  {
                     if (kind > 63)
                        kind = 63;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 62)
                        kind = 62;
                     { jjCheckNAdd(3); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  else if (curChar == 35)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 10)
                     kind = 4;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  { jjCheckNAdd(3); }
                  break;
               case 4:
                  if ((0xffffffff00000000L & l) != 0L && kind > 63)
                     kind = 63;
                  break;
               case 5:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 6:
                  if ((0xffffffff00000000L & l) != 0L)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 7:
                  if (curChar == 34 && kind > 64)
                     kind = 64;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 65)
                     kind = 65;
                  jjstateSet[jjnewStateCnt++] = 9;
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
                  if ((0x7fffffffffffffffL & l) != 0L)
                  {
                     if (kind > 63)
                        kind = 63;
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 61)
                        kind = 61;
                     { jjCheckNAdd(9); }
                  }
                  break;
               case 1:
                  { jjAddStates(0, 1); }
                  break;
               case 4:
                  if ((0x7fffffffffffffffL & l) != 0L && kind > 63)
                     kind = 63;
                  break;
               case 6:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     { jjAddStates(2, 3); }
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 61)
                     kind = 61;
                  { jjCheckNAdd(9); }
                  break;
               case 9:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 65)
                     kind = 65;
                  { jjCheckNAdd(9); }
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
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 1); }
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
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 6, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\12", "\167\141\162\162\141\156\164\171", 
"\154\151\155\151\164\163", "\142\162\145\141\153", "\143\157\156\164\151\156\165\145", 
"\161\165\151\164", "\150\141\154\164", "\162\145\164\165\162\156", "\146\157\162", "\151\146", 
"\167\150\151\154\145", "\160\162\151\156\164", "\145\154\163\145", "\144\145\146\151\156\145", "\54", 
"\50", "\51", "\133", "\135", "\173", "\175", "\73", "\56", "\137", 
"\154\145\156\147\164\150", "\163\161\162\164", "\163\143\141\154\145", "\162\145\141\144", 
"\151\142\141\163\145", "\157\142\141\163\145", "\154\141\163\164", "\141\165\164\157", "\174\174", 
"\46\46", "\41", "\76", "\76\75", "\74", "\74\75", "\75\75", "\41\75", "\75", "\53\75", 
"\55\75", "\52\75", "\57\75", "\45\75", "\136\75", "\53", "\55", "\52", "\57", "\45", 
"\53\53", "\55\55", "\136", null, null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

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
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2200L & (1L << curChar)) != 0L)
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

    /** Constructor. */
    public AnalisadorLexicoTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public AnalisadorLexicoTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
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
    for (i = 10; i-- > 0;)
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

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffe1L, 0x3L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[10];
    private final int[] jjstateSet = new int[2 * 10];

    
    protected char curChar;
}