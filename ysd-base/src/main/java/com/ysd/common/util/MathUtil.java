package com.ysd.common.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 高精度计算工具。
 * <p>
 * 计算前，请先通过{@link #getInstance(int)}获取相应精度的实例来使用，在该实例中，输出都会变成该实例的默认精度（或本身{@code BigDecimal}
 * 的精度更低则不更改），在不指定取整模式时使用四舍五入方式（{@link RoundingMode#HALF_UP}）。
 * </p>
 * <p>
 * 如整个产品中有一个预定义的默认精度，则可在JVM载入时调用{@link #initDefaultInstance(int)}来设置{@link MathUtil}的默认精度，以便直接调用{@link MathUtil}
 * 下的静态方法。
 * </p>
 * <p>
 * 如果产品中有需要高精度计算的场景，应该在任何交互中都使用{@link BigDecimal}对象。<br />
 * 也即，任何的外部输入（包括数据库载入或网络传入）以及内部计算过程，都应一直使用{@code BigDecimal}对象，<b>不应该使用{@code double}值</b>。
 * </p>
 * <p>
 * 当需要创建一个{@link BigDecimal}对象时，应使用字符串表达精确的字面内容，然后调用相应精度的实例上的{@link MathUtilInstance#valueOf(String)}来获取
 * {@code BigDecimal}对象，
 * <b>不要使用{@code double}值来获取{@code BigDecimal}对象</b>，因为在{@code double}值时精度已经丢失了，所以获取到的{@code BigDecimal}对象也无法保证精度。
 * </p>
 * <p>
 * 在计算过程中，应使用比最终结果更高的精度，避免在计算过程中的精度丢失。
 * 例如：
 * 
 * <pre>
 * MathUtilInstance i2 = MathUtil.getInstance(2);
 * MathUtilInstance i3 = MathUtil.getInstance(3);
 * 
 * String s1 = "0.014";
 * String s2 = "0.005";
 * 
 * // 先转为本实例精度，后计算，精度丢失
 * BigDecimal sub2 = i2.subtract(s1, s2); // 0.00
 * Assert.assertTrue(sub2.scale() == 2);
 * Assert.assertTrue(i2.equals(i2.valueOf("0.00"), sub2));
 * // 先以高精度计算，后转为本实例精度，精确
 * BigDecimal subOh2 = i2.subtractOnHigherScale(s1, s2); // 0.01
 * Assert.assertTrue(subOh2.scale() == 2);
 * Assert.assertTrue(i2.equals(i2.valueOf("0.01"), subOh2));
 * 
 * // 高精度下计算，精确结果
 * BigDecimal sub3 = i3.subtract(s1, s2); // 0.009
 * Assert.assertTrue(sub3.scale() == 3);
 * // 高精度比较，相等
 * Assert.assertTrue(i3.equals(i3.valueOf("0.009"), sub3));
 * // 降低精度
 * sub3 = i3.lowerScaleHalfUp(sub3);
 * // 低精度比较，相等
 * Assert.assertTrue(i2.equals(i2.valueOf("0.01"), sub3));
 * </pre>
 * 
 * 连续计算中可使用高精度的实例完成整个计算最后再调用{@link MathUtilInstance#lowerScaleHalfUp(BigDecimal)}来获得降低精度的结果。<br />
 * 只有两个值需要计算时，如果输入参数为{@code BigDecimal}对象则无精度影响，如果输入参数为{@code String}或{@code double}时，则应调用
 * {@link MathUtilInstance#addOnHigherScale(String, String)}或
 * {@link MathUtilInstance#subtractOnHigherScale(String, String)}来计算。
 * </p>
 * <p>
 * 所有的比较都是指在当前实例的默认精度上比较。
 * </p>
 * @author zhaohc
 *         
 */
public abstract class MathUtil {
    
    public static final int DEFAULT_SCALE = 8;
    
    /**
     * 0，零（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal ZERO = new BigDecimal(BigInteger.ZERO, DEFAULT_SCALE);
    /**
     * -1，负一（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal N_1 = BigDecimal.valueOf(-1, 0).setScale(DEFAULT_SCALE);
    /**
     * -1，负十（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal N_10 = BigDecimal.valueOf(-1, -1).setScale(DEFAULT_SCALE);
    /**
     * 1，一（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_1 = BigDecimal.valueOf(1, 0).setScale(DEFAULT_SCALE);
    /**
     * 10，十（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_10 = BigDecimal.valueOf(1, -1).setScale(DEFAULT_SCALE);
    /**
     * 100，一百（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_100 = BigDecimal.valueOf(1, -2).setScale(DEFAULT_SCALE);
    /**
     * 1,000，一千（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_1000 = BigDecimal.valueOf(1, -3).setScale(DEFAULT_SCALE);
    /**
     * 10,000，一万（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_10000 = BigDecimal.valueOf(1, -4).setScale(DEFAULT_SCALE);
    /**
     * 100,000，十万（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_100000 = BigDecimal.valueOf(1, -5).setScale(DEFAULT_SCALE);
    /**
     * 1,000,000，一百万（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_1000000 = BigDecimal.valueOf(1, -6).setScale(DEFAULT_SCALE);
    /**
     * 10,000,000，一千万（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_10000000 = BigDecimal.valueOf(1, -7).setScale(DEFAULT_SCALE);
    /**
     * 100,000,000，一亿（{@value #DEFAULT_SCALE}位小数）
     */
    public static final BigDecimal P_100000000 = BigDecimal.valueOf(1, -8).setScale(DEFAULT_SCALE);
    /**
     * 0.1（1位小数）
     */
    public static final BigDecimal P_01 = BigDecimal.valueOf(1, 1);
    /**
     * 0.01（2位小数）
     */
    public static final BigDecimal P_001 = BigDecimal.valueOf(1, 2);
    /**
     * 0.001（3位小数）
     */
    public static final BigDecimal P_0001 = BigDecimal.valueOf(1, 3);
    /**
     * 0.0001（4位小数）
     */
    public static final BigDecimal P_00001 = BigDecimal.valueOf(1, 4);
    /**
     * 0.00001（5位小数）
     */
    public static final BigDecimal P_000001 = BigDecimal.valueOf(1, 5);
    /**
     * 0.000001（6位小数）
     */
    public static final BigDecimal P_0000001 = BigDecimal.valueOf(1, 6);
    /**
     * 0.0000001（7位小数）
     */
    public static final BigDecimal P_00000001 = BigDecimal.valueOf(1, 7);
    /**
     * 0.00000001（8位小数）
     */
    public static final BigDecimal P_000000001 = BigDecimal.valueOf(1, 8);
    /**
     * 0.000000001（9位小数）
     */
    public static final BigDecimal P_0000000001 = BigDecimal.valueOf(1, 9);
    
    private static ConcurrentMap<Integer, MathUtilInstance> scaleCacheMap = new ConcurrentHashMap<>();
    
    private static MathUtilInstance instance = new MathUtilInstance(DEFAULT_SCALE);
    
    public static MathUtilInstance getInstance() {
        return instance;
    }
    
    public static MathUtilInstance getInstance(int defaultScale) {
        MathUtilInstance instance = scaleCacheMap.get(defaultScale);
        if (null == instance) {
            scaleCacheMap.putIfAbsent(defaultScale, new MathUtilInstance(defaultScale));
            instance = scaleCacheMap.get(defaultScale);
        }
        return instance;
    }
    
    public static void initDefaultInstance(int defaultScale) {
        instance = getInstance(defaultScale);
    }
    
    public static class MathUtilInstance {
        
        /**
         * 默认小数点位数
         */
        private final int defaultScale;
        
        private ConcurrentMap<String, BigDecimal> stringCache = new ConcurrentHashMap<>();
        
        private ConcurrentMap<Long, BigDecimal> longCache = new ConcurrentHashMap<>();
        
        private BigDecimal defaultResolution;
        
        private BigDecimal defaultZero;
        
        private MathUtilInstance higherScaleInstance;
        
        private MathUtilInstance lowerScaleInstance;
        
        public MathUtilInstance() {
            this(DEFAULT_SCALE);
        }
        
        public MathUtilInstance(int defaultScale) {
            this.defaultScale = defaultScale;
            init();
        }
        
        private void init() {
            defaultZero = new BigDecimal(BigInteger.ZERO, defaultScale);
            defaultResolution = BigDecimal.valueOf(1, defaultScale);
        }
        
        public BigDecimal getDefaultZero() {
            return defaultZero;
        }
        
        /**
         * 获取默认分辨率，如默认为3位小数，则该值为0.001
         * @return
         */
        public BigDecimal getDefaultResolution() {
            return defaultResolution;
        }
        
        public MathUtilInstance getHigherScaleInstance() {
            if (null == higherScaleInstance) {
                higherScaleInstance = getInstance(defaultScale + 1);
            }
            return higherScaleInstance;
        }
        
        public MathUtilInstance getLowerScaleInstance() {
            if (null == lowerScaleInstance) {
                lowerScaleInstance = getInstance(defaultScale - 1);
            }
            return lowerScaleInstance;
        }
        
        private BigDecimal setScaleIfDifferent(BigDecimal v, RoundingMode roundingMode) {
            if (v.scale() != defaultScale) {
                v = v.setScale(defaultScale, roundingMode);
            }
            return v;
        }
        
        private BigDecimal setScaleIfHigher(BigDecimal v, RoundingMode roundingMode) {
            int vs = v.scale();
            if (defaultScale < vs || 0 == vs) {
                v = v.setScale(defaultScale, roundingMode);
            }
            return v;
        }
        
        public BigDecimal valueOf(String stringVal, RoundingMode roundingMode) {
            if (StringUtils.isBlank(stringVal)) {
                return defaultZero;
            }
            BigDecimal bd = stringCache.get(stringVal);
            if (null == bd) {
                bd = new BigDecimal(stringVal);
                bd = setScaleIfDifferent(bd, roundingMode);
                // 0到100范围的做缓存
                if (ZERO.compareTo(bd) <= 0 && P_100.compareTo(bd) >= 0) {
                    BigDecimal tmpBD = stringCache.putIfAbsent(stringVal, bd);
                    if (null != tmpBD) {
                        bd = tmpBD;
                    }
                }
            }
            return bd;
        }
        
        /**
         * 获取对应的BigDecimal，四舍五入
         * @param stringVal
         * @return
         */
        public BigDecimal valueOf(String stringVal) {
            return valueOf(stringVal, RoundingMode.HALF_UP);
        }
        
        public BigDecimal valueOf(long longVal) {
            if (0 == longVal) {
                return defaultZero;
            }
            return valueOfInternal(longVal);
        }
        
        public BigDecimal valueOf(Long longVal) {
            if (null == longVal || 0 == longVal) {
                return defaultZero;
            }
            return valueOfInternal(longVal);
        }
        
        private BigDecimal valueOfInternal(Long longVal) {
            BigDecimal bd = longCache.get(longVal);
            if (null == bd) {
                bd = BigDecimal.valueOf(longVal).setScale(defaultScale);
                // 0到100范围的做缓存
                if (ZERO.compareTo(bd) <= 0 && P_100.compareTo(bd) >= 0) {
                    BigDecimal tmpBD = longCache.putIfAbsent(longVal, bd);
                    if (null != tmpBD) {
                        bd = tmpBD;
                    }
                }
            }
            return bd;
        }

        public BigDecimal valueOf(double doubleVal, RoundingMode roundingMode) {
            return valueOf(Double.toString(doubleVal), roundingMode);
        }
        
        /**
         * 获取对应的BigDecimal，四舍五入
         * @param doubleVal
         * @return
         */
        public BigDecimal valueOf(double doubleVal) {
            return valueOf(Double.toString(doubleVal));
        }

        public BigDecimal valueOf(Double doubleVal) {
            if (null == doubleVal) {
                return defaultZero;
            }
            return valueOf(doubleVal.toString());
        }

        public BigDecimal valueOf(Double doubleVal, RoundingMode roundingMode) {
            if (null == doubleVal) {
                return defaultZero;
            }
            return valueOf(doubleVal.toString(), roundingMode);
        }

        public static interface OpVisiter {
            
            BigDecimal operate(BigDecimal bdBase, BigDecimal bdOther);
            
        }
        
        private static OpVisiter addOpVisiter = new OpVisiter() {
            @Override
            public BigDecimal operate(BigDecimal bdBase, BigDecimal bdOther) {
                return bdBase.add(bdOther);
            }
        };
        private static OpVisiter subtractOpVisiter = new OpVisiter() {
            @Override
            public BigDecimal operate(BigDecimal bdBase, BigDecimal bdOther) {
                return bdBase.subtract(bdOther);
            }
        };
        private static OpVisiter multiplyOpVisiter = new OpVisiter() {
            @Override
            public BigDecimal operate(BigDecimal bdBase, BigDecimal bdOther) {
                return bdBase.multiply(bdOther);
            }
        };
        private static OpVisiter remainderOpVisiter = new OpVisiter() {
            @Override
            public BigDecimal operate(BigDecimal bdBase, BigDecimal bdOther) {
                return bdBase.remainder(bdOther);
            }
        };
        
        public BigDecimal operate(OpVisiter opVisiter, BigDecimal v1, BigDecimal v2) {
            if (null == v1) {
                v1 = defaultZero;
            }
            if (null != v2) {
                v1 = opVisiter.operate(v1, v2);
            }
            // 如果精度高于本实例，则降低
            return halfUp(v1);
        }
        
        public BigDecimal operate(OpVisiter opVisiter, BigDecimal... vs) {
            BigDecimal base = null;
            int vsL;
            if (null != vs && 0 != (vsL = vs.length)) {
                BigDecimal tmp;
                for (int i = 0; i < vsL; i++) {
                    tmp = vs[i];
                    if (null != tmp) {
                        if (null == base) {
                            base = tmp;
                        } else {
                            base = opVisiter.operate(base, tmp);
                        }
                    }
                }
            }
            if (null == base) {
                base = defaultZero;
            }
            // 如果精度高于本实例，则降低
            return halfUp(base);
        }
        
        public BigDecimal operate(OpVisiter opVisiter, String v1, String v2) {
            BigDecimal b1 = valueOf(v1);
            BigDecimal b2 = valueOf(v2);
            return opVisiter.operate(b1, b2);
        }
        
        public BigDecimal operateOnHigherScale(OpVisiter opVisiter, String v1, String v2) {
            // 获取高一个精度的实例
            MathUtilInstance higherScaleInstance = getHigherScaleInstance();
            // 在高一个精度上将字符串转为BigDecimal
            BigDecimal b1 = higherScaleInstance.valueOf(v1);
            BigDecimal b2 = higherScaleInstance.valueOf(v2);
            // 在高一个精度上计算
            BigDecimal rh = opVisiter.operate(b1, b2);
            // 四合五入到本精度
            return halfUp(rh);
        }
        
        public BigDecimal operate(OpVisiter opVisiter, double v1, double v2) {
            return operate(opVisiter, Double.toString(v1), Double.toString(v2));
        }
        
        public BigDecimal operateOnHigherScale(OpVisiter opVisiter, double v1, double v2) {
            return operateOnHigherScale(opVisiter, Double.toString(v1), Double.toString(v2));
        }
        
        public BigDecimal operate(OpVisiter opVisiter, BigDecimal v1, long v2) {
            BigDecimal b2 = valueOf(v2);
            BigDecimal r = opVisiter.operate(v1, b2);
            // 如果精度高于本实例，则降低
            return halfUp(r);
        }
        
        /**
         * 加法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal add(BigDecimal v1, BigDecimal v2) {
            return operate(addOpVisiter, v1, v2);
        }
        
        /**
         * 加法
         * @param vs
         * @return
         */
        public BigDecimal add(BigDecimal... vs) {
            return operate(addOpVisiter, vs);
        }
        
        /**
         * 加法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal add(String v1, String v2) {
            return operate(addOpVisiter, v1, v2);
        }
        
        /**
         * 加法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal addOnHigherScale(String v1, String v2) {
            return operateOnHigherScale(addOpVisiter, v1, v2);
        }
        
        /**
         * 加法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal add(double v1, double v2) {
            return operate(addOpVisiter, v1, v2);
        }
        
        /**
         * 加法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal addOnHigherScale(double v1, double v2) {
            return operateOnHigherScale(addOpVisiter, v1, v2);
        }
        
        /**
         * 加法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal add(BigDecimal v1, long v2) {
            return operate(addOpVisiter, v1, v2);
        }
        
        /**
         * 减法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal subtract(BigDecimal v1, BigDecimal v2) {
            return operate(subtractOpVisiter, v1, v2);
        }
        
        /**
         * 减法
         * @param vs
         * @return
         */
        public BigDecimal subtract(BigDecimal... vs) {
            return operate(subtractOpVisiter, vs);
        }
        
        /**
         * 减法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal subtract(String v1, String v2) {
            return operate(subtractOpVisiter, v1, v2);
        }
        
        /**
         * 减法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal subtractOnHigherScale(String v1, String v2) {
            return operateOnHigherScale(subtractOpVisiter, v1, v2);
        }
        
        /**
         * 减法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal subtract(double v1, double v2) {
            return operate(subtractOpVisiter, v1, v2);
        }
        
        /**
         * 减法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal subtractOnHigherScale(double v1, double v2) {
            return operateOnHigherScale(subtractOpVisiter, v1, v2);
        }
        
        /**
         * 减法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal subtract(BigDecimal v1, long v2) {
            return operate(subtractOpVisiter, v1, v2);
        }
        
        /**
         * 乘法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal multiply(BigDecimal v1, BigDecimal v2) {
            return operate(multiplyOpVisiter, v1, v2);
        }
        
        /**
         * 乘法
         * @param vs
         * @return
         */
        public BigDecimal multiply(BigDecimal... vs) {
            return operate(multiplyOpVisiter, vs);
        }
        
        /**
         * 乘法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal multiply(String v1, String v2) {
            return operate(multiplyOpVisiter, v1, v2);
        }
        
        /**
         * 乘法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal multiply(BigDecimal v1, long v2) {
            return operate(multiplyOpVisiter, v1, v2);
        }
        
        /**
         * 乘法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal multiply(BigDecimal v1, double v2) {
            return operate(multiplyOpVisiter, v1, valueOf(v2));
        }
        
        /**
         * 乘法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal multiply(double v1, double v2) {
            return operate(multiplyOpVisiter, valueOf(v1), valueOf(v2));
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(BigDecimal v1, BigDecimal v2) {
            return divideHalfUp(v1, v2);
        }
        
        /**
         * 除法
         * @param vs
         * @return
         */
        public BigDecimal divide(RoundingMode roundingMode, BigDecimal... vs) {
            BigDecimal base = null;
            int vsL;
            if (null != vs && 0 != (vsL = vs.length)) {
                BigDecimal tmp;
                for (int i = 0; i < vsL; i++) {
                    tmp = vs[i];
                    if (null != tmp) {
                        if (null == base) {
                            base = tmp;
                            // 除法最终以被除数的scale为准，计算时先转换到该scale，否则可能丢失精度
                            base = setScaleIfDifferent(base, roundingMode);
                        } else {
                            base = base.divide(tmp, roundingMode);
                        }
                    }
                }
            }
            if (null == base) {
                base = defaultZero;
            }
            return base;
        }
        
        /**
         * 除法
         * @param vs
         * @return
         */
        public BigDecimal divide(BigDecimal... vs) {
            return divide(RoundingMode.HALF_UP, vs);
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(String v1, String v2) {
            BigDecimal b1 = valueOf(v1);
            BigDecimal b2 = valueOf(v2);
            return divide(b1, b2);
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(BigDecimal v1, double v2) {
            return divide(v1, valueOf(v2));
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(double v1, double v2) {
            return divide(valueOf(v1), valueOf(v2));
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(BigDecimal v1, long v2) {
            // 除法最终以被除数的scale为准，计算时先转换到该scale，否则可能丢失精度
            v1 = setScaleIfDifferent(v1, RoundingMode.HALF_UP);
            BigDecimal b2 = valueOf(v2);
            return v1.divide(b2, RoundingMode.HALF_UP);
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(long v1, long v2) {
            return divide(v1, v2, RoundingMode.HALF_UP);
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(long v1, long v2, RoundingMode roundingMode) {
            BigDecimal b1 = valueOf(v1);
            BigDecimal b2 = valueOf(v2);
            return b1.divide(b2, roundingMode);
        }
        
        /**
         * 除法
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divide(BigDecimal v1, BigDecimal v2, RoundingMode roundingMode) {
            if (null == v1) {
                v1 = defaultZero;
            }
            // 除法最终以被除数的scale为准，计算时先转换到该scale，否则可能丢失精度
            v1 = setScaleIfDifferent(v1, roundingMode);
            if (null != v2) {
                v1 = v1.divide(v2, roundingMode);
            }
            return v1;
        }
        
        /**
         * 除法，向0方向舍入，去尾
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divideDown(BigDecimal v1, BigDecimal v2) {
            return divide(v1, v2, RoundingMode.DOWN);
        }
        
        /**
         * 除法，向0反方向舍入，进一
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divideUp(BigDecimal v1, BigDecimal v2) {
            return divide(v1, v2, RoundingMode.UP);
        }
        
        /**
         * 除法，五舍六入
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divideHalfDown(BigDecimal v1, BigDecimal v2) {
            return divide(v1, v2, RoundingMode.HALF_DOWN);
        }
        
        /**
         * 除法，四舍五入
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divideHalfUp(BigDecimal v1, BigDecimal v2) {
            return divide(v1, v2, RoundingMode.HALF_UP);
        }
        
        /**
         * 除法，向正无限大方向舍入
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divideCeiling(BigDecimal v1, BigDecimal v2) {
            return divide(v1, v2, RoundingMode.CEILING);
        }
        
        /**
         * 除法，向负无限大方向舍入
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal divideFloor(BigDecimal v1, BigDecimal v2) {
            return divide(v1, v2, RoundingMode.FLOOR);
        }
        
        /**
         * 取余
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal remainder(BigDecimal v1, BigDecimal v2) {
            return operate(remainderOpVisiter, v1, v2);
        }
        
        /**
         * 取余
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal remainder(String v1, String v2) {
            return operate(remainderOpVisiter, v1, v2);
        }
        
        /**
         * 取余
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal remainder(BigDecimal v1, long v2) {
            return operate(remainderOpVisiter, v1, v2);
        }
        
        /**
         * 比较大小
         * @param v1
         * @param v2
         * @return
         */
        public int compareTo(BigDecimal v1, BigDecimal v2) {
            return halfUp(v1).compareTo(halfUp(v2));
        }
        
        /**
         * 比较大小
         * @param v1
         * @param v2
         * @return
         */
        public int compareTo(String v1, String v2) {
            return valueOf(v1).compareTo(valueOf(v2));
        }
        
        /**
         * 比较大小
         * @param v1
         * @param v2
         * @return
         */
        public int compareTo(double v1, double v2) {
            return valueOf(v1).compareTo(valueOf(v2));
        }
        
        /**
         * 比较相等
         * @param v1
         * @param v2
         * @return
         */
        public boolean eq(BigDecimal v1, BigDecimal v2) {
            return compareTo(v1, v2) == 0;
        }
        
        /**
         * 比较相等
         * @param v1
         * @param v2
         * @return
         */
        public boolean eq(String v1, String v2) {
            return compareTo(v1, v2) == 0;
        }
        
        /**
         * 比较相等
         * @param v1
         * @param v2
         * @return
         */
        public boolean eq(double v1, double v2) {
            return compareTo(v1, v2) == 0;
        }
        
        /**
         * 比较不等
         * @param v1
         * @param v2
         * @return
         */
        public boolean ne(BigDecimal v1, BigDecimal v2) {
            return compareTo(v1, v2) != 0;
        }
        
        /**
         * 比较不等
         * @param v1
         * @param v2
         * @return
         */
        public boolean ne(String v1, String v2) {
            return compareTo(v1, v2) != 0;
        }
        
        /**
         * 比较不等
         * @param v1
         * @param v2
         * @return
         */
        public boolean ne(double v1, double v2) {
            return compareTo(v1, v2) != 0;
        }
        
        /**
         * 比较大于
         * @param v1
         * @param v2
         * @return
         */
        public boolean gt(BigDecimal v1, BigDecimal v2) {
            return compareTo(v1, v2) > 0;
        }
        
        /**
         * 比较大于
         * @param v1
         * @param v2
         * @return
         */
        public boolean gt(String v1, String v2) {
            return compareTo(v1, v2) > 0;
        }
        
        /**
         * 比较大于
         * @param v1
         * @param v2
         * @return
         */
        public boolean gt(double v1, double v2) {
            return compareTo(v1, v2) > 0;
        }
        
        /**
         * 比较小于
         * @param v1
         * @param v2
         * @return
         */
        public boolean lt(BigDecimal v1, BigDecimal v2) {
            return compareTo(v1, v2) < 0;
        }
        
        /**
         * 比较小于
         * @param v1
         * @param v2
         * @return
         */
        public boolean lt(String v1, String v2) {
            return compareTo(v1, v2) < 0;
        }
        
        /**
         * 比较小于
         * @param v1
         * @param v2
         * @return
         */
        public boolean lt(double v1, double v2) {
            return compareTo(v1, v2) < 0;
        }
        
        /**
         * 比较大于等于
         * @param v1
         * @param v2
         * @return
         */
        public boolean ge(BigDecimal v1, BigDecimal v2) {
            return compareTo(v1, v2) >= 0;
        }
        
        /**
         * 比较大于等于
         * @param v1
         * @param v2
         * @return
         */
        public boolean ge(String v1, String v2) {
            return compareTo(v1, v2) >= 0;
        }
        
        /**
         * 比较大于等于
         * @param v1
         * @param v2
         * @return
         */
        public boolean ge(double v1, double v2) {
            return compareTo(v1, v2) >= 0;
        }
        
        /**
         * 比较小于等于
         * @param v1
         * @param v2
         * @return
         */
        public boolean le(BigDecimal v1, BigDecimal v2) {
            return compareTo(v1, v2) <= 0;
        }
        
        /**
         * 比较小于等于
         * @param v1
         * @param v2
         * @return
         */
        public boolean le(String v1, String v2) {
            return compareTo(v1, v2) <= 0;
        }
        
        /**
         * 比较小于等于
         * @param v1
         * @param v2
         * @return
         */
        public boolean le(double v1, double v2) {
            return compareTo(v1, v2) <= 0;
        }
        
        /**
         * 等于零
         * @param v
         * @return
         */
        public boolean eq0(BigDecimal v) {
            return eq(v, defaultZero);
        }
        
        /**
         * 等于零
         * @param v
         * @return
         */
        public boolean eq0(String v) {
            return eq(valueOf(v), defaultZero);
        }
        
        /**
         * 等于零
         * @param v
         * @return
         */
        public boolean eq0(double v) {
            return eq(valueOf(v), defaultZero);
        }
        
        /**
         * 不等于零
         * @param v
         * @return
         */
        public boolean ne0(BigDecimal v) {
            return ne(v, defaultZero);
        }
        
        /**
         * 不等于零
         * @param v
         * @return
         */
        public boolean ne0(String v) {
            return ne(valueOf(v), defaultZero);
        }
        
        /**
         * 不等于零
         * @param v
         * @return
         */
        public boolean ne0(double v) {
            return ne(valueOf(v), defaultZero);
        }
        
        /**
         * 大于零
         * @param v
         * @return
         */
        public boolean gt0(BigDecimal v) {
            return gt(v, defaultZero);
        }
        
        /**
         * 大于零
         * @param v
         * @return
         */
        public boolean gt0(String v) {
            return gt(valueOf(v), defaultZero);
        }
        
        /**
         * 大于零
         * @param v
         * @return
         */
        public boolean gt0(double v) {
            return gt(valueOf(v), defaultZero);
        }
        
        /**
         * 小于零
         * @param v
         * @return
         */
        public boolean lt0(BigDecimal v) {
            return lt(v, defaultZero);
        }
        
        /**
         * 小于零
         * @param v
         * @return
         */
        public boolean lt0(String v) {
            return lt(valueOf(v), defaultZero);
        }
        
        /**
         * 小于零
         * @param v
         * @return
         */
        public boolean lt0(double v) {
            return lt(valueOf(v), defaultZero);
        }
        
        /**
         * 大于等于零
         * @param v
         * @return
         */
        public boolean ge0(BigDecimal v) {
            return ge(v, defaultZero);
        }
        
        /**
         * 大于等于零
         * @param v
         * @return
         */
        public boolean ge0(String v) {
            return ge(valueOf(v), defaultZero);
        }
        
        /**
         * 大于等于零
         * @param v
         * @return
         */
        public boolean ge0(double v) {
            return ge(valueOf(v), defaultZero);
        }
        
        /**
         * 小于等于零
         * @param v
         * @return
         */
        public boolean le0(BigDecimal v) {
            return le(v, defaultZero);
        }
        
        /**
         * 小于等于零
         * @param v
         * @return
         */
        public boolean le0(String v) {
            return le(valueOf(v), defaultZero);
        }
        
        /**
         * 小于等于零
         * @param v
         * @return
         */
        public boolean le0(double v) {
            return le(valueOf(v), defaultZero);
        }
        
        /**
         * 返回较小值
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal min(BigDecimal v1, BigDecimal v2) {
            v1 = halfUp(v1);
            v2 = halfUp(v2);
            return v1.compareTo(v2) < 0 ? v1 : v2;
        }
        
        /**
         * 返回较小值
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal min(String v1, String v2) {
            BigDecimal bd1 = valueOf(v1);
            BigDecimal bd2 = valueOf(v2);
            return bd1.compareTo(bd2) < 0 ? bd1 : bd2;
        }
        
        /**
         * 返回较小值
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal min(double v1, double v2) {
            BigDecimal bd1 = valueOf(v1);
            BigDecimal bd2 = valueOf(v2);
            return bd1.compareTo(bd2) < 0 ? bd1 : bd2;
        }
        
        /**
         * 返回较大值
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal max(BigDecimal v1, BigDecimal v2) {
            v1 = halfUp(v1);
            v2 = halfUp(v2);
            return v1.compareTo(v2) > 0 ? v1 : v2;
        }
        
        /**
         * 返回较大值
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal max(String v1, String v2) {
            BigDecimal bd1 = valueOf(v1);
            BigDecimal bd2 = valueOf(v2);
            return bd1.compareTo(bd2) > 0 ? bd1 : bd2;
        }
        
        /**
         * 返回较大值
         * @param v1
         * @param v2
         * @return
         */
        public BigDecimal max(double v1, double v2) {
            BigDecimal bd1 = valueOf(v1);
            BigDecimal bd2 = valueOf(v2);
            return bd1.compareTo(bd2) > 0 ? bd1 : bd2;
        }
        
        /**
         * 向0方向舍入，去尾
         * @param v
         * @return
         */
        public BigDecimal down(BigDecimal v) {
            return setScaleIfHigher(v, RoundingMode.DOWN);
        }
        
        /**
         * 向0反方向舍入，进一
         * @param v
         * @return
         */
        public BigDecimal up(BigDecimal v) {
            return setScaleIfHigher(v, RoundingMode.UP);
        }
        
        /**
         * 五舍六入
         * @param v
         * @return
         */
        public BigDecimal halfDown(BigDecimal v) {
            return setScaleIfHigher(v, RoundingMode.HALF_DOWN);
        }
        
        /**
         * 四舍五入
         * @param v
         * @return
         */
        public BigDecimal halfUp(BigDecimal v) {
            return setScaleIfHigher(v, RoundingMode.HALF_UP);
        }
        
        /**
         * 向正无限大方向舍入
         * @param v
         * @return
         */
        public BigDecimal ceiling(BigDecimal v) {
            return setScaleIfHigher(v, RoundingMode.CEILING);
        }
        
        /**
         * 向负无限大方向舍入
         * @param v
         * @return
         */
        public BigDecimal floor(BigDecimal v) {
            return setScaleIfHigher(v, RoundingMode.FLOOR);
        }
        
        /**
         * 强制(非强制时只会做降低精度的动作)向0方向舍入，去尾<br />
         * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
         * @param v
         * @return
         */
        public BigDecimal forceDown(BigDecimal v) {
            return setScaleIfDifferent(v, RoundingMode.DOWN);
        }
        
        /**
         * 强制(非强制时只会做降低精度的动作)向0反方向舍入，进一<br />
         * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
         * @param v
         * @return
         */
        public BigDecimal forceUp(BigDecimal v) {
            return setScaleIfDifferent(v, RoundingMode.UP);
        }
        
        /**
         * 强制(非强制时只会做降低精度的动作)五舍六入<br />
         * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
         * @param v
         * @return
         */
        public BigDecimal forceHalfDown(BigDecimal v) {
            return setScaleIfDifferent(v, RoundingMode.HALF_DOWN);
        }
        
        /**
         * 强制(非强制时只会做降低精度的动作)四舍五入<br />
         * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
         * @param v
         * @return
         */
        public BigDecimal forceHalfUp(BigDecimal v) {
            return setScaleIfDifferent(v, RoundingMode.HALF_UP);
        }
        
        /**
         * 强制(非强制时只会做降低精度的动作)向正无限大方向舍入<br />
         * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
         * @param v
         * @return
         */
        public BigDecimal forceCeiling(BigDecimal v) {
            return setScaleIfDifferent(v, RoundingMode.CEILING);
        }
        
        /**
         * 强制(非强制时只会做降低精度的动作)向负无限大方向舍入<br />
         * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
         * @param v
         * @return
         */
        public BigDecimal forceFloor(BigDecimal v) {
            return setScaleIfDifferent(v, RoundingMode.FLOOR);
        }
        
        /**
         * 降低一个精度，向0方向舍入，去尾
         * @param v
         * @return
         */
        public BigDecimal lowerScaleDown(BigDecimal v) {
            return getLowerScaleInstance().down(v);
        }
        
        /**
         * 降低一个精度，向0反方向舍入，进一
         * @param v
         * @return
         */
        public BigDecimal lowerScaleUp(BigDecimal v) {
            return getLowerScaleInstance().up(v);
        }
        
        /**
         * 降低一个精度，五舍六入
         * @param v
         * @return
         */
        public BigDecimal lowerScaleHalfDown(BigDecimal v) {
            return getLowerScaleInstance().halfDown(v);
        }
        
        /**
         * 降低一个精度，四舍五入
         * @param v
         * @return
         */
        public BigDecimal lowerScaleHalfUp(BigDecimal v) {
            return getLowerScaleInstance().halfUp(v);
        }
        
        /**
         * 降低一个精度，向正无限大方向舍入
         * @param v
         * @return
         */
        public BigDecimal lowerScaleCeiling(BigDecimal v) {
            return getLowerScaleInstance().ceiling(v);
        }
        
        /**
         * 降低一个精度，向负无限大方向舍入
         * @param v
         * @return
         */
        public BigDecimal lowerScaleFloor(BigDecimal v) {
            return getLowerScaleInstance().floor(v);
        }
        
        /**
         * 获取默认小数点位数
         * @return
         */
        public int getDefaultScale() {
            return defaultScale;
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程
         * @param bdVal
         * @param roundingMode
         * @return
         */
        public NumberWrapper getNumberWrapper(BigDecimal bdVal, RoundingMode roundingMode) {
            return new NumberWrapper(this, bdVal, roundingMode);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程，基准值四舍五入
         * @param bdVal
         * @return
         */
        public NumberWrapper getNumberWrapper(BigDecimal bdVal) {
            return new NumberWrapper(this, bdVal);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程
         * @param stringVal
         * @param roundingMode
         * @return
         */
        public NumberWrapper getNumberWrapper(String stringVal, RoundingMode roundingMode) {
            return new NumberWrapper(this, stringVal, roundingMode);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程，基准值四舍五入
         * @param stringVal
         * @return
         */
        public NumberWrapper getNumberWrapper(String stringVal) {
            return new NumberWrapper(this, stringVal);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程
         * @param longVal
         * @return
         */
        public NumberWrapper getNumberWrapper(long longVal) {
            return new NumberWrapper(this, longVal);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程
         * @param longVal
         * @return
         */
        public NumberWrapper getNumberWrapper(Long longVal) {
            return new NumberWrapper(this, longVal);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程，基准值四舍五入
         * @param doubleVal
         * @return
         */
        public NumberWrapper getNumberWrapper(double doubleVal) {
            return new NumberWrapper(this, doubleVal);
        }
        
        /**
         * 获取数字包装，用于便捷的链式编程
         * @param doubleVal
         * @param roundingMode
         * @return
         */
        public NumberWrapper getNumberWrapper(double doubleVal, RoundingMode roundingMode) {
            return new NumberWrapper(this, doubleVal);
        }
        
    }
    
    /**
     * 数字包装，用于便捷的链式编程
     * @author Tiger
     *         
     */
    public static class NumberWrapper {
        
        private MathUtilInstance mu;
        
        private BigDecimal base;
        
        public NumberWrapper(MathUtilInstance mu, BigDecimal bdVal, RoundingMode roundingMode) {
            setMu(mu);
            init(bdVal, roundingMode);
        }
        
        public NumberWrapper(MathUtilInstance mu, BigDecimal bdVal) {
            setMu(mu);
            init(bdVal);
        }
        
        public NumberWrapper(MathUtilInstance mu, String stringVal, RoundingMode roundingMode) {
            setMu(mu);
            init(stringVal, roundingMode);
        }
        
        public NumberWrapper(MathUtilInstance mu, String stringVal) {
            setMu(mu);
            init(stringVal);
        }
        
        public NumberWrapper(MathUtilInstance mu, long longVal) {
            setMu(mu);
            init(longVal);
        }
        
        public NumberWrapper(MathUtilInstance mu, Long longVal) {
            setMu(mu);
            init(longVal);
        }
        
        public NumberWrapper(MathUtilInstance mu, double doubleVal) {
            setMu(mu);
            init(doubleVal);
        }
        
        public NumberWrapper(MathUtilInstance mu, double doubleVal, RoundingMode roundingMode) {
            setMu(mu);
            init(doubleVal, roundingMode);
        }

        public NumberWrapper(MathUtilInstance mu, Double doubleVal) {
            setMu(mu);
            init(doubleVal);
        }

        public NumberWrapper(MathUtilInstance mu, Double doubleVal, RoundingMode roundingMode) {
            setMu(mu);
            init(doubleVal, roundingMode);
        }

        public NumberWrapper(int scale, BigDecimal bdVal, RoundingMode roundingMode) {
            setMuScale(scale);
            init(bdVal, roundingMode);
        }
        
        public NumberWrapper(int scale, BigDecimal bdVal) {
            setMuScale(scale);
            init(bdVal);
        }
        
        public NumberWrapper(int scale, String stringVal, RoundingMode roundingMode) {
            setMuScale(scale);
            init(stringVal, roundingMode);
        }
        
        public NumberWrapper(int scale, String stringVal) {
            setMuScale(scale);
            init(stringVal);
        }
        
        public NumberWrapper(int scale, long longVal) {
            setMuScale(scale);
            init(longVal);
        }
        
        public NumberWrapper(int scale, Long longVal) {
            setMuScale(scale);
            init(longVal);
        }
        
        public NumberWrapper(int scale, double doubleVal) {
            setMuScale(scale);
            init(doubleVal);
        }
        
        public NumberWrapper(int scale, double doubleVal, RoundingMode roundingMode) {
            setMuScale(scale);
            init(doubleVal, roundingMode);
        }

        public NumberWrapper(int scale, Double doubleVal) {
            setMuScale(scale);
            init(doubleVal);
        }

        public NumberWrapper(int scale, Double doubleVal, RoundingMode roundingMode) {
            setMuScale(scale);
            init(doubleVal, roundingMode);
        }

        public void setMu(MathUtilInstance mu) {
            this.mu = null == mu ? getInstance() : mu;
        }
        
        public void setMuScale(int scale) {
            mu = getInstance(scale);
        }
        
        public NumberWrapper init(BigDecimal bdVal, RoundingMode roundingMode) {
            base = null == bdVal ? mu.defaultZero : mu.setScaleIfDifferent(bdVal, roundingMode);
            return this;
        }
        
        public NumberWrapper init(BigDecimal bdVal) {
            return init(bdVal, RoundingMode.HALF_UP);
        }
        
        public NumberWrapper init(String stringVal, RoundingMode roundingMode) {
            base = mu.valueOf(stringVal, roundingMode);
            return this;
        }
        
        /**
         * 初始化基准值，四舍五入
         * @param stringVal
         * @return
         */
        public NumberWrapper init(String stringVal) {
            base = mu.valueOf(stringVal);
            return this;
        }
        
        public NumberWrapper init(long longVal) {
            base = mu.valueOf(longVal);
            return this;
        }
        
        public NumberWrapper init(Long longVal) {
            base = mu.valueOf(longVal);
            return this;
        }
        
        /**
         * 初始化基准值，四舍五入
         * @param doubleVal
         * @return
         */
        public NumberWrapper init(double doubleVal) {
            base = mu.valueOf(doubleVal);
            return this;
        }
        
        public NumberWrapper init(double doubleVal, RoundingMode roundingMode) {
            base = mu.valueOf(doubleVal, roundingMode);
            return this;
        }

        /**
         * 初始化基准值，四舍五入
         * @param doubleVal
         * @return
         */
        public NumberWrapper init(Double doubleVal) {
            base = mu.valueOf(doubleVal);
            return this;
        }

        public NumberWrapper init(Double doubleVal, RoundingMode roundingMode) {
            base = mu.valueOf(doubleVal, roundingMode);
            return this;
        }

        public BigDecimal get() {
            return base;
        }
        
        /**
         * 加法
         * @param v
         * @return
         */
        public NumberWrapper add(BigDecimal v) {
            base = mu.add(base, v);
            return this;
        }
        
        /**
         * 加法
         * @param v
         * @return
         */
        public NumberWrapper add(String v) {
            base = mu.add(base, valueOf(v));
            return this;
        }
        
        /**
         * 加法
         * @param v
         * @return
         */
        public NumberWrapper add(double v) {
            base = mu.add(base, valueOf(v));
            return this;
        }
        
        /**
         * 加法
         * @param v
         * @return
         */
        public NumberWrapper add(long v) {
            base = mu.add(base, valueOf(v));
            return this;
        }
        
        /**
         * 减法
         * @param v
         * @return
         */
        public NumberWrapper subtract(BigDecimal v) {
            base = mu.subtract(base, v);
            return this;
        }
        
        /**
         * 减法
         * @param v
         * @return
         */
        public NumberWrapper subtract(String v) {
            base = mu.subtract(base, valueOf(v));
            return this;
        }
        
        /**
         * 减法
         * @param v
         * @return
         */
        public NumberWrapper subtract(double v) {
            base = mu.subtract(base, valueOf(v));
            return this;
        }
        
        /**
         * 减法
         * @param v
         * @return
         */
        public NumberWrapper subtract(long v) {
            base = mu.subtract(base, valueOf(v));
            return this;
        }
        
        /**
         * 乘法
         * @param v
         * @return
         */
        public NumberWrapper multiply(BigDecimal v) {
            base = mu.multiply(base, v);
            return this;
        }
        
        /**
         * 乘法
         * @param v
         * @return
         */
        public NumberWrapper multiply(String v) {
            base = mu.multiply(base, valueOf(v));
            return this;
        }
        
        /**
         * 乘法
         * @param v
         * @return
         */
        public NumberWrapper multiply(long v) {
            base = mu.multiply(base, valueOf(v));
            return this;
        }
        
        /**
         * 乘法
         * @param v
         * @return
         */
        public NumberWrapper multiply(double v) {
            base = mu.multiply(base, valueOf(v));
            return this;
        }
        
        /**
         * 除法
         * @param v
         * @return
         */
        public NumberWrapper divide(BigDecimal v) {
            base = mu.divide(base, v);
            return this;
        }
        
        /**
         * 除法
         * @param v
         * @return
         */
        public NumberWrapper divide(String v) {
            base = mu.divide(base, valueOf(v));
            return this;
        }
        
        /**
         * 除法
         * @param v
         * @return
         */
        public NumberWrapper divide(double v) {
            base = mu.divide(base, valueOf(v));
            return this;
        }
        
        /**
         * 除法
         * @param v
         * @return
         */
        public NumberWrapper divide(long v) {
            base = mu.divide(base, valueOf(v));
            return this;
        }
        
        /**
         * 除法
         * @param v
         * @param roundingMode
         * @return
         */
        public NumberWrapper divide(long v, RoundingMode roundingMode) {
            base = mu.divide(base, valueOf(v), roundingMode);
            return this;
        }
        
        /**
         * 除法
         * @param v
         * @param roundingMode
         * @return
         */
        public NumberWrapper divide(BigDecimal v, RoundingMode roundingMode) {
            base = mu.divide(base, v, roundingMode);
            return this;
        }
        
        /**
         * 除法，向0方向舍入，去尾
         * @param v
         * @return
         */
        public NumberWrapper divideDown(BigDecimal v) {
            base = mu.divideDown(base, v);
            return this;
        }
        
        /**
         * 除法，向0反方向舍入，进一
         * @param v
         * @return
         */
        public NumberWrapper divideUp(BigDecimal v) {
            base = mu.divideUp(base, v);
            return this;
        }
        
        /**
         * 除法，五舍六入
         * @param v
         * @return
         */
        public NumberWrapper divideHalfDown(BigDecimal v) {
            base = mu.divideHalfDown(base, v);
            return this;
        }
        
        /**
         * 除法，四舍五入
         * @param v
         * @return
         */
        public NumberWrapper divideHalfUp(BigDecimal v) {
            base = mu.divideHalfUp(base, v);
            return this;
        }
        
        /**
         * 除法，向正无限大方向舍入
         * @param v
         * @return
         */
        public NumberWrapper divideCeiling(BigDecimal v) {
            base = mu.divideCeiling(base, v);
            return this;
        }
        
        /**
         * 除法，向负无限大方向舍入
         * @param v
         * @return
         */
        public NumberWrapper divideFloor(BigDecimal v) {
            base = mu.divideFloor(base, v);
            return this;
        }
        
        /**
         * 取余
         * @param v
         * @return
         */
        public NumberWrapper remainder(BigDecimal v) {
            base = mu.remainder(base, v);
            return this;
        }
        
        /**
         * 取余
         * @param v
         * @return
         */
        public NumberWrapper remainder(String v) {
            base = mu.remainder(base, valueOf(v));
            return this;
        }
        
        /**
         * 取余
         * @param v
         * @return
         */
        public NumberWrapper remainder(long v) {
            base = mu.remainder(base, valueOf(v));
            return this;
        }
        
        /**
         * 比较大小
         * @param v
         * @return
         */
        public int compareTo(BigDecimal v) {
            return base.compareTo(mu.halfUp(v));
        }
        
        /**
         * 比较大小
         * @param v
         * @return
         */
        public int compareTo(String v) {
            return base.compareTo(mu.valueOf(v));
        }
        
        /**
         * 比较大小
         * @param v
         * @return
         */
        public int compareTo(double v) {
            return base.compareTo(mu.valueOf(v));
        }
        
        /**
         * 比较相等
         * @param v
         * @return
         */
        public boolean eq(BigDecimal v) {
            return compareTo(v) == 0;
        }
        
        /**
         * 比较相等
         * @param v
         * @return
         */
        public boolean eq(String v) {
            return compareTo(v) == 0;
        }
        
        /**
         * 比较相等
         * @param v
         * @return
         */
        public boolean eq(double v) {
            return compareTo(v) == 0;
        }
        
        /**
         * 比较不等
         * @param v
         * @return
         */
        public boolean ne(BigDecimal v) {
            return compareTo(v) != 0;
        }
        
        /**
         * 比较不等
         * @param v
         * @return
         */
        public boolean ne(String v) {
            return compareTo(v) != 0;
        }
        
        /**
         * 比较不等
         * @param v
         * @return
         */
        public boolean ne(double v) {
            return compareTo(v) != 0;
        }
        
        /**
         * 比较大于
         * @param v
         * @return
         */
        public boolean gt(BigDecimal v) {
            return compareTo(v) > 0;
        }
        
        /**
         * 比较大于
         * @param v
         * @return
         */
        public boolean gt(String v) {
            return compareTo(v) > 0;
        }
        
        /**
         * 比较大于
         * @param v
         * @return
         */
        public boolean gt(double v) {
            return compareTo(v) > 0;
        }
        
        /**
         * 比较小于
         * @param v
         * @return
         */
        public boolean lt(BigDecimal v) {
            return compareTo(v) < 0;
        }
        
        /**
         * 比较小于
         * @param v
         * @return
         */
        public boolean lt(String v) {
            return compareTo(v) < 0;
        }
        
        /**
         * 比较小于
         * @param v
         * @return
         */
        public boolean lt(double v) {
            return compareTo(v) < 0;
        }
        
        /**
         * 比较大于等于
         * @param v
         * @return
         */
        public boolean ge(BigDecimal v) {
            return compareTo(v) >= 0;
        }
        
        /**
         * 比较大于等于
         * @param v
         * @return
         */
        public boolean ge(String v) {
            return compareTo(v) >= 0;
        }
        
        /**
         * 比较大于等于
         * @param v
         * @return
         */
        public boolean ge(double v) {
            return compareTo(v) >= 0;
        }
        
        /**
         * 比较小于等于
         * @param v
         * @return
         */
        public boolean le(BigDecimal v) {
            return compareTo(v) <= 0;
        }
        
        /**
         * 比较小于等于
         * @param v
         * @return
         */
        public boolean le(String v) {
            return compareTo(v) <= 0;
        }
        
        /**
         * 比较小于等于
         * @param v
         * @return
         */
        public boolean le(double v) {
            return compareTo(v) <= 0;
        }
        
        /**
         * 等于零
         * @return
         */
        public boolean eq0() {
            return eq(mu.defaultZero);
        }
        
        /**
         * 不等于零
         * @return
         */
        public boolean ne0() {
            return ne(mu.defaultZero);
        }
        
        /**
         * 大于零
         * @return
         */
        public boolean gt0() {
            return gt(mu.defaultZero);
        }
        
        /**
         * 小于零
         * @return
         */
        public boolean lt0() {
            return lt(mu.defaultZero);
        }
        
        /**
         * 大于等于零
         * @return
         */
        public boolean ge0() {
            return ge(mu.defaultZero);
        }
        
        /**
         * 小于等于零
         * @return
         */
        public boolean le0() {
            return le(mu.defaultZero);
        }
        
        /**
         * 改变scale，向0方向舍入，去尾
         * @return
         */
        public NumberWrapper scaleDown(int scale) {
            setMuScale(scale);
            base = mu.setScaleIfDifferent(base, RoundingMode.DOWN);
            return this;
        }
        
        /**
         * 改变scale，向0反方向舍入，进一
         * @param scale
         * @return
         */
        public NumberWrapper scaleUp(int scale) {
            setMuScale(scale);
            base = mu.setScaleIfDifferent(base, RoundingMode.UP);
            return this;
        }
        
        /**
         * 改变scale，五舍六入
         * @param scale
         * @return
         */
        public NumberWrapper scaleHalfDown(int scale) {
            setMuScale(scale);
            base = mu.setScaleIfDifferent(base, RoundingMode.HALF_DOWN);
            return this;
        }
        
        /**
         * 改变scale，四舍五入
         * @param scale
         * @return
         */
        public NumberWrapper scaleHalfUp(int scale) {
            setMuScale(scale);
            base = mu.setScaleIfDifferent(base, RoundingMode.HALF_UP);
            return this;
        }
        
        /**
         * 改变scale，向正无限大方向舍入
         * @param scale
         * @return
         */
        public NumberWrapper scaleCeiling(int scale) {
            setMuScale(scale);
            base = mu.setScaleIfDifferent(base, RoundingMode.CEILING);
            return this;
        }
        
        /**
         * 改变scale，向负无限大方向舍入
         * @param scale
         * @return
         */
        public NumberWrapper scaleFloor(int scale) {
            setMuScale(scale);
            base = mu.setScaleIfDifferent(base, RoundingMode.FLOOR);
            return this;
        }
        
        @Override
        public String toString() {
            return base.toPlainString();
        }
        
    }
    
    public static BigDecimal getDefaultZero() {
        return instance.getDefaultZero();
    }
    
    /**
     * 获取默认分辨率，如默认为3位小数，则该值为0.001
     * @return
     */
    public static BigDecimal getDefaultResolution() {
        return instance.getDefaultResolution();
    }
    
    public static MathUtilInstance getHigherScaleInstance() {
        return instance.getHigherScaleInstance();
    }
    
    public static MathUtilInstance getLowerScaleInstance() {
        return instance.getLowerScaleInstance();
    }
    
    public static BigDecimal valueOf(String stringVal, RoundingMode roundingMode) {
        return instance.valueOf(stringVal, roundingMode);
    }
    
    /**
     * 获取对应的BigDecimal，四舍五入
     * @param stringVal
     * @return
     */
    public static BigDecimal valueOf(String stringVal) {
        return instance.valueOf(stringVal);
    }
    
    public static BigDecimal valueOf(long longVal) {
        return instance.valueOf(longVal);
    }
    
    public static BigDecimal valueOf(Long longVal) {
        return instance.valueOf(longVal);
    }
    
    public static BigDecimal valueOf(double doubleVal, RoundingMode roundingMode) {
        return instance.valueOf(doubleVal, roundingMode);
    }
    
    /**
     * 获取对应的BigDecimal，四舍五入
     * @param doubleVal
     * @return
     */
    public static BigDecimal valueOf(double doubleVal) {
        return instance.valueOf(doubleVal);
    }

    public static BigDecimal valueOf(Double doubleVal, RoundingMode roundingMode) {
        return instance.valueOf(doubleVal, roundingMode);
    }

    /**
     * 获取对应的BigDecimal，四舍五入
     * @param doubleVal
     * @return
     */
    public static BigDecimal valueOf(Double doubleVal) {
        return instance.valueOf(doubleVal);
    }

    /**
     * 加法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal add(BigDecimal v1, BigDecimal v2) {
        return instance.add(v1, v2);
    }
    
    /**
     * 加法
     * @param vs
     * @return
     */
    public static BigDecimal add(BigDecimal... vs) {
        return instance.add(vs);
    }
    
    /**
     * 加法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal add(String v1, String v2) {
        return instance.add(v1, v2);
    }
    
    /**
     * 加法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal addOnHigherScale(String v1, String v2) {
        return instance.addOnHigherScale(v1, v2);
    }
    
    /**
     * 加法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal add(double v1, double v2) {
        return instance.add(v1, v2);
    }
    
    /**
     * 加法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal addOnHigherScale(double v1, double v2) {
        return instance.addOnHigherScale(v1, v2);
    }
    
    /**
     * 加法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal add(BigDecimal v1, long v2) {
        return instance.add(v1, v2);
    }
    
    /**
     * 减法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal subtract(BigDecimal v1, BigDecimal v2) {
        return instance.subtract(v1, v2);
    }
    
    /**
     * 减法
     * @param vs
     * @return
     */
    public static BigDecimal subtract(BigDecimal... vs) {
        return instance.subtract(vs);
    }
    
    /**
     * 减法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal subtract(String v1, String v2) {
        return instance.subtract(v1, v2);
    }
    
    /**
     * 减法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal subtractOnHigherScale(String v1, String v2) {
        return instance.subtractOnHigherScale(v1, v2);
    }
    
    /**
     * 减法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal subtract(double v1, double v2) {
        return instance.subtract(v1, v2);
    }
    
    /**
     * 减法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal subtractOnHigherScale(double v1, double v2) {
        return instance.subtractOnHigherScale(v1, v2);
    }
    
    /**
     * 减法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal subtract(BigDecimal v1, long v2) {
        return instance.subtract(v1, v2);
    }
    
    /**
     * 乘法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal multiply(BigDecimal v1, BigDecimal v2) {
        return instance.multiply(v1, v2);
    }
    
    /**
     * 乘法
     * @param vs
     * @return
     */
    public static BigDecimal multiply(BigDecimal... vs) {
        return instance.multiply(vs);
    }
    
    /**
     * 乘法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal multiply(String v1, String v2) {
        return instance.multiply(v1, v2);
    }
    
    /**
     * 乘法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal multiply(BigDecimal v1, long v2) {
        return instance.multiply(v1, v2);
    }
    
    /**
     * 乘法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal multiply(BigDecimal v1, double v2) {
        return instance.multiply(v1, v2);
    }
    
    /**
     * 乘法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal multiply(double v1, double v2) {
        return instance.multiply(v1, v2);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divide(BigDecimal v1, BigDecimal v2) {
        return instance.divide(v1, v2);
    }
    
    /**
     * 除法
     * @param roundingMode
     * @param vs
     * @return
     */
    public static BigDecimal divide(RoundingMode roundingMode, BigDecimal... vs) {
        return instance.divide(roundingMode, vs);
    }
    
    /**
     * 除法
     * @param vs
     * @return
     */
    public static BigDecimal divide(BigDecimal... vs) {
        return instance.divide(vs);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divide(String v1, String v2) {
        return instance.divide(v1, v2);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal divide(BigDecimal v1, double v2) {
        return instance.divide(v1, v2);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal divide(double v1, double v2) {
        return instance.divide(v1, v2);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divide(BigDecimal v1, long v2) {
        return instance.divide(v1, v2);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divide(long v1, long v2) {
        return instance.divide(v1, v2);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal divide(long v1, long v2, RoundingMode roundingMode) {
        return instance.divide(v1, v2, roundingMode);
    }
    
    /**
     * 除法
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divide(BigDecimal v1, BigDecimal v2, RoundingMode roundingMode) {
        return instance.divide(v1, v2, roundingMode);
    }
    
    /**
     * 除法，向0方向舍入，去尾
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divideDown(BigDecimal v1, BigDecimal v2) {
        return instance.divideDown(v1, v2);
    }
    
    /**
     * 除法，向0反方向舍入，进一
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divideUp(BigDecimal v1, BigDecimal v2) {
        return instance.divideUp(v1, v2);
    }
    
    /**
     * 除法，五舍六入
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divideHalfDown(BigDecimal v1, BigDecimal v2) {
        return instance.divideHalfDown(v1, v2);
    }
    
    /**
     * 除法，四舍五入
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divideHalfUp(BigDecimal v1, BigDecimal v2) {
        return instance.divideHalfUp(v1, v2);
    }
    
    /**
     * 除法，向正无限大方向舍入
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divideCeiling(BigDecimal v1, BigDecimal v2) {
        return instance.divideCeiling(v1, v2);
    }
    
    /**
     * 除法，向负无限大方向舍入
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal divideFloor(BigDecimal v1, BigDecimal v2) {
        return instance.divideFloor(v1, v2);
    }
    
    /**
     * 取余
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal remainder(BigDecimal v1, BigDecimal v2) {
        return instance.remainder(v1, v2);
    }
    
    /**
     * 取余
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal remainder(String v1, String v2) {
        return instance.remainder(v1, v2);
    }
    
    /**
     * 取余
     * @param v1
     * @param v2
     * @return
     */
    public static BigDecimal remainder(BigDecimal v1, long v2) {
        return instance.remainder(v1, v2);
    }
    
    /**
     * 比较大小
     * @param v1
     * @param v2
     * @return
     */
    public static int compareTo(BigDecimal v1, BigDecimal v2) {
        return instance.compareTo(v1, v2);
    }
    
    /**
     * 比较大小
     * @param v1
     * @param v2
     * @return
     */
    public static int compareTo(String v1, String v2) {
        return instance.compareTo(v1, v2);
    }
    
    /**
     * 比较大小
     * @param v1
     * @param v2
     * @return
     */
    public static int compareTo(double v1, double v2) {
        return instance.compareTo(v1, v2);
    }
    
    /**
     * 比较相等
     * @param v1
     * @param v2
     * @return
     */
    public static boolean eq(BigDecimal v1, BigDecimal v2) {
        return instance.eq(v1, v2);
    }
    
    /**
     * 比较相等
     * @param v1
     * @param v2
     * @return
     */
    public static boolean eq(String v1, String v2) {
        return instance.eq(v1, v2);
    }
    
    /**
     * 比较相等
     * @param v1
     * @param v2
     * @return
     */
    public static boolean eq(double v1, double v2) {
        return instance.eq(v1, v2);
    }
    
    /**
     * 比较不等
     * @param v1
     * @param v2
     * @return
     */
    public static boolean ne(BigDecimal v1, BigDecimal v2) {
        return instance.ne(v1, v2);
    }
    
    /**
     * 比较不等
     * @param v1
     * @param v2
     * @return
     */
    public static boolean ne(String v1, String v2) {
        return instance.ne(v1, v2);
    }
    
    /**
     * 比较不等
     * @param v1
     * @param v2
     * @return
     */
    public static boolean ne(double v1, double v2) {
        return instance.ne(v1, v2);
    }
    
    /**
     * 比较大于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean gt(BigDecimal v1, BigDecimal v2) {
        return instance.gt(v1, v2);
    }
    
    /**
     * 比较大于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean gt(String v1, String v2) {
        return instance.gt(v1, v2);
    }
    
    /**
     * 比较大于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean gt(double v1, double v2) {
        return instance.gt(v1, v2);
    }
    
    /**
     * 比较小于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean lt(BigDecimal v1, BigDecimal v2) {
        return instance.lt(v1, v2);
    }
    
    /**
     * 比较小于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean lt(String v1, String v2) {
        return instance.lt(v1, v2);
    }
    
    /**
     * 比较小于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean lt(double v1, double v2) {
        return instance.lt(v1, v2);
    }
    
    /**
     * 比较大于等于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean ge(BigDecimal v1, BigDecimal v2) {
        return instance.ge(v1, v2);
    }
    
    /**
     * 比较大于等于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean ge(String v1, String v2) {
        return instance.ge(v1, v2);
    }
    
    /**
     * 比较大于等于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean ge(double v1, double v2) {
        return instance.ge(v1, v2);
    }
    
    /**
     * 比较小于等于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean le(BigDecimal v1, BigDecimal v2) {
        return instance.le(v1, v2);
    }
    
    /**
     * 比较小于等于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean le(String v1, String v2) {
        return instance.le(v1, v2);
    }
    
    /**
     * 比较小于等于
     * @param v1
     * @param v2
     * @return
     */
    public static boolean le(double v1, double v2) {
        return instance.le(v1, v2);
    }
    
    /**
     * 等于零
     * @param v
     * @return
     */
    public static boolean eq0(BigDecimal v) {
        return instance.eq0(v);
    }
    
    /**
     * @param v
     * @return
     */
    public static boolean eq0(String v) {
        return instance.eq0(v);
    }
    
    /**
     * @param v
     * @return
     */
    public static boolean eq0(double v) {
        return instance.eq0(v);
    }
    
    /**
     * 不等于零
     * @param v
     * @return
     */
    public static boolean ne0(BigDecimal v) {
        return instance.ne0(v);
    }
    
    /**
     * 不等于零
     * @param v
     * @return
     */
    public static boolean ne0(String v) {
        return instance.ne0(v);
    }
    
    /**
     * 不等于零
     * @param v
     * @return
     */
    public static boolean ne0(double v) {
        return instance.ne0(v);
    }
    
    /**
     * 大于零
     * @param v
     * @return
     */
    public static boolean gt0(BigDecimal v) {
        return instance.gt0(v);
    }
    
    /**
     * 大于零
     * @param v
     * @return
     */
    public static boolean gt0(String v) {
        return instance.gt0(v);
    }
    
    /**
     * 大于零
     * @param v
     * @return
     */
    public static boolean gt0(double v) {
        return instance.gt0(v);
    }
    
    /**
     * 小于零
     * @param v
     * @return
     */
    public static boolean lt0(BigDecimal v) {
        return instance.lt0(v);
    }
    
    /**
     * 小于零
     * @param v
     * @return
     */
    public static boolean lt0(String v) {
        return instance.lt0(v);
    }
    
    /**
     * 小于零
     * @param v
     * @return
     */
    public static boolean lt0(double v) {
        return instance.lt0(v);
    }
    
    /**
     * 大于等于零
     * @param v
     * @return
     */
    public static boolean ge0(BigDecimal v) {
        return instance.ge0(v);
    }
    
    /**
     * 大于等于零
     * @param v
     * @return
     */
    public static boolean ge0(String v) {
        return instance.ge0(v);
    }
    
    /**
     * 大于等于零
     * @param v
     * @return
     */
    public static boolean ge0(double v) {
        return instance.ge0(v);
    }
    
    /**
     * 小于等于零
     * @param v
     * @return
     */
    public static boolean le0(BigDecimal v) {
        return instance.le0(v);
    }
    
    /**
     * @param v
     * @return
     */
    public static boolean le0(String v) {
        return instance.le0(v);
    }
    
    /**
     * @param v
     * @return
     */
    public static boolean le0(double v) {
        return instance.le0(v);
    }
    
    /**
     * 返回较小值
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal min(BigDecimal v1, BigDecimal v2) {
        return instance.min(v1, v2);
    }
    
    /**
     * 返回较小值
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal min(String v1, String v2) {
        return instance.min(v1, v2);
    }
    
    /**
     * 返回较小值
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal min(double v1, double v2) {
        return instance.min(v1, v2);
    }
    
    /**
     * 返回较大值
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal max(BigDecimal v1, BigDecimal v2) {
        return instance.max(v1, v2);
    }
    
    /**
     * 返回较大值
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal max(String v1, String v2) {
        return instance.max(v1, v2);
    }
    
    /**
     * 返回较大值
     * @param v1
     * @param v2
     * @return
     */
    public BigDecimal max(double v1, double v2) {
        return instance.max(v1, v2);
    }
    
    /**
     * 向0方向舍入，去尾
     * @param v
     * @return
     */
    public static BigDecimal down(BigDecimal v) {
        return instance.down(v);
    }
    
    /**
     * 向0反方向舍入，进一
     * @param v
     * @return
     */
    public static BigDecimal up(BigDecimal v) {
        return instance.up(v);
    }
    
    /**
     * 五舍六入
     * @param v
     * @return
     */
    public static BigDecimal halfDown(BigDecimal v) {
        return instance.halfDown(v);
    }
    
    /**
     * 四舍五入
     * @param v
     * @return
     */
    public static BigDecimal halfUp(BigDecimal v) {
        return instance.halfUp(v);
    }
    
    /**
     * 向正无限大方向舍入
     * @param v
     * @return
     */
    public static BigDecimal ceiling(BigDecimal v) {
        return instance.ceiling(v);
    }
    
    /**
     * 向负无限大方向舍入
     * @param v
     * @return
     */
    public static BigDecimal floor(BigDecimal v) {
        return instance.floor(v);
    }
    
    /**
     * 强制(非强制时只会做降低精度的动作)向0方向舍入，去尾<br />
     * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
     * @param v
     * @return
     */
    public static BigDecimal forceDown(BigDecimal v) {
        return instance.forceDown(v);
    }
    
    /**
     * 强制(非强制时只会做降低精度的动作)向0反方向舍入，进一<br />
     * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
     * @param v
     * @return
     */
    public static BigDecimal forceUp(BigDecimal v) {
        return instance.forceUp(v);
    }
    
    /**
     * 强制(非强制时只会做降低精度的动作)五舍六入<br />
     * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
     * @param v
     * @return
     */
    public static BigDecimal forceHalfDown(BigDecimal v) {
        return instance.forceHalfDown(v);
    }
    
    /**
     * 强制(非强制时只会做降低精度的动作)四舍五入<br />
     * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
     * @param v
     * @return
     */
    public static BigDecimal forceHalfUp(BigDecimal v) {
        return instance.forceHalfUp(v);
    }
    
    /**
     * 强制(非强制时只会做降低精度的动作)向正无限大方向舍入<br />
     * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
     * @param v
     * @return
     */
    public static BigDecimal forceCeiling(BigDecimal v) {
        return instance.forceCeiling(v);
    }
    
    /**
     * 强制(非强制时只会做降低精度的动作)向负无限大方向舍入<br />
     * <b>注意：只有需要提升精度才应该调用该方法，因为该方法总是创建新对象，性能较低</b>
     * @param v
     * @return
     */
    public static BigDecimal forceFloor(BigDecimal v) {
        return instance.forceFloor(v);
    }
    
    /**
     * 降低一个精度，向0方向舍入，去尾
     * @param v
     * @return
     */
    public static BigDecimal lowerScaleDown(BigDecimal v) {
        return instance.lowerScaleDown(v);
    }
    
    /**
     * 降低一个精度，向0反方向舍入，进一
     * @param v
     * @return
     */
    public static BigDecimal lowerScaleUp(BigDecimal v) {
        return instance.lowerScaleUp(v);
    }
    
    /**
     * 降低一个精度，五舍六入
     * @param v
     * @return
     */
    public static BigDecimal lowerScaleHalfDown(BigDecimal v) {
        return instance.lowerScaleHalfDown(v);
    }
    
    /**
     * 降低一个精度，四舍五入
     * @param v
     * @return
     */
    public static BigDecimal lowerScaleHalfUp(BigDecimal v) {
        return instance.lowerScaleHalfUp(v);
    }
    
    /**
     * 降低一个精度，向正无限大方向舍入
     * @param v
     * @return
     */
    public static BigDecimal lowerScaleCeiling(BigDecimal v) {
        return instance.lowerScaleCeiling(v);
    }
    
    /**
     * 降低一个精度，向负无限大方向舍入
     * @param v
     * @return
     */
    public static BigDecimal lowerScaleFloor(BigDecimal v) {
        return instance.lowerScaleFloor(v);
    }
    
    /**
     * 获取默认小数点位数
     * @return
     */
    public static int getDefaultScale() {
        return instance.getDefaultScale();
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程
     * @param bdVal
     * @param roundingMode
     * @return
     */
    public static NumberWrapper getNumberWrapper(BigDecimal bdVal, RoundingMode roundingMode) {
        return instance.getNumberWrapper(bdVal, roundingMode);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程，基准值四舍五入
     * @param bdVal
     * @return
     */
    public static NumberWrapper getNumberWrapper(BigDecimal bdVal) {
        return instance.getNumberWrapper(bdVal);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程
     * @param stringVal
     * @param roundingMode
     * @return
     */
    public static NumberWrapper getNumberWrapper(String stringVal, RoundingMode roundingMode) {
        return instance.getNumberWrapper(stringVal, roundingMode);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程，基准值四舍五入
     * @param stringVal
     * @return
     */
    public static NumberWrapper getNumberWrapper(String stringVal) {
        return instance.getNumberWrapper(stringVal);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程
     * @param longVal
     * @return
     */
    public static NumberWrapper getNumberWrapper(long longVal) {
        return instance.getNumberWrapper(longVal);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程
     * @param longVal
     * @return
     */
    public static NumberWrapper getNumberWrapper(Long longVal) {
        return instance.getNumberWrapper(longVal);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程，基准值四舍五入
     * @param doubleVal
     * @return
     */
    public static NumberWrapper getNumberWrapper(double doubleVal) {
        return instance.getNumberWrapper(doubleVal);
    }
    
    /**
     * 获取数字包装，用于便捷的链式编程
     * @param doubleVal
     * @param roundingMode
     * @return
     */
    public static NumberWrapper getNumberWrapper(double doubleVal, RoundingMode roundingMode) {
        return instance.getNumberWrapper(doubleVal);
    }
    
}
