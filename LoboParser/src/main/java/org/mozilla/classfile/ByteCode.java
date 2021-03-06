/* -*- Mode: java; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.classfile;

/**
 * This class provides opcode values expected by the JVM in Java class files.
 *
 * It also provides tables for internal use by the ClassFileWriter.
 *
 * Author Roger Lawrence
 *
 */
public class ByteCode {

    /**
     * The byte opcodes defined by the Java Virtual Machine.
     */
    /** Constant <code>ACONST_NULL=0x01</code> */
    /** Constant <code>ICONST_M1=0x02</code> */
    /** Constant <code>ICONST_0=0x03</code> */
    /** Constant <code>ICONST_1=0x04</code> */
    /** Constant <code>ICONST_2=0x05</code> */
    /** Constant <code>ICONST_3=0x06</code> */
    /** Constant <code>ICONST_4=0x07</code> */
    /** Constant <code>ICONST_5=0x08</code> */
    /** Constant <code>LCONST_0=0x09</code> */
    /** Constant <code>LCONST_1=0x0A</code> */
    /** Constant <code>FCONST_0=0x0B</code> */
    /** Constant <code>FCONST_1=0x0C</code> */
    /** Constant <code>FCONST_2=0x0D</code> */
    /** Constant <code>DCONST_0=0x0E</code> */
    /** Constant <code>DCONST_1=0x0F</code> */
    /** Constant <code>BIPUSH=0x10</code> */
    /** Constant <code>SIPUSH=0x11</code> */
    /** Constant <code>LDC=0x12</code> */
    /** Constant <code>LDC_W=0x13</code> */
    /** Constant <code>LDC2_W=0x14</code> */
    /** Constant <code>ILOAD=0x15</code> */
    /** Constant <code>LLOAD=0x16</code> */
    /** Constant <code>FLOAD=0x17</code> */
    /** Constant <code>DLOAD=0x18</code> */
    /** Constant <code>ALOAD=0x19</code> */
    /** Constant <code>ILOAD_0=0x1A</code> */
    /** Constant <code>ILOAD_1=0x1B</code> */
    /** Constant <code>ILOAD_2=0x1C</code> */
    /** Constant <code>ILOAD_3=0x1D</code> */
    /** Constant <code>LLOAD_0=0x1E</code> */
    /** Constant <code>LLOAD_1=0x1F</code> */
    /** Constant <code>LLOAD_2=0x20</code> */
    /** Constant <code>LLOAD_3=0x21</code> */
    /** Constant <code>FLOAD_0=0x22</code> */
    /** Constant <code>FLOAD_1=0x23</code> */
    /** Constant <code>FLOAD_2=0x24</code> */
    /** Constant <code>FLOAD_3=0x25</code> */
    /** Constant <code>DLOAD_0=0x26</code> */
    /** Constant <code>DLOAD_1=0x27</code> */
    /** Constant <code>DLOAD_2=0x28</code> */
    /** Constant <code>DLOAD_3=0x29</code> */
    /** Constant <code>ALOAD_0=0x2A</code> */
    /** Constant <code>ALOAD_1=0x2B</code> */
    /** Constant <code>ALOAD_2=0x2C</code> */
    /** Constant <code>ALOAD_3=0x2D</code> */
    /** Constant <code>IALOAD=0x2E</code> */
    /** Constant <code>LALOAD=0x2F</code> */
    /** Constant <code>FALOAD=0x30</code> */
    /** Constant <code>DALOAD=0x31</code> */
    /** Constant <code>AALOAD=0x32</code> */
    /** Constant <code>BALOAD=0x33</code> */
    /** Constant <code>CALOAD=0x34</code> */
    /** Constant <code>SALOAD=0x35</code> */
    /** Constant <code>ISTORE=0x36</code> */
    /** Constant <code>LSTORE=0x37</code> */
    /** Constant <code>FSTORE=0x38</code> */
    /** Constant <code>DSTORE=0x39</code> */
    /** Constant <code>ASTORE=0x3A</code> */
    /** Constant <code>ISTORE_0=0x3B</code> */
    /** Constant <code>ISTORE_1=0x3C</code> */
    /** Constant <code>ISTORE_2=0x3D</code> */
    /** Constant <code>ISTORE_3=0x3E</code> */
    /** Constant <code>LSTORE_0=0x3F</code> */
    /** Constant <code>LSTORE_1=0x40</code> */
    /** Constant <code>LSTORE_2=0x41</code> */
    /** Constant <code>LSTORE_3=0x42</code> */
    /** Constant <code>FSTORE_0=0x43</code> */
    /** Constant <code>FSTORE_1=0x44</code> */
    /** Constant <code>FSTORE_2=0x45</code> */
    /** Constant <code>FSTORE_3=0x46</code> */
    /** Constant <code>DSTORE_0=0x47</code> */
    /** Constant <code>DSTORE_1=0x48</code> */
    /** Constant <code>DSTORE_2=0x49</code> */
    /** Constant <code>DSTORE_3=0x4A</code> */
    /** Constant <code>ASTORE_0=0x4B</code> */
    /** Constant <code>ASTORE_1=0x4C</code> */
    /** Constant <code>ASTORE_2=0x4D</code> */
    /** Constant <code>ASTORE_3=0x4E</code> */
    /** Constant <code>IASTORE=0x4F</code> */
    /** Constant <code>LASTORE=0x50</code> */
    /** Constant <code>FASTORE=0x51</code> */
    /** Constant <code>DASTORE=0x52</code> */
    /** Constant <code>AASTORE=0x53</code> */
    /** Constant <code>BASTORE=0x54</code> */
    /** Constant <code>CASTORE=0x55</code> */
    /** Constant <code>SASTORE=0x56</code> */
    /** Constant <code>POP=0x57</code> */
    /** Constant <code>POP2=0x58</code> */
    /** Constant <code>DUP=0x59</code> */
    /** Constant <code>DUP_X1=0x5A</code> */
    /** Constant <code>DUP_X2=0x5B</code> */
    /** Constant <code>DUP2=0x5C</code> */
    /** Constant <code>DUP2_X1=0x5D</code> */
    /** Constant <code>DUP2_X2=0x5E</code> */
    /** Constant <code>SWAP=0x5F</code> */
    /** Constant <code>IADD=0x60</code> */
    /** Constant <code>LADD=0x61</code> */
    /** Constant <code>FADD=0x62</code> */
    /** Constant <code>DADD=0x63</code> */
    /** Constant <code>ISUB=0x64</code> */
    /** Constant <code>LSUB=0x65</code> */
    /** Constant <code>FSUB=0x66</code> */
    /** Constant <code>DSUB=0x67</code> */
    /** Constant <code>IMUL=0x68</code> */
    /** Constant <code>LMUL=0x69</code> */
    /** Constant <code>FMUL=0x6A</code> */
    /** Constant <code>DMUL=0x6B</code> */
    /** Constant <code>IDIV=0x6C</code> */
    /** Constant <code>LDIV=0x6D</code> */
    /** Constant <code>FDIV=0x6E</code> */
    /** Constant <code>DDIV=0x6F</code> */
    /** Constant <code>IREM=0x70</code> */
    /** Constant <code>LREM=0x71</code> */
    /** Constant <code>FREM=0x72</code> */
    /** Constant <code>DREM=0x73</code> */
    /** Constant <code>INEG=0x74</code> */
    /** Constant <code>LNEG=0x75</code> */
    /** Constant <code>FNEG=0x76</code> */
    /** Constant <code>DNEG=0x77</code> */
    /** Constant <code>ISHL=0x78</code> */
    /** Constant <code>LSHL=0x79</code> */
    /** Constant <code>ISHR=0x7A</code> */
    /** Constant <code>LSHR=0x7B</code> */
    /** Constant <code>IUSHR=0x7C</code> */
    /** Constant <code>LUSHR=0x7D</code> */
    /** Constant <code>IAND=0x7E</code> */
    /** Constant <code>LAND=0x7F</code> */
    /** Constant <code>IOR=0x80</code> */
    /** Constant <code>LOR=0x81</code> */
    /** Constant <code>IXOR=0x82</code> */
    /** Constant <code>LXOR=0x83</code> */
    /** Constant <code>IINC=0x84</code> */
    /** Constant <code>I2L=0x85</code> */
    /** Constant <code>I2F=0x86</code> */
    /** Constant <code>I2D=0x87</code> */
    /** Constant <code>L2I=0x88</code> */
    /** Constant <code>L2F=0x89</code> */
    /** Constant <code>L2D=0x8A</code> */
    /** Constant <code>F2I=0x8B</code> */
    /** Constant <code>F2L=0x8C</code> */
    /** Constant <code>F2D=0x8D</code> */
    /** Constant <code>D2I=0x8E</code> */
    /** Constant <code>D2L=0x8F</code> */
    /** Constant <code>D2F=0x90</code> */
    /** Constant <code>I2B=0x91</code> */
    /** Constant <code>I2C=0x92</code> */
    /** Constant <code>I2S=0x93</code> */
    /** Constant <code>LCMP=0x94</code> */
    /** Constant <code>FCMPL=0x95</code> */
    /** Constant <code>FCMPG=0x96</code> */
    /** Constant <code>DCMPL=0x97</code> */
    /** Constant <code>DCMPG=0x98</code> */
    /** Constant <code>IFEQ=0x99</code> */
    /** Constant <code>IFNE=0x9A</code> */
    /** Constant <code>IFLT=0x9B</code> */
    /** Constant <code>IFGE=0x9C</code> */
    /** Constant <code>IFGT=0x9D</code> */
    /** Constant <code>IFLE=0x9E</code> */
    /** Constant <code>IF_ICMPEQ=0x9F</code> */
    /** Constant <code>IF_ICMPNE=0xA0</code> */
    /** Constant <code>IF_ICMPLT=0xA1</code> */
    /** Constant <code>IF_ICMPGE=0xA2</code> */
    /** Constant <code>IF_ICMPGT=0xA3</code> */
    /** Constant <code>IF_ICMPLE=0xA4</code> */
    /** Constant <code>IF_ACMPEQ=0xA5</code> */
    /** Constant <code>IF_ACMPNE=0xA6</code> */
    /** Constant <code>GOTO=0xA7</code> */
    /** Constant <code>JSR=0xA8</code> */
    /** Constant <code>RET=0xA9</code> */
    /** Constant <code>TABLESWITCH=0xAA</code> */
    /** Constant <code>LOOKUPSWITCH=0xAB</code> */
    /** Constant <code>IRETURN=0xAC</code> */
    /** Constant <code>LRETURN=0xAD</code> */
    /** Constant <code>FRETURN=0xAE</code> */
    /** Constant <code>DRETURN=0xAF</code> */
    /** Constant <code>ARETURN=0xB0</code> */
    /** Constant <code>RETURN=0xB1</code> */
    /** Constant <code>GETSTATIC=0xB2</code> */
    /** Constant <code>PUTSTATIC=0xB3</code> */
    /** Constant <code>GETFIELD=0xB4</code> */
    /** Constant <code>PUTFIELD=0xB5</code> */
    /** Constant <code>INVOKEVIRTUAL=0xB6</code> */
    /** Constant <code>INVOKESPECIAL=0xB7</code> */
    /** Constant <code>INVOKESTATIC=0xB8</code> */
    /** Constant <code>INVOKEINTERFACE=0xB9</code> */
    /** Constant <code>INVOKEDYNAMIC=0xBA</code> */
    /** Constant <code>NEW=0xBB</code> */
    /** Constant <code>NEWARRAY=0xBC</code> */
    /** Constant <code>ANEWARRAY=0xBD</code> */
    /** Constant <code>ARRAYLENGTH=0xBE</code> */
    /** Constant <code>ATHROW=0xBF</code> */
    /** Constant <code>CHECKCAST=0xC0</code> */
    /** Constant <code>INSTANCEOF=0xC1</code> */
    /** Constant <code>MONITORENTER=0xC2</code> */
    /** Constant <code>MONITOREXIT=0xC3</code> */
    /** Constant <code>WIDE=0xC4</code> */
    /** Constant <code>MULTIANEWARRAY=0xC5</code> */
    /** Constant <code>IFNULL=0xC6</code> */
    /** Constant <code>IFNONNULL=0xC7</code> */
    /** Constant <code>GOTO_W=0xC8</code> */
    /** Constant <code>JSR_W=0xC9</code> */
    /** Constant <code>BREAKPOINT=0xCA</code> */
    /** Constant <code>IMPDEP1=0xFE</code> */
    /** Constant <code>IMPDEP2=0xFF</code> */
    public static final int
        NOP = 0x00,
        ACONST_NULL = 0x01,
        ICONST_M1 = 0x02,
        ICONST_0 = 0x03,
        ICONST_1 = 0x04,
        ICONST_2 = 0x05,
        ICONST_3 = 0x06,
        ICONST_4 = 0x07,
        ICONST_5 = 0x08,
        LCONST_0 = 0x09,
        LCONST_1 = 0x0A,
        FCONST_0 = 0x0B,
        FCONST_1 = 0x0C,
        FCONST_2 = 0x0D,
        DCONST_0 = 0x0E,
        DCONST_1 = 0x0F,
        BIPUSH = 0x10,
        SIPUSH = 0x11,
        LDC = 0x12,
        LDC_W = 0x13,
        LDC2_W = 0x14,
        ILOAD = 0x15,
        LLOAD = 0x16,
        FLOAD = 0x17,
        DLOAD = 0x18,
        ALOAD = 0x19,
        ILOAD_0 = 0x1A,
        ILOAD_1 = 0x1B,
        ILOAD_2 = 0x1C,
        ILOAD_3 = 0x1D,
        LLOAD_0 = 0x1E,
        LLOAD_1 = 0x1F,
        LLOAD_2 = 0x20,
        LLOAD_3 = 0x21,
        FLOAD_0 = 0x22,
        FLOAD_1 = 0x23,
        FLOAD_2 = 0x24,
        FLOAD_3 = 0x25,
        DLOAD_0 = 0x26,
        DLOAD_1 = 0x27,
        DLOAD_2 = 0x28,
        DLOAD_3 = 0x29,
        ALOAD_0 = 0x2A,
        ALOAD_1 = 0x2B,
        ALOAD_2 = 0x2C,
        ALOAD_3 = 0x2D,
        IALOAD = 0x2E,
        LALOAD = 0x2F,
        FALOAD = 0x30,
        DALOAD = 0x31,
        AALOAD = 0x32,
        BALOAD = 0x33,
        CALOAD = 0x34,
        SALOAD = 0x35,
        ISTORE = 0x36,
        LSTORE = 0x37,
        FSTORE = 0x38,
        DSTORE = 0x39,
        ASTORE = 0x3A,
        ISTORE_0 = 0x3B,
        ISTORE_1 = 0x3C,
        ISTORE_2 = 0x3D,
        ISTORE_3 = 0x3E,
        LSTORE_0 = 0x3F,
        LSTORE_1 = 0x40,
        LSTORE_2 = 0x41,
        LSTORE_3 = 0x42,
        FSTORE_0 = 0x43,
        FSTORE_1 = 0x44,
        FSTORE_2 = 0x45,
        FSTORE_3 = 0x46,
        DSTORE_0 = 0x47,
        DSTORE_1 = 0x48,
        DSTORE_2 = 0x49,
        DSTORE_3 = 0x4A,
        ASTORE_0 = 0x4B,
        ASTORE_1 = 0x4C,
        ASTORE_2 = 0x4D,
        ASTORE_3 = 0x4E,
        IASTORE = 0x4F,
        LASTORE = 0x50,
        FASTORE = 0x51,
        DASTORE = 0x52,
        AASTORE = 0x53,
        BASTORE = 0x54,
        CASTORE = 0x55,
        SASTORE = 0x56,
        POP = 0x57,
        POP2 = 0x58,
        DUP = 0x59,
        DUP_X1 = 0x5A,
        DUP_X2 = 0x5B,
        DUP2 = 0x5C,
        DUP2_X1 = 0x5D,
        DUP2_X2 = 0x5E,
        SWAP = 0x5F,
        IADD = 0x60,
        LADD = 0x61,
        FADD = 0x62,
        DADD = 0x63,
        ISUB = 0x64,
        LSUB = 0x65,
        FSUB = 0x66,
        DSUB = 0x67,
        IMUL = 0x68,
        LMUL = 0x69,
        FMUL = 0x6A,
        DMUL = 0x6B,
        IDIV = 0x6C,
        LDIV = 0x6D,
        FDIV = 0x6E,
        DDIV = 0x6F,
        IREM = 0x70,
        LREM = 0x71,
        FREM = 0x72,
        DREM = 0x73,
        INEG = 0x74,
        LNEG = 0x75,
        FNEG = 0x76,
        DNEG = 0x77,
        ISHL = 0x78,
        LSHL = 0x79,
        ISHR = 0x7A,
        LSHR = 0x7B,
        IUSHR = 0x7C,
        LUSHR = 0x7D,
        IAND = 0x7E,
        LAND = 0x7F,
        IOR = 0x80,
        LOR = 0x81,
        IXOR = 0x82,
        LXOR = 0x83,
        IINC = 0x84,
        I2L = 0x85,
        I2F = 0x86,
        I2D = 0x87,
        L2I = 0x88,
        L2F = 0x89,
        L2D = 0x8A,
        F2I = 0x8B,
        F2L = 0x8C,
        F2D = 0x8D,
        D2I = 0x8E,
        D2L = 0x8F,
        D2F = 0x90,
        I2B = 0x91,
        I2C = 0x92,
        I2S = 0x93,
        LCMP = 0x94,
        FCMPL = 0x95,
        FCMPG = 0x96,
        DCMPL = 0x97,
        DCMPG = 0x98,
        IFEQ = 0x99,
        IFNE = 0x9A,
        IFLT = 0x9B,
        IFGE = 0x9C,
        IFGT = 0x9D,
        IFLE = 0x9E,
        IF_ICMPEQ = 0x9F,
        IF_ICMPNE = 0xA0,
        IF_ICMPLT = 0xA1,
        IF_ICMPGE = 0xA2,
        IF_ICMPGT = 0xA3,
        IF_ICMPLE = 0xA4,
        IF_ACMPEQ = 0xA5,
        IF_ACMPNE = 0xA6,
        GOTO = 0xA7,
        JSR = 0xA8,
        RET = 0xA9,
        TABLESWITCH = 0xAA,
        LOOKUPSWITCH = 0xAB,
        IRETURN = 0xAC,
        LRETURN = 0xAD,
        FRETURN = 0xAE,
        DRETURN = 0xAF,
        ARETURN = 0xB0,
        RETURN = 0xB1,
        GETSTATIC = 0xB2,
        PUTSTATIC = 0xB3,
        GETFIELD = 0xB4,
        PUTFIELD = 0xB5,
        INVOKEVIRTUAL = 0xB6,
        INVOKESPECIAL = 0xB7,
        INVOKESTATIC = 0xB8,
        INVOKEINTERFACE = 0xB9,
        INVOKEDYNAMIC = 0xBA,
        NEW = 0xBB,
        NEWARRAY = 0xBC,
        ANEWARRAY = 0xBD,
        ARRAYLENGTH = 0xBE,
        ATHROW = 0xBF,
        CHECKCAST = 0xC0,
        INSTANCEOF = 0xC1,
        MONITORENTER = 0xC2,
        MONITOREXIT = 0xC3,
        WIDE = 0xC4,
        MULTIANEWARRAY = 0xC5,
        IFNULL = 0xC6,
        IFNONNULL = 0xC7,
        GOTO_W = 0xC8,
        JSR_W = 0xC9,
        BREAKPOINT = 0xCA,

