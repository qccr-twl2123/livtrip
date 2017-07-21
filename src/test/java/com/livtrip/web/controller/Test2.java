package com.livtrip.web.controller;

/**
 * Created by xierongli on 17/7/20.
 */
public class Test2 {

    public static void main(String[] args) {

        String privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDFDGu4g/EiBrCP r/Ik2ROdmSdxSp2OCjSgG4/S6sD+dt//oQOZP4FW9Fu1/IDd1pjyz0vJFEm8e1M7 9rVb7us+aZG7s45rIYPKe7gt+oOsXeKcw+CRR99HytUZug4u/kZIYr63DbAj3H55 cLXmATaz/sF/9Egm6jXITxviLjSuEMxqgdAD766lmlJAhOsNk7vusdeGtBwYsA8E hS0xglOFjzehjX6PSe8zVRn01enkC+f/OSpMvl0l8ujI1Cud9sJdSJBlvN4TRuWA KgIk1/ks9tQcm1JCudmxYzMt1umiPJpqmhBdhQGhNugMLcvSOlP5ELOCq+ujurH7 oUUE6GCJAgMBAAECggEBAKP3T/O8JvzPYEBQgkfTMpVjigSluDEnoN7R0H4Lxgh4 1rAaRapRw8idkWr/8COonKD/ieqKrUjfvkUZZ5RWXP4UTqZIJWxT+RyWko3/9W2K ujUEcWuyyMMuruC3h3HnOIinUld0Vmug4MUg2tvHisOAa3eTyC5JmfNSkLtHA6MK 9REKgZo+utlBhRoJT6MHeqhQT+Z4Mfzh/2atrjeN3emUTlqN16gxRjhYqF/s0knE 5bLNtUg01MgiyF75Dy9BQbP5WKZOMKsyxS1JFPJNCLOsm1AT6kMiFaAKfeWjXxpl iV+dETvLQXOWBHtT1r7loTwlbI2XckAA1tL4KKZBoXkCgYEA7XEEDduVgaNxAT+0 P3YN+Lw0n73TzT0Bc5umlLpwqLBR0fHafbwkq3InwWKeDPPsd5hwoaGOqfWazYvX I3bj5orK4+ZpYB0faJEByCUnIHsQn/0Ot0O/rG94UsJv/4MWdUeatgNmUhNjibOA ziOeePvfJAWPdsDttiE5k2613q8CgYEA1HMt7H8yEmHgd+I0ytEgPp8JOGQp8OQ+ m9HPhckKczBpcIuBTuQidwSyM4Lv8fAF+sXMlHh6TowoX0diYact9/RGlA904gJ+ WZXx8LuV8XyrPQLVQM3HdxbSteg8nYCIyuWo0FqRdySjSfxKQBM3N85g9eBeKxzT p73BddN5wkcCgYEA4NZFyoGFvu5vkYkrO3SkokZFZoYwS4ZbG4fmY6twBqx/rdfg 13MTHi3Iq3ygwQ8xecYl0UfUeegSIFUs8W4hPCttGAUU/2hUV4YIM+fKdx1Rjs3n 424J0FT1kRiBSWhuGbwmKfhqKYomlTwe2hQsec+3arrBMOhbsD0h8hPBsA0CgYBH f5vtA8GuPhJ1RkPOHiNj79ICkHMtByOq/SmCNO63ZYuWvNx/2Hdg5suyWla2bbkV dIwtS36eAL11k2igxMrLsAIwwiLsDTrIm5YZFoiYBQT8O3/Zl2eRxLSVU9tShneD EVeHB3P9TO9HbwjuF4l11pb7KM+IYuM4iLwbE1je8QKBgEKeGmRvEgcm6+o/IVTz iIC96Z5dbMMyJxHCK1WLQa2AFAQTQe0Mz2rsqJH0g0n1OybXI1hhFp6sKBdN1D6o BeU9fp+aJiX5zFLNIQlZtXfZMyafa81dkfwJ4fVdk2I0LBFX8kUHXNx303uFVjSG dX0Uae8bUvfqXWipvi5wlQkc";
        String publicKey ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxQxruIPxIgawj6/yJNkT nZkncUqdjgo0oBuP0urA/nbf/6EDmT+BVvRbtfyA3daY8s9LyRRJvHtTO/a1W+7r PmmRu7OOayGDynu4LfqDrF3inMPgkUffR8rVGboOLv5GSGK+tw2wI9x+eXC15gE2 s/7Bf/RIJuo1yE8b4i40rhDMaoHQA++upZpSQITrDZO77rHXhrQcGLAPBIUtMYJT hY83oY1+j0nvM1UZ9NXp5Avn/zkqTL5dJfLoyNQrnfbCXUiQZbzeE0blgCoCJNf5 LPbUHJtSQrnZsWMzLdbpojyaapoQXYUBoTboDC3L0jpT+RCzgqvro7qx+6FFBOhg iQIDAQAB";

        privateKey = privateKey.replace(" ","");
        publicKey = publicKey.replace(" ","");
        System.out.println(privateKey);
        System.out.println(publicKey);

    }
}