    IMPDEP1 = 0xFE,
        IMPDEP2 = 0xFF;

    /**
     * Types for the NEWARRAY opcode.
     */
    /** Constant <code>T_CHAR=5</code> */
    /** Constant <code>T_FLOAT=6</code> */
    /** Constant <code>T_DOUBLE=7</code> */
    /** Constant <code>T_BYTE=8</code> */
    /** Constant <code>T_SHORT=9</code> */
    /** Constant <code>T_INT=10</code> */
    /** Constant <code>T_LONG=11</code> */
    public static final byte
        T_BOOLEAN = 4,
        T_CHAR = 5,
        T_FLOAT = 6,
        T_DOUBLE = 7,
        T_BYTE = 8,
        T_SHORT = 9,
        T_INT = 10,
        T_LONG = 11;

    /*
     * Types for MethodHandle
     */
    /** Constant <code>MH_GETFIELD=1</code> */
    /** Constant <code>MH_GETSTATIC=2</code> */
    /** Constant <code>MH_PUTFIELD=3</code> */
    /** Constant <code>MH_PUTSTATIC=4</code> */
    /** Constant <code>MH_INVOKEVIRTUAL=5</code> */
    /** Constant <code>MH_INVOKESTATIC=6</code> */
    /** Constant <code>MH_INVOKESPECIAL=7</code> */
    /** Constant <code>MH_NEWINVOKESPECIAL=8</code> */
    /** Constant <code>MH_INVOKEINTERFACE=9</code> */
    public static final byte
        MH_GETFIELD = 1,
        MH_GETSTATIC = 2,
        MH_PUTFIELD = 3,
        MH_PUTSTATIC = 4,
        MH_INVOKEVIRTUAL = 5,
        MH_INVOKESTATIC = 6,
        MH_INVOKESPECIAL = 7,
        MH_NEWINVOKESPECIAL = 8,
        MH_INVOKEINTERFACE = 9;
}
